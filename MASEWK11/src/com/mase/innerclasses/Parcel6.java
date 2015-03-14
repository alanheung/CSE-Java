package com.mase.innerclasses;

public class Parcel6{
	public Contents getContents(){
		//		class Parcel6$1 implements Contents{
		//		private int i=11;
		//		@Override
		//		public int value(){
		//		return i;
		//		}
		//	}
		//		return new Parcel6$1();
		return new Contents(){
			private int i=11;

			@Override
			public int value(){
				return i;
			}
		};
	}

	public static void main(String[] args) {
		Parcel6 p = new Parcel6();
		Contents c = p.getContents();
		System.out.println(c.value());

	}

}
