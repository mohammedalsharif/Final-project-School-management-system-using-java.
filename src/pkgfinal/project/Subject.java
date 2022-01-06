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
public class Subject implements Serializable {

    private String name;
    private Teacher teacher;
    private Student student;

    public Subject() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Subject(String name, Teacher teacher, Student student) {
        super();
        this.name = name;
        this.teacher = teacher;
        this.student = student;
    }
    public Subject(Subject copySubject){
        this.name=copySubject.name;
        this.teacher=copySubject.teacher;
        this.student=copySubject.student;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Subject [name=" + name + ", teacher=" + teacher + ", student=" + student + "]";
    }

}
/**
 *
 * @author Mohammed MN AlSharfi
 * 1301183242
 */