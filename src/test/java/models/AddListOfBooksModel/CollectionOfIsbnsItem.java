package models.AddListOfBooksModel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CollectionOfIsbnsItem{

	@JsonProperty("isbn")
	private String isbn;

	public CollectionOfIsbnsItem(String isbn){ this.isbn=isbn; }
}