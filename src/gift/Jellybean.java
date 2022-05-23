package gift;

public class Jellybean extends Gift {
    private Double height;

    public Jellybean(String name, Double wight, Double price, Double height) {
        super(name, wight, price);
        this.height = height;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Jellybean + [" + super.toString() + ", height = " + height + ']';
    }
}