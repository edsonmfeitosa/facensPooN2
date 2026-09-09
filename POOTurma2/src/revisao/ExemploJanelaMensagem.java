
package revisao;

import javax.swing.JOptionPane;


public class ExemploJanelaMensagem {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Mensagem", "Título", JOptionPane.ERROR_MESSAGE);
        JOptionPane.showConfirmDialog(null, "Mensagem", "Título", JOptionPane.YES_NO_OPTION);
        
    }
}
