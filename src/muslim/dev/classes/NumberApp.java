public class NumberApp {

    public static void main(String[] args) {

        Integer intValue = 100;

        Long longValue = intValue.longValue();
        Double doubleValue = longValue.doubleValue();
        Short shortValue = doubleValue.shortValue();

        String contoh = "10.10";
        // Integer contohInt = Integer.valueOf(contoh); // Error
        Double contohInt = Double.valueOf(contoh);
        System.out.println(contohInt);
    }
}
