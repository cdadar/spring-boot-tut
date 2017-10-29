package dev.local.auth.service;

public interface AuthService {
    User register(User userToAdd);
    String login(String username, String password);
    String refresh(String oldToken);
}
