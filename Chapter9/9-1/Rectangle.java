public class Rectangle {
    private double width;
    private double height;

    public void makeDefault() {
        width = 1;
        height = 1;
    }

    public void makeRect(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return width * 2 + height * 2;
    }

    public double getHeight() {return height;}

    public double getWidth() {return width;}

}
