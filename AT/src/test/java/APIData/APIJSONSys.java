package APIData;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class APIJSONSys {

    @JsonProperty("country")
    private String country;
    public APIJSONSys()
    {

    }
    public String getCountry() {
        return country;
    }
}