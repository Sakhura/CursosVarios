package DatosTipoVector;

import java.util.Scanner;

public class PruebaVector4 {
    private Scanner teclado;
    private int[] vec;

    public void cargar() {
        teclado=new Scanner(System.in);
        vec=new int[8];
        for(int f=0;f<8;f++) {
            System.out.print("Ingrese elemento:");
            vec[f]=teclado.nextInt();
        }
    }

    public void acumularElementos() {
        int suma=0;
        for(int f=0;f<8;f++) {
            suma=suma+vec[f];
        }
        System.out.println("La suma de los 8 elementos es:"+suma);
    }

    public void acumularMayores36() {
        int suma=0;
        for(int f=0;f<8;f++) {
            if (vec[f]>36) {
                suma=suma+vec[f];
            }
        }
        System.out.println("La suma de los elementos mayores a 36 es:"+suma);
    }

    public void cantidadMayores50() {
        int cant=0;
        for(int f=0;f<8;f++) {
            if (vec[f]>50) {
                cant++;
            }
        }
        System.out.println("La cantidad de valores mayores a 50 es:"+cant);
    }

    public static void main(String[] ar) {
        PruebaVector4 pv=new PruebaVector4();
        pv.cargar();
        pv.acumularElementos();
        pv.acumularMayores36();
        pv.cantidadMayores50();
    }
}
