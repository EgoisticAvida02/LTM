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
//Data - Phan tu lon va nho thu k
public class WSK1rkXmIf {
    public static void main(String[] args) {
        String studentCode = "B21DCCN550";
        String qCode = "K1rkXmIf";
        
        DataService_Service service = new DataService_Service();
        DataService port = service.getDataServicePort();
        
        List<Integer> list = port.getData(studentCode, qCode);
        System.out.println(list);
        
        int k = list.get(0);
        list = new ArrayList<>(list.subList(1, list.size()));
        Collections.sort(list);
        
        int kSmallest = list.get(k-1);
        int kLargest = list.get(list.size() - k);
        List<Integer> res = new ArrayList<>();
        res.add(kLargest); res.add(kSmallest);
        
        port.submitDataIntArray(studentCode, qCode, res);
    }
}
