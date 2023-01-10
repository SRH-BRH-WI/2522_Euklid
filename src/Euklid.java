public class Euklid {
    public static void main(String[] args) {

        // Deklararion und Initialisierung
        int a = 12;
        int b = 9;

        while ( a != b ) {
            if ( a > b ) a = a - b;
            else         b = b - a;
        }

        System.out.println("a = " + a);
    }

}
