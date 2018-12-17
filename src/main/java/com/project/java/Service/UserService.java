package com.project.java.Service;

import com.project.java.Randonnees;
import com.project.java.Repository.RandonneesRepository;
import com.project.java.Repository.UserRepository;
import com.project.java.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RandonneesRepository randoRepository;

    public Users lierRandoUtilisateur(Integer Id_Utilisateur, Integer id_r) throws Exception {
        if (userRepository.exists(Id_Utilisateur)) {

            Users u =  userRepository.findOne(Id_Utilisateur);

            if (randoRepository.exists(id_r)){

                Randonnees r = randoRepository.findOne(id_r);
                // instanciation de la classe

                u.getRandos().add(r);

                //sauvegarde dans la BDD
                return userRepository.save(u);

            } else {
                throw new Exception("L'identifiant de randonnées n'existe pas : " + id_r);
            }

        } else {
            throw new Exception("L'identifiant utilisateur n'existe pas : " + Id_Utilisateur);
        }


    }
}