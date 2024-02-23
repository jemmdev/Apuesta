
package coche;

/**
 *
 * @author Fran
 */
public class Coche {

    private String nombre;
    private double precio;  //jose enrique 
    private double precioIVA;
    private int stock;

    /* Constructor sin argumentos */
    public Coche ()
    {
    }
    // Constructor con parámetro para iniciar todas las propiedades de la clase
    // coche
    
    public Coche (String nom, double precio, int stock)
    {
        this.setNombre(nom);
        this.setPrecio(precio);
        this.setStock(stock);
    }
   // Método para asignar el nombre del coche
    public void asignarNombre(String nom)
    {
        setNombre(nom);
    }
    // Método que me devuelve el nombre del coche
    public String obtenerNombre()
    {
        return getNombre();
    }

    // Método que me devuelve el stock de coches disponible en cada momento
     public int obtenerStock ()
    {
        return getStock();
    }

    /* Método para comprar coches. Modifica el stock.
     * Este método va a ser probado con Junit
     */
    public void comprar(int cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede comprar un nº negativo de coches");
        setStock(getStock() + cantidad);
    }

    public void vender (int cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede vender una cantidad negativa de coches");
        if (obtenerStock()< cantidad)
            throw new Exception ("No se hay suficientes coches para vender");
        setStock(getStock() - cantidad);
    }

	private String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private double getPrecio() {
		return precio;
	}

	private void setPrecio(double precio) {
		this.precio = precio;
	}

	private double getPrecioIVA() {
		return precioIVA;
	}

	private void setPrecioIVA(double precioIVA) {
		this.precioIVA = precioIVA;
	}

	private int getStock() {
		return stock;
	}

	private void setStock(int stock) {
		this.stock = stock;
	}
    
}  
   
    

