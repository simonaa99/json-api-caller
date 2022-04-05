package rs.ac.bg.fon.np.json_api_caller.airplane;

import com.google.gson.annotations.SerializedName;

public class Airplane {

	@SerializedName("registration_number")
	private String registration_number;
	
	@SerializedName("production_line")
	private String production_line;
	
	@SerializedName("model_name")
	private String model_name;
	
	@SerializedName("first_flight_date")
	private String first_flight_date;
	
	@SerializedName("line_number")
	private String line_number;
	
	@SerializedName("plane_series")
	private String plane_series;
	
	@SerializedName("plane_owner")
	private String plane_owner;
	
	@SerializedName("engines_count")
	private String engines_count;
	
	@SerializedName("plane_age")
	private String plane_age;
	
	@SerializedName("plane_status")
	private String plane_status;

	public String getRegistration_number() {
		return registration_number;
	}

	public void setRegistration_number(String registration_number) {
		this.registration_number = registration_number;
	}

	public String getProduction_line() {
		return production_line;
	}

	public void setProduction_line(String production_line) {
		this.production_line = production_line;
	}

	public String getModel_name() {
		return model_name;
	}

	public void setModel_name(String model_name) {
		this.model_name = model_name;
	}

	public String getFirst_flight_date() {
		return first_flight_date;
	}

	public void setFirst_flight_date(String first_flight_date) {
		this.first_flight_date = first_flight_date;
	}

	public String getLine_number() {
		return line_number;
	}

	public void setLine_number(String line_number) {
		this.line_number = line_number;
	}

	public String getPlane_series() {
		return plane_series;
	}

	public void setPlane_series(String plane_series) {
		this.plane_series = plane_series;
	}

	public String getPlane_owner() {
		return plane_owner;
	}

	public void setPlane_owner(String plane_owner) {
		this.plane_owner = plane_owner;
	}

	public String getEngines_count() {
		return engines_count;
	}

	public void setEngines_count(String engines_count) {
		this.engines_count = engines_count;
	}

	public String getPlane_age() {
		return plane_age;
	}

	public void setPlane_age(String plane_age) {
		this.plane_age = plane_age;
	}

	public String getPlane_status() {
		return plane_status;
	}

	public void setPlane_status(String plane_status) {
		this.plane_status = plane_status;
	}

	@Override
	public String toString() {
		return "Airplane [registration_number=" + registration_number + ", production_line=" + production_line
				+ ", model_name=" + model_name + ", first_flight_date=" + first_flight_date + ", line_number="
				+ line_number + ", plane_series=" + plane_series + ", plane_owner=" + plane_owner + ", engines_count="
				+ engines_count + ", plane_age=" + plane_age + ", plane_status=" + plane_status + "]";
	}
	
	
	
	
	
}
