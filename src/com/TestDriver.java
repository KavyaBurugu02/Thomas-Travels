package com;

public class TestDriver {
	public static void main(String[] args) {
	Travel t = new Travel();
	Driver driver1 = new Driver(111,"Raju","Bus",10);
	Driver driver2 = new Driver(222,"Ramu","Lorry",187655);
	Driver driver3 = new Driver(333,"Venky","Auto",25);
	Driver driver4 = new Driver(444,"Kiran","Auto",1055);
	Driver[] driversList = new Driver[4];
	driversList[0] = driver1;
	driversList[1] = driver2;
	driversList[2] = driver3;
	driversList[3] = driver4;
	
	boolean result = t.isCarDriver(driver2);
	System.out.println(result);
	
	String details =t.retrieveByDriverId(driversList,111);
	System.out.println(details);
	int count =t.retrieveCountOfDriver(driversList, "Car");
    System.out.println(count);
    System.out.println("----------");
	Sstem.out.println("Feature branch");
    
       Driver[] retriveDriver = t.retriveDriver(driversList, "Car");
       for(Driver driverIs : retriveDriver)
       System.out.println(driverIs);
       
      Driver fullDetails =  t.retriveMaximumDistanceTravelledDriver(driversList);
      System.out.println(fullDetails);
       
	}
	
	



}
