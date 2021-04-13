public class HealthyBurger extends Hamburger {
    private String healthyExtraOneName;
    private double healthyExtraOnePrice;

    private String healthyExtraTwoName;
    private double healthyExtraTwoPrice;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown rye");
    }

    public void addHealthAdditionOne(String name, double price){
        this.healthyExtraOneName = name;
        this.healthyExtraOnePrice = price;
    }

    public void addHealthAdditionTwo(String name, double price){
        this.healthyExtraTwoName = name;
        this.healthyExtraTwoPrice = price;
    }

    @Override
    public double itemizeHamburger() {

        double hamburgerPrice =  super.itemizeHamburger();
        if(this.healthyExtraOneName != null) {
            hamburgerPrice += this.healthyExtraOnePrice;
            System.out.println("Added " + this.healthyExtraOneName + " for an extra " + this.healthyExtraOnePrice);
        }
        if(this.healthyExtraTwoName != null) {
            hamburgerPrice += this.healthyExtraTwoPrice;
            System.out.println("Added " + this.healthyExtraTwoName + " for an extra " + this.healthyExtraTwoPrice);
        }

        return hamburgerPrice;
    }
}
