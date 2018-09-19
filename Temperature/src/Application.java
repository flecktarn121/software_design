public class Application 
{
	public static void main(String[] args) 
	{
		Temperatura[] temperaturas = new Temperatura[100];

		// Toma de datos
		double mediaCelsius = 0;
		double mediaFahrenheit = 0;
		double varianza = 0;
		for (int i = 0; i < temperaturas.length; i++) {
			temperaturas[i] = new Temperatura(leeSensorCelsius());
			mediaCelsius += temperaturas[i].getCelsius();
			mediaFahrenheit += temperaturas[i].getFarenheit();
			varianza += Math.pow((temperaturas[i].getFarenheit()) - mediaFahrenheit, 2);
		}
		mediaCelsius = mediaCelsius / temperaturas.length;
		System.out.printf("La media en Celsius es: %.1f ºC\n", mediaCelsius);
		
		mediaFahrenheit = mediaFahrenheit / temperaturas.length;
		System.out.printf("La media en Fahrenheit es: %.1f ºF\n", mediaFahrenheit);
		
		varianza = varianza / temperaturas.length;
		System.out.printf("La varianza en Fahrenheit es: %.1f\n", varianza);
	}

	public static double leeSensorCelsius() 
	{
		return Math.random() * 30;
	}
}