package com.nttdata.spring.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.nttdata.spring.persistence.NttdataPedido;
import com.nttdata.spring.persistence.NttdataProducto;

@Service("CMC")
public class NttdataMensajeriaManagementCMCImpl implements NttdataMensajeriaManagementServiceI {

	@Override
	public void addPedido(NttdataPedido pedido, List<NttdataProducto> productos) {
		ArrayList<NttdataProducto> lista = new ArrayList<NttdataProducto>();
		for (NttdataProducto producto : productos) {
			producto.setPrecio_pvp(producto.getPrecio_base() + (producto.getPrecio_base() * 0.04));
			lista = pedido.getListProductos();
			lista.add(producto);
			pedido.setListProductos(lista);
		}
	}

	@Override
	public void showPedido(NttdataPedido pedido) {
		Double finalAmount = 0.0;
		for (NttdataProducto producto : pedido.getListProductos()) {
			System.out.println(producto.getNombre() + " | " + producto.getId() + " | " + producto.getPrecio_base() + " | " + producto.getPrecio_pvp());
			finalAmount += producto.getPrecio_pvp();
		}
		System.out.println("Precio a total a pagar por el pedido :" + finalAmount);
	}
}
