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

    public void borrarConsola(){
        System.out.println("Introduzca el nombre de la consola que desea borrar");
        //usando el scanner y bucle for para hacer algo distinto a lo que hemos hecho en clase
        String nombre = sc.next();
        for (int i = 0; i < consolas.size(); i++) {
            if (consolas.get(i).getNombre().equals(nombre)) {
                consolas.remove(i);
            }
        }
    }

    public void borrarJuego(){
        System.out.println("Introduzca el nombre del juego que desea borrar");
        String nombre = sc.next();
        for (int i = 0; i < juegos.size(); i++) {
            if (juegos.get(i).getNombre().equals(nombre)) {
                juegos.remove(i);
            }
        }
    }
    public void menu() {
        int opcion = 0;
        do {
            System.out.println("-----MENU-----");
            System.out.println("Bienvenido a la tienda de consolas");
            System.out.println("¿Que desea hacer?");
            System.out.println("1. Añadir consola");
            System.out.println("2. Añadir juego");
            System.out.println("3. Mostrar consolas");
            System.out.println("4. Mostrar juegos");
            System.out.println("5. Borrar consola");
            System.out.println("6. Borrar juego");
            System.out.println("7. Salir");
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
                    borrarConsola();
                    break;
                case 6:
                    borrarJuego();
                    break;
                case 7: 
                    System.out.println("No te vayas plis :,3");
                    break;
                default:
                    System.out.println("Opcion incorrecta :(");
                    break;
            }
        } while (opcion != 5);
    }


}


