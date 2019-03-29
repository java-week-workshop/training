package org.xebia.adaptor;

class Main 
{ 
    public static void main(String args[]) 
    { 
        Dog dog = new Dog(); 
        ToyDog toyDog = new PlasticToyDog(); 
          
        ToyDog dogAdapter = new DogAdapter(dog); 
  
        System.out.println("Dog..."); 
        dog.bark(); 
        dog.run(); 
  
        System.out.println("ToyDog..."); 
        toyDog.makeSound();   
        
        System.out.println("DogAdapter..."); 
        dogAdapter.makeSound(); 
    } 
} 
