package ejercicio2guiaColeccionesPag19;

import java.util.ArrayList;
import java.util.Scanner;

/*
* Crear una clase llamada CantanteFamoso. Esta clase guardará cantantes famosos y
tendrá como atributos el nombre y discoConMasVentas.
Se debe, además, en el main, crear una lista de tipo CantanteFamoso y agregar 5
objetos de tipo CantanteFamoso a la lista. Luego, se debe mostrar los nombres de
cada cantante y su disco con más ventas por pantalla.
Una vez agregado los 5, en otro bucle, crear un menú que le de la opción al usuario de
agregar un cantante más, mostrar todos los cantantes, eliminar un cantante que el
usuario elija o de salir del programa. Al final se deberá mostrar la lista con todos los
cambios.
* */
public class CantanteFamoso {
    public static ArrayList<Cantante> cantantes = new ArrayList<Cantante>();
    public static Scanner sc = new Scanner(System.in);
    public static void llenarLista(ArrayList<Cantante> cantantes){
        cantantes.add(new Cantante("RHCP","Stadium Arcadium"));
        cantantes.add(new Cantante("Ed Sheeran", "÷"));
        cantantes.add(new Cantante("Beyoncé", "Lemonade"));
        cantantes.add(new Cantante("Lady Gaga", "The Fame"));
    }
    public static void main(String[] args) {

        llenarLista(cantantes);
        System.out.println("Listado de cantantes con su disco mas famoso");

        //comienzo del programa.
        int opcion=0;
        while (opcion!=4){
            System.out.println("Ingrese una opcion para empezar a trabajar:");
            System.out.println("1. Agregar un cantante");
            System.out.println("2. Mostrar cantantes");
            System.out.println("3. Eliminar un cantante");
            System.out.println("4. Salir");
            opcion= sc.nextInt();
            sc.nextLine();
            switch (opcion){
                case 1:
                    agregarCantante();
                    break;
                case 2:
                    mostrarCantantes();
                    break;
                case 3:
                    eliminarCantante();
                case 4:
                    System.out.println("Gracias por utilizar nuestros servicios");
                    break;
            }
        }
        }
        public static void agregarCantante(){
            System.out.println("Agrega el nombre del cantante:");
            String nombre = sc.nextLine();
            System.out.println("Agrega el nombre del album");
            String album= sc.nextLine();
            cantantes.add(new Cantante(nombre,album));
            System.out.println("Cantante agregado exitosamente");
        }
        public static void mostrarCantantes(){
            System.out.println("\n Cantantes famosos:");
            for(Cantante cantante: cantantes) {
                System.out.println(cantante);
            }
            System.out.println("\n");
        }
        public static void eliminarCantante(){
            System.out.println("Ingrese el nombre del cantante que desea eliminar");
            String nombre= sc.nextLine();
            for(int i=0; i< cantantes.size();i++){
                if (cantantes.get(i).getNombre().equals(nombre)) {
                    cantantes.remove(i);
                    System.out.println("Cantante eliminado exitosamente");
                    mostrarCantantes();
                    return;
                }
            }
            System.out.println("No se encontro al cantante");
        }
}
