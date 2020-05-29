package com.easyapp.user;

import com.easyapp.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ProviderCreatingFactoryBean;
import org.springframework.stereotype.Service;

import javax.inject.Provider;

@Service
public class UserService {
    @Autowired
    Provider<User> userProvider;

    private User getUserInstance() {
        return userProvider.get();
    }
}
