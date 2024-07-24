package lanchonete.atendimento.cozinha;

public class Cozinheiro {
    //pode ser default
    public void adicionarLancheNoBalcao(){
        System.out.println("ADICIONAR LANCE NATURAL HAMBURGUER NO BALCAO");
    }
    //pode ser default
    public void adicionarSucoNoBalcao(){
        System.out.println("ADICIONANDO SUCO NO BALCAO");
    }
    //pode ser default
    public void adicionarComboNoBalcao(){
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }
    private void prepararLanche(){
        System.out.println("PREPARANDO LANCHE TIPO HAMBURGUER");
    }
    private void prepararVitamina(){
        System.out.println("PREPARANDO VITAMINA");
    }
    private void prepararCombo(){
        prepararLanche();
        prepararVitamina();
    }
    private void selecionarIgredientesLanche(){
        System.out.println("SELECIONANDO O PÃO, SALADA, OVO E CARNE");
    }
    private void selecionarIgredientesVitamina(){
        System.out.println("SELECIONANDO FRUTA, LEITE E SUCO");
    }
    private void lavarIgredientes(){
        System.out.println("LAVANDO IGREDIENTES");
    }
    private void baterVitaminaLiquidificador(){
        System.out.println("BATENDO VITAMINA LIQUIDIFICADOR");
    }
    private void fritarIgredientesLanche(){
        System.out.println("FRITANDO A CARNE E OVO PARA O HAMBURGUER");
    }
    private void pedirParaTrocasGas(Almoxarife meuAmigo){
        meuAmigo.trocarGas();
    }
    private void pedirIgredientes(Almoxarife almoxarife){
        almoxarife.entregarIgredientes();
    }
}
