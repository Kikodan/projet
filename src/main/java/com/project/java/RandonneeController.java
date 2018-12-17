package com.project.java;

import com.project.java.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RandonneeController {

    @Autowired
    private UserService rservice;


    @RequestMapping("/GetRandoUtilisateur")
    public Users GetRandoUtilisateur (@RequestParam(value = "Id_Utilisateur")Integer Id_Utilisateur,
                                        @RequestParam(value = "id_r") Integer id_r) throws Exception {
        return rservice.lierRandoUtilisateur(Id_Utilisateur, id_r);
    }
}