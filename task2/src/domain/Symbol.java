package domain;

/**
 * This is the abstract class to store and manipulate symbols.
 *
 */
public abstract class Symbol {
    private char symbol;

    public Symbol(char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }
}
