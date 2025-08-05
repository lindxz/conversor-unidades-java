
package buttonconvert;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
//BY Lind
class Convertidor extends JFrame{
    JLabel menu, menu0, meni1, meu2, menu3;
    JLabel centimetros, metros;
    JTextField Centimetros, Metros;
    JButton borrar, siguiente, calcular;
    
    public Convertidor(){
        setSize (600,300);
        setLocationRelativeTo(null);
        setLayout(null);
        this.getContentPane().setBackground(new Color(188, 197, 250));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Convertidor de cm a metros"
                + "By: Lind");
        text();
        setVisible(true);
    }
    public void  text() throws HeadlessException{
         JLabel menu = new JLabel("~~ BIENVENIDO ~~ ");
       menu.setBounds(30,10,500,20);
       add(menu);
       JLabel menu0 = new JLabel(" Este convertidor es para: ");
       menu0.setBounds(20,35,500,20);
       add(menu0);
       JLabel menu1 = new JLabel("+ cm - m");
       menu1.setBounds(100,60,200,20);
       add(menu1);
       
       JLabel menu2 = new JLabel("+ kg - g");
       menu2.setBounds(200,60,200,20);
       add(menu2);
       
       JLabel menu3 = new JLabel("+ pesos - dolares");
       menu3.setBounds(300,60,200,20);
       add(menu3);
       //---------------------------------------------------------
       JLabel centimetros = new JLabel ("Centimetros");
       centimetros.setBounds(40,120,100,10);
       add(centimetros);
       
       JLabel metros = new JLabel ("Metros");
       metros.setBounds(40,150,100,10);
       add(metros);
//------------------------------------------   
       JTextField Centimetros = new JTextField (null);
       Centimetros.setBounds(120,120,400,20);
       Centimetros.setBackground(new Color(255, 203, 186));
       add (Centimetros);
       
       JTextField Metros = new JTextField (null);
       Metros.setBounds(120,150,400,20);
       Metros.setBackground(new Color(186, 255, 221));
       add (Metros);
//------------------------------------------       
       JButton borrar= new JButton ("Borrar");
       borrar.setBounds(225,200,100,25);
       borrar.setBackground(new Color(246, 239, 179));
       add (borrar);
       
       JButton calcular = new JButton ("Calcular");
       calcular.setBounds(320,200,100,25);
       calcular.setBackground(new Color(207, 249, 229));
       add (calcular);
       
       JButton siguiente = new JButton ("Siguiente");
       siguiente.setBounds(415,200,100,25);
       siguiente.setBackground(new Color(198, 253, 211));
       add (siguiente);
       ActionListener action= new ActionListener(){
            public void actionPerformed (ActionEvent e){
                double Cm, Mts, C, M;
                if (e.getSource() == siguiente){
                  new kilogramo();
            dispose(); 

                }
                if(e.getSource() == calcular){
                    if(Centimetros.getText().isEmpty() && Metros.getText().isEmpty()){
                        Metros.setText("Sin Datos");
                        Centimetros.setText("Sin Datos");
                    }
                    else{
                        if (!Centimetros.getText().isEmpty())
                        {
                            Cm= Double.parseDouble(Centimetros.getText());
                            C = ((Cm / 100));
                            Metros.setText(("" + C));
                        }
                        else{
                            Mts= Double.parseDouble(Metros.getText());
                            M = ((Mts *100));
                            Centimetros.setText((Double.toString(M)));
                        }
                    }
                }
                else{
                    Metros.setText("");
                    Centimetros.setText("");
                }
        }
    };
        siguiente.addActionListener(action);
        calcular.addActionListener(action);
        borrar.addActionListener(action);
    }
}

public class Principal {

    public static void main(String[] args) {
        new Convertidor();
    }
    
}
