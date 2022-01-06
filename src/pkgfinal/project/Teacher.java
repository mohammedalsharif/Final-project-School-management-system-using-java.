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
public class Teacher extends Employee implements Serializable{

    int NumberClasess;

    public Teacher(int NumberClasess) {
        super();
        this.NumberClasess = NumberClasess;
    }

    public Teacher() {
        super();

    }

    public Teacher(String name, int id, String address, String phno, String email, int basicSalary,  int classNo) {
        super(name, id, address, phno, email, basicSalary);
        this.NumberClasess = classNo;
    }

    Teacher(Teacher teacher1) {
        this.name = teacher1.name;
        this.id = teacher1.id;
        this.address = teacher1.address;
        this.phno = teacher1.phno;
        this.email = teacher1.email;
        this.basicSalary = teacher1.basicSalary;
        this.NumberClasess = teacher1.NumberClasess;
    }

    public int getClassNo() {
        return NumberClasess;
    }

    public void setClassNo(int NumberClasess) {
        this.NumberClasess = NumberClasess;
    }

    @Override
    public String toString() {
        return "Teacher [name=" + name + ", id=" + id + ", address=" + address + ", phno=" + phno + ", email=" + email
                + ", basicSalary=" + basicSalary + ", liveExpense=" +", NumberClasess=" + this.NumberClasess + "]";
    }

    @Override
    double getSalary() {
        double salary = basicSalary + 0.1 * basicSalary + 20 * NumberClasess;
        return salary;
    }

}
/**
 *
 * @author Mohammed MN AlSharfi
 * 1301183242
 */