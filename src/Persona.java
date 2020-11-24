public class Persona {
	String nombre;
	int edad;
	String email;

	public Persona() {
		this("", 1, "");
	}

	public Persona(String nombre, int edad, String email) {
		this.nombre = nombre;
		this.edad = (edad>0)?edad:1;
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
		return "\"" + nombre + "\""  + separador + "\" " + edad + "\"" + separador + "\" "  + email + "\"";
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
		String[] resultado = {"nombre:" + nombre,  ", edad:" + edad, ", email:" + email};
		return resultado;
	}
	
	public void importarYAML(String[] PersonaYaml) {
		PersonaYaml[0].split(":");
		
		
	
	}
}
