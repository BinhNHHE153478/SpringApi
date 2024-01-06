package service;

import model.UserEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private List<UserEntity> userList;

    public UserService() {
        userList = new ArrayList<>();

        UserEntity user1 = new UserEntity(1,"Ida", 32, "ida@mail.com");
        UserEntity user2 = new UserEntity(2,"Hans", 26, "hans@mail.com");
        UserEntity user3 = new UserEntity(3,"Lars", 45, "lars@mail.com");
        UserEntity user4 = new UserEntity(4,"Ben", 32, "ben@mail.com");
        UserEntity user5 = new UserEntity(5,"Eva", 59, "eva@mail.com");

        userList.addAll(Arrays.asList(user1,user2,user3,user4,user5));
    }

    public Optional<UserEntity> getUser(Integer id) {
        Optional<UserEntity> optional = Optional.empty();
        for (UserEntity user: userList) {
            if(id == user.getId()){
                optional = Optional.of(user);
                return optional;
            }
        }
        return optional;
    }
}