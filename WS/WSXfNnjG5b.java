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
//Data - Thap phan -> nhi phan
public class WSXfNnjG5b {
    public static void main(String[] args) {
        String studentCode = "B21DCCN550";
        String qCode = "XfNnjG5b";
        
        DataService_Service service = new DataService_Service();
        DataService port = service.getDataServicePort();
        
        List<Integer> list = port.getData(studentCode, qCode);
        System.out.println(list);
        
        List<String> res = new ArrayList<>();
        for (int i : list) {
            String tmp = Integer.toBinaryString(i);
            res.add(tmp);
        }
        
        port.submitDataStringArray(studentCode, qCode, res);
    }
}
