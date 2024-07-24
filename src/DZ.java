public class DZ {
    public static void main(String[] args) {
        int x = 4568;
        int result = sumLastNums(x);
        System.out.println("Результат: " + result);
    }

    public static int sumLastNums(int x) {
        int lastTwoDigits = x % 100;
        int lastDigit = lastTwoDigits % 10;
        int secondToLastDigit = lastTwoDigits / 10;
        return lastDigit + secondToLastDigit;
    }
}
