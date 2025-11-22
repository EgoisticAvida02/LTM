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
//Character - Phan loai nguyen am
public class WSBZRhywWg {
    public static void main(String[] args){
        String studentCode = "B21DCCN550";
        String qCode = "BZRhywWg";
        
        CharacterService_Service service = new CharacterService_Service();
        CharacterService port = service.getCharacterServicePort();
        
        List<String> list = port.requestStringArray(studentCode, qCode);
        System.out.println(list);
        
        Map<Integer, List<String>> group = new HashMap<>();
        for (String word : list) {
            int vowelCnt = countVowel(word);
            group.computeIfAbsent(vowelCnt, k -> new ArrayList<>()).add(word);
        }
        
        for (Map.Entry<Integer, List<String>> entry : group.entrySet()) {
            Collections.sort(entry.getValue());
        }
        
        List<String> res = new ArrayList<>();
        for (Map.Entry<Integer, List<String>> entry : group.entrySet()) {
            String tmp = String.join(", ", entry.getValue());
            res.add(tmp);
        }
        
        port.submitCharacterStringArray(studentCode, qCode, res);
    }
    
    public static int countVowel(String word) {
        int cnt = 0;
        for (char c : word.toLowerCase().toCharArray()) {
            if ("ueoai".indexOf(c) != -1) cnt++;
        }
        return cnt;
    }
}
