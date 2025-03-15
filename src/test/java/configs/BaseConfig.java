package configs;

import org.aeonbits.owner.Config;

public interface BaseConfig extends Config {

    @Key("baseUrl")
    @DefaultValue("https://demoqa.com")
    String getBaseUrl();

    @Key("browserSize")
    @DefaultValue("1920x1080")
    String getBrowserSize();

    @Key("login")
    @DefaultValue("Ttest")
    String getLogin();

    @Key("password")
    @DefaultValue("!Aa12345678")
    String getPassword();

    @Key("userID")
    @DefaultValue("8ceabcc7-76b4-42f6-a9f0-a9ca6f5789b7")
    String getUserID();

}
