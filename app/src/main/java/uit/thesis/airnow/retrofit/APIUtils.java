package uit.thesis.airnow.retrofit;

public class APIUtils {
    public static final String Base_Url = "http://13.59.35.198:8000/api/";
//    public static final String Base_Url = "http://192.168.1.109:8000/api/";

    public static APIService getData() {
        return RetrofitClient.getClient(Base_Url).create(APIService.class);

    }//nhan va gui data
}
