
public class VarArgs73 {

    public static String concatenateString(String... str) {
        StringBuilder sb = new StringBuilder();
        for(String s: str) {
            sb.append(s).append(" ");
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(concatenateString("abc", "acb", "bca", "cba", "cab", "bac"));
    }
} 