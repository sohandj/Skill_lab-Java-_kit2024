package sem_6_ass_1;

/*
 * Create a class `Animal` with a method `makeSound()`. 
 * Then create subclasses `Dog` and `Cat` that inherit from `Animal` 
 * and override the `makeSound()` method.
 * Writeamainmethod to demonstrate calling `makeSound()` on instances of `Dog` and `Cat`.
 * */
class Animal {

 public void makeSound() {
     System.out.println("Some generic animal sound");
 }
}


class Dog extends Animal {


 public void makeSound() {
     System.out.println("Woof!");
 }
}


class Cat extends Animal {
 

 public void makeSound() {
     System.out.println("Meow!");
 }
}


public class AnimalSound {
 public static void main(String[] args) {
     
     Animal dog = new Dog();
     Animal cat = new Cat();

     
     dog.makeSound(); 
     cat.makeSound(); 
 }
}
