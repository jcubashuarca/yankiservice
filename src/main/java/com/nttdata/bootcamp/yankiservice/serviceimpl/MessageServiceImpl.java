package com.nttdata.bootcamp.yankiservice.serviceimpl;

import com.nttdata.bootcamp.yankiservice.dto.LinkRequest;
import com.nttdata.bootcamp.yankiservice.dto.MessageKafka;
import com.nttdata.bootcamp.yankiservice.dto.Result;
import com.nttdata.bootcamp.yankiservice.model.Yanki;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MessageServiceImpl {

    @Autowired
    private StreamBridge streamBridge;

    public boolean sendToAccount(Yanki yanki){
        return streamBridge.send("toaccount-out-0",yanki);
    }

    public boolean sendResult(Result result){
        return streamBridge.send("result-out-0",result);
    }

    public boolean sendToLink(LinkRequest linkRequest){
        return streamBridge.send("link-out-0",linkRequest);
    }

    public boolean sendProcess(MessageKafka messageKafka) {
        return streamBridge.send("proccessyanki-out-0", messageKafka);
    }

}
