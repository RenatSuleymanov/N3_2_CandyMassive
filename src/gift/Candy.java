package gift;

public class Candy extends Gift {

    private String color;

    public Candy(String name, Double wight, Double price, String color) {
        super(name, wight, price);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Candy + [" + super.toString() + ", color = " + color + "]";
    }
}