package com.wipro.librarymanagementsystem;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();

        
        library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", "1234567890"));
        library.addBook(new Book("1984", "George Orwell", "2345678901"));
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee", "3456789012"));
        library.addBook(new Book("Pride and Prejudice", "Jane Austen", "4567890123"));

        
        library.displayBooks();

        
        System.out.println("\nLinear Search for '1984':");
        Book book1 = library.linearSearch("1984");
        if (book1 != null) {
            System.out.println("Found: " + book1);
        } else {
            System.out.println("Book not found.");
        }

        
        System.out.println("\nBinary Search for 'To Kill a Mockingbird':");
        Book book2 = library.binarySearch("To Kill a Mockingbird");
        if (book2 != null) {
            System.out.println("Found: " + book2);
        } else {
            System.out.println("Book not found.");
        }

        
        long startTime, endTime;

        System.out.println("\nComparing Linear and Binary Search Performance:");
        
        startTime = System.nanoTime();
        library.linearSearch("Pride and Prejudice");
        endTime = System.nanoTime();
        System.out.println("Linear Search Time: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        library.binarySearch("Pride and Prejudice");
        endTime = System.nanoTime();
        System.out.println("Binary Search Time: " + (endTime - startTime) + " ns");

        
        library.removeBook("1984");
        library.displayBooks();
    }
}

