package APIData;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class APIJSONWeather {
    @JsonProperty("main")
    private String main;
    public  APIJSONWeather()
    {

    }
    public String getMain() {
        return main;
    }
}
