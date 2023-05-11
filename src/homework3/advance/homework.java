package homework3.advance;

import homework3.noob.Car;
import homework3.noob.Financial_record;
import homework3.noob.Jig;
import homework3.noob.Toyto;

import java.io.*;
import java.util.Arrays;
import java.util.Random;

public class homework {
    public static void main(String[] args) throws IOException {
        //Продвинутый уровень
        //Задача №1
        // Сделать задачу №1 (1 и 2 пункты) из базовой.
        // 1. Создать класс CarFactory, у которого есть два статических метода: создать жигули, создать toyota.
        // 2. Создать 20 тойот, 20 жигулей с помощью CarFactory, положить их в один массив.
        // 3. Пройтись по массиву, проверить к какому классу принадлежит машина, привести тип к классу машины
        // и вызвать характерные для нее методы.
        CarFactory carFactory = new CarFactory();

        Car[] carFactoryr = new Car[40];
        for (int i = 0; i < 40; i++) {
            if (i < 20) {
                carFactoryr[i] = carFactory.getCreateJig();
            } else {
                carFactoryr[i] = carFactory.getCreateToyta();
            }

        }

        for (int i = 0; i < carFactoryr.length; i++) {
            System.out.println(carFactoryr[i].getClass());

        }
        for (int i = 0; i < 40; i++) {
            if (i < 20) {
                Jig jig = (Jig) carFactoryr[i];
                jig.getBroken();
            } else {
                Toyto toyto = (Toyto) carFactoryr[i];
                toyto.getMusic();
            }

        }

//Задача №2
        // 1. Создать класс Financial record, с двумя атрибутами: incomes, outcomes (доходы, расходы)
        // 2. Создать в этом классе геттеры, сеттеры и конструктор на все атрибуты
        // 3. Создать 10 отчетов, с разными доходами и расходами (используй random)
        // 4. Записать в файл "report.txt" все данные из отчетов.
        // 5. Прочитать файл report.txt, просуммировать все доходы и вывести на экран, тоже самое с расходами
        // Ожидаемый результат: общие доходы - (какое то число), общие расходы - (какое то число)
        String i = "C:\\Java\\untitled2\\src\\homework3\\advance\\report1.txt";
        Financial_record1 financialRecord1 = new Financial_record1(0, 0);

        int[] financialRecord1s = new int[20];
        for (int q = 0; q < 20; q++) {
            if (q < 10) {
                financialRecord1s[q] = financialRecord1.getCreateIncomes();
            } else {
                financialRecord1s[q] = financialRecord1.getCreateOutcomes();
            }

        }
        FileWriter fileWriter = new FileWriter(i);


        fileWriter.write(Arrays.toString(financialRecord1s).replace("[", "").replace("]", "").replace(" ", "\n").replace(",", ""));
        fileWriter.flush();
        fileWriter.close();
        FileReader fileReader = new FileReader(i);

        BufferedReader bufferedReader1 = new BufferedReader(fileReader);

        int rer = 0;
        int rer1 = 0;
        int j = 0;
        while (bufferedReader1.ready()) {
            if (j < 10) {


                rer = rer + Integer.parseInt(bufferedReader1.readLine());
            } else {


                rer1 = rer1 + Integer.parseInt(bufferedReader1.readLine());


            }


            j++;
        }
        System.out.println("Общие доходы - " + rer);
        System.out.println("Общие расходы - " + rer1);
        bufferedReader1.close();


        FileWriter fileWriter1 = new FileWriter(i);


        fileWriter1.write("Общие доходы - " + rer + "\n" + "Общие расходы - " + rer1);
        fileWriter1.flush();
        fileWriter1.close();
        fileReader.close();
    }
}