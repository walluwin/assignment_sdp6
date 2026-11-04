public class RiskVisitor implements Visitor {
    private int totalRiskPoints;

    @Override
    public void visitActor(Actor actor) {
        int risk = actor.getFilmingDays() >= 5 ? 2 : 1;
        report("Actor " + actor.getName(), risk);
    }

    @Override
    public void visitScene(Scene scene) {
        report("Scene " + scene.getName(), scene.getRiskLevel());
    }

    @Override
    public void visitSpecialEffect(SpecialEffect effect) {
        report("Effect " + effect.getName(), effect.getComplexity());
    }

    @Override
    public void visitEquipment(Equipment equipment) {
        int risk = equipment.needsSpecialist() ? 3 : 1;
        report("Equipment " + equipment.getName(), risk);
    }

    private void report(String item, int risk) {
        totalRiskPoints += risk;
        String level = risk >= 4 ? "HIGH" : risk >= 2 ? "MEDIUM" : "LOW";
        System.out.printf("%-28s Risk: %d (%s)%n", item, risk, level);
    }

    public int getTotalRiskPoints() {
        return totalRiskPoints;
    }
}
