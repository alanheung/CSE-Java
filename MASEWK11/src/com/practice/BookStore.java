package com.practice;

public class BookStore {
    private class BookImpl implements Book {
        private String title, author;
        private boolean isBestSeller;
        private int howManyLanguages;

        private BookImpl(String title, String author, boolean isBestSeller, int howManyLanguages){
            this.title = title;
            this.author = author;
            this.howManyLanguages = howManyLanguages;
            this.isBestSeller = isBestSeller;
        }
        @Override
        public boolean isBestSeller(){
            return isBestSeller;
        }
        @Override
        public int howManyLanguages(){
            return howManyLanguages;
        }
    }
    // upcasting to an interface reference
    public Book getABook(String title, String author, boolean isBestSeller, int howManyLanguages) { 
        // accessing private class
        return new BookImpl(title, author, isBestSeller, howManyLanguages);         
    }
    
}
