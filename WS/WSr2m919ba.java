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
//Data - Tap so lon nhat
public class WSr2m919ba {
    public static void main(String[] args) {
        String studentCode = "B21DCCN550";
        String qCode = "r2m919ba";
        
        DataService_Service service = new DataService_Service();
        DataService port = service.getDataServicePort();
        
        List<Integer> list = port.getData(studentCode, qCode);
        System.out.println(list);
        
        String largestNum = null;
        List<String> stringNums = new ArrayList<>();
        for (int i : list) {
            stringNums.add(String.valueOf(i));
        }
        
        stringNums.sort((a, b) -> (b + a).compareTo(a + b));
        largestNum = String.join("", stringNums);
        System.out.println(largestNum);
        
        port.submitDataString(studentCode, qCode, largestNum);
    }
}
