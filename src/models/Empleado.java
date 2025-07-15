package models;

public class Empleado implements Comparable<Empleado> {
    private int id;
    private String name;
    private String position;

    public Empleado(int id, String name, String position) {
        this.id = id;
        this.name = name;
        this.position = position;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Position: " + position;
    }

    @Override
    public int hashCode() {
        return((Integer)id).hashCode() + name.hashCode();   
    }

    @Override
    public boolean equals(Object obj) {
        return hashCode() == obj.hashCode();
    }

    @Override
    public int compareTo(Empleado o) {
        int compareTo = Integer.compare(id, o.id);
        if (compareTo!=0) return compareTo;
        return name.compareTo(o.name);
    }

    
}