package homework3.noob;

public class Financial_record {
    //3
    //Необходимо:
    // 1. Создать класс Financial record, с двумя атрибутами: incomes, outcomes (доходы, расходы)
    // 2. Создать в этом классе геттеры, сеттеры и конструктор на все атрибуты
    // 3. Создать объект этого класса прямо здесь (class Homework3, метод main), с доходами 500, расходами 300
    // 4. Записать в файл "report.txt" данные из объекта класса.
    // Ожидаемый результат: в файле report.txt - одна строка: доходы = 500, расходы = 300

    private  int incomes;
    private   int outcomes;
    public Financial_record(int incomes, int outcomes){
        this.incomes = incomes;
        this.outcomes = outcomes;
    }
    public String getIncomes(){
        return "доходы = " + incomes;

    }
    public String getOutcomes(){
        return "расходы = " + outcomes;

    }
    public void setIncomes(int newIncomes){
        this.incomes = newIncomes;

    }
    public void setOutcomes(int newOutcomes){
        this.outcomes = newOutcomes;

    }

}
