package actividad2;

import java.util.Scanner;

/**
 *
 * @author Ángel Hidalgo
 */
public class Actividad2 {

    static void encabezados() {
        System.out.println("UNIVERSIDAD AUTÓNOMA DE CAMPECHE");
        System.out.println("FACULTAD DE INGENIERÍA");
        System.out.println("INGENIERÍA EN SISTEMAS COMPUTACIONALES");
        System.out.println("----------------------------------------");

    }

    static void separador() {
        System.out.println("[-----------------------------------------------]");
    }

    static void menú() {
        System.out.println("1.-----Sandaleas / Gucci-----");
        System.out.println("2.-----Tennis / Nike-----");
        System.out.println("3.-----Tennis / Ozono-----");
        System.out.println("4.-----Zapatos / Flexi-----");
        System.out.println("5.-----Botas / Contempo-----");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        encabezados();
        System.out.println(" ");
        //1.- Crear un menú del 1 al 5 con opciones de acciones  se lea un valor de tipo int y se procese algún mensaje.   
        int valor = 0;

        System.out.println("[----------EJERCICIO 1-------------]");
        System.out.println("[-----------M E N Ú---------------]");
        menú();
        System.out.println("Escoja un elemento de nuestro menú:");
        valor = teclado.nextInt();
        switch (valor) {

            case 1:
                System.out.println("Sandaleas / Gucci");
                System.out.println("PRECIO: $3,000");
                break;
            case 2:
                System.out.println("Tennis / Nike");
                System.out.println("PRECIO: $400");
                break;
            case 3:
                System.out.println("Tennis / Ozono");
                System.out.println("PRECIO: $499");
                break;
            case 4:
                System.out.println("Zapatos / Flexi");
                System.out.println("PRECIO: $320");
                break;
            case 5:
                System.out.println("Botas / Contempo");
                System.out.println("PRECIO: $999");
                break;
        }

        separador();
        System.out.println(" ");
        //2.- Crear un menú del 1 al 5 con opciones de acciones  se lea un valor de tipo string 
        //(correr, saltar, dormir, comer, estudiar) y se proceso algun mensaje.
        String opcion = "";

        System.out.println("[----------EJERCICIO 2--------------]");

    }

}
