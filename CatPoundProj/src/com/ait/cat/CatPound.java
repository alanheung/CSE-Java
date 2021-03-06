package com.ait.cat;
import java.util.ArrayList;

public class CatPound {
		
	private ArrayList<Cat> catCollection;
		
		public CatPound(){
			catCollection = new ArrayList<Cat>();
		}
		public void addCat(Cat aCat){
			catCollection.add(aCat);
		}
		public int getNumberOfCats(){
			return catCollection.size();
		}
		public boolean findCat(Cat name){
			return catCollection.contains(name);
		}
		public void removeCat(Cat aCat){
			catCollection.remove(aCat);
		}
		public boolean searchCatName(String name){
			boolean catFound=false;
			for(Cat theCat: catCollection){//		for(Employee employee :employees)
				if(theCat.getName().equals(name)){
					catFound=true;
				}
			}
			return catFound;
		}
		public int getNumberOlderThan(int age){
			int numberOlder=0;
			for(Cat cat :catCollection){
				if(cat.getAge()>age){
					numberOlder++;
				}
			}
			return numberOlder;
		}
}
