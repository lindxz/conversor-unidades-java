
package buttonconvert;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
//BY Lind
class pesos extends JFrame{
 JLabel pesos, dolares;
    JTextField Pesos,Dolares;
    JButton borrar, calcular,salir;
    
    public pesos(){
        setSize(600, 300);
        setLocationRelativeTo(null);
        setLayout(null);
        this.getContentPane().setBackground(new Color(255, 241, 186));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Convertidor de pesos a dolares -- "
                + " By: Lind");
        text();
        setVisible(true);
    }
    public void text() throws HeadlessException{
        JLabel pesos = new JLabel("Pesos: : ");
        pesos.setBounds(40,35,100,10);
        add(pesos);
        
        JLabel dolares = new JLabel("Dolares: ");
        dolares.setBounds(40, 65, 100, 10);
        add (dolares);
//----------------------------------------------------------        
        JTextField Pesos = new JTextField (null);
        Pesos.setBounds(120,30,400,20);
        Pesos.setBackground (new Color(186, 234, 255));
        add(Pesos);
        JTextField Dolares = new JTextField(null);
        Dolares.setBounds(120,60,400,20);
        Dolares.setBackground(new Color(222, 255, 186));
        add(Dolares);
//-----------------------------------------------------------        
        JButton borrar = new JButton ("Borrar");
        borrar.setBounds(120, 100, 100, 25);
        borrar.setBackground(new Color(198, 253, 211));
        add(borrar);
        
        JButton calcular = new JButton("Convertir");
        calcular.setBounds(225,100,100,25);
        calcular.setBackground (new Color(188, 197, 250));
        add(calcular);
        JButton salir = new JButton("Salir");
        salir.setBounds(330,100, 100, 25);
        salir.setBackground( new Color(246, 221, 204));
        add(salir);
        ActionListener action= new ActionListener(){
            public void actionPerformed (ActionEvent e){
                double Pe, Dl, P, D;
                if (e.getSource() ==salir){
                    System.exit(0);
                }
                if(e.getSource() == calcular){
                    if(Pesos.getText().isEmpty() && Dolares.getText().isEmpty()){
                        Dolares.setText("Sin Datos");
                        Pesos.setText("Sin Datos");
                    }
                    else{
                        if (!Pesos.getText().isEmpty())
                        {
                            Pe= Double.parseDouble(Pesos.getText());
                            P = (Pe* 0.050);
                            Dolares.setText(("" + P));
                        }
                        else{
                            Dl= Double.parseDouble(Dolares.getText());
                            D = (Dl* 19.89);
                            Pesos.setText((Double.toString(D)));
                        }
                    }
                }
                else{
                    Dolares.setText("");
                    Pesos.setText("");
                }
               
        }
    };
        salir.addActionListener(action);
        calcular.addActionListener(action);
        borrar.addActionListener(action);
}


 public class Pesos {
    
}
}

