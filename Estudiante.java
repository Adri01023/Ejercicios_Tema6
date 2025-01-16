package Ejercicios_Tema_6;

import Ejercicios_Tema_6.Persona.EstadoCivil;

public class Estudiante extends Persona {
	String curso;
	Estudiante(String n, String a, String d, EstadoCivil e, String c) {
		super(n, a, d, e);
		curso = c;
	}
}
