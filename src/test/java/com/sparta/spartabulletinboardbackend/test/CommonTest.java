package com.sparta.spartabulletinboardbackend.test;

import com.sparta.spartabulletinboardbackend.user.entity.User;
import com.sparta.spartabulletinboardbackend.user.entity.UserRole;

public interface CommonTest {
    Long TEST_USER_ID = 1L;
    String TEST_USER_NAME = "username";
    String TEST_USER_EMAIL = "email@email.com";
    String TEST_USER_PASSWORD = "password1A~";

    User TEST_USER = User.builder()
            .username(TEST_USER_NAME)
            .email(TEST_USER_EMAIL)
            .password(TEST_USER_PASSWORD)
            .userRole(UserRole.USER)
            .build();

    // Another User
    Long TEST_ANOTHER_USER_ID = 2L;
    String ANOTHER_PREFIX = "a";

    User TEST_ANOTHER_USER = User.builder()
            .username(ANOTHER_PREFIX + TEST_USER_NAME)
            .email(ANOTHER_PREFIX + TEST_USER_EMAIL)
            .password(ANOTHER_PREFIX + TEST_USER_PASSWORD)
            .userRole(UserRole.USER)
            .build();
}
