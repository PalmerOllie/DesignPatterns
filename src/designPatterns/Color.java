package designPatterns;

public enum Color {
    BLACK("\u001B[30m"),
    RED("\u001B[31m"),
    GREEN("\u001B[32m"),
    BLUE("\u001B[34m"),
    YELLOW("\u001B[33m"),
    PURPLE("\u001B[35m"),
    CYAN("\u001B[36m"),
    WHITE("\u001B[37m"),
    _RESET_("\u001B[0m");

    public final String ANSI_STRING;

    private Color(String ansi) {
        ANSI_STRING = ansi;
    }
};
