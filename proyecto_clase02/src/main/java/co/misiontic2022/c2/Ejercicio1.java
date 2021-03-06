package co.misiontic2022.c2;

import java.util.Scanner;

public class Ejercicio1 {

    //Algotirmo numero de suerte

    //Funciones o métodos
    public static int obtenerNumeroSuerte(String fecha){
        int numeroSuerte = 0;

        String [] arregloFecha = fecha.split("/", 5);
        int valorDia = Integer.parseInt(arregloFecha[0]);
        int valorMes = Integer.parseInt(arregloFecha[1]);
        int valorAño = Integer.parseInt(arregloFecha[2]);

        int sumaPartesFechas = valorDia + valorMes + valorAño;

        while (sumaPartesFechas > 0) {
            numeroSuerte += sumaPartesFechas % 10;
            sumaPartesFechas = (sumaPartesFechas / 10);
        }

        return numeroSuerte;
    }


    //Interacción
    public static void saludo(){
        System.out.println("App Número Suerte");
    }

    public static String leerFecha(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar la fecha DD/MM/AAAA");
        return sc.nextLine();
    }

    public static void reportarNumeroSuerte(int numeroSuerte){
        System.out.println("El número de la suerte es: "+ numeroSuerte);
    }
    public static void main(String[] args) {
        saludo();
        reportarNumeroSuerte(obtenerNumeroSuerte(leerFecha()));
    }
    
}
