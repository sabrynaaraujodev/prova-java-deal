package br.com.confidencecambio.javabasico;

import br.com.confidencecambio.javabasico.service.CalculoIMCService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@RestController
public class CalculoIMCController {
    private CalculoIMCService serviceIMC;

    public CalculoIMCController(final CalculoIMCService serviceIMC) {

        this.serviceIMC = serviceIMC;
    }

    @RequestMapping(value = "/calculaIMC", method = RequestMethod.GET)
    public ResponseEntity<String> calculaIMC(
            @RequestParam String nome,
            @RequestParam Double peso,
            @RequestParam Double altura){
        var retorno = "Ola " + nome.toUpperCase() + " , seu imc é : " + serviceIMC.calcularImc(peso,altura);
        return new ResponseEntity<>(retorno, HttpStatus.OK);
    }

}
