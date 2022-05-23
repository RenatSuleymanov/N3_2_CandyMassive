package gift;

public class Doughnut extends Gift {
    private int calorie;

    public Doughnut(String name, Double wight, Double price, int calorie) {
        super(name, wight, price);
        this.calorie = calorie;
    }

    public int getCalorie() {
        return calorie;
    }

    public void setCalorie(int calorie) {
        this.calorie = calorie;
    }

    @Override
    public String toString() {
        return "Doughnut + [" + super.toString() + ", height = " + calorie + ']';
    }
}