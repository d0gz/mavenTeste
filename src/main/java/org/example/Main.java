package org.example;
import java.util.Set;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {


        System.out.println("Conjuntos!: ");


        Set<Integer> conjunto = new HashSet<>();
        conjunto.add(1);
        conjunto.add(2);
        conjunto.add(3);

        System.out.println(conjunto.toString());

        Set<Integer> conjuntoVazio = new HashSet<>();

        // contains pega o elemento
        // containsAll pega outra colecao
        System.out.println(conjunto.containsAll(conjuntoVazio));

    }


}