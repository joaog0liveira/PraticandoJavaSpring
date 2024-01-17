package com.praticaspring.praticando.entities;

public class Department {
    private Long id;
    private String name;

    // se eu usar a anotation do lombok eu elimino essa parte de criar o construtor
    // mas aqui irei usar os métodos do java
    public Department(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Department() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
