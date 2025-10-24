import javax.swing.*;

public class AlgoritmusForm extends JFrame{
    private JTextField txtFVzorek;
    private JButton bttnZacatek;
    private JButton bttnZpet;
    private JButton bttnDalsi;
    private JButton bttnKonec;
    private JPanel pnMain;
    private JTextArea txtAText;

    public AlgoritmusForm() {
        initComponents();
    }

    private void initComponents() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(pnMain);
        setTitle("Vyhledávání v text");
        setSize(800, 400);
    }
}
