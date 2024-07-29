package Dio.operadores;

public class operadorRelacionais {
    public static void main(String[] args) {

        int numero1 = 1;
        int numero2 = 2;

        String nomeUm = "Gilson";
        String nomeDois = new String ("Gilson");


        System.out.println(nomeUm.equals(nomeDois));





        if (numero1 < numero2) { // nos ajuda na tomada de decisao.
            System.out.println("A nossa condição é verdadeira");
        }

        boolean simNao = numero1 == numero2;
        System.out.println("numeroUm é igual a numeroDois? " + simNao);


        simNao = numero1 != numero2;
        System.out.println("numeroUm é igual a numeroDois? " + simNao);

        simNao = numero1 > numero2;
        System.out.println("numeroUm é igual a numeroDois? " + simNao);

    }
}
