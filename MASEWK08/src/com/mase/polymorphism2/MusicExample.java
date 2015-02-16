package com.mase.polymorphism2;

public class MusicExample{

	public static void main(String[] args) {
		//tune(new Guitar());
		//tune(new Wind());
		//tuneAnother(new Wind());
		Instrument[] orchestra = new Instrument[5];
		int i=0;
//		orchestra[i++] = new Instrument();
//		orchestra[i++] = new Instrument();
//		orchestra[i++] = new Instrument();
//		orchestra[i++] = new Instrument();
//		orchestra[i++] = new Instrument();
		orchestra[i++] = new Wind();
		orchestra[i++] = new Percussion();
		orchestra[i++] = new Stringed();
		orchestra[i++] = new Brass();
		orchestra[i++] = new Woodwind();
		tuneAll(orchestra);
	}

	public class Guitar {
		public void play(){
			System.out.println("Guitar::play");;
		}
	}
	public static void tune(Instrument i){
		i.play();
	}

	public static void tuneAll(Instrument[] e){
		for(int i=0; i < e.length; i++){
			tune(e[i]);
		}
//		for(Instrument current :e){
//				tune(current);
//		}
	}
}//end


