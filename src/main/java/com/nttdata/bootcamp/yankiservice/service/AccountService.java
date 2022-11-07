package com.nttdata.bootcamp.yankiservice.service;

import com.nttdata.bootcamp.yankiservice.dto.AccountRequest;
import com.nttdata.bootcamp.yankiservice.dto.AccountResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface AccountService {
    Flux<AccountResponse> getAll();

    Mono<AccountResponse> getByPhone(Long phone);

    Mono<Void> deleteByPhone(Long phone);

    Mono<Void> deleteAll();

    Mono<AccountResponse> updateAmountByPhone(Long phone, Double amount);

    Mono<AccountResponse> save(AccountRequest accountRequest);

    Mono<AccountResponse> updateByPhone(Long phone, AccountRequest accountRequest);
}
