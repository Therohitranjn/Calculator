package com.library;

import java.util.ArrayList;

public class Library {

    ArrayList<Book> bookList = new ArrayList<>();

    public  void addBook(Book book){
        bookList.add(book);
    }

    public void showBook(){
        System.out.println("Book list");
        for(Book book:bookList){
            book.displayBook();
        }
    }

    public void issuBook(int bkId){
        for(Book b: bookList){
            if(b.bookId==bkId){
                if(!b.isIssued){
                    b.isIssued=true;
                    System.out.println("Book " +b.bookName+" has been issued");
                }else{
                    System.out.println("Book already issued ");
                }
                return;
            }
        }
        System.out.println("Book is not found");
    }
}
