package designPatterns.structural.bridgeExample;

public class Movie {
    private String genre;
    private String runtime;
    private String title;
    private String year;

    public String getGenre() {
        return genre;
    }

    public String getRuntime() {
        return runtime;
    }

    public String getTitle() {
        return title;
    }

    public String getYear() {
        return year;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
