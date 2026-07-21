package mx.edu.tecdesoftware.vet_care_api.persistence.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "mascotas")
public class Mascota {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_mascota")
    private Integer idMascota;

    private String nombre;
    private String especie;
    private String raza;
    private String sexo;

    @Column(name = "fecha_nacimiento")
    private LocalDate fechaNacimiento;

    private Double peso;

    // Columna FK: se usa para ESCRIBIR el id del dueño.
    @Column(name = "id_dueno")
    private Integer idDueno;

    // Asociación de SOLO LECTURA hacia el dueño (misma columna id_dueno).
    // insertable/updatable = false para que no choque con el campo idDueno de arriba.
    @ManyToOne
    @JoinColumn(name = "id_dueno", insertable = false, updatable = false)
    private Dueno dueno;

    // Una mascota tiene muchas consultas. Se mapea desde el campo "mascota" de Consulta.
    @OneToMany(mappedBy = "mascota", cascade = CascadeType.ALL)
    private List<Consulta> consultas;

    public Integer getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(Integer idMascota) {
        this.idMascota = idMascota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Integer getIdDueno() {
        return idDueno;
    }

    public void setIdDueno(Integer idDueno) {
        this.idDueno = idDueno;
    }

    public Dueno getDueno() {
        return dueno;
    }

    public void setDueno(Dueno dueno) {
        this.dueno = dueno;
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(List<Consulta> consultas) {
        this.consultas = consultas;
    }
}
