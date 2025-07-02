package com.example.vindecoder;

import jakarta.persistence.*;

@Entity
@NamedStoredProcedureQuery(
    name = "VinDecodeResult.spVinDecode",
    procedureName = "spVinDecode",
    resultClasses = VinDecodeResult.class,
    parameters = {
        @StoredProcedureParameter(mode = ParameterMode.IN, name = "vin", type = String.class),
        @StoredProcedureParameter(mode = ParameterMode.IN, name = "year", type = Integer.class)
    }
)
public class VinDecodeResult {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id = System.nanoTime(); // just to satisfy JPA

    @Column(name = "Make")
    private String make;

    @Column(name = "Model")
    private String model;

    @Column(name = "ModelYear")
    private Integer modelYear;

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getModelYear() {
        return modelYear;
    }

    public void setModelYear(Integer modelYear) {
        this.modelYear = modelYear;
    }
}
