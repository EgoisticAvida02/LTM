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
//Data - Sap xep chan le
public class WS5ayQRIJN {
    public static void main(String[] args) {
        String studentCode = "B21DCCN550";
        String qCode = "5ayQRIJN";
        
        DataService_Service service = new DataService_Service();
        DataService port = service.getDataServicePort();
        
        List<Integer> list = port.getData(studentCode, qCode);
        System.out.println(list);
        
        List<Integer> res = sortedList(list);
        port.submitDataIntArray(studentCode, qCode, res);
        
    }
    
    private static List<Integer> sortedList(List<Integer> list) {
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        
        for (int num : list) {
            if (num % 2 == 0) even.add(num);
            else odd.add(num);
        }
        
        int i = 0, j = 0;
        while(i < even.size() && j < odd.size()) {
            res.add(even.get(i++));
            res.add(odd.get(j++));
        }
        
        while(i < even.size()) {
            res.add(even.get(i++));
        }
        
        while(j < odd.size()) {
            res.add(odd.get(j++));
        }
        
        return res;
    }
}
