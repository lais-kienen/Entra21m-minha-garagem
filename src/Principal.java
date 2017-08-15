
import dao.CarroDAO;
import database.Utilitarios;
import java.awt.EventQueue;
import java.sql.Date;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Carro;
import view.JFrameInicial;

/**
 * @author (name=Laís Kienen, date=08-10-17)
 */
public class Principal {

    public static void main(String[] args) {
        /*CarroDAO dao = new CarroDAO();

         Carro celta = new Carro();
         celta.setNome("Celta");
         celta.setFabricante("Chevrolet");
         celta.setCor("Vermelho");
         celta.setAnoFabricacao((short) 2002);
         celta.setAnoLancamento((short) 2001);
         celta.setEstaFuncional(true);
         celta.setPermitidaCirculacao(true);
         celta.setQuantidadeBatidas((byte) 2);
         celta.setPlaca("");
         celta.setPotencia(146);
         celta.setDataCompra(new Date(2017, 6, 11));
         celta.setTipoPneu((short) 16);
         celta.setRenavan(9452648);
         celta.setQuilometragem(93542.16f);
         celta.setQuantidadePortas((byte) 2);
         celta.setChassis("1878-5444-1879-3548-1425");
         celta.setDescricao("O Celta (ou Suzuki Fun como é conhecido na Argentina) é um carro popular "
         + "categoria 1 litro da Chevrolet que foi produzido no Brasil. Concorrente direto de outros "
         + "carros populares como o Uno da Fiat, do Gol da Volkswagen e do Ka da Ford.[1][2][3] O Celta "
         + "é um hatchback e no final de 2005 e início de 2006 foi lançada a versão sedan do carro, "
         + "chamada Prisma. Foi concebido e desenvolvido integralmente no Brasil.\n"
         + "\n"
         + "Usa a mesma plataforma GM4200 da segunda geração do Chevrolet Corsa, o Corsa B, lançado no Brasil "
         + "em 1994 e na Alemanha em 1993, originalmente reaproveitada do Opel Corsa A europeu de "
         + "1982 que nunca chegou a ser comercializado oficialmente no Brasil.");
         int codigoInserir = dao.inserir(celta);
         if (codigoInserir != Utilitarios.NAO_FOI_POSSIVEL_INSERIR) {
         celta.setId(codigoInserir);
         } else {
         JOptionPane.showMessageDialog(null, "Não foi possível inserir");

         }

         celta.setNome("Gol");
         celta.setFabricante("VW");
         int codigoAlterar = dao.alterar(celta);
         if (codigoAlterar != Utilitarios.NAO_FOI_POSSIVEL_ALTERAR) {
         JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
         } else {
         JOptionPane.showMessageDialog(null, "Erro na alteração.");
            
         
         for (int i = 1; i < 5; i++) {
         dao.excluir(i); //entre parenteses é o id a ser apagado
         }
        
         ArrayList<Carro> carros = dao.retornarListagem();
         for (Carro carro : carros) {
         System.out.println(carro.getId() + " - " + carro.getNome());
         }
         }*/

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrameInicial inicial = new JFrameInicial();
            }
        });
    }

}
