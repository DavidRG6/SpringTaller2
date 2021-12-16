package com.nttdata.spring.persistence;

import java.util.ArrayList;
import java.util.List;

public class NttdataPedido {
	private String id;
	private String destinatario;
	private String direccion_entrega;
	private Boolean exterior;
	private ArrayList<NttdataProducto> listProductos=new ArrayList<NttdataProducto>();

	
	public NttdataPedido(String id, String destinatario, String direccion_entrega, Boolean exterior) {
		this.id = id;
		this.destinatario = destinatario;
		this.direccion_entrega = direccion_entrega;
		this.exterior = exterior;
	}

	/**
	 * @return the listProductos
	 */
	public ArrayList<NttdataProducto> getListProductos() {
		return listProductos;
	}

	/**
	 * @param listProductos the listProductos to set
	 */
	public void setListProductos(ArrayList<NttdataProducto> listProductos) {
		this.listProductos = listProductos;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the destinatario
	 */
	public String getDestinatario() {
		return destinatario;
	}

	/**
	 * @param destinatario
	 *            the destinatario to set
	 */
	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}

	/**
	 * @return the direccion_entrega
	 */
	public String getDireccion_entrega() {
		return direccion_entrega;
	}

	/**
	 * @param direccion_entrega
	 *            the direccion_entrega to set
	 */
	public void setDireccion_entrega(String direccion_entrega) {
		this.direccion_entrega = direccion_entrega;
	}

	/**
	 * @return the exterior
	 */
	public Boolean getExterior() {
		return exterior;
	}

	/**
	 * @param exterior
	 *            the exterior to set
	 */
	public void setExterior(Boolean exterior) {
		this.exterior = exterior;
	}

}
