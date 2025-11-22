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
//Data - Loại bỏ các phần tử trùng lặp, giữ lại lần xuất hiện đầu tiên
public class WSyNEpS3rJ {
    public static void main(String[] args) {
        String studentCode = "B21DCCN550";
        String qCode = "yNEpS3rJ";
        
        DataService_Service service = new DataService_Service();
        DataService port = service.getDataServicePort();
        
        List<Integer> list = port.getData(studentCode, qCode);
        System.out.println(list);
        
        Set<Integer> set = new HashSet<>();
        List<Integer> res = new ArrayList<>();
        
        for (int i : list) {
            if (set.add(i)) {
                res.add(i);
            }
        }
        
        port.submitDataIntArray(studentCode, qCode, res);
    }
}
