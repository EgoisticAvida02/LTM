/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WS;
import java.util.Collections;
import java.util.List;
import vn.medianews.*;
/**
 *
 * @author Admin
 */
// Character - sap xep tang dan theo do dai cac tu trong mang
public class WS2DM72EPJ {
    public static void main(String[] args) {
        String studentCode = "B21DCCN550";
        String qCode = "2DM72EPJ";
        
        CharacterService_Service service = new CharacterService_Service();
        CharacterService port = service.getCharacterServicePort();
        
        List<String> list = port.requestStringArray(studentCode, qCode);
        System.out.println(list);
        
        Collections.sort(list, (o1, o2) -> o1.length() - o2.length());
        port.submitCharacterStringArray(studentCode, qCode, list);
    }
}
