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
//Character - Tim tu co do dai lon nhat, nho nhat trong chuoi
public class WSqp6cu7bi {
    public static void main(String[] args) {
        String studentCode = "B21DCCN550";
        String qCode = "qp6cu7bi";
        
        CharacterService_Service service = new CharacterService_Service();
        CharacterService port = service.getCharacterServicePort();
        
        List<String> list = port.requestStringArray(studentCode, qCode);
        System.out.println(list);
        
        String longest = "";
        String shortest = list.get(0);
        
        for (String word : list) {
            if (word.length() > longest.length()) longest = word;
            if (word.length() < shortest.length()) shortest = word;
        }
        String res = longest + ";" + shortest;
        
        port.submitCharacterString(studentCode, qCode, res);
    }
}
