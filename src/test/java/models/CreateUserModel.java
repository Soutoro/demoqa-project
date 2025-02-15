package models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateUserModel {

    private String userName, password;

    public CreateUserModel(String userName, String password){
        this.userName = userName;
        this.password = password;
    }
}
