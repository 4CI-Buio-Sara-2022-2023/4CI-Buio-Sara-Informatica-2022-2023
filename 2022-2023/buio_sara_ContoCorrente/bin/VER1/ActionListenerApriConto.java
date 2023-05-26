
/**
 * Aggiungi qui una descrizione della classe ActionListenerApriConto
 * 
 * @author (il tuo nome) 
 * @version (un numero di versione o una data)
 */
import javax.swing.*;
import java.awt.event.*;

public class ActionListenerApriConto implements ActionListener {
    private JTextArea textArea;
    private JTextField textFieldIntestatario;
    private Banca conti;
    private String intestatario;
    private Conto cont;

    @Override
    public void actionPerformed(ActionEvent e) {
        cont = new Conto();
        conti.aggiungiConto(cont);
        this.intestatario = textFieldIntestatario.getText();
        this.cont.setIntestatario(intestatario);
        textArea.append("intestatario del conto: " + cont.getIntestatario() + "\n");        
    }

    public ActionListenerApriConto(JTextArea textArea, JTextField textFieldIntestatario, Banca c) {
        this.textArea = textArea;
        this.textFieldIntestatario = textFieldIntestatario;
        this.conti = c;
    }
}
