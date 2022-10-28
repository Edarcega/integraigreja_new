package com.edstecno.integraigreja.config;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;

import com.edstecno.integraigreja.entities.Membro;
import com.edstecno.integraigreja.repositories.MembroRepository;
import com.edstecno.integraigreja.services.IgrejaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.edstecno.integraigreja.entities.Igreja;
import com.edstecno.integraigreja.entities.Usuario;
import com.edstecno.integraigreja.repositories.IgrejaRepository;
import com.edstecno.integraigreja.repositories.UsuarioRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    IgrejaRepository igrejaRepository;

    @Autowired
    UsuarioRepository uRepository;

    @Autowired
    MembroRepository membroRepository;

    @Override
    public void run(String... args) throws Exception {
        Igreja i1 = new Igreja(null, "Igreja Batista Jardim Maracanã", "Batista","ibajama@gmail.com", "39249175000172", "Rua Teste", "Colombo", "PR",
                "83407310", "150", "N/A", "41-3333-3030", null, LocalDate.now());

        Igreja i3 = new Igreja(null, "Congregação Batista Monte Castelo", "Batista","cbmclo@gmail.com", "39249175000173", "Rua Teste", "Colombo", "PR",
                "83407310", "153", "N/A", "41-3333-3030", "Igreja Batista Jardim Maracanã", LocalDate.now());

        igrejaRepository.saveAll(Arrays.asList(i1, i3));

        Usuario u1 = new Usuario(null, "Brian o'conner", "brian@gmail.com", "1234");

        Usuario u2 = new Usuario(null, "Dominc Toreto", "dom@gmail.com", "1234");

        Membro membro = new Membro(null,u1.getNome(), new Date(), "Rua teste", "41 999999999", "Mia Toretto", "Alfa", null, i1);

        membroRepository.saveAll(Arrays.asList(membro));

        uRepository.saveAll(Arrays.asList(u1, u2));

    }

}