/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal.project;

import java.io.Serializable;

/**
 *
 * @author Mohammed MN AlSharfi
 * 1301183242
 */
public class Student implements Serializable{

    private int id;
    private String name;
    private int level;

    public Student() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Student(int id, String name, int level) {
        super();
        this.id = id;
        this.name = name;
        this.level = level;
    }

    public Student(Student s) {
        this(s.getId(), s.getName(), s.getLevel());
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

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", level=" + level + "]";
    }

}
/**
 *
 * @author Mohammed MN AlSharfi
 * 1301183242
 */