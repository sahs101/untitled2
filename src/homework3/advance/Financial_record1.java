package homework3.advance;

import java.util.Random;

public class Financial_record1 {
    private int incomes;
    private int outcomes;
    // 1. Создать класс Financial record, с двумя атрибутами: incomes, outcomes (доходы, расходы)
    // 2. Создать в этом классе геттеры, сеттеры и конструктор на все атрибуты
    // 3. Создать 10 отчетов, с разными доходами и расходами (используй random)
    // 4. Записать в файл "report.txt" все данные из отчетов.
    // 5. Прочитать файл report.txt, просуммировать все доходы и вывести на экран, тоже самое с расходами
    // Ожидаемый результат: общие доходы - (какое то число), общие расходы - (какое то число)

    public Financial_record1(int incomes, int outcomes) {
        Random wew = new Random();
         incomes = wew.nextInt();
         outcomes = wew.nextInt();
        this.incomes = incomes;
        this.outcomes = outcomes;
    }
    public int getIncomes(){
        return  incomes;

    }
    public int getOutcomes(){
        return  outcomes;

    }
    public void setIncomes(int newIncomes){
        this.incomes = newIncomes;

    }
    public void setOutcomes(int newOutcomes){
        this.outcomes = newOutcomes;

    }
    public static int getCreateIncomes() {
        Random wew = new Random();
        int incomes1 = wew.nextInt();

        Financial_record1 b = new Financial_record1(incomes1 ,0);





        return b.getIncomes();
    }
    public static int getCreateOutcomes() {
        Random wew = new Random();

        int outcomes1 = wew.nextInt();
        Financial_record1 b = new Financial_record1(0, outcomes1);





        return b.getOutcomes();
    }

}
