import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

// обработка ошибки при помощи исключения:
        boolean flag = true;
        while (flag) {
            try {
                System.out.println("I'm entering = " + getSymbol());
                flag = false;
            } catch (NewException ne) {
                System.out.println(ne.getSymbol() + " - Invalid value, please try again!");
            }
        }
    }

// логика определения трех повторяющихся символов
    public static String getSymbol() {
        Scanner src = new Scanner(System.in);
        String symbol = src.nextLine();
        char[] ch = symbol.toCharArray();
        int i = 0;
        for (i = 0; i < ch.length-2; i++) {
            if (ch[i] == ch[i+1] && ch[i] == ch[i+2] ) {
                throw new NewException(symbol.charAt(i) + " Repeated 3 times");
            }
        }
        return symbol;
    }
}







