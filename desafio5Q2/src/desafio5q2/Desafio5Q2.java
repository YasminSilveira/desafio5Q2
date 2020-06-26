/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio5q2;

/**
 *
 * @author yasmi
 */
public class Desafio5Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
         int numero, acuSomaNum;   
         Scanner teclado = new Scanner(System.in);
         numero = 1; acuSomaNum = 0;
         while(numero != 0){
        //     System.out.println("Informe um numero ou zero para sair:");
        //     numero = teclado.nextInt();
             numero =Integer.parseInt(JOptionPane.
                     showInputDialog("Informe um numero ou zero para sair:"));
             acuSomaNum = acuSomaNum + numero;
         }
         JOptionPane.showMessageDialog(null,"A soma de todos os valores digitados é: "
                 +acuSomaNum);
    }

}
