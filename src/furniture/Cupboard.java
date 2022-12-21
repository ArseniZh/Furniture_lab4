package furniture;

public class Cupboard implements IFurnitureAction{
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

    public void move(double xCoordinate, double yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public void buildFurniture() {
        this.assembled = true;
    }


}
