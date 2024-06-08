package ConstructorClase;

import java.util.Scanner;

public class EmpleadoFabrica {
    private Scanner teclado;
    String nombre;
    float sueldo;

    public EmpleadoFabrica() {
        teclado=new Scanner(System.in);
        System.out.print("Ingrese el nombre del empleado:");
        nombre=teclado.next();
        System.out.print("Ingrese su sueldo:");
        sueldo=teclado.nextFloat();
    }

    public void pagaImpuestos() {
        if (sueldo>3000) {
            System.out.print("Debe abonar impuestos");
        } else {
            System.out.print("No paga impuestos");
        }
    }

    public static void main(String[] ar) {
        EmpleadoFabrica empleado1;
        empleado1=new EmpleadoFabrica();
        empleado1.pagaImpuestos();
    }
}
