package Clases;

import java.util.ArrayList;
import java.util.List;

import com.sun.javafx.geom.Vec2d;
import com.sun.xml.internal.bind.v2.model.core.ID;

public class Monticulo {

	private ArrayList<Integer> vec;

	public Monticulo() {
		vec = new ArrayList<>();
		vec.add(0);
	}

	public void insertar(Integer num) {

		if (vec.size() == 1) {
			vec.add(num);
		} else {
			vec.add(num); // agrego al final

			int IndUltimo = vec.size() - 1;
			Integer insertado = num;
			Integer indiceInsertado = IndUltimo;
			Integer padre = vec.get(IndUltimo / 2);
			Integer indicePadre = (IndUltimo / 2);

			while (indicePadre > 0 && insertado < padre) {
				// intercambio
				vec.set(indiceInsertado, padre);
				vec.set(indicePadre, insertado);

				// reasigno variables
				insertado = vec.get(indicePadre);
				indiceInsertado = indicePadre;

				indicePadre /= 2;
				padre = vec.get(indicePadre); // antes de cortar me traera el 0.
			}
		}

	}

	public Integer sacar() {

		//saco el pri
		Integer ret = vec.get(1);
		// piso el pri con el ult
		vec.set(1, vec.get(vec.size()-1));
		// borro el ult
		vec.remove(vec.size()-1);

		// balanceo
		int indicePadre = 1;
		Integer auxIntercambio = 0;

		while (indicePadre * 2 + 1 < vec.size()) {

			auxIntercambio = vec.get(indicePadre); // hijo
			if (vec.get(indicePadre * 2) < vec.get(indicePadre * 2 + 1)) {

				vec.set(indicePadre, vec.get(indicePadre * 2));
				vec.set(indicePadre * 2, auxIntercambio); // aca no pone el 3

				indicePadre *= 2;
			} else {
				vec.set(indicePadre, vec.get(indicePadre * 2 + 1));
				vec.set(indicePadre * 2 + 1, auxIntercambio);

				indicePadre = indicePadre * 2 + 1;
			}
			
		}
		
		/**
		 * Puede pasar que corto el while porque el ultimo nodo no tiene hermano. 
		 * En ese caso debere comparar el nodo actual con su unico hijo que es el ultimo nodo 
		 * para ver si tengo que intercambiarlos*/
		if(indicePadre*2 == vec.size()-1) {
			
			if(vec.get(indicePadre) > vec.get(indicePadre*2) ) { 
				
				
				auxIntercambio = vec.get(indicePadre); // hijo
				vec.set(indicePadre, vec.get(indicePadre * 2));
				vec.set(indicePadre * 2, auxIntercambio);
				
			}
		}
		


		return ret;
	}

	public ArrayList<Integer> getVec() {
		return vec;
	}

	public void mostrar() {
		for (Integer elem : getVec()) {
			System.out.println(elem);
		}
	}



}
