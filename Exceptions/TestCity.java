package Exceptions;

import java.util.HashMap;

class CityNotFoundException extends Exception {
    public CityNotFoundException(String message) {
        super(message);
    }

    public void printStackTrace() {
        System.out.println(super.getMessage());
    }
}

class City {
    private HashMap<Integer, String> cityList;

    public City() {
        cityList = new HashMap<>();
        cityList.put(11111, "Kolkata");
        cityList.put(22222, "Benagaluru");
        cityList.put(33333, "Siwan");
        cityList.put(44444, "Patna");
    }

    public String findCityByZipCode(int zipCode) throws CityNotFoundException {
        if (cityList.containsKey(zipCode)) {
            return cityList.get(zipCode);
        } else {
            throw new CityNotFoundException("City not found for zip code: " + zipCode);
        }
    }
}


public class TestCity {
    public static void main(String[] args) {
        City city = new City();
        try {
            System.out.println(city.findCityByZipCode(11111));
            System.out.println(city.findCityByZipCode(50000));
        } catch (CityNotFoundException e) {
            e.printStackTrace();
        }
    }
}
