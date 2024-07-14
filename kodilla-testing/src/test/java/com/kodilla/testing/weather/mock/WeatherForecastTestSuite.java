package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class WeatherForecastTestSuite {

    @Mock
    private Temperatures temperaturesMock;

    @BeforeEach
    void test(){
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
    }

    @Test
    void testCalculateForecastWithMock(){
        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();
        //Then
        Assertions.assertEquals(5, quantityOfSensors);
    }

    @Test
    void testAverageTemperature(){
        //Given
        double expectedAverageTemperature = 25.56;
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        double averageValue = weatherForecast.calculateAverageTemperature();

        //Then
        Assertions.assertEquals(expectedAverageTemperature, averageValue);
    }

    @Test
    void testMedianTemperature(){
        //Given
        double expectedMedianTemperature = 25.5;
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        double medianValue = weatherForecast.calculateMedianTemperature();

        //Then
        Assertions.assertEquals(expectedMedianTemperature, medianValue);
    }
}