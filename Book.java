/**
 * Book class
 * represents books searched for by user
 */
public class Book {
    private String isbn; // string representing the isbn of this media item
    private String genre; // string representing the genre of this media item
    private String author; // a string representing the author of the book
    private String title; // a string representing the title of the book
    private String publisher; // a string representing the publisher of the book

    /**
     * Book constructor
     * @param isbn string representing the isbn of this media item
     * @param genre string representing the genre of this media item
     * @param author a string representing the author of the book
     * @param title a string representing the title of the book
     * @param publisher a string representing the publisher of the book
     */
    public Book(String isbn, String genre, String author, String title, String publisher){
        this.isbn = isbn;
        this.genre = genre;
        this.author = author;
        this.title = title;
        this.publisher = publisher;
    }

    /**
     * getISBN() method
     * a getter method for isbn
     * @return isbn
     */
    final public String getISBN(){
        return this.isbn;
    }

    /**
     * getGenre() method
     * a getter method for genre
     * @return genre
     */
    final public String getGenre(){
        return this.genre;
    }

    /**
     * getAuthor() method
     * a getter method for author
     * @return author
     */
    final public String getAuthor(){
        return this.author;
    }

    /**
     * getTitle() method
     * a getter method for title
     * @return title
     */
    final public String getTitle(){
        return this.title;
    }

    /**
     * getPublisher() method
     * a getter method for publisher
     * @return publisher
     */
    final public String getPublisher(){
        return this.publisher;
    }

    /**
     * toString() method
     * @return a string representation of object
     */
    @Override public String toString(){
        return "Title: " + getTitle() + ", Author: " + getAuthor() + ", Publisher: " + getPublisher() + ", ISBN: " + getISBN();
    }
}