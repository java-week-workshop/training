package org.xebia.adaptor;

public class DogAdapter implements ToyDog{
	
	Dog dog = new Dog();
	public DogAdapter(Dog dog) 
    { 
        
        this.dog = dog; 
    } 

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		dog.bark();
	}

}
