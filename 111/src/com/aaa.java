package com;

public class aaa {
    public static void main(String[] args) {
		House house=new House();
		house.setWaterAmount(10);
		Thread dog=new Thread(house);
		Thread cat=new Thread(house);
		dog.setName("��");
		cat.setName("è");
		dog.start();
		cat.start();
	
    }
}
