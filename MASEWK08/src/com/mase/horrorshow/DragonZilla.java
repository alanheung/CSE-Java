package com.mase.horrorshow;

public class DragonZilla implements DangerousMonster{
	@Override
	public void menace(){
		System.out.println("DragonZilla::menace");
	}
	@Override
	public void destroy(){
		System.out.println("DragonZilla::destroy");

	}
}
