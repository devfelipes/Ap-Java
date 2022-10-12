package entities;

public class Entities {
	public double largura, altura;

	public double area() {
		return this.altura * this.largura;
	}
	public double perimetro () {
		return (this.altura * 2 ) + (this.largura * 2);
	}
	public double diagonal () {
		return Math.sqrt((this.altura * this. altura)+ (this.largura * this.largura));
	}
	public String toString() {
		return "ÁREA= "
			+ String.format("%.2f%n",area())
			+ "PERIMETRO= "
			+ String.format("%.2f%n",perimetro())
			+ "DIAGONAL= "
			+ String.format("%.2f",diagonal());
	}
	
}
