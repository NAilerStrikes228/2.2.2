package web.Dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImp implements CarDao {

    private List<Car> carList = new ArrayList<>();

    {
        carList.add(new Car("Mercedes-Benz M-Класс II (W164) 350", 2007, 650_000.00));
        carList.add(new Car("Hyundai ix35 I Рестайлинг", 2015, 945_000));
        carList.add(new Car("Land Rover Range Rover Evoque I 6-speed", 2012, 1_490_000));
        carList.add(new Car("Peugeot 408 I Рестайлинг", 2017, 984_000.00));
        carList.add(new Car("Volkswagen Touareg II", 2013, 1_797_000));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count == 0) {
            return carList;
        }
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
