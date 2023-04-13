package homework1;

public class homework_bas {
    public static void main(String[] args) {
        //Базовый уровень
        //Задача №1
        //Дано (переменные ниже менять нельзя)
        String hi = "                Hello ";
        String world = " WoRld!";
        char newLine = '\n';
        //Создать из трех переменных единую строку,
        //Привести к правильному виду (Ниже) используя String.trim()
        //затроить (Можно вызвать тольку одну команду System.out.println())

        //Результат вывода на экран:
        //Hello world!
        //Hello world!
        //Hello world!
        hi = hi.replace(" ","");
        world = world.replace(" ","").toLowerCase();
        System.out.println((hi+" "+world+newLine).repeat(3));


        //Задача №2
        //Создать переменные с ростом (!в метрах), весом в кило.
        //Произвести расчет индекса массы тела (вес) / (рост * рост) используя переменные, вывести на экран
        //Пример результата вывода на экран:
        //21.0345645
        double av = 1.5;
        int m = 90;
        double mav= m/(av*av);
        System.out.println(mav);


        //Задача №3
        //Создать из массива букв a,b,c,d,e, строку,вывести на экран , поменять в массиве 4 букву по счету на h,
        //и снова создать строку, вывести на экран
        //Ожидаемый результат:
        //abcde
        //abche
        char[] ded = new char[]{'a', 'b', 'c', 'd', 'e'};
        System.out.println(String.valueOf(ded));
        ded[3]= 'h';
        System.out.println(String.valueOf(ded));

    }
}

