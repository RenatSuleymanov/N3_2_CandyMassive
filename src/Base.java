import gift.*;

public class Base {
    public static void main(String[] args) {
        Candy candy = new Candy("candyOne", 14.11, 102.5, "red");
        Doughnut doughnut = new Doughnut("DoughnutOne", 22.1, 98.99, 120);
        Jellybean jellybean = new Jellybean("JellybeanOne", 11.7, 140.00, 2.66);
        Tartlet tartletOne = new Tartlet("TartletOne", 27.12, 220.45, 11.22);
        Tartlet tartletTwo = new Tartlet();
        tartletTwo.setName("TartletTwo");
        tartletTwo.setWight(30.01);
        tartletTwo.setPrice(37.12);
        tartletTwo.setRadius(11.11);
        Gift[] box = {candy, doughnut, jellybean, tartletOne,tartletTwo};
        Double totalPrice = 0.0;
        Double totalWight = 0.0;
        for (Gift someGift : box) {
            System.out.println(someGift.toString());
            totalPrice += someGift.getPrice();
            totalWight += someGift.getWight();
        }
        System.out.printf("Total Price = %.2f, Total Wight = %.2f", totalPrice, totalWight);
    }

}