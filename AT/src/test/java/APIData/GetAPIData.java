package APIData;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GetAPIData {

    @JsonProperty("name")
    private String name;
    @JsonProperty("sys")
    private APIJSONSys sys;
    @JsonProperty("main")
    private APIJSONMain main;
    @JsonProperty("wind")
    private APIJSONWind wind;
    @JsonProperty("weather")
    private static ArrayList weather;

    public GetAPIData()
    {

    }

    public String getName() {
        return name;
    }

    public APIJSONSys getSys() {
        return sys;
    }

    public APIJSONMain getMain() {
        return main;
    }

    public APIJSONWind getWind() {
        return wind;
    }
    public static ArrayList getWeather() {
        return weather;
    }


}