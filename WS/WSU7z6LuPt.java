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
//Data - Chuyen sang co so 8 va 16
public class WSU7z6LuPt {
    public static void main(String[] args) {
        String studentCode = "B21DCCN550";
        String qCode = "U7z6LuPt";
        
        DataService_Service service = new DataService_Service();
        DataService port = service.getDataServicePort();
        
        List<Integer> list = port.getData(studentCode, qCode);
        System.out.println(list);
        
        List<String> res = new ArrayList<>();
        for (int i : list) {
            String octal = Integer.toOctalString(i);
            String hex = Integer.toHexString(i).toUpperCase();
            String resString = octal + "|" + hex;
            res.add(resString);
        }
        System.out.println(res);
        
        port.submitDataStringArray(studentCode, qCode, res);
    }  
}
