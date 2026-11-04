public class Equipment implements Element {
    private final String name;
    private final double rentalCostPerDay;
    private final int rentalDays;
    private final boolean needsSpecialist;

    public Equipment(String name, double rentalCostPerDay, int rentalDays,
                     boolean needsSpecialist) {
        this.name = name;
        this.rentalCostPerDay = rentalCostPerDay;
        this.rentalDays = rentalDays;
        this.needsSpecialist = needsSpecialist;
    }

    public String getName() {
        return name;
    }

    public double getRentalCostPerDay() {
        return rentalCostPerDay;
    }

    public int getRentalDays() {
        return rentalDays;
    }

    public boolean needsSpecialist() {
        return needsSpecialist;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitEquipment(this);
    }
}
