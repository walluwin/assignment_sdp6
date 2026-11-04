public class ScheduleVisitor implements Visitor {
    private int totalDays;

    @Override
    public void visitActor(Actor actor) {
        addDays("Actor " + actor.getName(), actor.getFilmingDays());
    }

    @Override
    public void visitScene(Scene scene) {
        // Convert filming hours to full working days (8 hours per day).
        int days = (int) Math.ceil(scene.getFilmingHours() / 8.0);
        addDays("Scene " + scene.getName(), days);
    }

    @Override
    public void visitSpecialEffect(SpecialEffect effect) {
        addDays("Effect " + effect.getName(), effect.getProductionDays());
    }

    @Override
    public void visitEquipment(Equipment equipment) {
        addDays("Equipment " + equipment.getName(), equipment.getRentalDays());
    }

    private void addDays(String item, int days) {
        totalDays += days;
        System.out.printf("%-28s %d day(s)%n", item, days);
    }

    public int getTotalDays() {
        return totalDays;
    }
}
