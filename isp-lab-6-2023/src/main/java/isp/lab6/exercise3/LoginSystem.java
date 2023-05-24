package isp.lab6.exercise3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class LoginSystem {
    private Set<User> users;
    private Map<String, ActiveSession> sessions;
    private OnlineStore store;

    public LoginSystem(OnlineStore store) {
        this.users = new HashSet<>();
        this.sessions = new HashMap<>();
        this.store = store;
    }

    public void register(String username, String password) {
        User newUser = new User(username, password);
        users.add(newUser);
    }

    public boolean login(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                addSession(username);
                return true;
            }
        }
        return false;
    }

    public boolean logout(String username) {
        if (sessions.containsKey(username)) {
            removeSession(username);
            return true;
        }
        return false;
    }

    private void addSession(String username) {
        ActiveSession session = new ActiveSession(username);
        sessions.put(username, session);
    }

    private void removeSession(String username) {
        sessions.remove(username);
    }
}
