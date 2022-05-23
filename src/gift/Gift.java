package gift;

public abstract class Gift {
    private String name;
    private Double wight;
    private Double price;

    public Gift(String name, Double wight, Double price) {
        this.name = name;
        this.wight = wight;
        this.price = price;
    }

    public Gift(){};

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getWight() {
        return wight;
    }

    public void setWight(Double wight) {
        this.wight = wight;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "name = " + name + ", wight = " + wight + ", price = " + price;
    }
}