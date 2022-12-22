package furniture;

public class BookCase extends Cupboard{
    private int bookCapacity;
    private int shelvesNumber;

    public BookCase() {
        super();
        this.bookCapacity = 0;
        this.shelvesNumber = 0;
    }

    public BookCase(double xCoordinate, double yCoordinate, String color, double height, double width, double weight, boolean assembled, int bookCapacity, int shelvesNumber) {
        super(xCoordinate, yCoordinate, color, height, width, weight, assembled);
        this.bookCapacity = bookCapacity;
        this.shelvesNumber = shelvesNumber;
    }

    public void setBookCapacity(int bookCapacity) {
        this.bookCapacity = bookCapacity;
    }
    public int getBookCapacity() {
        return this.bookCapacity;
    }
    public void setShelvesNumber(int shelvesNumber) {
        this.shelvesNumber = shelvesNumber;
    }
    public int getShelvesNumber() {
        return this.shelvesNumber;
    }

    public String toString() {
        return super.toString()
                + "\nbook capacity: " + bookCapacity
                + "\nshelves number: " + shelvesNumber;
    }
}
