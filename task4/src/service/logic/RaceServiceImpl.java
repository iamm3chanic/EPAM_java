package service.logic;

import java.util.List;

import dao.RaceDao;
import dao.DaoException;
import domain.Race;
import service.RaceNotExistsException;
import service.RaceService;
import service.ServiceException;

public class RaceServiceImpl implements RaceService {
    private RaceDao raceDao;

    public void setRaceDao(RaceDao raceDao) {
        this.raceDao = raceDao;
    }

    @Override
    public List<Race> findAll() throws ServiceException {
        try {
            return raceDao.readAll();
        } catch(DaoException e) {
            throw new ServiceException(e);
        }
    }

    @Override
    public Race findById(Long id) throws ServiceException {
        try {
            return raceDao.read(id);
        } catch(DaoException e) {
            throw new ServiceException(e);
        }
    }

    @Override
    public void save(Race race) throws ServiceException {
        try {
            if(race.getId() != null) {
                Race storedRace = raceDao.read(race.getId());
                if(storedRace != null) {
                    raceDao.update(race);
                } else {
                    throw new RaceNotExistsException(race.getId());
                }
            } else {
                Long id = raceDao.create(race);
                race.setId(id);
            }
        } catch(DaoException e) {
            throw new ServiceException(e);
        }
    }

    @Override
    public void delete(Long id) throws ServiceException {
        try {
            raceDao.delete(id);
        } catch(DaoException e) {
            throw new ServiceException(e);
        }
    }
}
