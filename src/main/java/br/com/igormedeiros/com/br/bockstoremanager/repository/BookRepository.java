package br.com.igormedeiros.com.br.bockstoremanager.repository;

import br.com.igormedeiros.com.br.bockstoremanager.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
