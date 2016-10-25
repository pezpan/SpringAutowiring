package beans;

public class Carta {

	private IEscritura boligrafo;
	private IEscritura pluma;

	public IEscritura getBoligrafo() {
		return boligrafo;
	}
	
	public void setBoligrafo(IEscritura boligrafo) {
		this.boligrafo = boligrafo;
	}
	
	public IEscritura getPluma() {
		return pluma;
	}
	
	public void setPluma(IEscritura pluma) {
		this.pluma = pluma;
	}
	
	@Override
	public String toString() {
		boligrafo.escribir();
		pluma.escribir();
		return "Hemos escrito en la carta\n";
	}
}
