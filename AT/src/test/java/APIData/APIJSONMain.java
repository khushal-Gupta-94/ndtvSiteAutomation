package APIData;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class APIJSONMain {
    @JsonProperty("temp")
    private double temp;
    @JsonProperty("humidity")
    private double humidity;
    public APIJSONMain()
    {

    }
    public double getTemp() {
        return temp;
    }
    public double getHumidity() {
        return humidity;
    }
}