package app.Weather.dto;

import app.Weather.db.entity.Weather;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Setter
@Getter
@Builder
@ToString
public class MWeather {
    private String description;
    private double temperature;
    private String city;


    public static MWeather create(Response response){
        return MWeather.builder()
                .city(response.getName())
                .description(response.getWeather().get(0).getDescription())
                .temperature(response.getMain().getTemp())
                .build();
    }


    @Getter
    @Setter
    @ToString
    public static class Response{
        private Main main;
        private List<Weather> weather;
        private String name;


        @Getter
        @Setter
        @ToString
        public static class Main{
            private double temp;
        }

    }

}
