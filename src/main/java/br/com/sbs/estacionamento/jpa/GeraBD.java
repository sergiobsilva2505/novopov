package br.com.sbs.estacionamento.jpa;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GeraBD {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("estacionamentomvc");

		factory.close();
	}

}
