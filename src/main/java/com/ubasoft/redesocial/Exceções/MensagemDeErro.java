package com.ubasoft.redesocial.Exceções;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MensagemDeErro {
    private String messagem;
    private String campoDaMensagem;

}
