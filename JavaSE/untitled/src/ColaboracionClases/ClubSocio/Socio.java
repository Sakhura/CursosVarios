package ColaboracionClases.ClubSocio;

import java.util.Scanner;

public class Socio {
    private String nombre;
    private int antiguedad;

    public Socio(Scanner teclado) {
        System.out.print("Ingrese el nombre del socio:");
        nombre=teclado.next();
        System.out.print("Ingrese la antiguedad:");
        antiguedad=teclado.nextInt();
    }

    public void imprimir() {
        System.out.println(nombre+" tiene una antiguedad de "+antiguedad);
    }

    public int retornarAntiguedad() {
        return antiguedad;
    }
}
