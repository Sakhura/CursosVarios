package MatricesIrregulares;

import java.util.Scanner;

public class MatrizIrregular2 {
    private Scanner teclado;
    private int[][] mat;

    public void cargar() {
        teclado=new Scanner(System.in);
        mat=new int[5][];
        for(int f=0;f<mat.length;f++) {
            mat[f]=new int[f+1];
            for(int c=0;c<mat[f].length;c++) {
                System.out.print("Ingrese componente:");
                mat[f][c]=teclado.nextInt();
            }
        }
    }

    public void imprimir() {
        for(int f=0;f<mat.length;f++) {
            for(int c=0;c<mat[f].length;c++) {
                System.out.print(mat[f][c]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] ar) {
        MatrizIrregular2 ma=new MatrizIrregular2();
        ma.cargar();
        ma.imprimir();
    }
}
