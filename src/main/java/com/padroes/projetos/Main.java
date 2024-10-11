package com.padroes.projetos;

import com.padroes.SingletonLazyHolder;

public class Main {
    public static void main(String[] args) {
        //instanciando sem utilizar o new!
        SingletonLazy singleton = SingletonLazy.getInstancia();
        SingletonLazy singleton2 = SingletonLazy.getInstancia();
        // teste para verificar se está referenciando a mesma instancia
        System.out.println(singleton);
        System.out.println(singleton2);

        SingletonEager singleton_apressado = SingletonEager.getInstanciaEager();
        SingletonLazyHolder singleton_protegido = SingletonLazyHolder.getInstancia();
        singleton.testeSingleton();
        singleton_apressado.testeEager();
        singleton_protegido.testeProtegido();
        
    }


}