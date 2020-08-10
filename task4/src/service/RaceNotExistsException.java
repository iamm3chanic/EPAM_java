package service;

public class RaceNotExistsException extends ServiceException {
    private Long id;

    public RaceNotExistsException(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
