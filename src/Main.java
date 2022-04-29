import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

// обработка ошибки при помощи исключения:
        boolean flag = true;
        while (flag) {
            try {
                System.out.println("You are entering correct value = " + codeSymbol());
                flag = false;
            } catch (NewException ne) {
                System.out.println(ne.getSymbol() + " - Invalid value, please try again!");
            } catch (NullPointerException e) {
                System.out.println("You aren't enter anything. Enter you text !");
            }
        }
    }
// логика определения трех повторяющихся символов
    public static String codeSymbol() {
        Scanner src = new Scanner(System.in);
        String text = src.nextLine();
        char[] ch = text.toCharArray();
        int i = 0;
        if (ch.length == 0) {
            throw new NullPointerException("Exception: text is null!");
        }
        for (i = 0; i < ch.length-2; i++) {
            if (ch[i] == ch[i+1] && ch[i] == ch[i+2] ) {
                throw new NewException(text.charAt(i) + " Repeated min 3 times");
            }
        }
        return text;
    }
}







