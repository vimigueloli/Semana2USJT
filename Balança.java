import javax.swing.JOptionPane;

public class Balança{
   public static void main(String [] args){
      int peso = Integer.parseInt(JOptionPane.showInputDialog("digite o seu peso!"));
      JOptionPane.showMessageDialog(null,"o seu peso é: " + peso + "Kg" ); 
   }
   
}