public class workout {
    public static void main(String[] args) {


        System.out.println();
        String name = "Игорь";
        uman test = new uman(name, 35);
        System.out.println(test.getNameAge());
        name = "Натали";
        System.out.println(test.getNameAge());
        uman test1 = new uman("Олег", 5);
        System.out.println();
        String ere = "qwe";
        System.out.println(ere);
        ere = "ewq";
        System.out.println(ere);


        test1.printNameAge();
        test1.swapAge(10);
        test1.printNameAge();
        test1.swapName("alexandro");
        test1.printNameAge();
    }
}