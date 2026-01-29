package library.model;

public class User {

    private String username;
    private String role; // ADMIN or USER

    public User(String username, String role) {
        this.username = username;
        this.role = role;
    }

    public boolean isAdmin() {
        return "ADMIN".equalsIgnoreCase(role);
    }
}
