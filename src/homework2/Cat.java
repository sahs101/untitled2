package homework2;

public class Cat extends Animal {
    private String color;
    private int age;
    public Cat (String Color, int Age){
        this.color = Color;
        this.age =Age;
    }
    public void setColor(String newColor){
        color = newColor;
    }
    public String getColor(){
        return this.color;
    }
    public int getAge(){
        return this.age;
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("жрёт нах");
    }
}
