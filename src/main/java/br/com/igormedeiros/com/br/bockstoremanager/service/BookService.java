package br.com.igormedeiros.com.br.bockstoremanager.service;

import br.com.igormedeiros.com.br.bockstoremanager.dto.MessageResponseDTO;
import br.com.igormedeiros.com.br.bockstoremanager.entity.Book;
import br.com.igormedeiros.com.br.bockstoremanager.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class BookService {
    private BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    public MessageResponseDTO create(Book book){

        Book savedBook = bookRepository.save(book);
        return MessageResponseDTO.builder().message("Book created with ID " + book.getId()).build();

    }
}
