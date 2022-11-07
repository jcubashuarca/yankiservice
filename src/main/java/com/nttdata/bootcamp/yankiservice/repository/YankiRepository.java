package com.nttdata.bootcamp.yankiservice.repository;

import com.nttdata.bootcamp.yankiservice.model.Yanki;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface YankiRepository extends ReactiveMongoRepository<Yanki,String> {
    Flux<Yanki> findYankiByFromOrTo(Long phoneFrom, Long phoneTo);

    Mono<Yanki> findYankiByIdAndAmount(String id, Double amount);
}
