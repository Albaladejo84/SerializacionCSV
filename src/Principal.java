public class Principal {

	public static void main(String[] args) {
//		
//		Ejercicio CSV
		
//		1.- Crear una clase Persona con atributos nombre, edad, email, con:
//		    • 	Un constructor sin argumentos que genere el nombre vacío (“”), la edad a 1, y el email 	vacío (“”). 
//
//		    • 	Un constructor con 3 argumentos (nombre, edad, email)
//
//		    • 	Los métodos set y get correspondientes. 
//
//		    • 	Generar el método toString().
//
//		    • 	Crear un método exportarCsv que devuelva una cadena en formato csv con los datos 	de la persona.
//
//		    • 	Crear un método cargarCsv que reciba una cadena con formato csv y cambie los datos 	de la persona
//		2.- Crear una clase Principal con el método main() donde se probarán los métodos de la clase Persona.
		

		
		System.out.println("Creando un CSV con los atributos de un objeto Persona");
		Persona persona = new Persona ("Pedro", 36, "albaladejopedro84@gmail.com");
		System.out.println(persona);
		System.out.println(persona.exportarCsv());
		System.out.println("");
		//-----------------------------------------------------------------------------------------------------------------------------
		System.out.println("Creando un objeto Persona con los atributos de un CSV");
		String personaCsv = "Juan,18,otro@gmail.com";
		System.out.println(personaCsv);
		//-----------------------------------------------------------------------------------------------------------------------------
		Persona persona2 = new Persona ();
		persona2.cargarCsv(personaCsv);
		System.out.println(persona2);
		System.out.println("");
		//-----------------------------------------------------------------------------------------------------------------------------
		System.out.println("Creando un objeto Persona con los atributos de un CSV y diciendo que el caracter de separacion son dos puntos");
		String personaCsv2 = "Jose:63:josele@gmail.com";
		Persona persona3 = new Persona ();
		persona3.cargarCsv(personaCsv2, ":");
		System.out.println(persona3.exportarCsv());
		System.out.println(persona3);

	}
}
