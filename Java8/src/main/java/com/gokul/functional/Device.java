package com.gokul.functional;

public class Device{
	private int price;
	private String name;
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Device(int price, String name) {
		super();
		this.price = price;
		this.name = name;
	}
	public Device() {
		super();
	}
//	@Override
//	public int compareTo(Device device) {
//		if(this.getPrice() > device.getPrice())
//		{
//			return 1;
//		}
//		else if(this.getPrice() < device.getPrice())
//		{
//			return -1;
//		}
//		else {
//			return 0;			
//		}
//	}
}
