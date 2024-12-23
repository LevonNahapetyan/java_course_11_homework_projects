import Model.StoreModel;

public class Test {
    public static void main(String[] args) {

        StoreModel yerevanCity = new StoreModel();
        yerevanCity.setName("Yerevan City Supermarket");
        yerevanCity.setCity("Yeravn");
        yerevanCity.setYearFounded(2002);
        yerevanCity.setRating(4.4);
        yerevanCity.setOpen24hour(true);

        yerevanCity.printInfo();




        System.out.println("---------------------------------");

        StoreModel sprouts = new StoreModel();
        sprouts.setName("Sprouts Farmer Store");
        sprouts.setCity("Los Angeles");
        sprouts.setYearFounded(1920);
        sprouts.setRating(4.7);

        sprouts.printInfo();

    }
}
