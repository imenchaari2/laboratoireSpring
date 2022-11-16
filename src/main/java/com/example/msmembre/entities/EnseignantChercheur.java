package com.example.msmembre.entities;

import lombok.EqualsAndHashCode;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.Collection;

@Entity
@DiscriminatorValue("ens")
@EqualsAndHashCode(callSuper = true)
public class EnseignantChercheur extends Membre implements Serializable {
    private String grade;
    private String etablissement;
    @OneToMany(mappedBy = "encadrant")
    private Collection<Etudiant> etudiants;
}
