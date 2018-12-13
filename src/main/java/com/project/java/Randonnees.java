package com.project.java;

import javax.persistence.*;
import java.util.List;

@Entity
@Table (name = "randonnees")
    public class Randonnees {

    public List<Utilisateurs> getUtilisateurs() {
        return utilisateurs;
    }

    public void setUtilisateurs(List<Utilisateurs> utilisateurs) {
        this.utilisateurs = utilisateurs;
    }

    @ManyToMany
    @JoinTable(name = "userrando",
            joinColumns = @JoinColumn(name = "id_r"),
            inverseJoinColumns = @JoinColumn(name = "Utilisateur_Id"))
    private List<Utilisateurs> utilisateurs;


        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
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
}
