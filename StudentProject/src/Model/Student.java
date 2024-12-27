package Model;

public class Student {
    private String name;
    private String surname;
    private int year;
    private double mark;
    private char gender;
    private boolean phdDegree;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public boolean isPhdDegree() {
        return phdDegree;
    }

    public void setPhdDegree(boolean phdDegree) {
        this.phdDegree = phdDegree;
    }

    public void printInfo() {
        System.out.println("name: " + name);
        System.out.println("surname: " + surname);
        System.out.println("year born: " + year);
        System.out.println("mark: " + mark);
        System.out.println("gender: " + gender );
        System.out.println("phdDegree: " + phdDegree);
        System.out.println();
        System.out.println("-------------------------------------");
    }



}
