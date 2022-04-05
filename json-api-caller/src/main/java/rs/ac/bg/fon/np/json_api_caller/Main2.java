package rs.ac.bg.fon.np.json_api_caller;

import java.io.FileWriter;
import java.io.PrintWriter;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;

import rs.ac.bg.fon.np.json_api_caller.airplane.Airplane;

public class Main2 {

	public static void main(String[] args) {
		Airplane a1 = new Airplane();	
		a1.setRegistration_number("Y15-ZZ");
		a1.setProduction_line("Boeing 747 Classic");
		a1.setModel_name("123");
		a1.setFirst_flight_date("2015-08-02T22:00:00.000Z");
		a1.setLine_number("15974");
		a1.setPlane_series("4568");
		a1.setPlane_owner("Airwork Flight Operations Ltd");
		a1.setEngines_count("2");
		a1.setPlane_age("7");
		a1.setPlane_status("active");

		
		Airplane a2 = new Airplane();
		a2.setRegistration_number("P75-JJ");
		a2.setProduction_line("JIRA 77");
		a2.setModel_name("321");
		a2.setFirst_flight_date("2000-07-02T22:00:00.000Z");
		a2.setLine_number("1478");
		a2.setPlane_series("15");
		a2.setPlane_owner("Moran Flight Operations Ltd");
		a2.setEngines_count("2");
		a2.setPlane_age("22");
		a2.setPlane_status("active");
		
		Airplane a3 = new Airplane();
		a3.setRegistration_number("HY7Y-AA");
		a3.setProduction_line("NYN 159 Speed");
		a3.setModel_name("187");
		a3.setFirst_flight_date("1971-08-02T22:00:00.000Z");
		a3.setLine_number("88");
		a3.setPlane_series("14");
		a3.setPlane_owner("JUN");
		a3.setEngines_count("2");
		a3.setPlane_age("51");
		a3.setPlane_status("inactive");
		
		Airplane[] a = {a1,a2,a3};
		try(PrintWriter out = new PrintWriter(new FileWriter("niz_objekata.json"))) {

			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			out.print(gson.toJson(a));

		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
