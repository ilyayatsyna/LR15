package org.example;

public class Book {
    String title;
    Language language;
    private int count;

    public Book(String title, Language language) {
        this.title = title;
        this.language = language;
    }

    public Book(String title, Language language, int count) {
        this(title, language);
        this.count = count;
    }

    public int getCount () {return count;}

    public void setCount (int count){
        this.count = count;
    }

}