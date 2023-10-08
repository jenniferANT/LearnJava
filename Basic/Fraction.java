package Basic;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator){
        if(denominator == 0){
            throw new IllegalArgumentException("Mãu số không the = 0");
        }
        if ( denominator < 0){
            numerator = -numerator;
            denominator = -denominator;
        }
        this.numerator = numerator;
        this.denominator=denominator;
    }

    private int gcd(int a, int b){
        if(b == 0){
            return a;
        }
        return gcd(b, a%b);
    }
    private void simplify(){
        int commonFactor = gcd(Math.abs(numerator), denominator);
        numerator /= commonFactor;
        denominator/=commonFactor;
    }
    public Fraction add(Fraction orther){
        int newNumerator = this.numerator * orther.denominator + orther.numerator * this.denominator;
        int newDenominator = this.denominator * orther.denominator;
        Fraction result = new Fraction(newNumerator, newDenominator);
        result.simplify();
        return result;
    }
    // Phương thức trừ hai phân số
    public Fraction subtract(Fraction other) {
        int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        Fraction result = new Fraction(newNumerator, newDenominator);
        result.simplify();
        return result;
    }
    // Phương thức nhân hai phân số
    public Fraction multiply(Fraction other) {
        int newNumerator = this.numerator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        Fraction result = new Fraction(newNumerator, newDenominator);
        result.simplify();
        return result;
    }

    // Phương thức chia hai phân số
    public Fraction divide(Fraction other) {
        if (other.numerator == 0) {
            throw new IllegalArgumentException("Không thể chia cho 0");
        }

        int newNumerator = this.numerator * other.denominator;
        int newDenominator = this.denominator * other.numerator;
        Fraction result = new Fraction(newNumerator, newDenominator);
        result.simplify();
        return result;
    }
    public String toString() {
        if (denominator == 1) {
            return Integer.toString(numerator);
        } else {
            return numerator + "/" + denominator;
        }
    }
    public static void main(String[] args) {
        // Tạo các phân số
        Fraction fraction1 = new Fraction(3, 4);
        Fraction fraction2 = new Fraction(1, 2);

        // Thực hiện các phép toán
        Fraction sum = fraction1.add(fraction2);
        Fraction difference = fraction1.subtract(fraction2);
        Fraction product = fraction1.multiply(fraction2);
        Fraction quotient = fraction1.divide(fraction2);

        // In kết quả
        System.out.println("Tổng: " + sum);
        System.out.println("Hiệu: " + difference);
        System.out.println("Tích: " + product);
        System.out.println("Thương: " + quotient);
    }
}
