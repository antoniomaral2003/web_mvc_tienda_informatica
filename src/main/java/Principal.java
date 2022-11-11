import org.iesvegademijas.model.*;
import org.iesvegademijas.dao.*;

/**
 * 
 */

/**
 * @author Antonio Martin
 *
 */
public class Principal {

	public static void main(String[] args) {
		
		Fabricante fabricante1 = new Fabricante(10, "Dell");
		FabricanteDAO tablaFabricante = new FabricanteDAOImpl();
		Producto producto1 = new Producto(11, "Inspiron 16 Plus", 1499.00, 10);
		ProductoDAO tablaProducto = new ProductoDAOImpl();
		
		producto1.setCodigo(15);
		producto1.setNombre("VivoBook S OLED");
		producto1.setPrecio(1299.00);
		producto1.setCodigoFabricante(1);
		
		tablaFabricante.create(fabricante1);
		tablaProducto.create(producto1);
		
		tablaProducto.getAll().forEach(System.out::println);
		
		producto1.setNombre("VivoBook S Flip");
		
		tablaProducto.update(producto1);
		
		System.out.println("*******************************************");
		
		tablaProducto.delete(13);
		
		System.out.println("*******************************************");
		
		tablaProducto.getAll().forEach(System.out::println);
		

	}

}
