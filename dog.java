public class dog{
    int age;
    double weight;
    String name;
    String furColor;
    String breed;

    public dog(){
    }

    public void bark(){
        System.out.print("Woof! Woof!");
    }

    public void rename(String newName){
        name = newName;
    }

    public void eat(double food){
        weight += food;
    }
}