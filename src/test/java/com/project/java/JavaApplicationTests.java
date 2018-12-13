package com.project.java;

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
			Randonnees u = RandonneesRepository.findOne(1);
			String r = u.getNomRando();
			Assert.assertTrue(r.equals("Autour de Montpeyroux"));
		}
		{
			Randonnees R = randonneesRepository.findOne(1L);
			R.getUtilisateurs();
			List<Utilisateurs> utilisateurs = R.getUtilisateurs();
		}
		//Then
		//Assert.assertTrue(NomRando>0);


	}

}

