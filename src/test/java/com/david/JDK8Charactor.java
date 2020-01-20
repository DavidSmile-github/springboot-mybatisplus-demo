package com.david;

import com.david.entity.User;
import org.junit.Test;
import org.springframework.util.StringUtils;

import java.util.Optional;
import java.util.function.Predicate;

/**
 * @version 1.0
 * @author: HongBo﹒Liu
 * @date: 2020/1/20 14:18
 */
public class JDK8Charactor {

    private static Predicate<String> isNotEmpty = (name) -> {
        if (StringUtils.isEmpty(name)) {
            return false;
        } else {
            return true;
        }
    };

    @Test
    public void test1() {
        User user = null;
        user = Optional.ofNullable(user).orElse(new User());

        try {
            Optional<User> userOptional = Optional.of(user);
            userOptional.map(User::getName).filter(isNotEmpty).orElseThrow(() ->new Exception("name can't be empty"));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
