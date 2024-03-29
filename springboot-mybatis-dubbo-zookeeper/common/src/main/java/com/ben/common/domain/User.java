package com.ben.common.domain;

import java.io.Serializable;

public class User implements Serializable {
    private static final long serialVersionUID = 8211467894571021590L;

    private int id;
    private String name;

    public User(){}

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
