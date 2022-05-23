package gift;

public class Tartlet extends Gift {
    private Double radius;

    public Tartlet(String name, Double wight, Double price, Double radius) {
        super(name, wight, price);
        this.radius = radius;
    }

    public Tartlet(){};

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Tartlet + [" + super.toString() + ", height = " + radius + ']';
    }
}