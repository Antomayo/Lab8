package Lab8;

public class DogCreator {
    
    public static void main(String[] args) {

        //guide
        System.out.println("\nNAME, BREED, AGE, COLOR, SERVICE.\n");
        
        //myDog1 using an arg Constructor
        Dog myDog = new Dog("Moose", "Border Collie", 12, "White and Black", false);
        System.out.println(myDog.toString());
        System.out.println(Dog.bark() + "\n");

        //myDog2 using a no-arg constructor
        Dog myDog2 = new Dog();
        System.out.println(myDog2.toString());
        System.out.println(Dog.bark() + "\n");
        
        //myDog3 using a no-arg constructor and the setter method
        Dog myDog3 = new Dog();
        myDog3.setDog("Hunter", "German Shepard", 4, "Brown and Black", true);
        System.out.println(myDog3.toString());
        System.out.println(Dog.bark() + "\n");

    }

}

class Dog {

    //variable block
    String name;
    String breed;
    int age;
    String color;
    boolean service;

    //Makes the pups bark
    public static String bark(){
        return "Bark!";
    }

    //overrides the "toString" method
    public String toString(){
        return name + ", " + breed + ", " + age + ", " + color + ", " + service;
    }

    //myDog1 using arg Constructor
    public Dog(String name, String breed, int age, String color, Boolean service){
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
        this.service = service;
    }

    //myDog2 using no-arg constructor
    public Dog(){
        name = "Rufus";
        breed = "Pitbull";
        age = 10;
        color = "Brown";
        service = false;
    }

    //myDog3 using a no-arg constructor and the setter method
    public void setDog(String newName, String newBreed, int newAge, String newColor, boolean newService){
        this.name = newName;
        this.breed = newBreed;
        this.age = newAge;
        this.color = newColor;
        this.service = newService;
    }

}

