package Service;

import Model.Student;

import java.util.Scanner;

public class StudentService {
    Scanner scanner = new Scanner(System.in);

    public Student createStudent() {
        System.out.print("name: ");
        String name = scanner.next();
        System.out.print("surname: ");
        String surname = scanner.next();
        System.out.print("year born: ");
        int year = scanner.nextInt();
        System.out.print("mark: ");
        double mark = scanner.nextDouble();
        System.out.print("gender: ");
        char gender = scanner.next().charAt(0);
        System.out.print("phd degree: ");
        boolean phdDegree = scanner.nextBoolean();

        Student student = new Student();
        student.setName(name);
        student.setSurname(surname);
        student.setYear(year);
        student.setMark(mark);
        student.setGender(gender);
        student.setPhdDegree(phdDegree);

        System.out.println("-------------");
        return student;


    }


    public void printArrayInfo(Student[] students) {
        for(Student student : students) {
            student.printInfo();

        }
    }
}
