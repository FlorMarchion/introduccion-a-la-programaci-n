package PracticaConstantes;

public class PracticaConstantes {

    public static void main(String[] args) {

        final float Pi = 3.14f;
        float n1 = 2.5f, n2 = 7.2f, n3;

        n3 = Pi;
        n2 = n3 + Pi;
        n1 = n2 / n1;
        n3 = n2 + n1;
        n2 = n2 - Pi;

        System.out.println("El valor de n2 = " + n2);
        System.out.println("EL valor de n3 = " + n3);
        System.out.println("El valor de n1 = " + n1);
    }

}
