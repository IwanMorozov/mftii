public class Z12 {
    public static void main(String[] args){
        System.out.println(printDays("четверг"));//Пример 1
        System.out.println(printDays("чг"));//Пример2
    }
    public static String printDays(String x){
        switch (x) {
            case "понедельник":
                System.out.println("понедельник");
            case "вторник":
                System.out.println("вторник");
            case "среда":
                System.out.println("среда");
            case "четверг":
                System.out.println("четверг");
            case "пятница":
                System.out.println("пятница");
            case "суббота":
                System.out.println("суббота");
            case "воскресенье":
                System.out.println("воскресенье");
                break;
            default:
                System.out.println("это не день недели");
        }

        return " ";
    }
}
