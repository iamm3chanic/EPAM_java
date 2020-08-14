package domain;

public class User extends TableUnit {
    private String login;
    private String password;
    private String lastName;
    private String firstName;
    private Role role;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
/*`user_id`     INT NOT NULL AUTO_INCREMENT,
    `login`       VARCHAR(255) NOT NULL,
    `password`    VARCHAR(255) NOT NULL,
    `last_name`   VARCHAR(255) NOT NULL,
    `first_name`  VARCHAR(255) NOT NULL,
    `role`        TINYINT*/