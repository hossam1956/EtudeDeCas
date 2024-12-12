package com.chalabi.EtudeDeCas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.chalabi.EtudeDeCas.dao.ChambreRepository;
import com.chalabi.EtudeDeCas.dao.ClientRepository;
import com.chalabi.EtudeDeCas.entities.Chambre;
import com.chalabi.EtudeDeCas.entities.Client;

@SpringBootApplication
public class EtudeDeCasApplication implements CommandLineRunner {
	
	@Autowired
	private ClientRepository clientRepository;
	@Autowired
	private ChambreRepository chambreRepository;

	public static void main(String[] args) {
		SpringApplication.run(EtudeDeCasApplication.class, args);
	}
	@Override
    public void run(String... args) throws Exception {
        clientRepository.save(new Client(null, "Chalabi", "Hossam", "hc@gmail.com", "123456789"));
        clientRepository.save(new Client(null, "Jaafari", "CharafEddine", "cj@gmail.com", "987654321"));
        clientRepository.save(new Client(null, "Chahid", "Youssef", "cy@gmail.com", "9870004321"));

        chambreRepository.save(new Chambre(null, "Simple", 100.0, true));
        chambreRepository.save(new Chambre(null, "Double", 150.0, false));
        chambreRepository.save(new Chambre(null, "Suite", 300.0, true));

        System.out.println("Initial data added to the database.");
    }

}
