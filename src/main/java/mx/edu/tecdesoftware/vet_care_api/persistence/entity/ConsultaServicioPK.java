package mx.edu.tecdesoftware.vet_care_api.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class ConsultaServicioPK implements Serializable {

    @Column(name = "id_consulta")
    private Integer idConsulta;

    @Column(name = "id_servicio")
    private Integer idServicio;

    public Integer getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(Integer idConsulta) {
        this.idConsulta = idConsulta;
    }

    public Integer getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(Integer idServicio) {
        this.idServicio = idServicio;
    }
}
