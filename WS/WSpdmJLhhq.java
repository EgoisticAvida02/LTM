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
//Object - Loc khach hang mua nhieu
public class WSpdmJLhhq {
    public static void main(String[] args) {
        String studentCode = "B21DCCN550";
        String qCode = "pdmJLhhq";
        
        ObjectService_Service service = new ObjectService_Service();
        ObjectService port = service.getObjectServicePort();
        
        List<Customer> list = port.requestListCustomer(studentCode, qCode);
        System.out.println(list);
        
        List<Customer> res = new ArrayList<>();
        for (Customer customer : list) {
            if (customer.getTotalSpent() > 5000 && customer.getPurchaseCount() >= 5) res.add(customer);
        }
        
        port.submitListCustomer(studentCode, qCode, res);
    }
}
