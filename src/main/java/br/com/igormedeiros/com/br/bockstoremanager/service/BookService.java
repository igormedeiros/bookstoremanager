package br.com.igormedeiros.com.br.bockstoremanager.service;

import br.com.igormedeiros.com.br.bockstoremanager.dto.BookDTO;
import br.com.igormedeiros.com.br.bockstoremanager.dto.MessageResponseDTO;
import br.com.igormedeiros.com.br.bockstoremanager.entity.Book;
import br.com.igormedeiros.com.br.bockstoremanager.mapper.BookMapper;
import br.com.igormedeiros.com.br.bockstoremanager.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    private final BookRepository bookRepository;

    private final BookMapper bookMapper = BookMapper.INSTANCE;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public MessageResponseDTO create(BookDTO bookDTO) {
        Book bookToSave = bookMapper.toModel(bookDTO);

        Book savedBook = bookRepository.save(bookToSave);
        return MessageResponseDTO.builder().message("Book created with ID " + savedBook.getId()).build();

    }
}
