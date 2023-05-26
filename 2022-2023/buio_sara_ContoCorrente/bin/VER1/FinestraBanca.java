
/**
 * Aggiungi qui una descrizione della classe FinestraBanca
 * 
 * @author (il tuo nome) 
 * @version (un numero di versione o una data)
 */
import javax.swing.*;
import java.awt.*;

public class FinestraBanca extends JFrame {
    private Label labelIntestatario;
    private Banca conti;
    private JTextArea textArea;
    private JTextField textField;
    public Container contentPane;
    private JButton buttonApriConto;
    private JButton buttonEffettuaDeposito;
    private JButton buttonEffettuaPrelievo;
    private JButton buttonVisualizzaSaldo;
    private JButton buttonprelievo50;
    private JButton buttonprelievo100;
    private JButton buttonprelievo200;
    

    public FinestraBanca(){

        //finestra con le sue proprietà
        setTitle("Banca Personale");
        contentPane = this.getContentPane();
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.conti = new Banca();

        //inizializzazione label
        labelIntestatario = new Label("Nome intestatario conto:");

        //inizializzazione textfield
        textField = new JTextField(20);
        
        //inizializzazione bottoni
        buttonApriConto = new JButton("Apri conto");
        buttonEffettuaDeposito = new JButton("Effettua un deposito");
        buttonEffettuaPrelievo = new JButton("Effettua un prelievo");
        buttonVisualizzaSaldo = new JButton("Visualizza le informazioni relative al conto");
        buttonprelievo50 = new JButton ("prelievo: 50€");
        buttonprelievo100 = new JButton ("prelievo: 100€");
        buttonprelievo200 = new JButton ("prelievo: 200€");
        //inizializzazione text area con la sua dimensione
        textArea = new JTextArea();
        textArea.setPreferredSize(new Dimension(400,400));

        //action listener del bottone apri conto
        ActionListenerApriConto apriconto = new ActionListenerApriConto(this.textArea, this.textField, this.conti);
        buttonApriConto.addActionListener(apriconto);
        
        //action listener del bottone effettua deposito
        ActionListenerDeposito deposito = new ActionListenerDeposito(this.conti, this.textField, this.textArea);
        buttonEffettuaDeposito.addActionListener(deposito);

        //action listener del bottone effettua prelievo
        ActionListenerPrelievo prelievo = new ActionListenerPrelievo(this.conti, this.textField, this.textArea);
        buttonEffettuaPrelievo.addActionListener(prelievo);

        //action listener del bottone visualizza saldo
        ActionListenerVisualizzaSaldo visualizza = new ActionListenerVisualizzaSaldo(textArea, conti);
        buttonVisualizzaSaldo.addActionListener(visualizza);
        
        //primo pannello con la scritta per l'intestatario, il box per scrivere e il bottone apri conto
        JPanel panel1 = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        panel1.add(labelIntestatario);
        panel1.add(textField);
        panel1.add(buttonApriConto);

        //secondo pannello con tutti gli altri bottoni
        JPanel panel2 = new JPanel(new FlowLayout());
        panel2.add(buttonEffettuaDeposito);
        panel2.add(buttonEffettuaPrelievo);
        panel2.add(buttonVisualizzaSaldo);
        panel2.add(buttonprelievo50);
        panel2.add(buttonprelievo100);
        panel2.add(buttonprelievo200);

        //aggiungo al contentpane i due pannelli e la textArea dove verrà visualizzato ogni output
        this.contentPane.setLayout((new FlowLayout()));
        this.contentPane.add(panel1);
        this.contentPane.add(panel2);
        this.contentPane.add(textArea);
    }
}