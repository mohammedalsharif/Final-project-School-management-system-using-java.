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
public abstract class Employee implements Serializable{

    String name;
    int id;
    String address;
    String phno;
    String email;
    int basicSalary;
    

    public Employee() {
        super();
    }

    public Employee(String name, int id, String address, String phno, String email, int basicSalary) {
        super();
        this.name = name;
        this.id = id;
        this.address = address;
        this.phno = phno;
        this.email = email;
        this.basicSalary = basicSalary;
       
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhno() {
        return phno;
    }

    public void setPhno(String phno) {
        this.phno = phno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(int basicSalary) {
        this.basicSalary = basicSalary;
    }

 

    @Override
    public String toString() {
        return "Employee [name=" + name + ", id=" + id + ", address=" + address + ", phno=" + phno + ", email=" + email
                + ", basicSalary=" + basicSalary + ", liveExpense=" +  "]";
    }

    abstract double getSalary();
}
/**
 *
 * @author Mohammed MN AlSharfi
 * 1301183242
 */
