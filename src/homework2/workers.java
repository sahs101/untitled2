package homework2;

public class workers {
    //Написать систему управления складскими запасами. Создать класс склад, создать класс работники
    // (написать геттеры на все аттрибуты).
    // Количество работников минимум 3.берут из склада товар, и
    //    // Работники портят его. Нужно написать вз(аимодействие через методы работников и склад:
    // Работник берет из склада товар, на складе товар уменьшается. Работник когда взял товар, выводит на экран
    // "Ура я испортил водку!" и добавляет к себе в журнал количество испорченного товара.
    // У склада есть только одна позиция - Водка.
    private  int vodkaBad = 0;
    public workers(int vodka) {
        this.vodkaBad = vodka;

    }
    public int setVodkaBad(){
        vodkaBad++;
        return  Storage.getQuantityOfGoods();

    }
    public int vodka1(){
        System.out.println("Ура я испортил водку!");

        return 0;
    }
    public int getVodkaBad(){
        return vodkaBad;
    }
    public void ebat(){
        setVodkaBad();
        vodka1();
    }
}
