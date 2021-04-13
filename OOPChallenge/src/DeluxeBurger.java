public class DeluxeBurger extends Hamburger {
    public DeluxeBurger(){
        super("Deluxe","Sausage & Bacon", 14.54, "White");
        super.addHamburgerAdditionOne("Chips", 2.75);
        super.addHamburgerAdditionTwo("Drink", 1.81);
    }

    @Override
    public void addHamburgerAdditionOne(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAdditionTwo(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAdditionThree(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAdditionFour(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }
}
