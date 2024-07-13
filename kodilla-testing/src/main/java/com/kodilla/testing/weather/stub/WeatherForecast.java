package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }
    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();
        for(Map.Entry<String, Double> temperature: temperatures.getTemperatures().entrySet()) {
            resultMap.put(temperature.getKey(), temperature.getValue());
        }
        return resultMap;
    }

    public double calculateAverageTemperature() {
    double sumTemperature = 0;
    double averageTemperature;
    for(Map.Entry<String, Double> temperature: temperatures.getTemperatures().entrySet()) {
        sumTemperature += temperature.getValue();
    }
    averageTemperature = sumTemperature / temperatures.getTemperatures().size();
    return averageTemperature;
    }

    public double calculateMedianTemperature() {
        double medianTemperature = 0;
        Collection<Double> values = temperatures.getTemperatures().values();
        ArrayList<Double> temperatureValues = new ArrayList<>(values);
        Collections.sort(temperatureValues);
        if(temperatureValues.size() % 2 == 0) {
            medianTemperature = (temperatureValues.get(temperatureValues.size() / 2) + temperatureValues.get(temperatureValues.size() / 2 - 1)) / 2;
        } else{
            medianTemperature = temperatureValues.get(temperatureValues.size() / 2);
        }
        return medianTemperature;
    }
}
