package mx.edu.tecdesoftware.vet_care_api.domain;

import java.util.List;

public class Service {

    private Integer serviceId;
    private String description;
    private Double price;
    private Boolean active;
    private List<ConsultService> consultServices;

    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public List<ConsultService> getConsultServices() {
        return consultServices;
    }

    public void setConsultServices(List<ConsultService> consultServices) {
        this.consultServices = consultServices;
    }
}
