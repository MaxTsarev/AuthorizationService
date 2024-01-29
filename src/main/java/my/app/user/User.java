package my.app.user;

import my.app.authorities.Authorities;

import java.util.List;
import java.util.Objects;

public class User {

    private String user;
    private String password;
    private List<Authorities> authorities;

    public User() {
    }

    public User(String name, String password, List<Authorities> authorities) {
        this.user = name;
        this.password = password;
        this.authorities = authorities;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Authorities> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(List<Authorities> authorities) {
        this.authorities = authorities;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(user, user.user) && Objects.equals(password, user.password) && authorities == user.authorities;
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, password, authorities);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + user + '\'' +
                ", password='" + password + '\'' +
                ", authorities=" + authorities +
                '}';
    }
}
