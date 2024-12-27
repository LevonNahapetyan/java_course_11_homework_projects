import Model.Student;
import Service.StudentService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentService service = new StudentService();

//---------------------Adding students-------------------------
//        Student s1 = service.createStudent();
//        Student s2 = service.createStudent();
//        Student s3 = service.createStudent();
//        Student s4 = service.createStudent();
//        Student s5 = service.createStudent();
//        Student[] students = {s1, s2, s3};



//---------------------Method Implementations-------------------

//        service.printArrayInfo(students);
//        service.printOldestStudent(students);
//        service.printOldestInGirls(students);
//        service.sortStudentsByMark(students);
//        for(Student student : students) {
//            student.printInfo();
//        }



//------------------------------------Menu---------------------------------------
        boolean menu = true;
        System.out.println("Tell us how many students are you going to create so we can create an array for you because for now our arrays are static");
        int length = scanner.nextInt();
        Student[] studentsForMenu = new Student[length];
        int count = 0;
        int i = 0;
        while(menu == true && count <= length) {
            System.out.println();
            System.out.println();
            System.out.println("-------Menu-------");
            System.out.println("1: Create a student");
            System.out.println("2: Print an info for chosen student");
            System.out.println("3: Print info for an array of students");
            System.out.println("4: Find the oldest student");
            System.out.println("5: Find the oldest female student");
            System.out.println("6: Sort students by mark from high to low");
            System.out.println("7: Exit menu");

            System.out.print("Enter the number: ");
            int n = scanner.nextInt();
            switch (n) {
                case 1:
                    StudentService studentService = new StudentService();
                    Student student = studentService.createStudent();
                    studentsForMenu[i] = student;
                    i++;
                    break;

                case 2:
                    System.out.println("Choose a student by name to print");
                    String printCurrent = scanner.next();
                    for(Student st : studentsForMenu) {
                        if(st.getName().equals(printCurrent)){
                            st.printInfo();
                            break;
                        }
                    }
                    break;

                case 3:
                    for(Student st : studentsForMenu) {
                        if(st == null) {
                            System.out.println("The array isn't full yet");
                            break;
                        } else {
                            StudentService studentService1 = new StudentService();
                            studentService1.printArrayInfo(studentsForMenu);
                        }
                    }
                    break;

                case 4:
                    for(Student student1 : studentsForMenu){
                        if(student1 == null){
                            System.out.println("The array isn't full yet");
                            break;
                        } else{
                            StudentService studentService1 = new StudentService();
                            studentService1.printOldestStudent(studentsForMenu);
                        }
                    }
                    break;

                case 5:
                    for(Student student1 : studentsForMenu){
                        if(student1 == null){
                        System.out.println("The array isn't full yet");
                        break;
                        } else {
                            StudentService studentService1 = new StudentService();
                            studentService1.printOldestInGirls(studentsForMenu);
                        }
                    }
                    break;

                case 6:
                    for(Student student1 : studentsForMenu){
                        if(student1 == null){
                            System.out.println("The array isn't full yet");
                            break;
                        } else{
                            StudentService studentService1 = new StudentService();
                            studentService1.sortStudentsByMark(studentsForMenu);
                        }
                    }
                    break;
                case 7:
                    menu = false;
                    break;
            }

        }



    }
}
