package com.library;

public class Book {
    int bookId;
    String bookName;
    String authName;
    boolean isIssued;

    public Book(int bookId,String bookName, String authName){
        this.bookId=bookId;
        this.bookName=bookName;
        this.authName=authName;
        this.isIssued=false;
    }

    public void displayBook(){
        String status = isIssued ? "Issued" : "Availble";
        System.out.println(bookId+" "+bookName+" "+" by "+authName+" - "+status);
    }
}
