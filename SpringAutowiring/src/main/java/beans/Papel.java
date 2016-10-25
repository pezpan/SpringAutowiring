package beans;

public class Papel {
	
	private Boligrafo boligrafo;
	private Pluma pluma;
	public Boligrafo getBoligrafo() {
		return boligrafo;
	}
	public void setBoligrafo(Boligrafo boligrafo) {
		this.boligrafo = boligrafo;
	}
	public Pluma getPluma() {
		return pluma;
	}
	public void setPluma(Pluma pluma) {
		this.pluma = pluma;
	}
	@Override
	public String toString() {
		boligrafo.escribir();
		pluma.escribir();
		return "Hemos escrito en el papel\n";
	}
	
	

}
