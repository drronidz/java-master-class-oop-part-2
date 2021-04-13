public class Hamburger {

    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String additionOneName;
    private double additionOnePrice;

    private String additionTwoName;
    private double additionTwoPrice;

    private String additionThreeName;
    private double additionThreePrice;

    private String additionFourName;
    private double additionFourPrice;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void addHamburgerAdditionOne(String name, double price){
        this.additionOneName = name;
        this.additionOnePrice = price;
    }
    public void addHamburgerAdditionTwo(String name, double price){
        this.additionTwoName = name;
        this.additionTwoPrice = price;
    }

    public void addHamburgerAdditionThree(String name, double price){
        this.additionThreeName = name;
        this.additionThreePrice = price;
    }

    public void addHamburgerAdditionFour(String name, double price){
        this.additionFourName = name;
        this.additionFourPrice = price;
    }

    public double itemizeHamburger() {
        double hamburgerPrice = this.price;
        System.out.println(this.name + " " +
                "hamburger " + " on a " + this.breadRollType + " roll "
                + " price is " + this.price);

        if(this.additionOneName != null) {
            hamburgerPrice += this.additionOnePrice;
            System.out.println("Added " + this.additionOneName + " for an extra " +this.additionOnePrice);
        }
        if(this.additionTwoName != null) {
            hamburgerPrice += this.additionTwoPrice;
            System.out.println("Added " + this.additionTwoName + " for an extra " +this.additionTwoPrice);
        }
        if(this.additionThreeName != null) {
            hamburgerPrice += this.additionThreePrice;
            System.out.println("Added " + this.additionThreeName + " for an extra " +this.additionThreePrice);
        }

        if(this.additionFourName != null) {
            hamburgerPrice += this.additionFourPrice;
            System.out.println("Added " + this.additionFourName + " for an extra " +this.additionFourPrice);
        }

        return hamburgerPrice;

    }
}
