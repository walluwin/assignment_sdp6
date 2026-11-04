public class Actor implements Element {
    private final String name;
    private final double dailyRate;
    private final int filmingDays;

    public Actor(String name, double dailyRate, int filmingDays) {
        this.name = name;
        this.dailyRate = dailyRate;
        this.filmingDays = filmingDays;
    }

    public String getName() {
        return name;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public int getFilmingDays() {
        return filmingDays;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitActor(this);
    }
}
