package com.padroes;

public class SingletonLazyHolder {
    // cria uma classe que protege o singleton
    private static class InstanceHolder{
        public static SingletonLazyHolder instance = new SingletonLazyHolder(); 
    }

    private SingletonLazyHolder(){
        super();
    }

    public static SingletonLazyHolder getInstancia(){
        return InstanceHolder.instance;
    }

    public void testeProtegido(){
        System.out.println("o protegido foi instanciado!");
    }

}
