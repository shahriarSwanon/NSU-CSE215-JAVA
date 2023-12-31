package labAssignment;

public class Fraction {
    private int numerator;
    private int denominator;
    
    Fraction(int numerator, int denominator){
        this.numerator=numerator;
        this.denominator=denominator;
    }
    Fraction(){
        this.numerator=0;
        this.denominator=0;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }
    @Override
    public String toString(){
        String s = +this.numerator+" / "+this.denominator;
        return s;
    }
    public void add(Fraction fraction){
        int n1 = this.numerator;
        int d1 = this.denominator;
        int n2 = fraction.numerator;
        int d2 = fraction.denominator;
        int n,d;
        if(d1==d2)
        {
            n=n1+n2;
            d=d1;
        }
        else
        {
            n=(n1*d2)+(n2*d1);
            d=(d1*d2);
        }
        
        System.out.println("Sum: "+n+" / "+d);
    }
    public void sub(Fraction fraction){
        int n1 = this.numerator;
        int d1 = this.denominator;
        int n2 = fraction.numerator;
        int d2 = fraction.denominator;
        int n,d;
        if(d1==d2)
        {
            n=n1-n2;
            d=d1;
        }
        else
        {
            n=(n1*d2)-(n2*d1);
            d=(d1*d2);
        }
        System.out.println("Sub: "+n+" / "+d);
    }
    public void multiplication(Fraction fraction){
        int n1 = this.numerator;
        int d1 = this.denominator;
        int n2 = fraction.numerator;
        int d2 = fraction.denominator;
        int n,d;
        n=(n1*n2);
        d=(d1*d2);
        System.out.println("Multiplication: "+n+" / "+d);
    }
    public void division(Fraction fraction){
        int n1 = this.numerator;
        int d1 = this.denominator;
        int n2 = fraction.numerator;
        int d2 = fraction.denominator;
        int n,d;
        n=(n1*d2);
        d=(d1*n2);
        System.out.println("Division: "+n+" / "+d);
    }
}
