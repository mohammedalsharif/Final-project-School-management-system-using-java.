/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal.project;

import com.sun.source.tree.BreakTree;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Mohammed MN AlSharfi
 * 1301183242
 */
public class FinalProject {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Principal principal = null;
        String SubjectName = null;
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Teacher> teachers = new ArrayList<>();
        ArrayList<Subject> subjects = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        File filered = new File("output.dat");

        if (filered.exists()) {
            FileInputStream FIS = new FileInputStream(filered);
            ObjectInputStream OIS = new ObjectInputStream(FIS);
            try {

                ArrayList<Teacher> listtea = (ArrayList<Teacher>) OIS.readObject();
                for (Teacher teach : listtea) {
                    teachers.add(teach);
                }

                ArrayList<Student> liststu = (ArrayList<Student>) OIS.readObject();
                for (Student studen : liststu) {
                    students.add(studen);
                }

                ArrayList<Subject> listsub = (ArrayList<Subject>) OIS.readObject();
                for (Subject subjec : listsub) {
                    subjects.add(subjec);
                }
                OIS.close();
                FIS.close();

            } catch (IOException e) {
                System.out.println("errrror");
            }
        }
        int choice;
        while (true) {
            System.out.println("1 - Add Employee");
            System.out.println("2 - Add Student");
            System.out.println("3 - Add Subject");
            System.out.println("4 - Show Subjects");
            System.out.println("5 - Show Employee Salaries");
            System.out.println("6 - Count of Student in any Subject");
            System.out.println("7 - Save data in file");
            System.out.println("8 - Exit");

            choice = scanner.nextInt();

            if (choice == 1 || choice == 5) {
                System.out.println("Press 1 to choose teacher , 2 to choose Principal");
                int nextChoice = scanner.nextInt();
                if (choice == 1) {

                    String name;
                    int id;
                    String address;
                    String phno;
                    String email;
                    int basicSalary;
                    int liveExpense;

                    System.out.println("Enter Name :");
                    name = scanner.next();

                    System.out.println("Enter Id :");
                    id = scanner.nextInt();

                    System.out.println("Enter Address :");
                    address = scanner.next();

                    System.out.println("Enter phNo :");
                    phno = scanner.next();

                    System.out.println("Enter email :");
                    email = scanner.next();

                    System.out.println("Enter Basic Salary");
                    basicSalary = scanner.nextInt();

                   

                    if (nextChoice == 1) {
                        int classNo;
                        System.out.println("Enter number of Class :");
                        classNo = scanner.nextInt();
                        Teacher teacher = new Teacher(name, id, address, phno, email, basicSalary, classNo);
                       
                        teachers.add(teacher);

                    } else {
                        System.out.println("principal Bonus :");
                        int bonus = scanner.nextInt();
                        principal = new Principal(name, id, address, phno, email, basicSalary, bonus);
                    }
                } else {
                    if (nextChoice == 1) {
                        if (teachers.isEmpty()) {
                            System.out.println("Teacher Not Exists" + "\n" + "________________________________");
                        } else {

                            for (Teacher teacher1 : teachers) {
                                System.out.println(teacher1.getName() + ":" + teacher1.getSalary() + "\n"
                                        + "________________________________");
                            }
                        }

                    } else {
                        if (principal == null) {
                            System.out.println("Principal Not Exists");
                        } else {
                            System.out.println(principal.getName() + ":" + principal.getSalary() + "\n"
                                    + "________________________________");
                        }
                    }

                }
            } else if (choice == 2) {
                System.out.println("Enter { StudentId , StudentName , Studentlevel }");
                String name;
                int id;
                int Studentlevel;
                System.out.println("Enter Student Id :");
                id = scanner.nextInt();
                System.out.println("Enter Student Name :");
                name = scanner.next();
                System.out.println("Enter Student level :");
                Studentlevel = scanner.nextInt();
                Student s = new Student(id, name, Studentlevel);

                students.add(s);

            } else if (choice == 3) {
                System.out.println("Enter { SubjectName , SubjectStudent , StudentTeacher }");
                Teacher StudentTeacher = null;
                Student Subjectstudent = null;
                System.out.println("Enter SubjectName :");
                SubjectName = scanner.next();

                System.out.println("List Students Name");
                int j = 1;
                for (Student student : students) {
                    System.out.println(j + " - " + student.getName());
                    j++;
                }

                System.out.println("Enter Student Name :");
                String Sname=scanner.next();

                for (Student student : students) {
                    if (student.getName().equals(Sname)) {
                        Subjectstudent = new Student(student);
                    }
                    
                }

                System.out.println("List Teachers Name ");
                int i = 1;
                for (Teacher teacher1 : teachers) {
                    System.out.println(i + " - " + teacher1.getName());
                    i++;
                }
                  
                System.out.println("Enter Teacher Name :");
                String Tname=scanner.next();
                for (Teacher teacher1 : teachers) {
                    if (teacher1.getName().equals(Tname)) {
                        StudentTeacher = new Teacher(teacher1);
                    }

                }
                if (StudentTeacher == null || SubjectName == null) {
                    System.out.println("no subject added");
                } else {

                    Subject subject = new Subject(SubjectName, StudentTeacher, Subjectstudent);
                    subjects.add(subject);

                }
            } else if (choice == 4) {

                for (Subject subject : subjects) {
                    if (subject != null) {
                        System.out.println(subject);
                    } else {
                        System.out.println("Subject not fuond" + "\n_________________");
                    }
                }
            } else if (choice == 6) {
                System.out.println("Enter Subject");
                String cuontsubject = scanner.next();
                int cnt = 0;
                for (Subject subject : subjects) {
                    if (subject.getName().equals(cuontsubject)) {
                        cnt++;
                    }
                }
                System.out.println("Total Students in  " + cuontsubject + " are :" + cnt);
            } else if (choice == 7) {
                try {
                    FileOutputStream fileOS = new FileOutputStream("output.dat");
                    ObjectOutputStream fileOOS = new ObjectOutputStream(fileOS);
                    fileOOS.writeObject(teachers);
                    fileOOS.writeObject(students);
                    fileOOS.writeObject(subjects);
                    fileOOS.close();
                    fileOS.close();
                } catch (IOException e) {
                    System.out.println("NoWrite");
                }

                System.out.println("Done*_*\n__________________________");
            } else if(choice==8){
                scanner.close();
                return;
            }else{ 
                
                System.out.println("Please, enter a valid value");
            }
        }
    }

}

/**
 *
 * @author Mohammed MN AlSharfi
 * 1301183242
 */