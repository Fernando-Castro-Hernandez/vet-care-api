package mx.edu.tecdesoftware.vet_care_api.persistence.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "consultas")
public class Consulta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_consulta")
    private Integer idConsulta;

    // Columna FK: se usa para ESCRIBIR el id de la mascota.
    @Column(name = "id_mascota")
    private Integer idMascota;

    private LocalDateTime fecha;

    private String motivo;

    private String diagnostico;

    private Double total;

    private String estado;

    // Asociación de SOLO LECTURA hacia la mascota (misma columna id_mascota).
    @ManyToOne
    @JoinColumn(name = "id_mascota", insertable = false, updatable = false)
    private Mascota mascota;

    // Una consulta tiene muchos renglones de servicio. Se guardan en cascada
    // al guardar la consulta (patrón maestro-detalle).
    @OneToMany(mappedBy = "consulta", cascade = CascadeType.ALL)
    private List<ConsultaServicio> consultaServicios;

    public Integer getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(Integer idConsulta) {
        this.idConsulta = idConsulta;
    }

    public Integer getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(Integer idMascota) {
        this.idMascota = idMascota;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public List<ConsultaServicio> getConsultaServicios() {
        return consultaServicios;
    }

    public void setConsultaServicios(List<ConsultaServicio> consultaServicios) {
        this.consultaServicios = consultaServicios;
    }
}
