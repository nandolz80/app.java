package com.example.iossenac.teste2.model;


public class Conta {

    private String nome;
    private String agencia;
    private String nconta;
    private float saldo;
    private float limite;


    public Conta(String nome, String agencia, String nconta, float limite) {
        this.nome = nome;
        this.agencia = agencia;
        this.nconta = nconta;
        this.saldo = 0;
        this.limite = limite;
    }

    public Conta(String nome, String agencia, String nconta, float saldo, float limite) {
        this.nome = nome;
        this.agencia = agencia;
        this.nconta = nconta;
        this.saldo = saldo;
        this.limite = limite;
    }

    public void depositar(float valor){
        this.saldo +=valor;
    }

    public void sacar(float valor) throws Exception {
        if(this.saldo + this.limite >= valor) {
            this.saldo -= valor;
        }else{
            System.out.println("ERRO!");
            throw new Exception("aldo insuficiente");
        }
    }

    public void tranferir(Conta conta, float valor){
        if(this.saldo + this.limite >= valor) {
            conta.depositar(valor);
            this.saldo -= valor;
        }else{
            System.out.println("ERRO!");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNconta() {
        return nconta;
    }

    public void setNconta(String nconta) {
        this.nconta = nconta;
    }

    public float getSaldo() {
        return saldo;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }





}
