package models.AddListOfBooksModel;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class AddListOfBooksResponse {

	@JsonProperty("userId")
	private String userId;

	@JsonProperty("collectionOfIsbns")
	private List<CollectionOfIsbnsItem> collectionOfIsbns;

	public AddListOfBooksResponse(String userId, List<CollectionOfIsbnsItem> collectionOfIsbns) {
		this.userId = userId;
		this.collectionOfIsbns = collectionOfIsbns;
	}

}