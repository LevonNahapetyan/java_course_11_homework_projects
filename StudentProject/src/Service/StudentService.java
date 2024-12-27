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


    public void printOldestStudent(Student[] students) {
        Student oldest = students[0];
        for(int i = 1; i < students.length; i++) {
            if(students[i].getYear() < oldest.getYear()) {
                oldest = students[i];
            }
        }
        System.out.println("The oldest student is " + oldest.getName() + ". He/she is " + (2024-oldest.getYear()) + " years old");
    }


    public void printOldestInGirls(Student[] students) {
        Student oldest = null;
        for(Student student : students) {
            if(oldest == null) {
                if(student.getGender() == 'F') {
                    oldest = student;
                }
            } else if (student.getGender() == 'F' && student.getYear() < oldest.getYear()) {
                oldest = student;
            }
        }
        if(oldest != null) {
            System.out.println("Oldest female student is " + oldest.getName());
        } else {
            System.out.println("No female students");
        }
    }



    public void sortStudentsByMark(Student[] students){
        Student temp = null;
        for(int i = 0; i < students.length; i++) {
            for(int j = 1; j < students.length; j++) {
                if(students[j].getMark() > students[j-1].getMark()) {
                    temp = students[j];
                    students[j] = students[j-1];
                    students[j-1] = temp;
                }
            }
        }
    }
}
