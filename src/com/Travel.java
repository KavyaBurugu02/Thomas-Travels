package com;


public class Travel extends Driver {
	public boolean isCarDriver(Driver driver){
		if(driver.getCategory().equalsIgnoreCase("Car")){
			return true;
		}
		else{
			return false;}
	}
	public String retrieveByDriverId(Driver[] driverList,int driverID){
		String cat ;
		String nameIs;
		long dis;
		for(Driver drivers : driverList){
			if(drivers.getdriverId() == driverID )	{
				cat = drivers.getCategory();
				nameIs = drivers.getDriverName();
				dis = drivers.getTotalDistance();
				return  "Driver name is "+ nameIs + "Belonging to the category" + 
				cat + "traveled" + dis + "KM so far"; 
			}
		}
		return "No matching found";
	}
	public int retrieveCountOfDriver(Driver[] driverList,String category){
		int count = 0;
		for(Driver driv : driverList){
			if(driv.getCategory().equals(category))
			{
				count++;
			}
		}
		return count;
	}
	public Driver[] retriveDriver(Driver[] driver,String category){
		Driver[] empArray = new Driver[driver.length];
		int i = 0;
		for(Driver eachDriver : driver)
		{ 
			if(eachDriver.getCategory().equals(category))
			{
				empArray[i] = eachDriver;

				i++;
			}
		}
		Driver[] cleanArray = new Driver[i];
		for(int j = 0;j<i;j++)
		{
			cleanArray[j] = empArray[j];
		}
		return cleanArray;
	}

	public Driver  retriveMaximumDistanceTravelledDriver(Driver[] driver)
	{
		long max = driver[0].getTotalDistance();
		int i;
		for( i = 1;i<driver.length-1;i++)
		{
			if(driver[i].getTotalDistance() > max)
			{
				max = driver[i].getTotalDistance();
			}

		}
		System.out.println(max);
		return driver[i];





	}


}




