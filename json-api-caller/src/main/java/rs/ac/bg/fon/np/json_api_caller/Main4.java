package rs.ac.bg.fon.np.json_api_caller;

import java.io.FileWriter;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class Main4 {

	public static void main(String[] args) {
		JsonObject a = new JsonObject();
		
		a.addProperty("registration_number", "KMN-7P");
		a.addProperty("production_line", "TITA 45");
		a.addProperty("model_name", "794");
		a.addProperty("first_flight_date", "2021-07-02T22:00:00.000Z");
		a.addProperty("line_number", "7412");
		a.addProperty("plane_series", "2");
		a.addProperty("plane_owner", "Koutik");
		a.addProperty("engines_count", "4");
		a.addProperty("plane_age", "1");
		a.addProperty("plane_status", "active");
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		try(FileWriter fw = new FileWriter("rucni_upis.json");){
			gson.toJson(a,fw);
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
