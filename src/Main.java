import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Element> productionItems = new ArrayList<>();

        productionItems.add(new Actor("Alex Morgan", 2500, 4));
        productionItems.add(new Actor("Sarah Lee", 1800, 3));
        productionItems.add(new Scene("City Chase", 10, 5000, 4));
        productionItems.add(new Scene("Coffee Shop", 5, 1200, 1));
        productionItems.add(new SpecialEffect("Explosion", 12000, 6, 5));
        productionItems.add(new SpecialEffect("Green Screen", 4000, 3, 3));
        productionItems.add(new Equipment("Cinema Camera", 350, 8, true));
        productionItems.add(new Equipment("Lighting Kit", 120, 6, false));

        System.out.println("==================================");
        System.out.println(" MOVIE PRODUCTION ANALYZER");
        System.out.println("==================================");

        BudgetVisitor budgetVisitor = new BudgetVisitor();
        System.out.println("\n--- BUDGET REPORT ---");
        for (Element item : productionItems) {
            item.accept(budgetVisitor);
        }
        System.out.printf("TOTAL BUDGET: $%,.2f%n", budgetVisitor.getTotalBudget());

        RiskVisitor riskVisitor = new RiskVisitor();
        System.out.println("\n--- RISK REPORT ---");
        for (Element item : productionItems) {
            item.accept(riskVisitor);
        }
        System.out.println("TOTAL RISK POINTS: " + riskVisitor.getTotalRiskPoints());

        ScheduleVisitor scheduleVisitor = new ScheduleVisitor();
        System.out.println("\n--- SCHEDULE REPORT ---");
        for (Element item : productionItems) {
            item.accept(scheduleVisitor);
        }
        System.out.println("TOTAL ESTIMATED DAYS: " + scheduleVisitor.getTotalDays());
    }
}
