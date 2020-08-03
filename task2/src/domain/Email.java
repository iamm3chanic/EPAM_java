package domain;

/**
 * This class represents an email as a sentence element
 *
 */
public class Email implements SentenceElement {
    private String email;

    public Email(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Email={" + email + '}';
    }
}