/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WS;
import java.util.ArrayList;
import java.util.List;
import vn.medianews.ObjectService;
import vn.medianews.ObjectService_Service;
import vn.medianews.Student;

/**
 *
 * @author Admin
 */

//Object - Loc sinh vien thuoc nhom A, D
public class WSraTXLlOF {
    public static void main(String[] args) {
        String studentCode = "B21DCCN550";
        String qCode = "raTXLlOF";
        
        ObjectService_Service service = new ObjectService_Service();
        ObjectService port = service.getObjectServicePort();
        
        List<Student> list = port.requestListStudent(studentCode, qCode);
        System.out.println(list);
        
        List<Student> res = new ArrayList<>();
        for (Student student : list) {
            if (student.getScore() >= 8 || student.getScore() < 5) res.add(student);
        }
        
        port.submitListStudent(studentCode, qCode, res);
    }
}
