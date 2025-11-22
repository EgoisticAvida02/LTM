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
//Character - Xoay vong ki tu theo chieu phai
public class WSMzROc3MW {
    public static void main(String[] args) {
        String studentCode = "B21DCCN550";
        String qCode = "MzROc3MW";
        
        CharacterService_Service service = new CharacterService_Service();
        CharacterService port = service.getCharacterServicePort();
        
        List<Integer> list = port.requestCharacter(studentCode, qCode);
        System.out.println(list);
        
        int rotateTimes = list.get(0) % list.size();
        Collections.rotate(list, rotateTimes);
        port.submitCharacterCharArray(studentCode, qCode, list);
    }
}
