package org.example;

class Division {
    private static int nextId = 1;
    final private int id;
    final private String name;

    public Division(String name) {
        this.id = nextId++;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    /**
     * @return string containing the properties of the class
     */
    @Override
    public String toString() {
        return name + " " + id;
    }
}
