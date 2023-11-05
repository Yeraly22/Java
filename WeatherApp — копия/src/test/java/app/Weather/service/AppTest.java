package app.Weather.service;


import app.Weather.dto.MWeather;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class AppTest {
    @Mock
    private WeatherService weatherService;

    @Test
    void shouldReturnWeather(){
        MWeather mWeather = MWeather.builder()
                .city("Almaty")
                .temperature(210)
                .description("cold")
                .build();
        Mockito.when(weatherService.getWeather("Almaty")).thenReturn(mWeather);
        MWeather responseWeather = weatherService.getWeather("Almaty");
        assertEquals("Almaty",responseWeather.getCity());
        assertEquals(210,responseWeather.getTemperature());
        assertEquals("cold",responseWeather.getDescription());
    }


}
