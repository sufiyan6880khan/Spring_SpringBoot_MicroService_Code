package com.sk.comps;

public class SportCar  implements ICar 
{

	@Override
	public void assemble() {
	
		System.out.println("Sport Car Ferrari assemble()");
		}

	@Override
	public void testDrive() {
		System.out.println("Sport Car Ferrari  testDrive()");
	}

	@Override
	public void diliver() {
		System.out.println("Sport Car Ferrari  diliver()");
		
	}

	@Override
	public void drive() {
		System.out.println("Sport Car Ferrari  Drive by Customer");
	}

}
