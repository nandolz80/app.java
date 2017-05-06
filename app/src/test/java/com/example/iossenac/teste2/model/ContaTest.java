package com.example.iossenac.teste2.model;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by iossenac on 29/04/17.
 */
public class ContaTest {
    @Test
    public void depositar() throws Exception {

    }

    @Test
    public void sacar() throws Exception {

        float valorEsperado = 100;
        float valorSaque = 100;
        Conta conta = new Conta("a","a","a",200,100);
        try {
            conta.sacar(valorSaque);
        }catch (Exception e){
            fail(e.getMessage());
        }
    }

    @Test
    public void tranferir() throws Exception {

    }

}