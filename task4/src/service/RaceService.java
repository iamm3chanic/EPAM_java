package service;

import domain.Race;

import java.util.List;

public interface RaceService {
    List<Race> findAll() throws ServiceException;

    Race findById(Long id) throws ServiceException;

    void save(Race request) throws ServiceException;

    void delete(Long id) throws ServiceException;
}