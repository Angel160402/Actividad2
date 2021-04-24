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

    }

    static void separador() {
        System.out.println("[-----------------------------------------------]");
    }

    static void acciones() {
        System.out.println("1.----Correr----");
        System.out.println("2.----Saltar----");
        System.out.println("3.----Dormir----");
        System.out.println("4.----Comer-----");
        System.out.println("5.----Estudiar--");
    }

    static void horario() {
        System.out.println("De 6:00am A 7:00am -> Despertar");
        System.out.println("De 7:00am A 8:00am -> Administración General");
        System.out.println("De 8:00am A 9:00am -> Descanso/Desayunar");
        System.out.println("De 9:00am A 11:00am -> Algebra Lineal");
        System.out.println("De 11:00am A 13:00pm -> Organización Computacional");
        System.out.println("De 13:00pm A 14:00pm -> Descanso");
        System.out.println("De 14:00pm A 16:00pm -> Física");
        System.out.println("De 16:00pm A 19:00pm -> Descanso/Limpieza");
        System.out.println("De 19:00pm A 21:00pm -> Lenguaje de Programación");
        System.out.println("De 21:00pm A 24:00am -> Dormir");
    }

    static void menú() {
        System.out.println("1.-----Sandaleas / Gucci-----");
        System.out.println("2.-----Tennis / Nike-----");
        System.out.println("3.-----Tennis / Ozono-----");
        System.out.println("4.-----Zapatos / Flexi-----");
        System.out.println("5.-----Botas / Contempo-----");
    }
    
    public static void diasDeLaSemana() {
        
    }

 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
/*
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
        String opcion;
        int accion = 0;
        String run = "Correr";
        String jump = "Saltar";
        String sleep = "Dormir";
        String eat = "Comer";
        String study = "Estudiar";
        System.out.println("[----------EJERCICIO 2--------------]");
        acciones();
        System.out.println("Escriba una acción a realizar:");
        opcion = teclado.next();

        switch (opcion) {
            case "Correr":
                System.out.println("Usted eligio:" + run);
                break;
            case "Saltar":
                System.out.println("Usted eligio:" + jump);
                break;
            case "Dormir":
                System.out.println("Usted eligio:" + sleep);
                break;
            case "Comer":
                System.out.println("Usted eligio:" + eat);
                break;
            case "Estudiar":
                System.out.println("Usted eligio:" + study);
                break;
        }

        separador();
        System.out.println(" ");
        //3.- Crear un horario de usted de cualquier día de la semana, ej: 6 Despertar, 7 Clase LP1, 8 Clase LP1, 9 Clase Estructuras, 10 …,
        //21 Dormir, leer un valor de 1  al 24 validar e imprimir la acción que realiza en su horario.
        System.out.println("[----------EJERCICIO 3-------------]");
        System.out.println("[-----------HORARIO DEL DÍA JUEVES---------------]");
        int val1 = 0;
        horario();
        System.out.println("Escoja una hora de 1 a 24 en el horario:");
        System.out.println("¿QUÉ TENGO QUE HACER EN ESA HORA?");
        val1 = teclado.nextInt();

        switch (val1) {

            case 6:
                System.out.println("Despertar");
                break;
            case 7:
                System.out.println("Clse de Adiministración General");
                break;
            case 8:
                System.out.println("Descanso/Desayuno");
                break;
            case 9:
                System.out.println("Clase de Algebra Lineal");
                break;
            case 11:
                System.out.println("Clase de Organización Computacioal");
                break;
            case 13:
                System.out.println("Descanso");
                break;
            case 14:
                System.out.println("Clase de Física");
                break;
            case 16:
                System.out.println("Descanso/Limpieza");
                break;
            case 19:
                System.out.println("Clase de Lenguaje de Programación");
                break;
            case 21:
                System.out.println("Dormir");
            default:
                System.out.println("Clase");
        }
        */

        separador();
        System.out.println(" ");
        /*4.- Crear una método en lea un número de tipo int y se solicite a otro método
        que valide el dato entre el 1 al 7  si el valor esta fuera de este rango regrese 
        que es incorrecto y el nombre del día de la semana, como segundo parámetro reciba 
        una valor boleano donde true es semana inglesa (inicia domingo), false es semana laborable (inicia en lunes).*/
        System.out.println("[----------EJERCICIO 4-------------]");
        System.out.println("[----------DÍAS DE LA SEMANA-------------]");
        
    }

}


