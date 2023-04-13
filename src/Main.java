import java.util.Scanner;
import java.lang.*;
public class Main {
    public static void main(String[] args) {
        int numeroMaximo = Integer.MIN_VALUE;
        int numeroMinimo = Integer.MAX_VALUE;
        int numeroIngresadoPorConsola;
        int contadorDeNumerosIngresados = 0;
        int totalDeTodosLosNumeros = 0;
        float promedio;

        Scanner scanner = new Scanner(System.in);

        String mensajeInicial;
        mensajeInicial = "Ingrese todos los numeros que usted desee(Al ingresar 0 se termina el proceso)";
        System.out.println(mensajeInicial);


        do {
            numeroIngresadoPorConsola = scanner.nextInt();

            if(numeroIngresadoPorConsola != 0){
                contadorDeNumerosIngresados ++;
            }

            totalDeTodosLosNumeros = totalDeTodosLosNumeros + numeroIngresadoPorConsola;

            if(numeroIngresadoPorConsola >= numeroMaximo){
                if(numeroIngresadoPorConsola == 0){
                    System.out.println("Cierre de proceso");
                }else{
                    numeroMaximo = numeroIngresadoPorConsola;
                }
            }

            if(numeroIngresadoPorConsola <= numeroMinimo){
                if(numeroIngresadoPorConsola == 0){
                    System.out.println("Cierre de proceso");
                }else{
                numeroMinimo = numeroIngresadoPorConsola;
                }
            }

        }while (numeroIngresadoPorConsola != 0);

        promedio = totalDeTodosLosNumeros/contadorDeNumerosIngresados;

        System.out.println("Este es el numero mas bajo ingresado: " + numeroMinimo);
        System.out.println("Este es el numero mas alto ingresado: " + numeroMaximo);
        System.out.println("Han sido ingresados " + contadorDeNumerosIngresados + " numeros.");
        System.out.println("El promedio de todos los numeros ingresados es: " + promedio);
    }
}


            /*if(numeroIngresadoPorConsola == 0){
                System.out.println("Cierre de proceso");
            }*/
            /*else if(numeroIngresadoPorConsola == 0){
                System.out.println("Cierre de ingreso");
            }else if(numeroIngresadoPorConsola < numeroMaximo){
                numeroMinimo = numeroIngresadoPorConsola;
            }*/