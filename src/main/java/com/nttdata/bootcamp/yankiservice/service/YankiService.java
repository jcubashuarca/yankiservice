package com.nttdata.bootcamp.yankiservice.service;

import com.nttdata.bootcamp.yankiservice.dto.LinkRequest;
import com.nttdata.bootcamp.yankiservice.model.Yanki;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface YankiService {

    Flux<Yanki> getByPhone(Long phone);

    Mono<String> makeYanki(Yanki yanki);

    Mono<String> linkYanki(LinkRequest linkRequest);
}
