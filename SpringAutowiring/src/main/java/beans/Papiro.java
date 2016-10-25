package beans;

public class Papiro {
	
	private Boligrafo boligrafo;
	private Pluma pluma;
	
	public Papiro(Boligrafo boligrafo, Pluma pluma) {
		super();
		this.boligrafo = boligrafo;
		this.pluma = pluma;
	}

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
		return "Hemos escrito en el papiro\n";
	}
}
