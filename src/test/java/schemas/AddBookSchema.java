package schemas;

import models.AddListOfBooksModel.AddListOfBooksResponse;
import models.AddListOfBooksModel.CollectionOfIsbnsItem;
import steps.AddAndDeleteBookHelperSteps;

import java.util.Collections;

public class AddBookSchema {

    AddAndDeleteBookHelperSteps addAndDeleteBookHelperSteps = new AddAndDeleteBookHelperSteps();

    public AddListOfBooksResponse addBookBody() {

        return new AddListOfBooksResponse("58fe457b-76c5-4b94-aa50-6356b28df725",
                Collections.singletonList(new CollectionOfIsbnsItem(addAndDeleteBookHelperSteps.getBooksIsbn().get(1))));
    }
}
