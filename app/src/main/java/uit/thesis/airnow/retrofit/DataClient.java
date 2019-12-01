package uit.thesis.airnow.retrofit;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import uit.thesis.airnow.model.AQIModel;
import uit.thesis.airnow.model.ForecastModel;
import uit.thesis.airnow.model.HumidityModel;
import uit.thesis.airnow.model.LocationModel;
import uit.thesis.airnow.model.TemperatureModel;

public class DataClient {

  @SerializedName("aqi")
  private List<AQIModel> dataAQIList;

  @SerializedName("forecast")
  private List<ForecastModel> forecastList;

  @SerializedName("humidity")
  private List<HumidityModel> humidityList;

  @SerializedName("temperature")
  private List<TemperatureModel> temperatureList;

  @SerializedName("locations")
  private List<LocationModel> locationsList;

  public List<AQIModel> getDataAQIList() {
    return dataAQIList;
  }

  public List<ForecastModel> getForecastList() {
    return forecastList;
  }

  public List<HumidityModel> getHumidityList() {
    return humidityList;
  }

  public List<TemperatureModel> getTemperatureList() {
    return temperatureList;
  }

  public List<LocationModel> getLocationsList() {
    return locationsList;
  }
}

