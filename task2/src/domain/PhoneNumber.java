package domain;

/**
 * This class represents a phone number as a sentence element
 *
 */
public class PhoneNumber implements SentenceElement {
    private String phoneNumber;

    public PhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "PhoneNumber={" + phoneNumber + '}';
    }
}