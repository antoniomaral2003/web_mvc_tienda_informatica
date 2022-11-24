/**
 * 
 */
package org.iesvegademijas.dao;

import java.util.*;
import org.iesvegademijas.model.Usuario;

/**
 * @author Antonio Martin
 *
 */
public interface UsuarioDAO {
	
	public void create(Usuario usuario);
	
	public List<Usuario> getAll();
	
	public Optional<Usuario> find(int id);
	
	public void update(Usuario usuario);
	
	public void delete(int id);
	

}
