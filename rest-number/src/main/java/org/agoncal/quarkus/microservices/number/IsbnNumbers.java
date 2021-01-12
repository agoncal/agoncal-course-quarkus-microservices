package org.agoncal.quarkus.microservices.number;


import javax.json.bind.annotation.JsonbProperty;
import javax.json.bind.annotation.JsonbTransient;
import java.time.Instant;

public class IsbnNumbers {

  @JsonbProperty("isbn_10")
  public String isbn10;
  @JsonbProperty("isbn_13")
  public String isbn13;
  @JsonbTransient
  public Instant generationDate;

  // toString
  @Override
  public String toString() {
    return "IsbnNumbers{" +
      "isbn10='" + isbn10 + '\'' +
      ", isbn13='" + isbn13 + '\'' +
      ", generationDate=" + generationDate +
      '}';
  }
}
// end::adocSnippet[]
