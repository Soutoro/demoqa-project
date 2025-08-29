package steps;

import controller.ApiController;
import io.qameta.allure.Step;
import tests.BaseTest;

import java.util.List;


public class AddAndDeleteBookHelperSteps extends BaseTest {

    private final ApiController controller = new ApiController();

    @Step("Вспомогательный шаг - получить список книг")
    public List<String> getBooksIsbn() {
        return controller.get("/BookStore/v1/Books", "books.isbn");
    }
}
