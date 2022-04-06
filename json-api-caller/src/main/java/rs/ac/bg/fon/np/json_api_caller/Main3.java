package rs.ac.bg.fon.np.json_api_caller;

import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import rs.ac.bg.fon.np.json_api_caller.airplane.Airplane;

public class Main3 {

	public static void main(String[] args) {
		
		try(FileReader fr = new FileReader("niz_objekata.json")) {

			List<Airplane> airplanes;

			Gson gson = new Gson();

			Type tipLista = new TypeToken<List<Airplane>>() {}.getType();

			airplanes = gson.fromJson(fr, tipLista);

			for (Airplane a : airplanes) {
				System.out.println(a);
			}

		}catch (Exception e) {
			e.printStackTrace();

		}

	}

}
