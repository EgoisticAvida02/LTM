/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WS;
import java.util.*;
import vn.medianews.*;

/**
 *
 * @author Admin
 */
//Data - Dem so lan xuat hien cua tung phan tu trong mang
public class WSj1AhbOxw {
    public static void main(String[] args) {
        String studentCode = "B21DCCN550";
        String qCode = "j1AhbOxw";
        
        DataService_Service service = new DataService_Service();
        DataService port = service.getDataServicePort();
        
        List<Integer> list = port.getData(studentCode, qCode);
        System.out.println(list);
        
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int num : list) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        List<String> res = new ArrayList<>();
        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey()) //Sap xep theo key tang dan
                .forEach(entry -> res.add(entry.getKey() + ", " + entry.getValue()));
        
        System.out.println(res);
        port.submitDataStringArray(studentCode, qCode, res);
    }
}
