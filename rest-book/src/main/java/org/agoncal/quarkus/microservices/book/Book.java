package org.agoncal.quarkus.microservices.book;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import java.time.Instant;

@Schema(description = "A book")
public class Book {

  @Schema(required = true)
  public String isbn13;
  @Schema(required = true)
  public String title;
  public String author;
  public int yearOfPublication;
  public String genre;
  public Instant creationDate;

  // toString()


  @Override
  public String toString() {
    return "Book{" +
      "isbn13='" + isbn13 + '\'' +
      ", title='" + title + '\'' +
      ", author='" + author + '\'' +
      ", genre='" + genre + '\'' +
      ", creationDate=" + creationDate +
      '}';
  }
}
