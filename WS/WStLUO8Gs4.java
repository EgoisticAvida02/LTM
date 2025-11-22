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
//Object - Loc sinh vien co diem so cao nhat theo mon hoc
public class WStLUO8Gs4 {
    public static void main(String[] args) {
        String studentCode = "B21DCCN550";
        String qCode = "tLUO8Gs4";
        
        ObjectService_Service service = new ObjectService_Service();
        ObjectService port = service.getObjectServicePort();
        
        List<StudentY> list = port.requestListStudentY(studentCode, qCode);
        
        Map<String, StudentY> topScoreMap = new LinkedHashMap<>();
        List<StudentY> topStudent = new ArrayList<>();
        
        for (StudentY student : list) {
            String subject = student.getSubject();
            if (!topScoreMap.containsKey(subject) || student.getScore() > topScoreMap.get(subject).getScore()) {
                topScoreMap.put(subject, student);
            }
        }
        
        for (Map.Entry<String, StudentY> entry : topScoreMap.entrySet()) {
            topStudent.add(entry.getValue());
        }
        
        port.submitListStudentY(studentCode, qCode, topStudent);
    }
}
