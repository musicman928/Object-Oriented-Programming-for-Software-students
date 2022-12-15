public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Octagon oct = new Octagon(-1);
        System.out.println(oct.getArea());
        Octagon betteroct = (Octagon) oct.clone();

        System.out.println(oct.compareTo(betteroct));
    }
}
