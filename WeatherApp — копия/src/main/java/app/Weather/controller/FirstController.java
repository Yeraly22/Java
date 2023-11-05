package app.Weather.controller;

import app.Weather.db.entity.Weather;
import app.Weather.dto.MResponse;
import app.Weather.dto.MWeather;
import app.Weather.service.WeatherService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(("/api"))
@RequiredArgsConstructor
public class FirstController {
    private final WeatherService weatherService;

    @GetMapping("test")
    public MResponse testFirstEndpoint(){
        return MResponse.builder()
                .response("tested first endpoint successfully")
                .status("200").build();
    }

    @GetMapping("/getWeather") //READ
    public MWeather getWeather(@RequestParam String city){
        return weatherService.getWeather(city);
    }


    @PostMapping("/saveWeather")
    public MResponse saveWeather(@RequestBody Weather weather){
       return weatherService.saveWeather(weather);
    }


    @PutMapping("/updateWeather")
    public MResponse updateWeather(@RequestBody Weather weather){
        return weatherService.updateWeather(weather);
    }

    @DeleteMapping("/deleteWeather")
    public MResponse deleteWeather(@RequestParam String city){
        return weatherService.deleteWeather(city);
    }

}
