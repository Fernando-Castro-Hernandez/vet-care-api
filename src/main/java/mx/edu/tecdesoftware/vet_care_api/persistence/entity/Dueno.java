package mx.edu.tecdesoftware.vet_care_api.persistence.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "duenos")
public class Dueno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_dueno")
    private Integer idDueno;

    private String nombre;
    private String apellidos;
    private String telefono;
    private String email;
    private String direccion;

    // Un dueño tiene muchas mascotas. Se mapea desde el campo "dueno" de Mascota.
    @OneToMany(mappedBy = "dueno", cascade = CascadeType.ALL)
    private List<Mascota> mascotas;

    public Integer getIdDueno() {
        return idDueno;
    }

    public void setIdDueno(Integer idDueno) {
        this.idDueno = idDueno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(List<Mascota> mascotas) {
        this.mascotas = mascotas;
    }
}
