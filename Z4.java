public class Z4 {
    public static void main(String[] args){
        System.out.println(makeDecision(5,7));//Пример 1
        System.out.println(makeDecision(8,-1));// Пример 2
        System.out.println(makeDecision(4,4));// Пример 3
    }
    public static String makeDecision(int x,int y){
        if (x > y){
            return ("\""+ x + ">" + y + "\"");
        }else if (x < y){
            return "\"" + x + "<" + y + "\"";
        }else{
            return "\"" + x + "==" + y + "\"";
        }

    }
}
