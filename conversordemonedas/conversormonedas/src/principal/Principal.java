package principal;

import modelos.ConsultaApi;
import modelos.Conversor;
import modelos.Resultado;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        ConsultaApi consulta = new ConsultaApi();
        Scanner lectura = new Scanner(System.in);
        String moneda1 = "";
        String moneda2 = "";
        double cant=0;
        int opcion=0;
        double conversion=0;
        System.out.println("*************************************");
        System.out.println("Bienvenido/a al conversor de monedas");


        while(opcion < 7){
            System.out.println("Elige la moneda Base");
            String presentacion = """
                    Menu
                    1) Dolar (USD).
                    2) Peso Argentino (ARS).
                    3) Peso Mexicano (MXN).
                    4) Peso Colombiano (COP).
                    5) Euro (EUR).
                    7) Salir
                    """;

            System.out.println(presentacion);
            opcion = lectura.nextInt();
            switch (opcion) {

                case 1:
                    moneda1 = "USD";
                    break;

                case 2:
                    moneda1 = "ARS";
                    break;

                case 3:
                    moneda1 = "MXN";
                    break;

                case 4:
                    moneda1 = "COP";
                    break;

                case 5:
                    moneda1 = "EUR";
                    break;

                case 7:
                    opcion = 7;
                        break;


            }

            if (opcion == 7){
                break;
            }

            System.out.println("Elija la moneda a la que quiere hacer conversion");
            System.out.println(presentacion);
            opcion = lectura.nextInt();
            switch (opcion) {

                case 1:
                    moneda2 = "USD";
                    break;

                case 2:
                    moneda2 = "ARS";
                    break;

                case 3:
                    moneda2 = "MXN";
                    break;

                case 4:
                    moneda2 = "COP";
                    break;

                case 5:
                    moneda2 = "EUR";
                    break;

            }

            System.out.println("Indique la cantidad para la conversion:");
            cant= lectura.nextDouble();
            Resultado resultado = consulta.buscarMoneda(moneda1, moneda2, cant);
            conversion= resultado.conversion_result();
            System.out.println("El valor: "+cant+"("+moneda1+") corresponde al valor final de ===> "+conversion+" ("+moneda2+")");
            System.out.println("*****************************************************");

        }
        System.out.println("**Gracias, Vuelve pronto.**");



    }
}
