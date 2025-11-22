package WS;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
import java.util.List;
import vn.medianews.*;
/**
 *
 * @author Admin
 */
public class WS8lidcyED {
    public static void main(String[] args) {
        String studentCode = "B21DCCN550";
        String qCode = "8lidcyED";
        
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
