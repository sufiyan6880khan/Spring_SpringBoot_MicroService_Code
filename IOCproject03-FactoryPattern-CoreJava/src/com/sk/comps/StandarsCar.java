package com.sk.comps;

public class StandarsCar  implements ICar 
{

	@Override
	public void assemble() {
	
		System.out.println("Standars Car Suzuki assemble()");
		}

	@Override
	public void testDrive() {
		System.out.println("Standars Car Suzuki testDrive()");
	}

	@Override
	public void diliver() {
		System.out.println("Standars Car Suzuki diliver()");
		
	}

	@Override
	public void drive() {
		System.out.println("StandarsCar Suzuki Drive by Customer ");
	}

}
