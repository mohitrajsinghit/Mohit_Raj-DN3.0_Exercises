package com.library.service;


import com.library.repository.BookRepository;

public class BookService {
    BookRepository repository;

    public void setRepository(BookRepository repository) {
        this.repository = repository;
    }

    public void runService(){
        repository.showRepository();
        System.out.println("Service is running...");
    }
}
