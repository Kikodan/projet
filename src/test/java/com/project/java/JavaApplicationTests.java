package com.project.java;

import com.project.java.Repository.RandonneesRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JavaApplicationTests {

	@Autowired
	private RandonneesRepository randonneesRepository;

	@Test
	public void testConnexionBdd() {
		//Given

		//When
		Long NomRando = randonneesRepository.count();

		//Then
		Assert.assertTrue(NomRando>0);


	}@Test
	public void testConnexionBdd2() {
		//Given

		//When


		{
			Randonnees R = randonneesRepository.findOne(1);

			List<Users> listeUtilisateurs = R.getUtilisateur();
			for (Users utilisateurs: listeUtilisateurs ){
				System.out.println(utilisateurs.getId());
			}


		}
		//Then
		//Assert.assertTrue(NomRando>0);


	}

}

