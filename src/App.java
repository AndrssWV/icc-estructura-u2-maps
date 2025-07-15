import controllers.Ejercicios;
import controllers.EmpleadoController;
import controllers.Mapa;

import models.Empleado;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("----Practica Mapas----");
        System.out.println("Nombre: Andres Villalta"); /// Cambiar por su nombre
        // Ejecuta el ejemplo de uso de HashMap con ejemplos sencillos
        //runMapExamlpe();

        // // Ejecuta el ejemplo de gestión de empleados usando HashMap
        // runEmpleadoExample();

        // // Ejecuta los ejercicios de sumatoria y anagramas
        runEjerccios();
    }

    private static void runMapExamlpe() {
        Mapa mapa = new Mapa();
        mapa.runHashMap();
        mapa.runLinkedHashMap();
        mapa.runTreeMap();
        mapa.runHashMapObj();
        mapa.runTreeMapObj();
        
    }

    private static void runEmpleadoExample() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    private static void runEjerccios() {
        Ejercicios ejercicios = new Ejercicios();

        System.out.println("\n--- Anagramas ---");
        System.out.println("listen vs silent: " + Ejercicios.areAnagrams("listen", "silent"));
        System.out.println("hello vs bello: " + Ejercicios.areAnagrams("hello", "bello"));
        System.out.println("triangle vs integral: " + Ejercicios.areAnagrams("triangle", "integral"));

        System.out.println("\n--- Sumatoria de Dos ---");
        int[] resultado1 = ejercicios.sumatoriaDeDos(new int[]{9, 2, 3, 6}, 5);
        mostrarResultadoSumatoria(5, resultado1);

        int[] resultado2 = ejercicios.sumatoriaDeDos(new int[]{9, 2, 3, 6}, 10);
        mostrarResultadoSumatoria(10, resultado2);

        System.out.println("\n--- Contar Caracteres ---");
        ejercicios.contarCaracteres("hola");

        System.out.println("\n--- sonAnagramas ---");
        System.out.println("roma vs amor: " + ejercicios.sonAnagramas("roma", "amor"));
        System.out.println("roma vs ramo: " + ejercicios.sonAnagramas("roma", "ramo"));
    }

    private static void mostrarResultadoSumatoria(int objetivo, int[] indices) {
        if (indices!=null) System.out.println("Índices para " + objetivo + ": [" + indices[0] + ", " + indices[1] + "]");
        else System.out.println("No hay combinación para " + objetivo);
    }
}
