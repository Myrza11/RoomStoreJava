package com.example.javasecuritydemo.configs;

import com.example.javasecuritydemo.models.Room;
import com.example.javasecuritydemo.repository.RoomRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class RoomConfiges {

    @Bean
    CommandLineRunner commandLineRunner(
            RoomRepository repository){
        return args -> {
            Room life_ex = new Room(
                    "gg"
            );

            Room gordosty = new Room(
                    "Black Room"
            );

            repository.saveAll(
                    List.of(life_ex, gordosty)
            );

        };
    }

}
