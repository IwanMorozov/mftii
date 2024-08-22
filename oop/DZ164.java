package dz164;

public final class DZ164 {
    private final int numerator;
    private final int denominator;

    public DZ164(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero");
        }
        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }
        int gcd = gcd(numerator, denominator);
        this.numerator = numerator / gcd;
        this.denominator = denominator / gcd;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    public DZ164 add(DZ164 other) {
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new DZ164(newNumerator, newDenominator);
    }

    public DZ164 subtract(DZ164 other) {
        int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new DZ164(newNumerator, newDenominator);
    }

    public DZ164 multiply(DZ164 other) {
        int newNumerator = this.numerator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        return new DZ164(newNumerator, newDenominator);
    }

    public DZ164 divide(DZ164 other) {
        int newNumerator = this.numerator * other.denominator;
        int newDenominator = this.denominator * other.numerator;
        return new DZ164(newNumerator, newDenominator);
    }

    public DZ164 add(int value) {
        return this.add(new DZ164(value, 1));
    }

    public DZ164 subtract(int value) {
        return this.subtract(new DZ164(value, 1));
    }

    public DZ164 multiply(int value) {
        return this.multiply(new DZ164(value, 1));
    }

    public DZ164 divide(int value) {
        return this.divide(new DZ164(value, 1));
    }

    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        DZ164 fraction1 = new DZ164(1, 2);
        DZ164 fraction2 = new DZ164(-3, 4);
        DZ164 fraction3 = new DZ164(3, -4);

        System.out.println(fraction1);  // Вывод: 1/2
        System.out.println(fraction2);  // Вывод: -3/4
        System.out.println(fraction3);  // Вывод: -3/4

        DZ164 sum = fraction1.add(fraction2);
        System.out.println(sum);  // Вывод: -1/4

        DZ164 difference = fraction1.subtract(fraction2);
        System.out.println(difference);  // Вывод: 5/4

        DZ164 product = fraction1.multiply(fraction2);
        System.out.println(product);  // Вывод: -3/8

        DZ164 quotient = fraction1.divide(fraction2);
        System.out.println(quotient);  // Вывод: -2/3

        // Примеры операций с целыми числами
        DZ164 addInt = fraction1.add(2);
        System.out.println(addInt);  // Вывод: 5/2

        DZ164 subInt = fraction1.subtract(1);
        System.out.println(subInt);  // Вывод: -1/2

        DZ164 mulInt = fraction1.multiply(3);
        System.out.println(mulInt);  // Вывод: 3/2

        DZ164 divInt = fraction1.divide(2);
        System.out.println(divInt);  // Вывод: 1/4
    }
}