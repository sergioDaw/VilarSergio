package Factura;
/**
 * Comentarios para la clase Factura
 * @author Modulo entornos de desarrollo
 * @version 1.0 13/03/2014
 */
import java.util.Arrays;

public class Factura {public String id_cliente;		// Identificador (codigo) del cliente
public String nombre_cliente;	// Nombre del cliente

public LineaFactura lineas[];	// lista de productos comprados
	

public Factura(String idCliente, String nombreCliente, LineaFactura[] lineas) {
	super();
	id_cliente = idCliente;
	nombre_cliente = nombreCliente;
	this.lineas = lineas;
}


/**
 * Devuelve el precio total de la Factura, calculado a partir del precio de cada linea	 
 */
public float getTotal(){
	float precio = 0;
	for (int i = 0; i < this.lineas.length; i++ ){
		precio += this.lineas[i].getTotal();
	}
	return precio;
}


@Override
public String toString() {
	return "Factura [" 
	+ "id_cliente=" + id_cliente 		 
	+ ", nombre_cliente=" + nombre_cliente 
	+ ", getTotal()=" + getTotal()
	+ ", lineas=" + Arrays.toString(lineas)
	+ "]";
}


public static void main(String[] args){
	
	/**
	 * Metodo Factura <code>Factura</code>
	 * @param id_cliente, numero de cliente
	 * @param nombre_cliente, el nombre del cliente
	 * @param lineas, es un array con la lista de los items comprados (?)
	 * @see getTotal
	 * @see Factura
	 * @return factura 1
	 */
	
	// Crear una factura
	LineaFactura[] lineas = new LineaFactura[]{
			new LineaFactura("P100", "Leche",	0.85f, 	6, 	0 ),
			new LineaFactura("P200", "Pan",		0.60f, 	1, 	0 ),
			new LineaFactura("P150", "Tomate",	0.85f, 	2, 	0 ),
			new LineaFactura("P600", "Cafe",		1.2f, 	1, 	0 )
		};														
	Factura factura1 = new Factura( "C100",  "Antonio Garcia", lineas);
	
	// Escribir la factura
	System.out.println( factura1 );
	
}	

}
