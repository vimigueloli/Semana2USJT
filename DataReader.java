import javax.swing.JOptionPane;

public class DataReader{
   public static void main(String [] args){
      int day = Integer.parseInt(JOptionPane.showInputDialog("digite o dia"));
      int month = Integer.parseInt(JOptionPane.showInputDialog("digite o mês"));
      int year = Integer.parseInt(JOptionPane.showInputDialog("digite o ano"));      
      if(day<32){
         if(month<13){
            JOptionPane.showMessageDialog(null,day + "/" + month + "/" + year);   
         }
         else{
            JOptionPane.showMessageDialog(null,"ERRO essa data não existe!");
         }
      } 
      else{
         JOptionPane.showMessageDialog(null,"ERRO essa data não existe!");
      }      
   }
}