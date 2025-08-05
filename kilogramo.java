
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
class kilogramo extends JFrame{
JLabel kilogramos, gramos;
    JTextField Kilogramos,Gramos;
    JButton borrar, calcular,siguiente;
    
    public kilogramo(){
        setSize(600, 300);
        setLocationRelativeTo(null);
        setLayout(null);
        this.getContentPane().setBackground(new Color(198, 253, 211));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Convertidor de kg a g -- "
                + " By: Lind");
        text();
        setVisible(true);
    }
    public void text() throws HeadlessException{
        JLabel kilogramos = new JLabel("Kilogramo: ");
        kilogramos.setBounds(40,35,100,18);
        add(kilogramos);
        
        JLabel gramos = new JLabel("Gramos: ");
        gramos.setBounds(40, 65, 100, 18);
        add (gramos);
//--------------------------------------------------        
        JTextField Kilogramos = new JTextField (null);
        Kilogramos.setBounds(120,30,400,20);
        Kilogramos.setBackground(new Color(247, 255, 186));
        add(Kilogramos);
        JTextField Gramos = new JTextField(null);
        Gramos.setBounds(120,60,400,20);
        Gramos.setBackground (new Color(245, 186, 255));
        add(Gramos);
//--------------------------------------------------        
        JButton borrar = new JButton ("Borrar");
        borrar.setBounds(120, 100, 100, 25);
        borrar.setBackground (new Color(246, 221, 204));
        add(borrar);
        
        JButton calcular = new JButton("Convertir");
        calcular.setBounds(225,100,100,25);
        calcular.setBackground (new Color(213, 198, 253));
        add(calcular);
        
        JButton siguiente = new JButton("Siguiente");
        siguiente.setBounds(330,100, 100, 25);
        siguiente.setBackground (new Color(249, 231, 159));
        add(siguiente);
        ActionListener action= new ActionListener(){
            public void actionPerformed (ActionEvent e){
                double Kg, Gr, K, G;
                     if (e.getSource() == siguiente){
                  new pesos();
            dispose(); }
                if(e.getSource() == calcular){
                    if(Kilogramos.getText().isEmpty() && Gramos.getText().isEmpty()){
                        Gramos.setText("Sin Datos");
                        Kilogramos.setText("Sin Datos");
                    }
                    else{
                        if (!Kilogramos.getText().isEmpty())
                        {
                            Kg= Double.parseDouble(Kilogramos.getText());
                            K = (Kg * 1000);
                            Gramos.setText(("" + K));
                        }
                        else{
                            Gr= Double.parseDouble(Gramos.getText());
                            G = (Gr/1000);
                            Kilogramos.setText((Double.toString(G)));
                        }
                    }              
                }
                else{
                    Gramos.setText("");
                    Kilogramos.setText("");
}
        }
        };
        siguiente.addActionListener(action);
        calcular.addActionListener(action);
        borrar.addActionListener(action);
                }


public class Kilogramo {
    
}
        }


