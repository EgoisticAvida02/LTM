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
//Character - Loai bo ki tu dac biet, so
public class WSsS7uimwi {
    public static void main(String[] args) {
        String studentCode = "B21DCCN550";
        String qCode = "sS7uimwi";
        
        CharacterService_Service service = new CharacterService_Service();
        CharacterService port = service.getCharacterServicePort();
        
        String s = port.requestString(studentCode, qCode);
        System.out.println(s);
        
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isAlphabetic(c)) sb.append(c);
        }
        sb.reverse();
        
        port.submitCharacterString(studentCode, qCode, sb.toString());
    }
}
