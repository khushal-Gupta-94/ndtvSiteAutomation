package APIData;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class APIJSONWind {
    @JsonProperty("speed")
    private double speed;

    public APIJSONWind() {

    }

    public double getSpeed() {
        return speed;
    }
}