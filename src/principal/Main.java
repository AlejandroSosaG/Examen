package principal;
import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// Vamos a presentar un menú que permita al usuario elegir entre dibujar una figura geómetrica, calcular si un número es ególatra o jugar a los dados.
        Scanner s=new Scanner(System.in);
        Random r=new Random();
        String respuesta;
        int opc;
        double num;
        char car;
        int rondas;
        int dado1;
        int dado2;
        int usuario;
        int rival;
        int suma;
        int suma2;
        do {
            do {
                System.out.println("¿Cual de las 3 opciones desea elegir?");
                opc = s.nextInt();
                switch (opc) {
                    case (1):
                        do {
                            System.out.println("Introduzca un número impar entre 5 y 15 para la base de la figura y el caracter *, b o h para dibujarla");
                            num = s.nextDouble();
                            car = s.next().charAt(0);
                        } while (num != 5 && num != 7 && num != 9 && num != 11 && num != 13 && num != 15 && car != '*' && car != 'b' && car != 'h');
                        System.out.println("Siento informarle de que el resto del programa aún está en construcción");
                    break;
                    case (2):
                        System.out.println("Siento informarle de que esta opción aún está en construcción");
                        break;
                    case (3):
                        System.out.println("¿Cuantas rondas desea jugar?");
                        rondas=s.nextInt();
                        for (int i=0;i<rondas;i++){
                            dado1=r.nextInt(6)+1;
                            dado2=r.nextInt(6)+1;
                            suma=dado1+dado2;
                            System.out.println("El usuario ha sacado un "+dado1+"y un "+dado2);
                            System.out.println("Su puntuación es "+suma);
                            if (dado1==dado2){
                                System.out.println("Ha sacado dobles, así que tira de nuevo");
                                dado1=r.nextInt(6)+1;
                                dado2=r.nextInt(6)+1;
                                suma2=dado1+dado2;
                                suma=suma+suma2;
                                System.out.println("El usuario ha sacado un "+dado1+"y un "+dado2);
                                System.out.println("Su puntuación es "+suma2);
                                System.out.println("Su puntuación total es "+suma);
                                if (dado1==dado2){
                                    System.out.println("Ha sacado dobles, así que vuelve a tirar de nuevo");
                                    dado1=r.nextInt(6)+1;
                                    dado2=r.nextInt(6)+1;
                                    suma2=dado1+dado2;
                                    suma=suma+suma2;
                                    System.out.println("El usuario ha sacado un "+dado1+"y un "+dado2);
                                    System.out.println("Su puntuación es "+suma2);
                                    System.out.println("Su puntuación total es "+suma);
                                    if (dado1==dado2){
                                        System.out.println("Ha sacado dobles, así que pierde los puntos obtenidos");
                                        suma=0;
                                    }
                                }
                            }
                        }
                    break;
                }
                System.out.println("¿Desea volver a elegir una opción?");
                respuesta = s.next();
            }while (opc!=1&&opc!=2&&opc!=3);
        }while (respuesta.equals("Si")||respuesta.equals("Sí")||respuesta.equals("si")||respuesta.equals("sí"));
    }
}
