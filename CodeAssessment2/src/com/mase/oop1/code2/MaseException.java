package com.mase.oop1.code2;

public class MaseException extends Exception{

	public MaseException(){
	}

	public MaseException(String message){
		super(message);
	}

	public MaseException(Throwable cause){
		super(cause);
	}
}
