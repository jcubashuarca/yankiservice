package com.nttdata.bootcamp.yankiservice.repository;

import com.nttdata.bootcamp.yankiservice.model.Account;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface AccountRepository extends ReactiveMongoRepository<Account,String> {
    Flux<Account> findAccountByPhone(Long phone);
}
