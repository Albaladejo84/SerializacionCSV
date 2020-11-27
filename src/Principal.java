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
		Persona persona = new Persona("Pedro", 36, "albaladejopedro84@gmail.com");
		System.out.println(persona);
		System.out.println(persona.exportarCsv());
		System.out.println("");
		// -----------------------------------------------------------------------------------------------------------------------------
		System.out.println("Creando un objeto Persona con los atributos de un CSV");
		String personaCsv = "Juan,18,otro@gmail.com";
		System.out.println(personaCsv);
		// -----------------------------------------------------------------------------------------------------------------------------
		Persona persona2 = new Persona();
		persona2.cargarCsv(personaCsv);
		System.out.println(persona2);
		System.out.println("");
		// -----------------------------------------------------------------------------------------------------------------------------
		System.out.println(
				"Creando un objeto Persona con los atributos de un CSV y diciendo que el caracter de separacion son dos puntos");
		String personaCsv2 = "Jose:63:josele@gmail.com";
		Persona persona3 = new Persona();
		persona3.cargarCsv(personaCsv2, ":");
		System.out.println(persona3.exportarCsv());
		System.out.println(persona3);
		System.out.println("");
		// ---------------------------------------------------------------------------------------------------------------------------------

		// 3. Crear tres metodos exportarYAML, importarYAML y crearPersonaConYAML.

		System.out.println(persona.toString(persona.exportarYAML()));
		System.out.println("");
		System.out.println(
				"Creando un objeto Persona con sus atributos a partir de un array de YAML (el caracter de separacion en YAML son dos puntos)");

		String[] personaYaml = { "nombre: Jose Luis", "edad: 12", "email:jolesito@mail.com" }; // Arrray de YAML
																								// recibido
		persona.importarYAML(personaYaml);
		System.out.println(persona.toString());
		System.out.println("");

		// ----------------------------------------------------------------------------
		System.out.println("Creando un objeto Persona con los atributos de un array YAML");
		String[] personaYaml2 = { "nombre: Carlos", "edad: 60", "email:carletes@mail.com" }; // Arrray de YAML recibido

		System.out.println(Persona.crearPersonaConYml(personaYaml2).toString());
		System.out.println("");

		//----------------------------------------------------------------------------------
		// 4. Recibir un YAML con los datos de varias personas y devolvr un array de personas con sus datos	
		
		String[] personasLista = { "nombre: Paco", "edad: 60", "email: e@mail.com",
									"nombre: Manuel", "edad: 70", "email: m@mail.com", 
									"nombre: Roberto", "edad: 80", "email: r@mail.com" }; 
		
		Persona[] listaPersonas = Persona.exportarPersonasYml(personasLista);
		for (int i = 0; i < listaPersonas.length; i++) {
			System.out.println(listaPersonas[i].toString());
		}
	}
}
