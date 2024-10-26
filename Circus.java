import java.time.LocalDate;

public class Circus {
    /*
     * Свойства:
     * perfomanceName: название представления
     * city: город 
     * openingDate: Дата премьеры
     * perfomanceDuration: Период проведения, мин
     * ticketPrice: Цена билета, руб
     * author: Автор
     * genre: Жанр
     * actors: Количество актеров, шт
     */

    private String perfomanceName;
    private String city;
    private LocalDate openingDate;
    private int perfomanceDuration;
    private int ticketPrice;

    private String author;
    private String genre;
    private int actors;

    public Circus(String perfomanceName, String city, LocalDate openingDate, int perfomanceDuration, int ticketPrice) {
        this.perfomanceName = perfomanceName;
        this.city = city;
        this.openingDate = openingDate;
        this.perfomanceDuration = perfomanceDuration;
        this.ticketPrice = ticketPrice;
    }

    public String getPerfomanceName() {
        return perfomanceName;
    }

    public String getCity() {
        return city;
    }

    public LocalDate getOpeningDate() {
        return openingDate;
    }

    public int getPerfomanceDuration() {
        return perfomanceDuration;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public int getActors() {
        return actors;
    }

    public void setPerfomanceName(String perfomanceName) {
        this.perfomanceName = perfomanceName;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setOpeningDate(LocalDate openingDate) {
        this.openingDate = openingDate;
    }

    public void setPerfomanceDuration(int perfomanceDuration) {
        this.perfomanceDuration = perfomanceDuration;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setActors(int actors) {
        this.actors = actors;
    }

    @Override
    public String toString() {
        return "Circus:\n"
        + "Свойства: " + "\n"
        + "Название представления: " + perfomanceName + "\n"
        + "Город: " + city + "\n"
        + "Дата премьеры: " + openingDate + "\n"
        + "Период проведения, мин: " + perfomanceDuration + "\n"
        + "Цена билета, руб.: " + ticketPrice + "\n"
        + "Автор: " + author + "\n"
        + "Жанр: " + genre + "\n"
        + "Количество актеров, шт.: " + actors + "\n";
    }
}
