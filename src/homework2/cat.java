package homework2;

public class cat {
    private String color;
    private int age;
    public cat (String Color, int Age){
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
}
