package view;

import dao.CarroDAO;
import java.util.ArrayList;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Carro;

/**
 * @author (name=Laís Kienen, date=08-14-17)
 */
public class JFrameListaCarros extends JFrame implements JFrameComportamentosInterface {

    private JTable jTable;
    private DefaultTableModel modelo;
    private JScrollPane scroll;

    public JFrameListaCarros() {
        criarTela();
        criarComponentes();
        definirLocalizacao();
        adicionarComponentes();
        adicionarOnClick();
    }

    @Override
    public void criarTela() {
        setSize(600, 600);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void criarComponentes() {
        modelo = new DefaultTableModel() {
            public boolean isCelEditable(int row, int column) {
                return false;
            }
        };
        modelo.addColumn("Fabricante");
        modelo.addColumn("Nome");
        modelo.addColumn("Placa");
        modelo.addColumn("Cor");

        popularJTable();
        jTable = new JTable(modelo);
        scroll = new JScrollPane(jTable);
    }

    @Override
    public void definirLocalizacao() {
        scroll.setBounds(10, 10, 500, 500);
    }

    @Override
    public void adicionarComponentes() {
        add(scroll);
    }

    public void popularJTable() {
        ArrayList<Carro> carros = new CarroDAO().retornarListagem();
        for (Carro carro : carros) {
            modelo.addRow(new Object[]{
                carro.getFabricante(), carro.getNome(), carro.getPlaca(), carro.getCor()
            });
        }
    }

    @Override
    public void adicionarOnClick() {
    }

}
