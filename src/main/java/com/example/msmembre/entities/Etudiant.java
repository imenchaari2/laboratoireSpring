package com.example.msmembre.entities;

import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
@Entity
@DiscriminatorValue("etd")
@EqualsAndHashCode(callSuper = true)
public class Etudiant extends Membre implements Serializable {
    @Temporal(TemporalType.DATE)
    private Date dateInscription;
    private String diplome;
    @ManyToOne
    private EnseignantChercheur encadrant;
}
