package mx.edu.tecdesoftware.vet_care_api.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "consultas_servicios")
public class ConsultaServicio {

    // Llave primaria compuesta (id_consulta + id_servicio).
    @EmbeddedId
    private ConsultaServicioPK id = new ConsultaServicioPK();

    private Integer cantidad;

    private Double precio;

    private Boolean estado;

    // El id_consulta de la PK se deriva de esta consulta (generada en cascada).
    @ManyToOne
    @MapsId("idConsulta")
    @JoinColumn(name = "id_consulta")
    private Consulta consulta;

    // Asociación de solo lectura hacia el servicio (la columna id_servicio la controla la PK).
    @ManyToOne
    @JoinColumn(name = "id_servicio", insertable = false, updatable = false)
    private Servicio servicio;

    public ConsultaServicioPK getId() {
        return id;
    }

    public void setId(ConsultaServicioPK id) {
        this.id = id;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }
}
