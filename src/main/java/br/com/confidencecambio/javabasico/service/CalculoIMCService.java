package br.com.confidencecambio.javabasico.service;

import org.springframework.stereotype.Component;

@Component
public class CalculoIMCService {

    public int calcularImc(double peso , double altura) {
        double imc = peso / (altura * altura);
        return (int) imc;
    }

    public String tratamentoNome(String nome) {
        return nome.toUpperCase();
    }
}
