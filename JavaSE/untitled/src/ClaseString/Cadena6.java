package ClaseString;

import java.util.Scanner;

public class Cadena6 {
    private Scanner teclado;
    private String oracion;

    public Cadena6() {
        teclado=new Scanner(System.in);
        System.out.print("Ingrese oración:");
        oracion=teclado.nextLine();
    }

    public void imprimir() {
        for(int f=0;f<oracion.length();f++) {
            if (oracion.charAt(f)==' ') {
                System.out.println();
            } else {
                System.out.print(oracion.charAt(f));
            }
        }
    }

    public static void main(String[] ar) {
        Cadena6 cad=new Cadena6();
        cad.imprimir();
    }
}
