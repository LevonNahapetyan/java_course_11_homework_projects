package Model;

public class StoreModel {
    private String name;
    private String city;
    private int yearFounded;
    private double rating;
    private boolean open24hour;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getYearFounded() {
        return yearFounded;
    }

    public void setYearFounded(int yearFounded) {
        this.yearFounded = yearFounded;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public boolean isOpen24hour() {
        return open24hour;
    }

    public void setOpen24hour(boolean open24hour) {
        this.open24hour = open24hour;
    }


    public void printInfo() {
        System.out.println("name: " + name);
        System.out.println("city: " + city);
        System.out.println("was founded in: " + yearFounded);
        System.out.println("rating: " + rating);
        if(open24hour) {
            System.out.println("Is working 24/7");
        }

    }

}
