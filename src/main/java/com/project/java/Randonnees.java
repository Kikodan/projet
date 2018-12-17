package com.project.java;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table (name = "randonnees")
    public class Randonnees {

    @ManyToMany (fetch = FetchType.EAGER ,mappedBy = "randos")
    @JsonBackReference
    private List<Users> utilisateur = new ArrayList<>();


        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column (name = "id_r")
        private Integer id;

        @Column (name = "nom_r")

        private String NomRando;

        @Column (name = "lieu_r")

        private String LieuRando;

        @Column (name = "duree_r")

        private String DureeRando;

        @Column (name = "dist_r")

        private String DistRando;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomRando() {
        return NomRando;
    }

    public void setNomRando(String nomRando) {
        NomRando = nomRando;
    }

    public String getLieuRando() {
        return LieuRando;
    }

    public void setLieuRando(String lieuRando) {
        LieuRando = lieuRando;
    }

    public String getDureeRando() {
        return DureeRando;
    }

    public void setDureeRando(String dureeRando) {
        DureeRando = dureeRando;
    }

    public String getDistRando() {
        return DistRando;
    }

    public void setDistRando(String distRando) {
        DistRando = distRando;
    }

    public List<Users> getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(List<Users> utilisateur) {
        this.utilisateur = utilisateur;
    }
}
