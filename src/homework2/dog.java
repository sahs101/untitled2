package homework2;

public class dog {
    private String color ;
    private int age;
    public dog (String Color, int Age){
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
