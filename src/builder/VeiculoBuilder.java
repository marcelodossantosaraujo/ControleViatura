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
public abstract class VeiculoBuilder {
    protected VeiculoProduct carro;
 
    public VeiculoBuilder() {
        carro = new VeiculoProduct();
    }
 
    public abstract void buildPreco(double preco);
 
    public abstract void buildDscMotor(String dscmotor);
 
    public abstract void buildAnoDeFabricacao(int anoFabricacao);
 
    public abstract void buildModelo(String modelo);
 
    public abstract void buildMontadora(String montadora);
 
    public VeiculoProduct getCarro() {
        return carro;
    }    
}
