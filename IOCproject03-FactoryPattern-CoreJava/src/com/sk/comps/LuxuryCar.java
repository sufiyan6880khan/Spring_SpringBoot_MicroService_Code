package com.sk.comps;

public class LuxuryCar  implements ICar 
{

	@Override
	public void assemble() {
	
		System.out.println("Luxury Car Rolls Royce assemble()");
		}

	@Override
	public void testDrive() {
		System.out.println("Luxury Car Rolls Royce testDrive()");
	}

	@Override
	public void diliver() {
		System.out.println("Luxury Car Rolls Royce diliver()");
		
	}

	@Override
	public void drive() {
		System.out.println("Luxury Car Rolls Royce  Drive by Customer ");
	}

}
