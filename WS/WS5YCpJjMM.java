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
//Object - Danh sach hoa don cua khach hang co tong gia tri lon nhat
public class WS5YCpJjMM {
    public static void main(String[] args) {
        String studentCode = "B21DCCN550";
        String qCode = "5YCpJjMM";
        
        ObjectService_Service service = new ObjectService_Service();
        ObjectService port = service.getObjectServicePort();
        
        List<Order> list = port.requestListOrder(studentCode, qCode);
        
        Map<String, Float> map = new HashMap<>();
        for (Order o : list) {
            map.put(o.getCustomerId(), map.getOrDefault(o.getCustomerId(), 0.0f) + o.getAmount());
        }
        float maxAmount = Collections.max(map.values());
        System.out.println(maxAmount);
        
        List<Order> res = new ArrayList<>();
        String maxCustomerId = "";
        for (Map.Entry<String, Float> entry : map.entrySet()) {
            if (maxAmount == entry.getValue()) {
                maxCustomerId = entry.getKey();
                break;
            }
        }
        System.out.println(maxCustomerId);
        
        for (Order o : list) {
            if (o.getCustomerId() == maxCustomerId) {
                res.add(o);
            }
        }
        
        port.submitListOrder(studentCode, qCode, res);
    }
}
