package opu;

public class Fraction {
    private int numerator;
    private int denominator;

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public void setNumerator(int numerator){
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public int getNumerator() {
        return numerator;
    }
    public Fraction(final int numerator, final int denominator){
        this.setNumerator(numerator);
        this.setDenominator(denominator);
    }

    public void String(){
        System.out.println("Fraction: " + numerator + "/" + denominator );
    }

    public void reciprocal(){
        System.out.println("Revers fraction: " + denominator + "/" + numerator);
    }

    public void sum( Fraction secondAddition){
        int endNumerator = 0;
        int endDenominator = 0;
        if(this.denominator != secondAddition.denominator){
            endDenominator = this.denominator * secondAddition.denominator;
            this.numerator = this.numerator * secondAddition.denominator;
            secondAddition.numerator = secondAddition.numerator * this.denominator;
            endNumerator = secondAddition.numerator + this.numerator;
        } else {
            endNumerator = this.numerator + secondAddition.numerator;
            endDenominator = this.denominator;
        }
        System.out.println( endNumerator + "/" + endDenominator);
    }

    public void difference(Fraction subtrahend){
        int endNumerator = 0;
        int endDenominator = 0;
        if(this.denominator != subtrahend.denominator){
            endDenominator = this.denominator * subtrahend.denominator;
            this.numerator = this.numerator * subtrahend.denominator;
            subtrahend.numerator = subtrahend.numerator * this.denominator;
            endNumerator = this.numerator - subtrahend.numerator;
        } else {
            endNumerator = this.numerator - subtrahend.numerator;
            endDenominator = this.denominator;
        }
        System.out.println( endNumerator + "/" + endDenominator);
    }


    public void multiplication (Fraction second){
        int endNumerator = 0;
        int endDenominator = 0;
        endNumerator = this.numerator * second.numerator;
        endDenominator = this.denominator * second.denominator;
        System.out.println(endNumerator + "/" + endDenominator);
    }
}
