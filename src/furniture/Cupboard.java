package furniture;

public abstract class Cupboard implements IFurnitureAction{
    private double xCoordinate;
    private double yCoordinate;
    private String color;
    private double height;
    private double width;
    private double weight;
    private boolean assembled;

    public Cupboard() {
        this.xCoordinate = 0;
        this.yCoordinate = 0;
        this.color = "colorless";
        this.height = 0;
        this.width = 0;
        this.weight = 0;
        this.assembled = false;
    }

    public Cupboard(double xCoordinate, double yCoordinate, String color, double height, double width, double weight, boolean assembled) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.color = color;
        this.height = height;
        this.width = width;
        this.weight = weight;
        this.assembled = assembled;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return this.color;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getHeight() {
        return this.height;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getWidth() {
        return this.width;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double getWeight() {
        return this.weight;
    }

    public void move(double xCoordinate, double yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public void buildFurniture() {
        this.assembled = true;
    }

    public void dismantleFurniture() {
        this.assembled = false;
    }

    public String toString() {
        return "x coordinate: " + xCoordinate
                + "\ny coordinate: " + yCoordinate
                + "\ncolor: " + color
                + "\nheight: " + height + " m"
                + "\nwidth: " + width + " m"
                + "\nweight: " + weight + " kg"
                + "\nassembled: " + assembled;
    }
}
