package com;

public class Driver {
	private int driverId;
	private String driverName;
	private String category;
	private long totalDistance;
	
	public Driver()
	{
		
	}
	public Driver(int driverId,String diverName,String category,long totalDistance) {
		this.driverId = driverId;
		this.driverName = diverName;
		this.category = category;
		this.totalDistance = totalDistance;
	}
	public void setdriverId(int id) {
		this.driverId = id;
	}
	public int getdriverId() {
		return driverId;
	}
	public void setDriverName(String name) {
		this.driverName = name;
	}
	public String getDriverName() {
		return driverName;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getCategory() {
		return category;
	}
	public long getTotalDistance() {
		return totalDistance;
	}
	public void setTotalDistance(long totalDistance) {
		this.totalDistance = totalDistance;
	}
	@Override
	public String toString() {
		return "Driver [driverId=" + driverId + ", driverName=" + driverName + ", category=" + category
				+ ", totalDistance=" + totalDistance + "]";
	}
	
	
	


}
