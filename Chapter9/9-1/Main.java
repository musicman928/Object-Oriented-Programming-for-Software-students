public class Main {
    public static void main(String[] args) {
        Rectangle a = new Rectangle();
        Rectangle b = new Rectangle();

        a.makeRect(4,40);
        b.makeRect(3.5,35.9);

        displayRect(a);
        displayRect(b);
    }

    public static void displayRect(Rectangle in) {
        System.out.printf("Width = %.1f\nHeight = %.1f\nArea = %.1f\nPerimeter = %.1f\n\n",in.getWidth(),in.getHeight(),in.getArea(),in.getPerimeter());
    }
}
