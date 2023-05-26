
/**
 * Aggiungi qui una descrizione della classe ActionListenerDeposito
 * 
 * @author (il tuo nome) 
 * @version (un numero di versione o una data)
 */
import javax.swing.*;
import java.awt.event.*;
public class ActionListenerDeposito implements ActionListener {
    private Banca cont;
    private JTextArea textArea;
    private JTextField textField;

    @Override
    public void actionPerformed(ActionEvent e) {
        Conto conti = this.cont.getLastCont();
        double saldo = Double.parseDouble(textField.getText());
        conti.deposito(saldo);
        textArea.append("deposito effettuato" + "\n");
    }
    public ActionListenerDeposito(Banca c, JTextField f, JTextArea a){
        this.cont = c;
        this.textArea = a;
        this.textField = f;
    }    
}
