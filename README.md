# MyDog
For this lab we once again are going to create 2 classes, 1 called Dog and 1 driver class. Dog objects have a few attributes, but this time unlike chair objects they can also do some cool things too. Each action is represented by a method. Therefore, for any action our Dog can do or we do to the Dog, we are going to create a method. For example, if I want my Dog to bark, I can create a method to do that in the Dog class and call that method in the driver Lab12B (once I have created an object.)

# Dog-Class
- Variables (Attributes): Make these public, like the first exercise
  1. int age // current age of dog
  2. double weight // how much does it weigh in lbs
  3. String name // what is the name of the dog
  4. String furColor // color of the dog's fur/hair
  5. String breed // what breed is the dog
- Behaviors (Methods): These also should be public
  1. bark //prints "Woof! Woof!"
  2. rename // take a string and change the name of the dog
  3. String breed // what breed is the dog
Keep in mind you need to have a return data type for each method and what parameters these take to carry out their function when creating the methods.

# Driver-Class
This class will have your typical main method. Inside this method, create a new Dog object and prompt the user to input the attributes describing this Dog. Once done, print out all the details about the Dog.

Next, use the methods you created int he Dog class to have it bard, change the name (using the rename method, not the dot operator, and feed it.

Finally print out all the details about the Dog, the object should have changed because of your calls to the various methods.
