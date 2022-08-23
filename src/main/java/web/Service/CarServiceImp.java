package web.Service;

import org.springframework.stereotype.Service;
import web.Dao.CarDao;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImp implements CarService {

    private final CarDao carDao;

    public CarServiceImp(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> getCars(int count) {
        return carDao.getCars(count);
    }
}
