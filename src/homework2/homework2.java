package homework2;

import java.util.Arrays;

public class homework2 {
    public static void main(String[] args) {


        // Домашка
        // Базовый уровень
        // Задание №1 - Написать цикл, который выводит через пробел 100 чисел с приставкой "a".
        // Ожидаемый результат: 1а 2а 3а .. 100а

        for (int i = 1; i <= 100; i++) {
            System.out.println(i+"a");

        }
        // Задание №2
        // Дано:
        int ageChildren = 16;
        // Задача: Написать условную конструкцию, которая в зависимости от возраста ребенка, отправляет его в учебное заведение
        // если ребенку до 6 лет то в сад, если до 11 лет в младшую школу, если до 17 лет в среднюю школу, иначе в университет
        // Отправляет - имеется в виду, печатает на экран: "пошел с сад", "пошел в младшую школу" и т.д.
        // Проверьте работоспособность условий, через изменение значения переменной.
        if (ageChildren<6){
            System.out.println("в сад");
        }else if (ageChildren<11){
            System.out.println("в младшую школу");
        }else if (ageChildren<17){
            System.out.println("в среднюю школу");
        }else {
            System.out.println("в университет");
        }

        // Задание №3
        // Дано:
        boolean chicken = false;
        boolean vegetables = true;
        boolean sour = true;
        boolean toast = true;
        boolean sausage = true;
        boolean eggs = false;
        // Задача: Повара попросили сделать салат.
        // Если у повара есть все ингредиенты для "Цезаря" (курица, овощи, соус и гренки), то лучше сделать "Цезарь".
        // Если для "Цезаря" ингредиентов не нашлось, то сделать Оливье (овощи, колбаса или курица, яйца).
        // Если и для Оливье не нашлось ингредиентов, то сделать Овощной салат (нужны только овощи).
        // Если ингредиентов нет, то повар объявляет: У меня ничего нет
        // Написать набор условий, приготовления салатов, по приоритету (от Цезаря к овощному). Либо объявить о невозможности сделать салат.
        // Ожидаемый результат: вывод на экран сделанного салата или объявление о том, что ничего нет.
        // Проверьте работоспособность условий, через изменение значения переменных.
        if (chicken & vegetables & sour & toast ==true){
            System.out.println("сделан цезарь");
        }else if (vegetables & (sausage || chicken) & eggs == true){
            System.out.println("сделано оливье");
        }else if (vegetables ==true){
            System.out.println("сделан овощной салат");
        }else {
            System.out.println("нет нужных ингредиентов");
        }

        // Задание №4
        // Создать два класса, которые описывают какое либо животное (имеют два атрибута).
        // Написать к ним конструктор, сеттеры, геттеры.
        // Создать экземпляры этих двух животных.
        cat cat1= new cat("black", 32);
        dog dog1 = new dog("red", 24);

        // Продвинутый уровень
        // Задание №1: Написать цикл, который будет прибавлять число к result до тех пор,
        // пока не получиться больше 1_000_000.
        // Дано:
        double increment = -1;
        double result = 0;
        // Вывести на экран, количество итераций, которое потребовалось, чтобы дойти до миллиона.
        // Если число отрицательное, то сразу заканчиваем цикл, ничего не выводя.
        // Внимание: число может измениться, и не должно приводить к изменению вашего кода.
        int i = 0;
        while (result<= 1000000) {
            if (increment < 0) {
                break;
            } else {
                result += increment;
                i++;
            }
        }
        if (increment < 0) {

        }else {

            System.out.println(i);
        }
        // Задание №2: Дан массив единиц, произвольной длины. Создать цикл, который заменяет каждый четный элемент на 0;
        // Например, дано: [1,1,1,1,1]
        // Ожидаемый результат: [0,1,0,1,0]
        // Подсказка: прочитай про операнд "%".
        int[] ints1 = {1,1,1,1,1,1};
        int j = 0;
        while(j<ints1.length) {

            ints1[j] = 0;
            j += 2;

            //System.out.println(Arrays.toString(ints1));
            if (j == ints1.length - 1) {
                ints1[ints1.length-1]=0;
                System.out.println(Arrays.toString(ints1));
                break;
            }
        }
        // System.out.println(ints1.length);
        System.out.println(Arrays.toString(ints1));
        // Задание №3:
        // Дано:
        boolean hasFuel = false;
        boolean hasElectricsProblem = true;
        boolean hasMotorProblem = false;
        boolean hasTransmissionProblem = true;
        boolean hasWheelsProblem = true;
        double q = 0;
        if (!hasFuel & (hasElectricsProblem & hasMotorProblem & hasWheelsProblem & hasTransmissionProblem) == false){

        }else {
            q=q+1000;
        }

        if (hasMotorProblem == false){
            q=q+10000;
        }
        if (hasElectricsProblem == false){
            q=q+5000;
        }
        if (hasTransmissionProblem == false){
            q=q+4000;
        }
        if (hasWheelsProblem == false){
            q=q+2000;
        }

        if (hasElectricsProblem!=true & hasMotorProblem!=true | hasElectricsProblem!=true & hasTransmissionProblem!=true | hasElectricsProblem!=true & hasWheelsProblem!=true | hasMotorProblem!=true & hasTransmissionProblem!=true | hasMotorProblem!=true & hasElectricsProblem!=true  | hasMotorProblem!=true & hasWheelsProblem!=true | hasTransmissionProblem!=true & hasWheelsProblem!=true )
        {
            q=q- (q/100*10);
        }
        if (hasTransmissionProblem!=true & (hasElectricsProblem!=true |hasMotorProblem!=true)) {
            q=q - (q/100*20);
        }
        // В автосервис приехала сломанная машина. Механики находят неисправность следующим способом:
        // Если у машины нет бензина и ничего не сломано, то отдают машину владельцу и берут 1000 рублей за консультацию.
        // Если у машины проблема с двигателем, то чинят и берут 10 000.
        // Если у машины проблема с электрикой, то чинят и берут 5000.
        // Если у машины проблема с коробкой передач, то чинят и берут 4000.
        // Если у машины проблема с колесами, то чинят и берут 2000.
        // Если две детали сломаны, то на общий счет идет скидка 10%.
        // Если сломана коробка передач, и электрика или двигатель, то на общий счет скидка 20%.
        // Если нет бензина и что-то сломано, то за консультацию денег не берут.
        // Ситуации, что бензин есть и ничего не сломано - быть не может.
        // Ожидаемый результат: выведен на экран счет клиенту.
        System.out.println(q);

        // Задание №4:
        // Написать систему управления складскими запасами. Создать класс склад, создать класс работники
        // (написать геттеры на все аттрибуты).
        // Количество работников минимум 3.
        // Работники берут из склада товар, и портят его. Нужно написать взаимодействие через методы работников и склад:
        // Работник берет из склада товар, на складе товар уменьшается. Работник когда взял товар, выводит на экран
        // "Ура я испортил водку!" и добавляет к себе в журнал количество испорченного товара.
        // У склада есть только одна позиция - Водка.
        workers rer = new workers(0);

        workers rer1 = new workers(0);
        workers rer2 = new workers(0);
        rer.ebat();
        rer.ebat();
        rer1.ebat();
        rer2.ebat();
        rer2.ebat();
        rer2.ebat();

        System.out.println(rer.getVodkaBad());
        System.out.println(rer1.getVodkaBad());
        System.out.println(rer2.getVodkaBad());
    }
}
