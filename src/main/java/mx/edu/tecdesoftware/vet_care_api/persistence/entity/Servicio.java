package mx.edu.tecdesoftware.vet_care_api.persistence.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "servicios")
public class Servicio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_servicio")
    private Integer idServicio;

    private String descripcion;

    private Double precio;

    private Boolean estado;

    // Un servicio puede aparecer en muchos renglones de consulta.
    // Se mapea desde el campo "servicio" de ConsultaServicio.
    @OneToMany(mappedBy = "servicio")
    private List<ConsultaServicio> consultaServicios;

    public Integer getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(Integer idServicio) {
        this.idServicio = idServicio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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

    public List<ConsultaServicio> getConsultaServicios() {
        return consultaServicios;
    }

    public void setConsultaServicios(List<ConsultaServicio> consultaServicios) {
        this.consultaServicios = consultaServicios;
    }
}
