import java.util.*;
public class RegularExp {
    static Map<String,String> regexp = new HashMap<String,String>();
    public RegularExp(){
        regexp.put("VAR", "^[A-Za-z]+$");
        regexp.put("DIGIT", "^0|[1-9][0-9]*$");
        regexp.put("OPERATOR", "^[-|+|/|*]$");
        regexp.put("ASSIGNMENT OPERATOR", "^=$");
    }
}