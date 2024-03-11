package com.mycompany.exerciciowhile03;

import java.util.Scanner;

/* Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. 
Escreva um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 4.Fim). 
Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até que seja válido). 
O programa será encerrado quando o código informado for o número 4. Deve ser escrito a mensagem: 
"MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível.
*/
public class ExercicioWhile03 {

    public static void main(String[] args) {
        
       Scanner teclado = new Scanner(System.in);
        
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        
        System.out.printf("\nDigite 1 | Alcool"
                + "\nDigite 2 | Gasolina"
                + "\nDigite 3 | Diesel"
                + "\nDigite 4 | End\n");
        int x = teclado.nextInt();
        while (x != 4){
            switch (x) {
                case 1 -> {
                    alcool += 1;
                    System.out.println("Álcool +1");
               }
                case 2 -> {
                    gasolina += 1;
                    System.out.println("Gasolina +1");
               }
                case 3 -> {
                    diesel += 1;
                    System.out.println("Diesel +1");
               }
                default -> {}
            }
        x = teclado.nextInt();
            
        }
        
        System.out.printf("\nÁlcool adicionado total: " + alcool);
        System.out.printf("\nGasolina total: " + gasolina);
        System.out.printf("\nDiesel total: " + diesel);
        System.out.printf("\nFim.");
    }
}

