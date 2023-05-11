import homework2.Animal;
import homework2.Cat;
import homework2.Dog;

import java.io.*;
import java.util.Random;

public class workout {
    public static void main(String[] args) throws IOException {


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

        Cat cat = new Cat("re", 123);
        Dog dog = new Dog("DFS", 232);
        Animal[] animals = {cat, dog};
        for (Animal dsfdsf : animals) {
            dsfdsf.eat();


        }
        String i = "C:\\Java\\untitled2\\src\\дэн.txt";

        try (FileReader fileReader = new FileReader(i)) {
            // while (fileReader.ready()) {

            //   char read = (char)fileReader.read();
//i=i+read;

            //System.out.println(read);

            //System.out.println(i);

            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String[]rerr={"1,2,2"};
            while (bufferedReader.ready()) {
                String line = bufferedReader.readLine();
                System.out.println(line);
            }
        }
            //bufferedReader.close();
            //fileReader.close();


            FileWriter fileWriter = new FileWriter(i);
            for (int j = 0; j < 100; j++) {


                fileWriter.write("абоба");
            }

            fileWriter.flush();
            fileWriter.close();

Animal ddssd = new Cat("FD",2);
Animal ddsGFGFsd = new Dog("FD",2);
Animal[] animals1= {ddssd,ddsGFGFsd};
        Random rer = new Random();
        int tet = rer.nextInt(10_000_000);
        System.out.println(tet);
        }
    }
