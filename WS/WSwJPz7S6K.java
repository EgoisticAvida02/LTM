/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WS;
import java.util.List;
import vn.medianews.*;
/**
 *
 * @author Admin
 */

//Character - Tim do dai tu lon nhat, nho nhat
public class WSwJPz7S6K {
    public static void main(String[] args) {
        String studentCode = "B21DCCN550";
        String qCode = "wJPz7S6K";
        
        CharacterService_Service service = new CharacterService_Service();
        CharacterService port = service.getCharacterServicePort();
        
        String s = port.requestString(studentCode, qCode);
        System.out.println(s);
        
        String[] words = s.split("\\s+");
        String longest = "", shortest = words[0];
        
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
            if (word.length() < shortest.length()) {
                shortest = word;
            }
        }
        System.out.println(longest);
        System.out.println(shortest);
        
        String res = longest + ";" + shortest;
        port.submitCharacterString(studentCode, qCode, res);
        
    }
}
