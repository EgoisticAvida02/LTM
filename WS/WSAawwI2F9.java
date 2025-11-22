/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WS;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import vn.medianews.*;
/**
 *
 * @author Admin
 */
//Object - Sắp xếp nhân viên theo ngày bắt đầu
public class WSAawwI2F9 {
    public static void main(String[] args) {
        String studentCode = "B21DCCN550";
        String qCode = "AawwI2F9";
        
        ObjectService_Service service = new ObjectService_Service();
        ObjectService port = service.getObjectServicePort();
        
        List<EmployeeY> list = port.requestListEmployeeY(studentCode, qCode);
        for (EmployeeY i : list) {
            System.out.println(i.getName() + " " + i.getStartDate());
        }
        System.out.println();
        
        Collections.sort(list, new Comparator<EmployeeY>(){
            @Override
            public int compare(EmployeeY o1, EmployeeY o2) {
                return o1.getStartDate().compare(o2.getStartDate());
            }
        });
        
        for (EmployeeY i : list) {
            System.out.println(i.getName() + " " + i.getStartDate());
        }
        
        port.submitListEmployeeY(studentCode, qCode, list);
    }
}

