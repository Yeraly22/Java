package app.Weather.proxy;

import app.Weather.db.entity.Weather;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "weathers",
url = "name.service.url")
public interface WeathersProxy {

    @PostMapping("/saveWeather")
     Weather createWeather(@RequestHeader String requestId,
                                  @RequestBody Weather weather);

}
