import java.util.StringTokenizer;

public class StringTokenizerApp {

    public static void main(String[] args) {

        String value = "Andi Tiri Petta Lolo";

        StringTokenizer tokenizer = new StringTokenizer(value, " ");

        while (tokenizer.hasMoreTokens()) {
            String result = tokenizer.nextToken();
            System.out.println(result);
        }
    }
}
