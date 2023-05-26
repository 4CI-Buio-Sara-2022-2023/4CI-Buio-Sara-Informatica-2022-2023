
/**
 * Aggiungi qui una descrizione della classe ActionListenerVisualizzaSaldo
 * 
 * @author (il tuo nome) 
 * @version (un numero di versione o una data)
 */
import javax.swing.*;
import java.awt.event.*;

public class ActionListenerVisualizzaSaldo implements ActionListener {
    private JTextArea textArea;
    private Banca conti;

    @Override
        public void actionPerformed(ActionEvent e){
            conti.toString();
            textArea.append(conti.getLastCont().toString() + "\n");
        }
    public ActionListenerVisualizzaSaldo(JTextArea a, Banca c){
        this.textArea = a;
        this.conti = c;
        }
}
