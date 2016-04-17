package util;

import java.io.IOException;


public class carro {

    public static String[][] getD() {
        return d;
    }

    public static void setD(String[][] d) {
        carro.d = d;
    }

    public static int getM() {
        return m;
    }

    public static void setM(int m) {
        carro.m = m;
    }

    public static String[][] getC() {
        return c;
    }

    public static void setC(String[][] c) {
        carro.c = c;
    }

    public static int getL() {
        return l;
    }

    public static void setL(int l) {
        carro.l = l;
    }

 

    
     public static String d[][]=new String [10][4];
     public  static int m=0;
     public static String c[][]=new String [10][4];
     public  static int l=0;
     
     
     public static void data_carros(){
       d[m][0]="Renoult";
       d[m][1]="Logan";
       d[m][2]="KM=32000-Precio=$6700-Manual";
    m++;
       d[m][0]="Renoult";
       d[m][1]="Fluences";
       d[m][2]="KM=2000-Precio=$12300-Manual";
       m++;
    d[m][0]="Nissan";
       d[m][1]="Tidda";
       d[m][2]="KM=78000-Precio=$8700-Auto";
       m++;
   }
   
    
}
