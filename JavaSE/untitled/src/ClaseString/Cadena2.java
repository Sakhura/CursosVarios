package ClaseString;

import java.util.Scanner;

public class Cadena2 {
    private Scanner teclado;
    private String mail;
    public Cadena2() {
        teclado=new Scanner(System.in);
        System.out.print("Ingrese un mail:");
        mail=teclado.nextLine();
    }

    public void verificarArroba() {
        boolean existe=false;
        for(int f=0;f<mail.length();f++) {
            if (mail.charAt(f)=='@') {
                existe=true;
            }
        }
        if (existe==true) {
            System.out.println(mail+" contiene el caracter @");
        } else {
            System.out.println(mail+" no contiene el caracter @");
        }
    }

    public static void main(String[] ar) {
        Cadena2 cad=new Cadena2();
        cad.verificarArroba();
    }
}
