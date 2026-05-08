package OPD;

public class Main {

    public static void main(String[] args) {

        // Исходные данные
        double plannedBudget = 60000;        // Плановый бюджет проекта, у.е.
        double plannedDuration = 2;          // Плановый срок проекта, месяцев

        double currentTime = 1;               // Текущий момент времени, месяцев
        double readinessPercent = 40;         // Степень готовности проекта, %
        double actualCost = 40000;            // Фактические затраты, у.е.

        // Перевод процента готовности в долю
        double readiness = readinessPercent / 100.0;

        // Расчет показателей освоенного объема
        double earnedValue = plannedBudget * readiness; // EV
        double plannedValue = plannedBudget * (currentTime / plannedDuration); // PV

        // Индексы выполнения
        double SPI = earnedValue / plannedValue; // Индекс сроков
        double CPI = earnedValue / actualCost;   // Индекс стоимости

        // Прогнозный срок выполнения
        double forecastDuration = plannedDuration / SPI;
        double timeOverrun = forecastDuration - plannedDuration;

        // Прогнозная стоимость проекта
        double forecastBudget = plannedBudget / CPI;
        double budgetOverrun = forecastBudget - plannedBudget;

        // Вывод результатов
        System.out.println("Расчет параметров проекта по методике C/SCSC");
        System.out.println("------------------------------------------------");

        System.out.printf("Плановый срок проекта: %.2f месяцев%n", plannedDuration);
        System.out.printf("Прогнозный срок проекта: %.2f месяцев%n", forecastDuration);
        System.out.printf("Превышение сроков: %.2f месяцев%n", timeOverrun);

        System.out.println();

        System.out.printf("Плановый бюджет проекта: %.2f у.е.%n", plannedBudget);
        System.out.printf("Прогнозный бюджет проекта: %.2f у.е.%n", forecastBudget);
        System.out.printf("Перерасход бюджета: %.2f у.е.%n", budgetOverrun);
    }
}
