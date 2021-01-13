package org.agoncal.quarkus.microservices.number;


import org.eclipse.microprofile.openapi.annotations.media.Schema;

import javax.json.bind.annotation.JsonbProperty;
import javax.json.bind.annotation.JsonbTransient;
import java.time.Instant;

@Schema(description = "Several ISBN formats")
public class IsbnNumbers {

  @Schema(required = true)
  @JsonbProperty("isbn_10")
  public String isbn10;
  @Schema(required = true)
  @JsonbProperty("isbn_13")
  public String isbn13;
  @JsonbTransient
  public Instant generationDate;

  // toString()
  @Override
  public String toString() {
    return "IsbnNumbers{" +
      "isbn10='" + isbn10 + '\'' +
      ", isbn13='" + isbn13 + '\'' +
      ", generationDate=" + generationDate +
      '}';
  }
}
