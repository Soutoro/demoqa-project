package schemas;

import models.AddListOfBooksModel.AddListOfBooksResponse;
import models.AddListOfBooksModel.CollectionOfIsbnsItem;
import steps.AddAndDeleteBookHelperSteps;

import java.util.Collections;

import static tests.BaseTest.config;

public class AddBookSchema {

    AddAndDeleteBookHelperSteps addAndDeleteBookHelperSteps = new AddAndDeleteBookHelperSteps();

    public AddListOfBooksResponse addBookBody() {

        return new AddListOfBooksResponse(config.getUserID(),
                Collections.singletonList(new CollectionOfIsbnsItem(addAndDeleteBookHelperSteps.getBooksIsbn().get(1))));
    }
}
