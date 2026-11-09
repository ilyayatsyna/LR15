package org.example;

public class Tool {
    private String name;
    private int id;
    private String usage;

    public Tool(String name, int id, String usage) {
        this.name = name;
        this.id = id;
        this.usage = usage;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getUsage() {
        return usage;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Название: " + name + ", Назначение: " + usage;
    }
}