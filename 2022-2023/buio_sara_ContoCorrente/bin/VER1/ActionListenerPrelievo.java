
/**
 * Aggiungi qui una descrizione della classe ActionListenerPagamento
 * 
 * @author (il tuo nome) 
 * @version (un numero di versione o una data)
 */
import javax.swing.*;
import java.awt.event.*;
public class ActionListenerPrelievo implements ActionListener {
    private JTextArea textArea;
    private JTextField textField;
    private Banca cont;

    @Override
    public void actionPerformed(ActionEvent e) {
        Conto conti = this.cont.getLastCont();
        double saldo = Double.parseDouble(textField.getText());
        conti.prelievo(saldo);
        textArea.append("prelievo effettuato" + "\n");
    }
    public ActionListenerPrelievo(Banca c, JTextField f, JTextArea a){
        this.textArea = a;
        this.textField = f;
        this.cont = c;
    }    
}