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
public class ConcessionariaDirector {
     protected VeiculoBuilder montadora;
 
    public ConcessionariaDirector(VeiculoBuilder montadora) {
        this.montadora = montadora;
    }
 
    public void construirCarro(double preco,
            String dscMotor,
            int anoDeFabricacao,
            String modelo,
            String nomemontadora) {
        montadora.buildPreco(preco);
        montadora.buildAnoDeFabricacao(anoDeFabricacao);
        montadora.buildDscMotor(dscMotor);
        montadora.buildModelo(modelo);
        montadora.buildMontadora(nomemontadora);
    }
 
    public VeiculoProduct getCarro() {
        return montadora.getCarro();
    }
}
