package ClaseString;

import java.util.Scanner;

public class Cadena3 {
    private Scanner teclado;
    private String cad;
    public Cadena3() {
        teclado=new Scanner(System.in);
        System.out.print("Ingrese una cadena:");
        cad=teclado.nextLine();
    }

    public void primerMitad() {
        String parte;
        parte=cad.substring(0,cad.length()/2);
        System.out.println("Primer mitad de caraceres:"+parte);
    }

    public void ultimoCaracter() {
        char ultimo=cad.charAt(cad.length()-1);
        System.out.println("Ultimo caracter:"+ultimo);
    }

    public void formaInversa() {
        System.out.println("Impresión en forma inversa:");
        for(int f=cad.length()-1;f>=0;f--) {
            System.out.print(cad.charAt(f));
        }
        System.out.println();
    }

    public void conGuion() {
        System.out.println("Separado por guiones:");
        for(int f=0;f<cad.length();f++) {
            System.out.print(cad.charAt(f)+"-");
        }
        System.out.println();
    }

    public void cantidadVocales() {
        int cant=0;
        for(int f=0;f<cad.length();f++) {
            if (cad.charAt(f)=='a' || cad.charAt(f)=='e' ||
                    cad.charAt(f)=='i' || cad.charAt(f)=='o' ||
                    cad.charAt(f)=='u' || cad.charAt(f)=='A' ||
                    cad.charAt(f)=='E' || cad.charAt(f)=='I' ||
                    cad.charAt(f)=='O'|| cad.charAt(f)=='U') {
                cant++;
            }
        }
        System.out.println("Cantidad de vocales:"+cant);
    }

    public void esCapicua() {
        int cant=0;
        for(int f=0;f<cad.length()/2;f++) {
            if (cad.charAt(f)==cad.charAt(cad.length()-1-f)) {
                cant++;
            }
        }
        if (cant==cad.length()/2) {
            System.out.println("Es capicúa la cadena "+cad);
        } else {
            System.out.println("No es capicúa la cadena "+cad);
        }
    }

    public static void main(String[] ar) {
        Cadena3 cad=new Cadena3();
        cad.primerMitad();
        cad.ultimoCaracter();
        cad.formaInversa();
        cad.conGuion();
        cad.cantidadVocales();
        cad.esCapicua();
    }
}
