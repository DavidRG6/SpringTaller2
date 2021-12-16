package com.nttdata.spring;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nttdata.spring.persistence.NttdataPedido;
import com.nttdata.spring.persistence.NttdataProducto;
import com.nttdata.spring.services.NttdataMensajeriaManagementCMCImpl;
import com.nttdata.spring.services.NttdataMensajeriaManagementPeninsulaImpl;
import com.nttdata.spring.services.NttdataMensajeriaManagementServiceI;

@SpringBootApplication
public class NttdataSpringMain implements CommandLineRunner {
	@Autowired
	@Qualifier("peninsula")
	NttdataMensajeriaManagementServiceI serviceMensajeriaPeninsula;
	@Autowired
	@Qualifier("CMC")
	NttdataMensajeriaManagementServiceI serviceMensajeriaCMC;

	public static void main(String[] args) {
		SpringApplication.run(NttdataSpringMain.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		// Lista Productos Peninsula
		ArrayList<NttdataProducto> listaProductosPeninsula1 = new ArrayList<NttdataProducto>();

		// Lista Productos CMC
		ArrayList<NttdataProducto> listaProductosCMC1 = new ArrayList<NttdataProducto>();

		// productos
		NttdataProducto p1 = new NttdataProducto("1", "patatas", 0.30);
		NttdataProducto p2 = new NttdataProducto("2", "pasta", 1.30);
		NttdataProducto p3 = new NttdataProducto("3", "leche", 5.30);
		NttdataProducto p4 = new NttdataProducto("4", "tomate", 3.30);
		NttdataProducto p1_2 = new NttdataProducto("1", "patatas", 0.30);
		NttdataProducto p2_2 = new NttdataProducto("2", "pasta", 1.30);
		NttdataProducto p3_2 = new NttdataProducto("3", "leche", 5.30);
		NttdataProducto p4_2 = new NttdataProducto("4", "tomate", 3.30);

		// Añadir productos
		listaProductosPeninsula1.add(p1);
		listaProductosPeninsula1.add(p2);
		listaProductosPeninsula1.add(p3);
		listaProductosPeninsula1.add(p4);

		listaProductosCMC1.add(p1_2);
		listaProductosCMC1.add(p2_2);
		listaProductosCMC1.add(p3_2);
		listaProductosCMC1.add(p4_2);

		// Crear Pedidos
			// Pedido Peninsula
			NttdataPedido pedidoPeninsula = new NttdataPedido("1", "Mercadona", "Calle Aviacion", false);
			crearPedido(pedidoPeninsula, listaProductosPeninsula1);
			// Pedido Peninsula
			NttdataPedido pedidoCMC = new NttdataPedido("2", "Carrefour", "Calle Helios", true);
			crearPedido(pedidoCMC, listaProductosCMC1);
		//Mostrar Pedidos
		
		System.out.println("Pedido en Peninsula");
			serviceMensajeriaPeninsula.showPedido(pedidoPeninsula);

		System.out.println("Pedido fuera de la Peninsula");
			serviceMensajeriaCMC.showPedido(pedidoCMC);
	}

	/**
	 * Funcion para la eleccion del pedido y su creacion
	 * 
	 * @param pedido
	 * @param productos
	 */
	private void crearPedido(NttdataPedido pedido, ArrayList<NttdataProducto> productos) {
		if (pedido.getExterior()) {
			serviceMensajeriaCMC.addPedido(pedido, productos);
		} else {
			serviceMensajeriaPeninsula.addPedido(pedido, productos);
		}
	}
}
