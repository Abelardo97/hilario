package or.generation;

public class DatosInmutables {

	public static void main(String[] args) {
		String nombre = "Eduardo";
		nombre = "Erick";
		String participante = "Eduardo";

		String personaCh18 = new String("Eduardo");

		if (participante.equals(personaCh18) )
			System.out.println("Es la misma persona");
		else
			System.out.println("La persona es diferente");

	}

}