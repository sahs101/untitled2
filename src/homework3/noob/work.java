package homework3.noob;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class work {
    public static void main(String[] args) throws IOException {
        //Базовый уровень
        //Задача №1
        //Дано: у нас есть две модели машин - жигули и toyota. Каждая из этих машин умеет: начинать движение,
        //останавливаться, включать фары. У жигули есть особенность: она ломается. У Toyota особенность: включает музыку
        //Необходимо:
        // 1.Создать абстрактный класс, который будет описывать общие действия этих машин (методы будут не абстрактные)
        // 2.Создать два класса, которые будут наследоваться от абстрактного класса, и реализовывать особенности этих машин
        // Методы должны просто печатать на экран действия машин (начал движение, включил музыку и тд.)
        // 3. Создать два экземпляра этих классов, и вызвать методы характерные для них
        Toyto toyto = new Toyto();
        toyto.getGo();
        toyto.getStop();
        toyto.getVkl();
        toyto.getMusic();
        Jig jig = new Jig();
        jig.getGo();
        jig.getStop();
        jig.getVkl();
        jig.getBroken();

        //Задача №2
        //Необходимо:
        // 1. Создать файл "my_first_file.txt". На первой строке написать: "Моя бабушка", на второй: "читает газету жизнь"
        // 2. Прочитать файл, и вывести на экран все слова файла в одну строкучитает газету жизнь
        // Ожидаемый результат: "Моя бабушка читает газету жизнь"

        try (FileReader fileReader = new FileReader("C:\\Java\\untitled2\\src\\homework3\\noob\\my_first_file.txt")) {
            // while (fileReader.ready()) {

            //   char read = (char)fileReader.read();
//i=i+read;

            //System.out.println(read);

            //System.out.println(i);

            BufferedReader bufferedReader = new BufferedReader(fileReader);
            int i = 0;
            while (bufferedReader.ready()) {


                String line = " " + bufferedReader.readLine();
                if (i == 0) {
                    line = line.trim();

                }


                System.out.print(line);
                i++;

            }
        }

//3
        //Необходимо:
        // 1. Создать класс Financial record, с двумя атрибутами: incomes, outcomes (доходы, расходы)
        // 2. Создать в этом классе геттеры, сеттеры и конструктор на все атрибуты
        // 3. Создать объект этого класса прямо здесь (class Homework3, метод main), с доходами 500, расходами 300
        // 4. Записать в файл "report.txt" данные из объекта класса.
        // Ожидаемый результат: в файле report.txt - одна строка: доходы = 500, расходы = 300
        String i = "C:\\Java\\untitled2\\src\\homework3\\noob\\report";
        Financial_record ere = new Financial_record(500, 300);
        FileReader fileReader = new FileReader(i);


FileWriter fileWriter = new FileWriter(i);
        fileWriter.write(ere.getIncomes() + ", " + ere.getOutcomes());
        fileReader.close();
        fileWriter.close();



    }
}