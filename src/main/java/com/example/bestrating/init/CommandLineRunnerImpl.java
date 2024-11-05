package com.example.bestrating.init;

import jakarta.transaction.Transactional;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLineRunnerImpl implements CommandLineRunner {

    @Transactional
    public void createData() {
        System.out.println("sas");
    }

    @Override
    public void run(String... args) throws Exception {

        createData();

    }
}
