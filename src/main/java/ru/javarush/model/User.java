package ru.javarush.model;


import javax.persistence.*;
import java.util.Date;

@Entity
public class User {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column
    private String name;
    @Column
    private int age;
    @Column
    private boolean isAdmin;
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Date createdDate;

    public User(){}

    public User(int id, String name, int age, boolean isAdmin, Date cteateDate) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.isAdmin = isAdmin;
        this.createdDate = cteateDate;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public Date getCteateDate() {
        return createdDate;
    }

    public void setCteateDate(Date cteateDate) {
        this.createdDate = cteateDate;
    }
}
