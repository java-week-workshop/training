package com.javaweek.generics;

public class GenericInterfaceDemo {

	public static void main(String[] args) {
		Container<String> stringStore = new Store<>();
		stringStore.set("java");
	//	stringStore.set(1);
		System.out.println(stringStore.get());
	
		Container<Integer> intStore = new Store<>();
		intStore.set(1);
		
		System.out.println(intStore.get());
	}
}


interface Container<T> {
	void set(T a);
	T get();
}

class Store<T> implements Container<T> {
	private T a;
	public void set(T a) {
		this.a = a;
	}

	public T get() {
		return a;
	}
	 
}