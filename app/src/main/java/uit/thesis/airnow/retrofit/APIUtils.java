package uit.thesis.airnow.retrofit;

import uit.thesis.airnow.Constants;

public class APIUtils {

  public static APIService getData() {
    return RetrofitClient.getClient(Constants.SERVER_API_BASE).create(APIService.class);
  }

  public static APIService getAirVisual() {
    return RetrofitClient.getClient(Constants.SERVER_AIRVISUAL).create(APIService.class);
  }
}
