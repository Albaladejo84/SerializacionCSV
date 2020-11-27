public class Persona {
	String nombre;
	int edad;
	String email;

	public Persona() {
		this("", 1, "");
	}

	public Persona(String nombre, int edad, String email) {
		this.nombre = nombre;
		this.edad = (edad > 0) ? edad : 1;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", email=" + email + "]";
	}

	public String toString(String[] yaml) {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", email=" + email + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String exportarCsv() {

		return nombre + ", " + edad + ", " + email;
//		return "\"" + nombre + "\",\"" + edad + "\",\"" + email + "\" CLRF";
	}

	public String exportarCsv(char separador) {
		return "\"" + nombre + "\"" + separador + "\" " + edad + "\"" + separador + "\" " + email + "\"";
	}

	public void cargarCsv(String PersonaCsv) {
		String[] campoStrings = PersonaCsv.split(",");
		this.nombre = campoStrings[0];
		setEdad(Integer.parseInt(campoStrings[1]));
		this.email = campoStrings[2];
	}

	public void cargarCsv(String PersonaCsv, String separador) {
		String[] campoStrings = PersonaCsv.split(separador);
		this.nombre = campoStrings[0];
		setEdad(Integer.parseInt(campoStrings[1]));
		this.email = campoStrings[2];
	}

	public String[] exportarYAML() {
		String[] resultado = { "nombre:" + nombre, ", edad:" + edad, ", email:" + email };
		return resultado;
	}

	public void importarYAML(String[] personaYaml) { // Recibe un array de YAML {"nombre: Jose Luis", "edad: 12",
														// "email: joselito@mail.com"}
		String[] campoNombre = personaYaml[0].split(":"); // Con split() divido cada campo del array YAML en dos campos
															// separados por ":"
		String[] campoEdad = personaYaml[1].split(":");
		String[] campoEmail = personaYaml[2].split(":");

		nombre = campoNombre[1].trim(); // Asidno el segundo campo de la división a los atributos del objeto Persona
		setEdad(Integer.parseInt(campoEdad[1].trim()));
		email = campoEmail[1].trim();
	}

	public static Persona crearPersonaConYml(String[] yml) { //Metodo que crea un objeto persona e invoca al metodo importar
		Persona persona = new Persona();
		persona.importarYAML(yml);
		return persona;
	}
	public static Persona[] exportarPersonasYml (String[] listaYml) {
		int numeroPersonas = listaYml.length/3;
		Persona[] listaPersonas = new Persona[numeroPersonas];
		for (int i = 0; i < numeroPersonas; i++) {
			String[] personaYml = {listaYml[i*3], listaYml[i*3+1], listaYml[i*3+2]};
			listaPersonas[i] = Persona.crearPersonaConYml(personaYml);
		}
		return listaPersonas;
	}

}
