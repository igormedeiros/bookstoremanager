package br.com.igormedeiros.com.br.bockstoremanager.dto;

import br.com.igormedeiros.com.br.bockstoremanager.entity.Author;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BookDTO {

    @NotNull
    private Long id;

    @NotBlank
    @Size(max = 200)
    private String name;

    @NotNull
    private Integer pages;

    @NotNull
    private Integer chapters;

    @NotBlank
    @Size(max = 100)
    @Pattern(regexp = "^(\\d{3}-)?\\d{10}$", message = "ISBN must bea valid format. ")
    private String isbn;

    @NotBlank
    @Size (max = 200)
    private String publisherName;

    @Valid
    @NotNull
    private Author author;
}
