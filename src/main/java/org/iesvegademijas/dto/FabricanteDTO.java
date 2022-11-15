/**
 * 
 */
package org.iesvegademijas.dto;

import org.iesvegademijas.model.Fabricante;

/**
 * @author usuario
 *
 */
public class FabricanteDTO extends Fabricante {
	
	private int numProds;
	
	// Constructor de la clase
	public FabricanteDTO(Fabricante fab) {
		
		super.setCodigo(fab.getCodigo());
		super.setNombre(fab.getNombre());
		
	}
	
	public FabricanteDTO() {
		
		
		
	}

	public int getNumProds() {
		return numProds;
	}

	public void setNumProds(int numProds) {
		this.numProds = numProds;
	}
	
	

}
