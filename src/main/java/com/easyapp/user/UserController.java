package com.easyapp.user;

import com.easyapp.domain.User;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/user/")
public class UserController {
    @Autowired
    UserService userService;

    @Autowired
    private ObjectFactory<User> userObjectFactory;


}
