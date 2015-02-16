package com.mase.adventure;

public class Hero extends ActionCharacter implements CanFight,CanSwim,CanFly{

	@Override
	public void swim(){
		System.out.println("Hero::swim()");
	}
	@Override
	public void fly(){
		System.out.println("Hero::fly()");
	}
}
