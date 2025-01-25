package com.Test.Test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MensagemController {

    @GetMapping("/")
    public String exibirMensagem() {
        return "Código Web";
    }
}
