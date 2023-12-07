package interfaz;
import java.util.ArrayList;
import java.util.Scanner;
import dominio.*;

public class Interfaz2 {
    public ArrayList<Juego> juegos;
    public ArrayList<Consolas> consolas;
    public Scanner sc = new Scanner(System.in);

    public Interfaz2() {
        juegos = new ArrayList<>();
        consolas = new ArrayList<>();
    }
        public void anadirConsola() {
        System.out.println("Introduzca el nombre de la consola");
        String nombre = sc.next();
        System.out.println("Introduzca el precio de la consola");
        int precio = sc.nextInt();
        Consolas c = new Consolas(nombre, precio);
        consolas.add(c);
    }

    public void anadirJuego() {
        System.out.println("Introduzca el nombre del juego");
        String nombre = sc.next();
        System.out.println("Introduzca el precio del juego");
        int precio = sc.nextInt();
        System.out.println("Introduzca la calidad grafica del juego");
        int calidad = sc.nextInt();
        System.out.println("Introduzca el nombre del juego");
        String nombrejuego = sc.next();
        System.out.println("Introduzca el numero de jumpscares del juego");
        int jumpscares = sc.nextInt();
        Terror t = new Terror(nombre, precio, calidad, nombrejuego, jumpscares);
        juegos.add(t);
    }

    public void mostrarConsolas() {
        for (int i = 0; i < consolas.size(); i++) {
            System.out.println(consolas.get(i).toString());
        }
    }

    public void mostrarJuegos() {
        for (int i = 0; i < juegos.size(); i++) {
            System.out.println(juegos.get(i).toString());
        }
    }
    public void menu() {
        int opcion = 0;
        do {
            System.out.println("1. Añadir consola");
            System.out.println("2. Añadir juego");
            System.out.println("3. Mostrar consolas");
            System.out.println("4. Mostrar juegos");
            System.out.println("5. Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    anadirConsola();
                    break;
                case 2:
                    anadirJuego();
                    break;
                case 3:
                    mostrarConsolas();
                    break;
                case 4:
                    mostrarJuegos();
                    break;
                case 5:
                    System.out.println("Gracias por usar el programa :)");
                    break;
                default:
                    System.out.println("Opcion incorrecta :(");
                    break;
            }
        } while (opcion != 5);
    }


}


