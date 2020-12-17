package pe.com.arland.cliente1.registro.entity;

import java.util.Date;

public abstract class ComprobanteBaseBackUp {

	public ComprobanteBaseBackUp(String idContribuyente, String tipoComprobante, String serieComprobante,
			Long numeroComprobante, Double montoComprobante, String idCliente, String idEmpleado, Date fechaRegistro,
			Date fechaCancelacion, String estadoComprobante) {
		super();
		this.idContribuyente = idContribuyente;
		this.tipoComprobante = tipoComprobante;
		this.serieComprobante = serieComprobante;
		this.numeroComprobante = numeroComprobante;
		this.montoComprobante = montoComprobante;
		this.idCliente = idCliente;
		this.idEmpleado = idEmpleado;
		this.fechaRegistro = fechaRegistro;
		this.fechaCancelacion = fechaCancelacion;
		this.estadoComprobante = estadoComprobante;
	}

	// TODO Auto-generated constructor stub
	private String idContribuyente;
	private String tipoComprobante;
	private String serieComprobante;
	private Long numeroComprobante;
	private Double montoComprobante;
	private String idCliente;
	private String idEmpleado;
	private Date fechaRegistro;
	private Date fechaCancelacion;
	private String estadoComprobante;
	
	public String getIdContribuyente() {
		return idContribuyente;
	}

	public void setIdContribuyente(String idContribuyente) {
		this.idContribuyente = idContribuyente;
	}

	public String getTipoComprobante() {
		return tipoComprobante;
	}

	public void setTipoComprobante(String tipoComprobante) {
		this.tipoComprobante = tipoComprobante;
	}

	public String getSerieComprobante() {
		return serieComprobante;
	}

	public void setSerieComprobante(String serieComprobante) {
		this.serieComprobante = serieComprobante;
	}

	public Long getNumeroComprobante() {
		return numeroComprobante;
	}

	public void setNumeroComprobante(Long numeroComprobante) {
		this.numeroComprobante = numeroComprobante;
	}

	public Double getMontoComprobante() {
		return montoComprobante;
	}

	public void setMontoComprobante(Double montoComprobante) {
		this.montoComprobante = montoComprobante;
	}

	public String getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}

	public String getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(String idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public Date getFechaCancelacion() {
		return fechaCancelacion;
	}

	public void setFechaCancelacion(Date fechaCancelacion) {
		this.fechaCancelacion = fechaCancelacion;
	}

	public String getEstadoComprobante() {
		return estadoComprobante;
	}

	public void setEstadoComprobante(String estadoComprobante) {
		this.estadoComprobante = estadoComprobante;
	}

	@Override
	public String toString() {
		return "ComprobanteBase [idContribuyente=" + idContribuyente + ", tipoComprobante=" + tipoComprobante
				+ ", serieComprobante=" + serieComprobante + ", numeroComprobante=" + numeroComprobante
				+ ", montoComprobante=" + montoComprobante + ", idCliente=" + idCliente + ", idEmpleado=" + idEmpleado
				+ ", fechaRegistro=" + fechaRegistro + ", fechaCancelacion=" + fechaCancelacion + ", estadoComprobante="
				+ estadoComprobante + "]";
	}

}
