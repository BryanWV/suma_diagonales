/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suma.diagonales;

import java.util.Scanner;

/**
 *
 * @author Bryan Wilches Villanueva
 */
public class SumaDiagonales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada= new Scanner(System.in);
       int matriz[][]= new int[50][50];
       int n;
       int suma1=0;
       int suma2=0;
       System.out.println("Digite la cantidad de filas y columnas de la matriz");
       n= entrada.nextInt();
       for (int i=0;i<n;i++)
       {
       for (int j=0;j<n;j++)
       {
       System.out.println("digite numero fila ["+i+"] columna["+j+"]");
       matriz[i][j]=entrada.nextInt();
       }
       }
       System.out.println("Esta es la matriz original");
       for (int i=0;i<n;i++)
       {
       for (int j=0;j<n;j++)
       {
       System.out.print(matriz[i][j]);
       System.out.print(" ");
       if (i==j)
       {
           suma1+=matriz[i][j];
       }
       }
       System.out.println("  ");
       }
        if (suma1<0)
        {
            suma1*=(-1);
        }
        System.out.println("el valor absoluto de la suma de la diagonal principal es: "+suma1+" ");
       for (int i=0;i<n;i++)
       {
       for (int j=0;j<n;j++)
       {
       
       if (i+j==n-1)
       {
           suma2+=matriz[i][j];
       }
       }
       System.out.println("  ");
       }
       if (suma2<0)
        {
            suma2*=(-1);
        }
       System.out.println("el valor absoluto de la suma de la diagonal secundaria es: "+suma2+" ");

       int sumatotal;
       sumatotal=suma1+suma2;
       int restatotal;
       restatotal=suma1-suma2;
       System.out.println("La suma del valor absoluto de las diagonales de la matriz es:"+sumatotal+" ");
       if (restatotal<0)
       {
       restatotal*=(-1);
       }
       System.out.println("La resta del valor absoluto de las diagonales de la matriz es:"+restatotal+" ");
    }
}

