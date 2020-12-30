package stepDefinitions;

import APIData.GetAPIData;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.Then;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)

@SuppressWarnings("deprecation")
public class APIDataFetch {
    @Then("^Fetch data for \"([^\"]*)\" from API using \"([^\"]*)\"$")
    public void fetchAPIData(String cityname,String appkey) throws IOException {
        List<String> apidata = new ArrayList<String>();
        final String USER_AGENT="Mozilla/5.0";
        StringBuffer result=new StringBuffer();
        HttpClient client=new DefaultHttpClient();
        String url="http://api.openweathermap.org/data/2.5/weather?q="+cityname+",IN&appid="+appkey;
        HttpGet request=new HttpGet(url);
        request.addHeader("User-Agent",USER_AGENT);
        HttpResponse response=client.execute(request);
        int responseCode=response.getStatusLine().getStatusCode();
        System.out.println("Response Code: " + responseCode);
        try{
            if(responseCode==200)

            {
                System.out.println("Get Response is Successfull");
                BufferedReader reader=new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
                String line="";
                while((line=reader.readLine())!=null)
                {
                    result.append(line);
                    System.out.println(result.toString());
                }
            }

        }
        catch(Exception ex)
        {
            result.append("Get Response Failed");
             System.out.println(result.toString());
        }
        ObjectMapper objectMapper=new ObjectMapper();
        GetAPIData datavalue =objectMapper.readValue(result.toString(), GetAPIData.class);

        String cityName=datavalue.getName();
        String country=datavalue.getSys().getCountry();
        String temperature = String.valueOf(datavalue.getMain().getTemp());
        String humidity = String.valueOf(datavalue.getMain().getHumidity());
        String windspeed = String.valueOf(datavalue.getWind().getSpeed());
        apidata.add(cityName);
        apidata.add(country);
        apidata.add(temperature);
        apidata.add(humidity);
        apidata.add(windspeed);
        for (String x:apidata)
            System.out.println(x);

    }
}

