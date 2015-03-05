package com.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class exceptionExample {


	public static void main(String[] args) {
//				testMethodA("hello");
//		testMethodB();
//		testMethodC();
//		testMethodD();
//		testMethodE();
		
//		try{
//			testMethodF();
//		}catch(Exception e){
//			e.printStackTrace();
//		}
		
		A a = new B();
		try{
			a.process();
		}catch(IOException ex){
			ex.printStackTrace();
		}
	}

	public static String testMethodA(String s){
		//finally section
		try{
			int x =9;
		}
		catch(Exception e){
			System.out.println("file not found");
			return "exception";
		}
		finally{
			System.out.println("finally section");
			//return from finally block
			//if i comment out line below I get a missing return statement
			return "ok from finally";
		}
	}
	public static String testMethodB(){
		//finally section
		try{
			//return from try block
			return "ok";// finally section is printed
		}
		catch(Exception e){
			System.out.println("file not found");
			return "exception";
		}
		finally{
			System.out.println("finally section");
		}
	}
	public static String testMethodC(){
//		file not foundjava.lang.Exception
//		finally section
		try{
			//throws exception
			throw new Exception();
		}
		catch(Exception e){
			System.out.println("file not found"+e.toString());
			return "exception";
		}
		finally{
			System.out.println("finally section");
		}
	}
	public static String testMethodD(){
		try{
			return "ok";
		}
//		catch(IOException | NoSuchMethodException | ClassNotFoundException e){
//			System.out.println(e.toString());
//			return null;
//		}doesnt work
		catch(RuntimeException e){
			System.out.println(e.toString());
			return null;
		}
		finally{
			System.out.println("finally section");
			return "IOException";
		}
	}
	public static String testMethodE(){
//		java.lang.ArrayIndexOutOfBoundsException: 55
//		finally section
		try{
			String [] sa = {"John","Peter"};
			System.out.println(sa[55]);
			return "ok";
		}
		catch(Exception e){
			System.out.println(e.toString());
			return "exception";
		}
		finally{
			System.out.println("finally section");
			return "ok from finally";
		}
	}
	public static void testMethodF() throws Exception{
		throw new Exception();
	}
	
	class A{
		public void process() throws IOException{
			throw new IOException();
		}
	}
	class B extends A{
		//compiler error process in B cannot override process A
		//overridden method does not throw NoSuchMethodException
		//to fix: 1. change A::process to throw NoSuchMethodException as well as
		//2. changeA::process to throw exception only(this catches all)
		public void process() throws IOException, FileNotFoundException, ArithmeticException{// is an IOException??
			System.out.println("B");
		}
	}

}//



