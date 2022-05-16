package opu;

public class Main {

    public static void main(String[] args) {
        Fraction first_frac = new Fraction(1, 2);
        Fraction second_frac = new Fraction(1, 3);
        first_frac.String();
        second_frac.String();
        first_frac.reciprocal();
        first_frac.sum(second_frac);
        first_frac.difference(second_frac);
        first_frac.multiplication(second_frac);
    }
}
