package com.dsz.sqlite;

/**
 * Created by Administrator on 2016/11/2.
 */

public class Person {

    private int id;
    private String name;
    private boolean falg;

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

    public boolean isFalg() {
        return falg;
    }

    public void setFalg(boolean falg) {
        this.falg = falg;
    }
    public Person(){

    }

    public Person(String name,boolean falg) {
        this.falg = falg;
        this.name = name;
    }


    public Person(int id, boolean falg, String name) {
        this.id = id;
        this.falg = falg;
        this.name = name;
    }
}
