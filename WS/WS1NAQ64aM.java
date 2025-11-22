/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WS;
import java.util.ArrayList;
import java.util.List;
import vn.medianews.*;
/**
 *
 * @author Admin
 */
//Data - Phân tích thừa số nguyên tố
public class WS1NAQ64aM {
    public static void main(String[] args) {
        String studentCode = "B21DCCN550";
        String qCode = "1NAQ64aM";
        
        DataService_Service service = new DataService_Service();
        DataService port = service.getDataServicePort();
        
        List<Integer> list = port.getData(studentCode, qCode);
        System.out.println(list);
        
        List<String> res = new ArrayList<>();
        for (int num : list) {
            String tmp = phanTich(num);
            res.add(tmp);
        }
        
        port.submitDataStringArray(studentCode, qCode, res);
    }
    
    private static String phanTich(int num) {
        StringBuilder sb = new StringBuilder();
        for (int i = 2; i <= Math.sqrt(num); i++) {
            while (num % i == 0) {
                sb.append(i).append(", ");
                num /= i;
            }
        }
        if (num > 1) sb.append(num);
        String res = sb.toString();
        if (res.endsWith(", ")) res = res.substring(0, sb.length() - 2);
        return res;
    }
}
