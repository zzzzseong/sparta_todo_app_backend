package com.sparta.spartabulletinboardbackend.user.entity;

public enum UserRole {
    USER(Authority.USER);  // 사용자 권한

    private final String authority;

    UserRole(String authority) {
        this.authority = authority;
    }

    public String getAuthority() {
        return this.authority;
    }

    public static class Authority {
        public static final String USER = "ROLE_USER";
    }
}