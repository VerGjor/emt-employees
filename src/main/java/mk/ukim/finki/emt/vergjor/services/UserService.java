package mk.ukim.finki.emt.vergjor.services;

import mk.ukim.finki.emt.vergjor.models.User;

import java.util.List;

public interface UserService {

    void registerUser(User user);
    User findUserById(String user_id);
    List<User> findByDepartmentID(int department_id);
    String existsByEmail(String email);
    void activateUserAccount(int code);
    String isActivationCodeValid(int code);
    String isAccountValid(String id);
    boolean isUserRegistered(String user_id);
    void sendNewPassword(String email);
    void updateUserPassword(String id, String password);
    void editUserInfo(User user);
    void changePassword(String id, String password);
}
