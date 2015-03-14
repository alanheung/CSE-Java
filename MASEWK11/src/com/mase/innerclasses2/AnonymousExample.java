package com.mase.innerclasses2;

public class AnonymousExample {
	public Contents Contents(){
		return new Contents(){
			private int i;

			@Override
			public int value(){
				return i;
			}
		};
	}

	//	public SomeClass someClass(){
	//		return new SomeClass(){			
	//			@Override
	//			public void b(){
	//				
	//			}
	//			public void c(){
	//				
	//			}
	//		};
	//	}

	public static void main(String[] args) {
		// 1.anon inner class implementing an interface
		Contents contents = new Contents(){
			@Override
			public int value(){
				return 80;
			}
		};
		System.out.println(contents.value());

		// 2.anon inner class extending a class
		SomeClass sc = new SomeClass(){//extending the SomeClass below
			@Override// still works if commented out, if you get the signature wrong, good habit to override
			public void b(){
				System.out.println("AnonymousExample::b");
			}
			public void c(){
				System.out.println("AnonymousExample::c");
			}
		};
		sc.a();//SomeClass::a
		sc.b();//AnonymousExample::b
		//sc.c();// c is not in the type of reference SomeClass
	}
}

class SomeClass {

	public void a(){
		System.out.println("SomeClass::a");

	}
	public void b(){
		System.out.println("SomeClass::b");

	}
}

