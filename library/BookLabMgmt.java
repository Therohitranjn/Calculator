package com.library;

import java.util.Scanner;

public class BookLabMgmt {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Library lab = new Library();
        lab.addBook(new Book(1001," Core Java","Hari Krishna"));
        lab.addBook(new Book(1002,"Oracle","Sudhar Shrama"));
        lab.addBook(new Book(1003,"JavaScript","Prasad"));
        lab.addBook(new Book(1004,"Advance Java","Venketesh"));
        lab.addBook(new Book(1005,"React JS", "Sudhar Sharma"));
        lab.addBook(new Book(1006,"Spring Boot","Nataraz Sir"));

        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        User user = new User(1,name);
        System.out.println("Welcome to the Library, "+user.userName);

        int choice;

        do{
            System.out.println("========== Library Management Menu ================= ");
            System.out.println("1. Show all Books");
            System.out.println("2. Issue a Book");
            System.out.println("3. Return a Book");
            System.out.println("4. Exit ");
            System.out.println("Choice: ");

            choice = sc.nextInt();

            switch (choice){
                case 1 : lab.showBook();
                break;

                case 2:
                    System.out.println("Enter Book id to issue: ");
                    int issueId = sc.nextInt();
                    lab.issuBook(issueId);
                    break;

                case 3:
                    System.out.println("Thanks for using the libray");
                    int returnBook = sc.nextInt();
                    lab.issuBook(returnBook);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }while (choice!=4);

    }
}
