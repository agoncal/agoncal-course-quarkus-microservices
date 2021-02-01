package org.agoncal.quarkus.microservices.book;

import javax.json.bind.annotation.JsonbProperty;

/**
 * @author Antonio Goncalves
 *         http://www.antoniogoncalves.org
 *         --
 */
public class IsbnThirteen {

  @JsonbProperty("isbn_13")
  public String isbn13;
}
