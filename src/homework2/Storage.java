package homework2;

public class Storage {
    //Написать систему управления складскими запасами. Создать класс склад, создать класс работники
    // (написать геттеры на все аттрибуты).
    // Количество работников минимум 3.
    // Работники берут из склада товар, и портят его. Нужно написать взаимодействие через методы работников и склад:
    // Работник берет из склада товар, на складе товар уменьшается. Работник когда взял товар, выводит на экран
    // "Ура я испортил водку!" и добавляет к себе в журнал количество испорченного товара.
    // У склада есть только одна позиция - Водка.
    private static int quantityOfGoods = 100;
    public  static int getQuantityOfGoods(){
        quantityOfGoods--;
        System.out.println(quantityOfGoods);
        return 0;
    }
    public Storage() {


    }
}
