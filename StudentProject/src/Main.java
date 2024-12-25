import Model.Student;
import Service.StudentService;

public class Main {
    public static void main(String[] args) {
        StudentService service = new StudentService();
        Student s1 = service.createStudent();
        Student s2 = service.createStudent();
        Student s3 = service.createStudent();
        Student[] students = {s1, s2, s3};
        service.printArrayInfo(students);
//        s1.printInfo();


    }
}
