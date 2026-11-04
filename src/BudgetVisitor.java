public class BudgetVisitor implements Visitor {
    private double totalBudget;

    @Override
    public void visitActor(Actor actor) {
        double cost = actor.getDailyRate() * actor.getFilmingDays();
        totalBudget += cost;
        System.out.printf("Actor %-20s $%,.2f%n", actor.getName(), cost);
    }

    @Override
    public void visitScene(Scene scene) {
        double cost = scene.getLocationCost();
        totalBudget += cost;
        System.out.printf("Scene %-20s $%,.2f%n", scene.getName(), cost);
    }

    @Override
    public void visitSpecialEffect(SpecialEffect effect) {
        double cost = effect.getCost();
        totalBudget += cost;
        System.out.printf("Effect %-19s $%,.2f%n", effect.getName(), cost);
    }

    @Override
    public void visitEquipment(Equipment equipment) {
        double cost = equipment.getRentalCostPerDay() * equipment.getRentalDays();
        totalBudget += cost;
        System.out.printf("Equipment %-16s $%,.2f%n", equipment.getName(), cost);
    }

    public double getTotalBudget() {
        return totalBudget;
    }
}
