package controller;

import entity.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentController {
    static ArrayList<Student> list = new ArrayList<>();

    public void add() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập ID : ");
        String enrollid = sc.nextLine();
        System.out.println("Nhập họ : ");
        String firstname = sc.nextLine();
        System.out.println("Nhập tên : ");
        String lastname = sc.nextLine();
        System.out.println("Nhập tuổi : ");
        int age = sc.nextInt();
        Student student = new Student(enrollid, firstname, lastname, age);
        list.add(student);

    }

    public void save() throws IOException {
        try {
            String content = "   EnrollID         |                 FullName               |         Age  \n";
            BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/admin/thuchanhjava2/src/main/resources/students.dat", true));
            bw.write(content);
            for (Student student : list
            ) {
                bw.write(
                        "   " + student.getEnrollID() + "               "  + "           " + student.getFisrtName() + student.getLastName() + "                    " + "      " + student.getAge() + "\n");
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void read() throws IOException {
        FileReader fileReader = new FileReader("/Users/admin/thuchanhjava2/src/main/resources/students.dat");
        BufferedReader br = new BufferedReader(fileReader);

        while (true) {
            String line = br.readLine();
            if (line == null) {
                break;
            }
            System.out.println(line);
        }
    }
}
