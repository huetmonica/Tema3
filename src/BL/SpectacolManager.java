package BL;

import Models.Spectacol;
import UI.LoginForm;
import DL.SpectacolDAO;
import java.util.ArrayList;

import javax.swing.JFrame;

public class SpectacolManager {
	private String titlu;
	private String regia;
	private String distributia;
	private String data;
	private String nrb;
	private int nr;

	public SpectacolManager(String titlu, String regia, String distributia, String data, String nrb) {
		this.titlu = titlu;
		this.regia = regia;
		this.distributia = distributia;
		this.data = data;
		this.nrb = nrb;

	}

	public void Adauga() {
		nr = Integer.parseInt(nrb);
		Spectacol sp = new Spectacol(titlu, regia, distributia, data, nr);
		SpectacolDAO spec = new SpectacolDAO();
		spec.addSpectacol(sp);
	}

	public ArrayList getSpectacole() {
		ArrayList list = new ArrayList();
		SpectacolDAO spec = new SpectacolDAO();
		list = spec.getSpectacol();
		return list;
	}

	public void ExportaSpectacole(String option) {

		ExportFactory ef = new ExportFactory();
		String opt = option;
		Export exp = ef.exporta(opt);
		exp.export();

	}
}
