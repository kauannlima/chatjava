package com.chatjava.realtime;

import com.chatjava.realtime.Config.ObjMsg;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class Application {

    @MessageMapping("/chatMessage")
    @SendTo("/canal")
    public ObjMsg sendMessage(ObjMsg message){
        return message;
    }
}