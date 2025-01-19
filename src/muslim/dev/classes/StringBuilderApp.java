public class StringBuilderApp {

    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();
        builder.append("Andi");
        builder.append(" ");
        builder.append("Tiri");
        builder.append(" ");
        builder.append("Petta");
        builder.append(" ");
        builder.append("Lolo");

        String name = builder.toString();

        System.out.println(name);
    }
}
