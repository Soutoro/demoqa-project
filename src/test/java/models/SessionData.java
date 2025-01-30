package models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
// Хранение данных сессии еще будет дорабатываться, изучаю синглтон и реализацию в проекте
public class SessionData {

    private String userID, expires, token;

}
