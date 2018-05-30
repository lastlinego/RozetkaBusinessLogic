package com.rozetkabusinesslogic.applogic;

import com.rozetkabusinesslogic.model.User;

import javax.jws.soap.SOAPBinding;

public interface IUserHelper {
    void login(User user);
    void register(User user);
}
