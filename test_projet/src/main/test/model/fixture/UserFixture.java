package main.test.model.fixture;

import main.java.classes.User;

public class UserFixture {
    public UserFixture(){}

    public User getDefault(){
        User user = new User();
        user.setPrenom("Albert");
        user.setNom("DUPONTEL");
        return user;
    }
}
