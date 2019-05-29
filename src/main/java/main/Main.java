package main;

import controller.StudentController;
import java.io.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        while (true) {
            Main main = new Main();
            Scanner scanner = new Scanner(System.in);
            System.out.println("-------Student manager-------");
            System.out.println("1.Thêm học sinh ");
            System.out.println("2.Lưu hộc sinh ");
            System.out.println("3.Hiển thị toàn bộ học sịnh ");
            System.out.println("4.Thoát ");
            StudentController controller=new StudentController();
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    controller.add();
                    break;
                case 2:
                    controller.save();
                    break;
                case 3:
                    controller.read();
                    break;
                case 4:
                    System.out.println("Thoát");
                    break;
                default:
                    System.out.println("lựa chọn sai vui lòng chọn lại.");
                    break;
            }
        }
    }
}
