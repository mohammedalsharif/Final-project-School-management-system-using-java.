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
public class Principal extends Employee{

    private int principalBonus;

    public Principal(int principalBonus) {
        super();
        this.principalBonus = principalBonus;
    }

    public Principal() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Principal(Principal p) {
        this.id = p.id;
        this.name = p.name;
    }

    public Principal(String name, int id, String address, String phno, String email, int basicSalary, int principalBonus) {
        super(name, id, address, phno, email, basicSalary);
        this.principalBonus = principalBonus;
        // TODO Auto-generated constructor stub
    }

    public int getPrincipalBonus() {
        return principalBonus;
    }

    public void setPrincipalBonus(int principalBonus) {
        this.principalBonus = principalBonus;
    }
    
     public String toString() {
        return "Principal [name=" + name + ", id=" + id + ", address=" + address + ", phno=" + phno + ", email=" + email
                + ", basicSalary=" + basicSalary + ", liveExpense="  + ", principalBonus=" +this.principalBonus + "]";
    }


    @Override
    double getSalary() {

        return (basicSalary + basicSalary* 0.10 + principalBonus);
    }
}
/**
 *
 * @author Mohammed MN AlSharfi
 * 1301183242
 */