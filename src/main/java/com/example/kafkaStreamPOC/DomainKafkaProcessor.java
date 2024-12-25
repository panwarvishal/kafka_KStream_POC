package com.example.kafkaStreamPOC;

import org.apache.kafka.streams.kstream.KStream;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.function.Function;

@Configuration
public class DomainKafkaProcessor {
    @Bean
    public Function<KStream<String , String>, KStream<String, String>> manupulatename()
    {
        return Kstream -> Kstream.filter((key, user)-> {
            System.out.println("test POC-- name "+ user );
            return  !user.equalsIgnoreCase("ho");
        });
    }
}
