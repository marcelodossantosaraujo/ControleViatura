/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package builder;

/**
 *
 * @author Marcelo
 */
public class FiatBuilder extends VeiculoBuilder {
 
    @Override
    public void buildPreco(double preco) {
        // Operação complexa. 
        carro.preco = preco;
    }
 
    @Override
    public void buildDscMotor(String dscmotor) {
        // Operação complexa.
        carro.dscMotor = dscmotor;
    }
 
    @Override
    public void buildAnoDeFabricacao(int ano) {
        // Operação complexa.
        carro.anoDeFabricacao = ano;
    }
 
    @Override
    public void buildModelo(String modelo) {
        // Operação complexa.
        carro.modelo = modelo;
    }
 
    @Override
    public void buildMontadora(String montadora) {
        // Operação complexa.
        carro.montadora = montadora;
    }
    
}
