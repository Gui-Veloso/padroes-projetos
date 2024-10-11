package com.padroes.projetos;

public class SingletonEager {
    // não faz verificação antes de criar
    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager (){
        super();
    }

    public static SingletonEager getInstanciaEager(){
        return instancia;
    }

    public void testeEager(){
        System.out.println("o apressadinho funciona!");
    }

}
