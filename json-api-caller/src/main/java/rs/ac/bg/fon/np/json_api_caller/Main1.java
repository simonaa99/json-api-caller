package rs.ac.bg.fon.np.json_api_caller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import rs.ac.bg.fon.np.json_api_caller.airplane.Airplane;

public class Main1 {

	public static String ACCESS_KEY = "";
	public static String BASE_URL = "http://api.aviationstack.com/v1/";
	public static int LIMIT = 1;
	
	public static void main(String[] args) {
			try{
			
			URL url = new URL(BASE_URL + "airplanes" + "?access_key=" + ACCESS_KEY + "&limit=" + LIMIT );
			
			System.out.println(url);
			
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			
			con.setRequestMethod("GET");

			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			
			Gson gson=new GsonBuilder().setPrettyPrinting().create();
			
			JsonObject airplanes = gson.fromJson(br, JsonObject.class);
			
			JsonArray data=airplanes.getAsJsonArray("data");
			
			JsonObject jsonAirplane=(JsonObject) data.get(0);
			
			Airplane airplane=new Airplane();
			
			airplane.setRegistration_number(jsonAirplane.get("registration_number").getAsString());
			airplane.setProduction_line(jsonAirplane.get("production_line").getAsString());
			airplane.setModel_name(jsonAirplane.get("model_name").getAsString());
			airplane.setFirst_flight_date(jsonAirplane.get("first_flight_date").getAsString());
			airplane.setLine_number(jsonAirplane.get("line_number").getAsString());
			airplane.setPlane_series(jsonAirplane.get("plane_series").getAsString());
			airplane.setPlane_owner(jsonAirplane.get("plane_owner").getAsString());
			airplane.setEngines_count(jsonAirplane.get("engines_count").getAsString());
			airplane.setPlane_age(jsonAirplane.get("plane_age").getAsString());
			airplane.setPlane_status(jsonAirplane.get("plane_status").getAsString());
			
			br.close();
			System.out.println(airplane);
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
