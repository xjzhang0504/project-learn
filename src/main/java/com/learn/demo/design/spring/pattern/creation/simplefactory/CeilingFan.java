package com.learn.demo.design.spring.pattern.creation.simplefactory;

public class CeilingFan implements IFan {

	@Override
	public void swithOn() {
		System.out.println("The CeilingFan is swithed on ...");
	}

	@Override
	public void switchOff() {
		System.out.println("The CeilingFan is swithed off ...");
	}
}
