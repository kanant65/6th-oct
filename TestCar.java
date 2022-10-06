package com.file_handling_test.com;

import java.io.File;
import java.io.IOException;

public class TestCar {

	public static void main(String[] args) {
		try {
			
			Car car1 = new Car("Scoda Octavia",2018,1200,2800000);
			Car car2 = new Car("Scoda Laura",2019,0,2300000);
			Car car3 = new Car("Toyota Corola",2020,120,3200000);
			Car car4 = new Car("Rolls Royce",2022,0,140000000);
			Car car5 = new Car("WolksVagon Beetle",2022,0,3500000);
			Car car6 = new Car("Audi Q6",2022,0,4400000);
			
			//Creating an array for storing cars
			Car cars[] =new Car[]{car1,car2,car3,car4,car5,car6};
			
			CarList carlist = new CarList("C:\\Users\\kanan\\eclipse-workspace\\javaclasses\\src\\com\\file_handling_test\\com\\car.txt");
			
			File file = new File("C:\\Users\\kanan\\eclipse-workspace\\javaclasses\\src\\com\\file_handling_test\\com\\car.txt");
			file.delete();
			
			//Adding car objects in a file
			for(Car car: cars) {
				carlist.addCar(car);
			}
			
			
			System.out.println("Total New Cars :"+carlist.countNewCars());
			
			System.out.println("Most Expensive Car :"+carlist.mostExpensiveCar());
			
			carlist.removeCar(car2);
			System.out.println("Total New Cars After remove car :"+carlist.countNewCars());
			
		}catch(IOException ex) {
			System.out.println(ex.getMessage());
		}
	}

}