package simulacioncalc;

import java.util.Scanner;

public class Simulacioncalc {

    public static void main(String[] args) {
        //SIMULADOR DE CALCULADORA CON VARIABLES DE OPCIONES
        //CONSTRUIR UN PROGRAMA QUE SIMULE EL FUNCIONAMIENTO 
        //DE UNA CALCULADORA QUE PUEDE REAZLIAR LAS CUATRO OPERACIONES
        //ARITMETICAS BASICAS

        int num1;
        int num2;
        char operacion;
        int suma;
        int resta;
        int mult;
        int div;

        Scanner entrada = new Scanner(System.in);
        System.out.println("INGRESA EL PRIMER NUMERO");
        num1 = entrada.nextInt();

        System.out.println("INGRESA EL SEGUNDO NUMERO");
        num2 = entrada.nextInt();

        System.out.println("DIGITE LA OPERACION QUE DESEE REALIZAR");
        operacion = entrada.next().charAt(0);

        switch (operacion) {
            case 'S':
            case 's':
                System.out.println("LA SUMA ES :" + num1 + num2);
                break;
            case 'R':
            case 'r':
                System.out.println("LA RESTA ES :" + (num1 - num2));
                break;
            case 'P':
            case 'p':
            case 'm':
            case 'M': 
                System.out.println("LA MULTIPLICACION ES :" + num1*num2);
                break;
            case 'd':
            case 'D':
                System.out.println("LA DIVISION ES :" + num1/num2);
                break;
            default :
                System.out.println("ERROR, SE EQUIVOCO DE OPERACION");
        }

    }

}
