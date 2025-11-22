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
//Character - Sap xep ky tu
public class WSsxwWVlTJ {
    public static void main(String[] args) {
        String studentCode = "B21DCCN550";
        String qCode = "sxwWVlTJ";
        
        CharacterService_Service service = new CharacterService_Service();
        CharacterService port = service.getCharacterServicePort();
        
        List<Integer> list = port.requestCharacter(studentCode, qCode);
        System.out.println(list);
        
        Collections.sort(list);
        port.submitCharacterCharArray(studentCode, qCode, list);
    }
}
