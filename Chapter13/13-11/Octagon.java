public class Octagon extends GeometricObject
        implements Cloneable, Comparable<Octagon> {
    private double AllSideLength;
    public Octagon(double AllSideLength) {
        this.AllSideLength = AllSideLength;
    }

    @Override
    public double getArea() {
        return (2 + 4/Math.sqrt(2)) * AllSideLength * AllSideLength;
    }

    @Override
    public double getPerimeter() {
        return AllSideLength * 8;
    }

    @Override
    public int compareTo(Octagon o) {
        double c = (this.getPerimeter() - o.getPerimeter());

        return (int) (c / (Math.abs(c)));
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
