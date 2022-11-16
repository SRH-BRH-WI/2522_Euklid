public class Euklid {
    public static void main(String[] args) {

        // Deklararion
        int a;
        int b;

        // Initialisierung
        a = 10;
        b = 4;

        while ( a != b ) {
            if ( a > b ) a = a - b;
            else         b = b - a;
        }

        System.out.println("a = " + a);
    }

}
