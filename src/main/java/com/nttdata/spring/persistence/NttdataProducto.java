package com.nttdata.spring.persistence;

public class NttdataProducto {
	private String id;
	private String nombre;
	private Double precio_pvp;
	private Double precio_base;

	public NttdataProducto(String id, String nombre, Double precio_base) {
		this.id = id;
		this.nombre = nombre;
		this.precio_base = precio_base;
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
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre
	 *            the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the precio_pvp
	 */
	public Double getPrecio_pvp() {
		return precio_pvp;
	}

	/**
	 * @param precio_pvp
	 *            the precio_pvp to set
	 */
	public void setPrecio_pvp(Double precio_pvp) {
		this.precio_pvp = precio_pvp;
	}

	/**
	 * @return the precio_base
	 */
	public Double getPrecio_base() {
		return precio_base;
	}

	/**
	 * @param precio_base
	 *            the precio_base to set
	 */
	public void setPrecio_base(Double precio_base) {
		this.precio_base = precio_base;
	}

}
