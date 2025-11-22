/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WS;
import java.util.*;
import javax.xml.datatype.XMLGregorianCalendar;
import vn.medianews.*;
/**
 *
 * @author Admin
 */
//Object - Lọc ra các đơn hàng có trạng thái là "pending" hoặc "processing" và có ngày đặt hàng (orderDate) quá 30 ngày so với ngày hiện tại
public class WSPDZUpY8U {
    public static void main(String[] args) {
        String studentCode = "B21DCCN550";
        String qCode = "PDZUpY8U";
        
        ObjectService_Service service = new ObjectService_Service();
        ObjectService port = service.getObjectServicePort();
        
        List<OrderY> list = port.requestListOrderY(studentCode, qCode);
        System.out.println(list);
        
        List<OrderY> res = filterOrder(list);
        port.submitListOrderY(studentCode, qCode, res);
    }
    
    private static List<OrderY> filterOrder(List<OrderY> list) {
        List<OrderY> res = new ArrayList<>();
        
        for (OrderY o : list) {
            String status = o.getStatus();
            if (status.equals("pending") || status.equals("processing")) {
                Date currentDate = new Date();
                XMLGregorianCalendar orderDate = o.getOrderDate();
                long time = currentDate.getTime() - orderDate.toGregorianCalendar().getTimeInMillis();
                long days = time/(1000*24*60*60);
                if (days > 30) res.add(o);
            } 
        }
        
        return res;
    }
}
