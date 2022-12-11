package br.com.igormedeiros.com.br.bockstoremanager.mapper;

import br.com.igormedeiros.com.br.bockstoremanager.dto.BookDTO;
import br.com.igormedeiros.com.br.bockstoremanager.entity.Book;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BookMapper {
    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

    Book toModel(BookDTO bootDTO);

    BookDTO toDTO(Book book);
}
