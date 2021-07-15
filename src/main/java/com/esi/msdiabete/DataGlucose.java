package com.esi.msdiabete;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class DataGlucose {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idData;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dateEnregistrement;

    private float value;
}
