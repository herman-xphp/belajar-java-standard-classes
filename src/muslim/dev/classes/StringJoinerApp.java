import java.util.StringJoiner;

public class StringJoinerApp {

    public static void main(String[] args) {

        StringJoiner joiner = new StringJoiner(", ", "{", "}");

        joiner.add("Andi");
        joiner.add("Petta");
        joiner.add("Lolo");

        String value = joiner.toString();
        System.out.println(value);
    }
}
