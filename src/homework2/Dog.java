package homework2;

public class Dog extends Animal {
    private String color;
    private int age;

    public Dog(String Color, int Age) {
        this.color = Color;
        this.age = Age;
    }

    public void setColor(String newColor) {
        color = newColor;
    }

    public String getColor() {
        return this.color;
    }

    public int getAge() {
        return this.age;
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("кушает нах");

    }
}
