package BL;

import java.util.ArrayList;

import DL.SpectacolDAO;
import BL.SpectacolManager;

public class ExportFactory {
	ArrayList list = new ArrayList();

	public Export exporta(String option) {
		if (option == null) {
			return null;
		}
		if (option.equalsIgnoreCase("csv")) {
			SpectacolDAO spec = new SpectacolDAO();
			list = spec.getSpectacol();
			// System.out.println(list.get(1));
			return new CsvExport(list);

		} else if (option.equalsIgnoreCase("json")) {
			SpectacolDAO spec = new SpectacolDAO();
			list = spec.getSpectacol();
			System.out.println("json");
			return new JsonExport(list);
		}

		return null;
	}
}
