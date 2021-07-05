package co.misiontic2022.c2;

import java.security.ProviderException;

import javax.print.DocFlavor.STRING;

public class promedioAjustadoNotas {

    public static int esPeorNota(int notaComparar, int peorNota) {
        if(notaComparar > peorNota) {
            notaComparar = peorNota;
        }
        return(peorNota);
    }

    public static double nota_quices(int nota1, int nota2, int nota3, int nota4, int nota5){

        double promedioAjustado = 0;

        int peorNota = nota1;

        peorNota = esPeorNota(peorNota, nota2);
        peorNota = esPeorNota(peorNota, nota3);
        peorNota = esPeorNota(peorNota, nota4);
        peorNota = esPeorNota(peorNota, nota5);
    
        promedioAjustado = ((nota1 + nota2 + nota3 + nota4 + nota5) - peorNota) / 4;
        promedioAjustado = promedioAjustado / 20;
        
        return(promedioAjustado);

    }

    public static void presentarResultado(String codigo, double promedioAjustado) {
        System.out.println("El promedio ajustado del estudiante " + codigo + " es: " + promedioAjustado);
    }

    public static void main(String[] args) {
        String codigo = "A0010276";
        presentarResultado(codigo, nota_quices(40, 50, 39, 76, 96));
    }
    
}
