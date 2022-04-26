import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean flag = true;
        while (flag) {
            try {
                System.out.println("I'm entering = " + getSymbol());
                flag = false;
            } catch (NewException ne) {
                System.out.println(ne.getSymbol() + " - Invalid value, please try again!");
            } catch (Exception e) {
                System.out.println("Our symbols are incorrect, please try again!");

            }
        }
    }

    /*
           public static String  getSymbol () {
               Scanner src = new Scanner(System.in);
               String symbol = src.nextLine();
               if (symbol.equals("AAA")) {
                   throw new NewException(symbol);
               }
               return symbol;
           }
     */
    public static String getSymbol() {
        Scanner src = new Scanner(System.in);
        String symbol = src.nextLine();
        char[] ch = symbol.toCharArray();
        int i = 0;
        int j = 0;
        for (i = 0; i < ch.length; i++) {
            int count = 0;
            for (j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j] && j == i+1) {
                    count++;

                    for (j = i + 2; j < ch.length; j++) {
                        if (ch[i] == ch[j] && j==i+2) {
                            count++;
                        }

                        if (count > 1) {
                            System.out.print(symbol.charAt(i) + " Occured ");
                            System.out.println();

                        }
                    }
                }
            }
        }
        return symbol;
    }
}







