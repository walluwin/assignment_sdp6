public class SpecialEffect implements Element {
    private final String name;
    private final double cost;
    private final int productionDays;
    private final int complexity; // 1 = simple, 5 = very complex

    public SpecialEffect(String name, double cost, int productionDays, int complexity) {
        this.name = name;
        this.cost = cost;
        this.productionDays = productionDays;
        this.complexity = complexity;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public int getProductionDays() {
        return productionDays;
    }

    public int getComplexity() {
        return complexity;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitSpecialEffect(this);
    }
}
