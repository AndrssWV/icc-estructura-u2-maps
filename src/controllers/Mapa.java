package controllers;

import java.security.KeyStore.Entry;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import models.Empleado;

public class Mapa {
    public Mapa() {
        System.out.println("Mapa Class");
    }

    public void runHashMap() {
        Map<String, String> mapa = new HashMap<>();
        mapa.put("001", "Celular");
        mapa.put("002", "Laptop");
        mapa.put("003", "Celular");
        mapa.put("003", "PC");

        System.out.println(mapa);
        System.out.println(mapa.keySet());
        for (String k : mapa.keySet()) System.out.println(mapa.get(k));

        System.out.println(mapa.get("005"));
    }

    public void runLinkedHashMap() {
        Map<Integer, String> mapa = new LinkedHashMap<>();
        mapa.put(1, "Andres");
        mapa.put(2, "Diego");
        mapa.put(3, "Jaime");
        mapa.put(4, "Pedro");
        mapa.put(5, "Sebastian");
        System.out.println(mapa);
        for (int k : mapa.keySet()) System.out.println(mapa.get(k));
    }

    public void runTreeMap() {
        Map<Integer, String> mapa = new TreeMap<>();
        mapa.put(1, "carro");
        mapa.put(2, "bicicleta");
        mapa.put(3, "moto");
        System.out.println(mapa);
    }

    public void runHashMapObj() {
        Map<Empleado, Integer> empleados = new HashMap<>();
        empleados.put(new Empleado(1, "Juan", "dev"), 1200);
        empleados.put(new Empleado(2, "Juan", "dev"), 1500);
        empleados.put(new Empleado(3, "Pedro", "dev"), 2000);
        empleados.put(new Empleado(1, "Juan", "dev"), 2500);
        empleados.put(new Empleado(1, "Pablo", "dev"), 3000);        
        System.out.println(empleados);
        for (Empleado k : empleados.keySet()) System.out.println(empleados.get(k));
    }

    public void runTreeMapObj() {
        Map<Empleado, Integer> empleados = new TreeMap<>();
        empleados.put(new Empleado(1, "Juan", "dev"), 1200);
        empleados.put(new Empleado(2, "Juan", "dev"), 1500);
        empleados.put(new Empleado(3, "Pedro", "dev"), 2000);    
        System.out.println(empleados);
        for (Empleado k : empleados.keySet()) System.out.println(empleados.get(k));
    }
}
