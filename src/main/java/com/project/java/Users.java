package com.project.java;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;

@Entity
@Table (name = "utilisateur")
    public class Users {


    @ManyToMany (fetch = FetchType.EAGER)
    @JsonManagedReference
    @JoinTable(name = "userrando",
            joinColumns = @JoinColumn(name = "Id_Utilisateur"),
            inverseJoinColumns = @JoinColumn(name = "id_r"))
    private List <Randonnees> randos;

    public List<Randonnees> getRandos() {
        return randos;
    }

    public void setRandos(List<Randonnees> randos) {
        this.randos = randos;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "Id_Utilisateur")
    private Integer id;

    @Column (name = "Pseudo_Utilisateur")
    private String Pseudo;

    @Column (name = "Nom_Utilisateur")
    private String Nom;

    @Column (name = "Prenom_Utilisateur")
    private String Prenom;

    @Column (name = "Email_Utilisateur")
    private String Email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPseudo() {
        return Pseudo;
    }

    public void setPseudo(String pseudo) {
        Pseudo = pseudo;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String prenom) {
        Prenom = prenom;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
