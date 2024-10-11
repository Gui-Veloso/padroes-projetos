package com.padroes.projetos;
// Singleton "preguiçoso", pois não disponibiliza a instância de imediato para o usuário
public class SingletonLazy {

    private static SingletonLazy instancia;
    // construtor é privado para garantir que ninguém de fora possa instanciar
    private SingletonLazy(){
        super();
    }

    public static SingletonLazy getInstancia() {
        if (instancia == null) {
            instancia = new SingletonLazy();
        }
        return instancia;
    }

    public void testeSingleton(){
        System.out.println("A instancia funcionou!");
    }
}
