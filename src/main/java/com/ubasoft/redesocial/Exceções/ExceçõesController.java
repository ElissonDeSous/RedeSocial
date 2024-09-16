package com.ubasoft.redesocial.Exceções;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.message.Message;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceçõesController {
     private MessageSource  Mensagem;

     public ExceçõesController(MessageSource Mensagem) {
        this.Mensagem = Mensagem;
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)

     public ResponseEntity<List<MensagemDeErro>> Exceçoes(MethodArgumentNotValidException e){
        List<MensagemDeErro> msgErro = new ArrayList<>();
         e.getBindingResult().getFieldErrors().forEach(err ->{
             String mensagem = Mensagem.getMessage(err,LocaleContextHolder.getLocale());
            MensagemDeErro erro = new MensagemDeErro(mensagem, err.getField());
            msgErro.add(erro);

            
         });
         return new ResponseEntity<>(msgErro, HttpStatus.BAD_REQUEST);
     }
    
}


