import java.util.Scanner;
class MyDog{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        dog pet = new dog();

        System.out.print("You are about to create a dog.\nHow old is the dog: ");
        pet.age = input.nextInt();
        System.out.print("How much does the dog weigh: ");
        pet.weight = input.nextDouble();
        input.nextLine();
        System.out.print("What is the dog's name: ");
        pet.name = input.nextLine();
        System.out.print("What color is the dog: ");
        pet.furColor = input.nextLine();
        System.out.print("What breed is the dog: ");
        pet.breed = input.nextLine();

        System.out.println("\n" + pet.name + " is a " + pet.age + " year old " + pet.furColor + " " + pet.breed + " that weighs " + pet.weight + " lbs.\n");

        pet.bark();
        System.out.print("\n" + pet.name + " is hungry, how much should he eat: ");
        pet.eat(input.nextDouble());
        input.nextLine();
        System.out.print(pet.name + " isn't a very good name. What should they be renamed to: ");
        pet.rename(input.nextLine());
        System.out.println("\n" + pet.name + " is a " + pet.age + " year old " + pet.furColor + " " + pet.breed + " that weighs " + pet.weight + " lbs.");
    }
}