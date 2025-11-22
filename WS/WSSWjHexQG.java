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
//Character - Sắp xếp theo số lượng nguyên âm tăng dần
public class WSSWjHexQG {
    public static void main(String[] args) {
        String studentCode = "B21DCCN550";
        String qCode = "SWjHexQG";
        
        CharacterService_Service service = new CharacterService_Service();
        CharacterService port = service.getCharacterServicePort();
        
        List<String> list = port.requestStringArray(studentCode, qCode);
        System.out.println(list);
        
        Collections.sort(list, (o1, o2) -> {
            return countVowel(o1) - countVowel(o2);
        });
        System.out.println(list);
        
        port.submitCharacterStringArray(studentCode, qCode, list);
    }
    
    public static int countVowel(String s) {
        int cnt = 0;
        String vowel = "ueoaiUEOAI";
        
        for (char c : s.toCharArray()) {
            if (vowel.indexOf(c) != -1) cnt++;
        }
        return cnt;
    }
}
