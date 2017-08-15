package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * @author (name=Laís Kienen, date=08-14-17)
 */
public class JFrameInicial extends JFrame implements JFrameComportamentosInterface {

    private JButton jButtonListaCarros;
    private JButton jButtonCadastroCarro;

    @Override
    public void criarTela() {
        setSize(600, 600);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);
        setTitle("Minha Garagem");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        
        
    }

    @Override
    public void criarComponentes() {
        jButtonListaCarros = new JButton("Lista de Carros");
        jButtonCadastroCarro = new JButton("Cadastro de Carros");
    }

    @Override
    public void definirLocalizacao() {
        jButtonListaCarros.setBounds(10, 10, 200, 35);
        jButtonCadastroCarro.setBounds(10, 55, 200, 35);
    }

    @Override
    public void adicionarComponentes() {
        add(jButtonListaCarros);
        add(jButtonCadastroCarro);
    }

    @Override
    public void adicionarOnClick() {
        jButtonListaCarros.addActionListener((ActionEvent e) -> {
            JFrameListaCarros lista = new JFrameListaCarros();
        });
        
        jButtonCadastroCarro.addActionListener((ActionEvent e) -> {
            new JFrameCadastroCarro().setVisible(true);
        });

  
    }

    public JFrameInicial() {
        criarTela();
        criarComponentes();
        definirLocalizacao();
        adicionarComponentes();
        adicionarOnClick();
    }

}
