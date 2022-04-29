public class NewException extends RuntimeException {


    private String symbol;
    public NewException(String symbol) {
        this.symbol = symbol;

    }
    public String getSymbol() {
        return symbol;
    }
}
