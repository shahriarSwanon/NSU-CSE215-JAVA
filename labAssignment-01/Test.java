package labAssignment;

public class Test {
    public static void main(String[] args) {
        Fraction f1 = new Fraction();
        Fraction f2 = new Fraction();
        f1.setNumerator(1);
        f1.setDenominator(4);
        f2.setNumerator(3);
        f2.setDenominator(5);
        System.out.println("Numbers 1: "+f1.toString());
        System.out.println("Numbers 2: "+f2.toString());
        f1.add(f2);
        f1.sub(f2);
        f1.multiplication(f2);
        f1.division(f2);
    }
}
