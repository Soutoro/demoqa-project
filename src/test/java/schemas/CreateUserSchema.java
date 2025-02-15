package schemas;

import models.CreateUserModel;
import testdata.NewUserData;

public class CreateUserSchema {

    NewUserData newUserData = new NewUserData();

    public CreateUserModel createUserBody() {

        return new CreateUserModel(newUserData.getNewUserLogin(), newUserData.getNewPassword());

    }

}
