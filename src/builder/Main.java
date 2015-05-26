/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package builder;

/**
 * @author Marcelo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         ConcessionariaDirector concessionaria = new ConcessionariaDirector(
            new FiatBuilder());
 
//    concessionaria.construirCarro();
    VeiculoProduct carro = concessionaria.getCarro();
    System.out.println("Carro: " + carro.modelo + "/" + carro.montadora
            + "\nAno: " + carro.anoDeFabricacao + "\nMotor: "
            + carro.dscMotor + "\nValor: " + carro.preco);
 
    System.out.println();
        
    }
    
}
