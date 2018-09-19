
public class Temperatura {

	private double celsius;
	private double farenheit;

	public Temperatura(double degreesCelsius) {
		this.celsius = degreesCelsius;
		this.farenheit = this.convertToFarenheit(degreesCelsius);
	}

	private double convertToCelsius(double degreesFarenheit) {
		return (degreesFarenheit - 32) * 5 / 9;
	}

	private double convertToFarenheit(double degreesCelsius) {
		return degreesCelsius * 9 / 5 + 32;
	}

	public double getCelsius() {
		return celsius;
	}

	public void setCelsius(double celsius) {
		this.celsius = celsius;
		this.farenheit = this.convertToFarenheit(celsius);
	}

	public double getFarenheit() {
		return farenheit;
	}

	public void setFarenheit(double farenheit) {
		this.farenheit = farenheit;
		this.celsius = this.convertToCelsius(farenheit);
	}

}
