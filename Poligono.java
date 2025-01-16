package Ejercicios_Tema_6;

public abstract class Poligono {
	double lado1, lado2, lado3, lado4;
	int nlados;
	Poligono(double l1, double l2, double l3, int nlados) {
		lado1 = l1;
		lado2 = l2;
		lado3 = l3;
		this.nlados = nlados;
	}
	abstract void perimetro();
}
