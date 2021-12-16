package com.nttdata.spring.services;

import java.util.List;

import com.nttdata.spring.persistence.NttdataPedido;
import com.nttdata.spring.persistence.NttdataProducto;

public interface NttdataMensajeriaManagementServiceI {
	/**
	 * Añadir un pedido a la lista
	 * 
	 * @param pedido
	 * @param productos
	 */
	public void addPedido(NttdataPedido pedido, List<NttdataProducto> productos);

	/**
	 * Mostar el pedido y el precio final
	 * 
	 * @param pedido
	 */
	public void showPedido(NttdataPedido pedido);
}
