package homework1;

import java.util.Arrays;

public class homework_pro {
    public static void main(String[] args) {

    //Продвинутый уровень
    //Задача №1
    //Произвести преобразование текста "234" в число типа int и прибавить к этому числу длину строки "some_text"
    String qwe = "234";
    int rer = Integer.parseInt(qwe);
    System.out.println(rer + "some_text".length());

    //Задача №2
    //Посчитать (a+b)^2 = ?, при a=3, b=5
    int a = 3;

    int b = 5;

        System.out.println((a + b) * (a + b));
    //Задача №3
    //Создать два массив чисел:
    // 1,2,5,7,10
    // 2,3,2,17,15
    // Создать массив чисел, в котором будут: все числа из этих двух массивов,
    // и результат умножения чисел с одинаковым порядковым номером
    int[] tyt = new int[]{1, 2, 5, 7, 10};
    int[] tye = new int[]{2, 3, 2, 17, 15};
    int[] tyw = new int[]{tyt.length + tye.length};



    int[] ints1 = {1, 2, 5, 7, 10};
    int[] ints2 = {2, 3, 2, 17, 15};
    int[] resultInts = new int[15];

        for (int i = 0; i < 5; i++) {
        resultInts[i] = ints1[i];
        resultInts[i + 5] = ints2[i];
        resultInts[i + 10] = ints1[i] * ints2[i];
        System.out.println(Arrays.toString(resultInts));
    }
        System.out.println(Arrays.toString(resultInts));

    //Ожидаемый результат:
    //1,2,5,7,10,2,3,2,17,15,2,6,10,119,150
    //(первый массив - 1,2,5,7,10), (второй массив - 2,3,2,17,15),
    //(результат перемножения - (1*2), (2*3), (5*2), (7*17), (10*15)

    //Задача №4
    //В слове "Hello world!" заменить l на r, сделать все буквы заглавными, выбрать первые 8 символов, вывести на экран
    String hello = "Hello world!";
    hello = hello.substring(0,8).replace("l","r");
        System.out.println(hello.toUpperCase());
}

}


