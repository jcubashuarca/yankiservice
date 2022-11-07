package com.nttdata.bootcamp.yankiservice.controller;

import com.nttdata.bootcamp.yankiservice.dto.LinkRequest;
import com.nttdata.bootcamp.yankiservice.model.Yanki;
import com.nttdata.bootcamp.yankiservice.service.YankiService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/yanki")
@AllArgsConstructor
@Slf4j
public class YankiController {
    @Autowired
    private YankiService service;

    @GetMapping("{phone}")
    public Flux<Yanki> getYankiByPhone(@PathVariable final Long phone) {
        return service.getByPhone(phone);
    }

    @PostMapping
    public Mono<String> makeYanki(@RequestBody final Yanki yanki) {
        return service.makeYanki(yanki);
    }

    @PostMapping("/link")
    public Mono<String> linkYanki(@RequestBody final LinkRequest linkRequest) {
        return service.linkYanki(linkRequest);
    }

}
