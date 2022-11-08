/**
 * 
 */
package org.iesvegademijas.dao;

import java.util.List;
import java.util.Optional;

import org.iesvegademijas.model.Fabricante;
import org.iesvegademijas.model.Producto;

/**
 * @author Antonio Martin
 *
 */
public interface ProductoDAO {
	
	public void create(Producto producto);
	
	public List<Producto> getAll();
	public Optional<Producto>  find(int id);
	
	public void update(Producto producto);
	
	public void delete(int id);

}
