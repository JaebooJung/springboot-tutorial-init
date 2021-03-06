package com.example.demo.entity;

import com.example.demo.entity.id.FredId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Transient;

@Data
@Entity
@IdClass(FredId.class)
@AllArgsConstructor
@NoArgsConstructor
public class FredData {
    @Id
    String seriesId;
    @Id
    String observationDate;

    Double value;

}
