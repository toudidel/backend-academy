package com.reply.myapp.books.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * If you do not provide a default constructor, you will get an error: No default constructor for
 * entity 'com.reply.myapp.books.model.Book'
 */
@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Book {

  @Id @GeneratedValue private Long id;

  private String title;

  private BigDecimal price;

  @ManyToOne private Author author;
}
