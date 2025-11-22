/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WS;
import vn.medianews.*;

/**
 *
 * @author Admin
 */
//Object - TInh toan gia san pham
public class WSWoBQK2cv {
    public static void main(String[] args) {
        String studentCode = "B21DCCN550";
        String qCode = "WoBQK2cv";
        
        ObjectService_Service service = new ObjectService_Service();
        ObjectService port = service.getObjectServicePort();
        
        ProductY product = port.requestProductY(studentCode, qCode);
        System.out.println(product);
        
        float finalPrice = product.getPrice() * (1 + product.getTaxRate()/100) * (1 - product.getDiscount()/100);
        product.setFinalPrice(finalPrice);
        
        port.submitProductY(studentCode, qCode, product);
    }
}
