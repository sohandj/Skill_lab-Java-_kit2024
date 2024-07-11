package sem_6_ass_1;


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
