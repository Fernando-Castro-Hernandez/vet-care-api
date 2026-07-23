package mx.edu.tecdesoftware.vet_care_api.domain;

import java.time.LocalDateTime;
import java.util.List;

public class Consult {

    private Integer consultId;
    private Integer petId;
    private LocalDateTime date;
    private String reason;
    private String diagnosis;
    private Double total;
    private String state;
    private Pet pet;
    private List<ConsultService> consultServices;

    public Integer getConsultId() {
        return consultId;
    }

    public void setConsultId(Integer consultId) {
        this.consultId = consultId;
    }

    public Integer getPetId() {
        return petId;
    }

    public void setPetId(Integer petId) {
        this.petId = petId;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public List<ConsultService> getConsultServices() {
        return consultServices;
    }

    public void setConsultServices(List<ConsultService> consultServices) {
        this.consultServices = consultServices;
    }
}
