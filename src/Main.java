
import java.util.regex.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        RegularExp lex = new RegularExp();
        LinkedList<Token> tokens = new LinkedList<Token>();
        String exp = "v = 100 + 1";
        String str_1 = "";
        for (int i = 0; i < exp.length(); i++) {
            if (exp.toCharArray()[i] == ' ') {
                continue;
            }
            str_1 += exp.toCharArray()[i];
            String str_2 = " ";
            if (i < exp.length() - 1) {
                str_2 = str_1 + exp.toCharArray()[i + 1];
            }
            for (String key : lex.regexp.keySet()) {
                Pattern p = Pattern.compile(lex.regexp.get(key));
                Matcher m_1 = p.matcher(str_1);
                Matcher m_2 = p.matcher(str_2);
                if (m_1.find() && !m_2.find()) {
                    tokens.add(new Token(key.toString(), str_1));
                    str_1 = "";
                }
            }
        }
        for (Token t : tokens) {
            System.out.println("Type of Regular Exp.: "+t.type + "; Token: " + t.token);
        }
    }
}
