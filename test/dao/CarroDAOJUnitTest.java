package dao;

import java.sql.Date;
import model.Carro;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author Alunos
 */
public class CarroDAOJUnitTest {
    
    @Test
    public void inserir() {
        Carro gol = new Carro();
        gol.setDataCompra(new Date(2017, 8, 14));
        gol.setAnoFabricacao((short) 2017);
        gol.setAnoLancamento((short) 2017);
        gol.setChassis("5151874");
        gol.setCor("Vermelho");
        gol.setDescricao("siuafsa fgeywi dsgvuidsn gaqweuidsauigd");
        gol.setEstaFuncional(false);
        gol.setFabricante("VW");
        gol.setNome("Gol");
        gol.setPlaca("GAO-2017");
        gol.setPotencia(100f);
        gol.setPermitidaCirculacao(true);
        gol.setQuantidadeBatidas((byte) 0);
        gol.setQuantidadePortas((byte) 4);
        gol.setQuilometragem(15887f);
        gol.setTipoPneu((short) 17);
        gol.setRenavan(198745);
        
        CarroDAO dao = new CarroDAO();
        dao.truncate();
        int codigo = dao.inserir(gol);
        assertEquals(codigo, 1);
        
        gol.setId(codigo);
        
        Carro carroBuscado = dao.buscarPorId(codigo);
        validarIgualdadeCarro(gol, carroBuscado);
    }
    
    @Test
    public void excluir() {
        Carro gol = new Carro();
        gol.setDataCompra(new Date(2017, 8, 14));
        gol.setAnoFabricacao((short) 2017);
        gol.setAnoLancamento((short) 2017);
        gol.setChassis("5151874");
        gol.setCor("Vermelho");
        gol.setDescricao("siuafsa fgeywi dsgvuidsn gaqweuidsauigd");
        gol.setEstaFuncional(false);
        gol.setFabricante("VW");
        gol.setNome("Gol");
        gol.setPlaca("GAO-2017");
        gol.setPotencia(100f);
        gol.setPermitidaCirculacao(true);
        gol.setQuantidadeBatidas((byte) 0);
        gol.setQuantidadePortas((byte) 4);
        gol.setQuilometragem(15887f);
        gol.setTipoPneu((short) 17);
        gol.setRenavan(198745);
        
        CarroDAO dao = new CarroDAO();
        dao.truncate();
        int codigo = dao.inserir(gol);
        dao.excluir(codigo);
        
        Carro carrobuscado = dao.buscarPorId(codigo);
        assertNull(carrobuscado);
    }
    
    @Test
    public void alterar() {
        Carro gol = new Carro();
        gol.setDataCompra(new Date(2017, 8, 14));
        gol.setAnoFabricacao((short) 2017);
        gol.setAnoLancamento((short) 2017);
        gol.setChassis("5151874");
        gol.setCor("Vermelho");
        gol.setDescricao("siuafsa fgeywi dsgvuidsn gaqweuidsauigd");
        gol.setEstaFuncional(false);
        gol.setFabricante("VW");
        gol.setNome("Gol");
        gol.setPlaca("GAO-2017");
        gol.setPotencia(100f);
        gol.setPermitidaCirculacao(true);
        gol.setQuantidadeBatidas((byte) 0);
        gol.setQuantidadePortas((byte) 4);
        gol.setQuilometragem(15887f);
        gol.setTipoPneu((short) 17);
        gol.setRenavan(198745);
        
        CarroDAO dao = new CarroDAO();
        dao.truncate();
        int codigo = dao.inserir(gol);
        gol.setId(codigo);
        gol.setDataCompra(new Date(2017, 6, 11));
        gol.setAnoFabricacao((short) 2001);
        gol.setAnoLancamento((short) 2002);
        gol.setChassis("5151154");
        gol.setCor("Vermelho");
        gol.setDescricao("hfreniugre dniqowehrb dnuiwqedr");
        gol.setEstaFuncional(true);
        gol.setFabricante("Chevrolet");
        gol.setNome("Celta");
        gol.setPlaca("MCL-1981");
        gol.setPotencia(95f);
        gol.setPermitidaCirculacao(true);
        gol.setQuantidadeBatidas((byte) 1);
        gol.setQuantidadePortas((byte) 2);
        gol.setQuilometragem(93562f);
        gol.setTipoPneu((short) 15);
        gol.setRenavan(146379);
        dao.alterar(gol);
        
        Carro carroModificado = dao.buscarPorId(gol.getId());
        validarIgualdadeCarro(gol, carroModificado);
        
    }
    
    public void validarIgualdadeCarro(Carro carro, Carro outroCarro) {
        assertEquals(carro.getId(), outroCarro.getId());
        assertEquals(carro.getAnoFabricacao(), outroCarro.getAnoFabricacao());
        assertEquals(carro.getAnoLancamento(), outroCarro.getAnoLancamento());
        assertEquals(carro.getChassis(), outroCarro.getChassis());
        assertEquals(carro.getCor(), outroCarro.getCor());
        assertEquals(carro.getDataCompra(), outroCarro.getDataCompra());
        assertEquals(carro.getDescricao(), outroCarro.getDescricao());
        assertEquals(carro.getFabricante(), outroCarro.getFabricante());
        assertEquals(carro.getNome(), outroCarro.getNome());
        assertEquals(carro.getPlaca(), outroCarro.getPlaca());
        assertEquals(carro.getPotencia(), outroCarro.getPotencia(), 0);
        assertEquals(carro.getQuantidadeBatidas(), outroCarro.getQuantidadeBatidas());
        assertEquals(carro.getQuantidadePortas(), outroCarro.getQuantidadePortas());
        assertEquals(carro.getQuilometragem(), outroCarro.getQuilometragem(), 0);
        assertEquals(carro.getRenavan(), outroCarro.getRenavan());
        assertEquals(carro.getTipoPneu(), outroCarro.getTipoPneu());
        assertEquals(carro.isEstaFuncional(), outroCarro.isEstaFuncional());
        assertEquals(carro.isPermitidaCirculacao(), outroCarro.isPermitidaCirculacao());
    }
    
}
