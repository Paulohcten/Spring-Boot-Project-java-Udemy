package com.educandoweb.springbootproject.Config;

import com.educandoweb.springbootproject.Entities.User;
import com.educandoweb.springbootproject.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        User u1 = new User(null, "Carlinhos Brown", "carlos@gmail.com", "988888889", "123456");
        User u2 = new User(null, "Bono Vox", "bono@gmail.com", "977777779", "123456");

        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}
