package Clases;


// la idea es que para esta interfaz se pueda tener diff implementaciones,
// por ejemplo la de monticulo.

public class ColaDePrioridad {

	Monticulo monticulo; //Composition

	public ColaDePrioridad() {
		monticulo = new Monticulo();
	}

	public void add(Integer num) {
		monticulo.insertar(num);
	}

	public Integer remove() {
		return monticulo.sacar();
	}

	public void mostrar() {
		for (Integer elem : monticulo.getVec()) {
			System.out.println(elem);
		}
	}
}
