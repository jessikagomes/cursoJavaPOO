package desafio;

public class DesafioAula05 {
    public static void main(String[] args) {
        ContaBanco cc = new ContaBanco();

       /* System.out.println(cc.getStatus());
        System.out.println(cc.getSaldo()); */

        ContaBanco cp = new ContaBanco();
       /* System.out.println(cp.getStatus());
        System.out.println(cp.getSaldo()); */

        cc.abrirConta("cc");
        System.out.println(cc.getStatus());
        System.out.println(cc.getSaldo());

        cp.fecharConta();
        /*System.out.println(cc.getStatus());
        System.out.println(cc.getSaldo());*/

       /* cc.depositar(100.00);
        System.out.println(cc.getSaldo());

        cc.sacar(100.00);
        cc.sacar(100.00);
        cc.depositar(200.00);
        cc.sacar(80.00);
        cc.pagarMensalidade("cc");
*/
        cc.pagarMensalidade("cc");


    }
}
