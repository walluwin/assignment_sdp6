public class Scene implements Element {
    private final String name;
    private final int filmingHours;
    private final int locationCost;
    private final int riskLevel; // 1 = low, 5 = very high

    public Scene(String name, int filmingHours, int locationCost, int riskLevel) {
        this.name = name;
        this.filmingHours = filmingHours;
        this.locationCost = locationCost;
        this.riskLevel = riskLevel;
    }

    public String getName() {
        return name;
    }

    public int getFilmingHours() {
        return filmingHours;
    }

    public int getLocationCost() {
        return locationCost;
    }

    public int getRiskLevel() {
        return riskLevel;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitScene(this);
    }
}
