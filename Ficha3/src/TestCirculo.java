public class TestCirculo {
    public static void main(String[] args) {
        Circulo c = new Circulo(4,4,8);
        System.out.println(c.toString());
        Circulo clone = c.clone();

        clone.setY(2);
        System.out.println(c.toString());
        System.out.println(clone.toString());
    }
}
