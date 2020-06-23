/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectos;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;
import javax.swing.text.StyledEditorKit;

/**
 *
 * @author Santiago
 */
public class Procesador_de_texto {
    public static void main(String[] args){
        ProcesadorJFrame mi;
        mi = new ProcesadorJFrame();
        mi.setVisible(true);
        mi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class ProcesadorJFrame extends JFrame{
    
    
    //----------------- Variables ------------------------ 
    private JTextArea areaDeTexto;
    
    private JTextArea areaInformation;
    private InformacionTextJPanel panelI;
    
    private int sizeFont;
    private String fuenteV;
    private int estiloV;
    
    private JCheckBoxMenuItem bold;
    private JCheckBoxMenuItem italic;
    
    
    public ProcesadorJFrame(){
        this.setSize(700, 450);
        this.setLocation(200, 200);
        this.setResizable(false);
        this.setTitle("Procesador de textos");
       
        this.setLayout(new BorderLayout(5, 5));
        
        add(new MenuProcesadorJPanel(), BorderLayout.NORTH);
        add(new ProcesadorJPanel(), BorderLayout.CENTER);
        
        panelI = new InformacionTextJPanel();
        add(panelI, BorderLayout.EAST);
    }
    
    

    class MenuProcesadorJPanel extends  JPanel{
        public MenuProcesadorJPanel(){
            
            this.setLayout(new BorderLayout());
            
            JMenuBar menubar = new JMenuBar();
            add(menubar, BorderLayout.NORTH);
            
            JMenu fuente = new JMenu("Fuente");
            JMenu estilo = new JMenu("Estilo");
            JMenu tamanio = new JMenu("Tamaño");
            menubar.add(fuente);
            menubar.add(estilo);
            menubar.add(tamanio);
            
            
            // -------------------- Fuente ------------------------------
            /*JMenuItem algerian = new JMenuItem(new ActionClass("Algerian"));
            algerian.setText("Algerian");
            JMenuItem bell_MT = new JMenuItem(new ActionClass("Bell MT"));
            bell_MT.setText("Bell MT");
            JMenuItem arial = new JMenuItem(new ActionClass("Arial"));
            arial.setText("Arial");
            JMenuItem consolas = new JMenuItem(new ActionClass("Consolas"));
            consolas.setText("Consolas");*/
            
            
            JRadioButtonMenuItem algerian = new JRadioButtonMenuItem(new ActionClass("Algerian"));
            algerian.setText("Algerian");
            JRadioButtonMenuItem bell_MT = new JRadioButtonMenuItem(new ActionClass("Bell MT"));
            bell_MT.setText("Bell MT");
            JRadioButtonMenuItem arial = new JRadioButtonMenuItem(new ActionClass("Arial"));
            arial.setText("Arial");
            JRadioButtonMenuItem consolas = new JRadioButtonMenuItem(new ActionClass("Consolas"));
            consolas.setText("Consolas");
            consolas.setSelected(true);
            
            ButtonGroup grupo_radioB = new ButtonGroup();
            grupo_radioB.add(algerian);
            grupo_radioB.add(bell_MT);
            grupo_radioB.add(arial);
            grupo_radioB.add(consolas);
            
            fuente.add(algerian);
            fuente.add(bell_MT);
            fuente.add(arial);
            fuente.add(consolas);
            
            
            //  ----------------- Estilo ----------------------------------
            /*JMenuItem bold = new JMenuItem(new ActionClass(Font.BOLD));
            bold.setText("Bold");
            JMenuItem italic = new JMenuItem(new ActionClass(Font.ITALIC));
            italic.setText("Italic");*/
            
            bold = new JCheckBoxMenuItem(new ActionClass(Font.BOLD));
            bold.setText("Bold");
            italic = new JCheckBoxMenuItem(new ActionClass(Font.ITALIC));
            italic.setText("Italic");
            
            bold.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));
            italic.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I, InputEvent.CTRL_DOWN_MASK));
            
            /*
            JMenuItem sinE = new JMenuItem(new ActionClass(Font.PLAIN));
            sinE.setText("Sin Estilo");*/ // Al agregar los checkbox quedo inutil este item
            estilo.add(bold);
            estilo.add(italic);
            //estilo.add(sinE);
            
            // ----------------- Tamaño ----------------------------------
            JMenuItem five = new JMenuItem(new ActionClass(5f));
            five.setText("5");
            JMenuItem ten = new JMenuItem(new ActionClass(10f));
            ten.setText("10");
            JMenuItem fifteen = new JMenuItem(new ActionClass(15f));
            fifteen.setText("15");
            JMenuItem twenty = new JMenuItem(new ActionClass(20f));
            twenty.setText("20");
            JMenuItem twentyF = new JMenuItem(new ActionClass(25f));
            twentyF.setText("25");
            JMenuItem thirty = new JMenuItem(new ActionClass(35f));
            thirty.setText("35");
            JMenuItem forty = new JMenuItem(new ActionClass(45f));
            forty.setText("45");
            tamanio.add(five);
            tamanio.add(ten);
            tamanio.add(fifteen);
            tamanio.add(twenty);
            tamanio.add(twentyF);
            tamanio.add(thirty);
            tamanio.add(forty);
            
            
        }
    }
    
        
        
    class ProcesadorJPanel extends JPanel{
        public ProcesadorJPanel(){
            
            sizeFont = 20;
            fuenteV = "Consolas";
            estiloV = Font.PLAIN;
            
            areaDeTexto = new JTextArea(16, 45);
            areaDeTexto.setLineWrap(true);
            areaDeTexto.setFont(new Font(fuenteV, estiloV, sizeFont));
            
            
            JScrollPane panelScrollareaTxt = new JScrollPane(areaDeTexto);
            
            add(panelScrollareaTxt);
            
            
            // -------  Menu emergente ---------------------------
            JPopupMenu menu_emergente = new JPopupMenu();
            JMenuItem opcion1 = new JMenuItem(new ActionClass(Font.BOLD));
            opcion1.setText("Bold");
            JMenuItem opcion2 = new JMenuItem(new ActionClass(Font.ITALIC));
            opcion2.setText("Italic");
            menu_emergente.add(opcion1);
            menu_emergente.add(opcion2);
            areaDeTexto.setComponentPopupMenu(menu_emergente);
        }
    }
    
    class ActionClass extends AbstractAction{
            
            public ActionClass(String fuente){
                this.putValue("Fuente", fuente);
                this.putValue(Action.NAME, "fuente");
            }
            
            public ActionClass(int estilo){
                this.putValue("Estilo", estilo);
                this.putValue(Action.NAME, "estilo");
            }
            
            public ActionClass(float tamanio){
                this.putValue("Tamanio", tamanio);
                this.putValue(Action.NAME, "tamanio");
            }
            
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                manejo_CheckBox(ae); // desactiva y activa las checkbox
                
                String iD = (String) this.getValue(Action.NAME);
                
                if(iD.equalsIgnoreCase("fuente")){

                    String fuenteVariable =(String) this.getValue("Fuente");
                    fuenteV = fuenteVariable;
                    
                }
                else if(iD.equalsIgnoreCase("estilo")){
                    int estiloVariable =(int) this.getValue("Estilo");
                    //JCheckBoxMenuItem objeto =(JCheckBoxMenuItem) ae.getSource();
                    //objeto.isSelected();
                    if(estiloVariable == 0){
                        estiloV = estiloVariable;
                    }
                    else if(estiloV == estiloVariable){
                        estiloV -= estiloVariable;
                    }
                    else if(estiloV != estiloVariable && (estiloV > 0 && estiloV < 3)){
                        estiloV = estiloV + estiloVariable;
                    }
                    else if(estiloV == 3){
                        estiloV -= estiloVariable;
                    }
                    else{
                        estiloV = estiloVariable;
                    }
                }
                else if(iD.equalsIgnoreCase("tamanio")){
                    float p = (float) this.getValue("Tamanio");
                    sizeFont = (int) p;
                }
                
                areaDeTexto.setFont(new Font(fuenteV, estiloV, sizeFont));
                panelI.UpdateTextArea();
            }
            
        }

    
    
    class InformacionTextJPanel extends JPanel{
        private String estiloL;
        
        public InformacionTextJPanel(){
            
            areaInformation = new JTextArea(5, 22);
            areaInformation.setLineWrap(true);
            areaInformation.setFont(new Font(fuenteV, estiloV, 12));
            areaInformation.setEditable(false);
            
            JScrollPane panelScroll = new JScrollPane(areaInformation);
            add(panelScroll);
            
            
            this.UpdateTextArea();
        }
        
        public void UpdateTextArea(){
            
            switch (estiloV) {
                case 0:
                    estiloL = "Sin estilo";
                    break;
                case 1:
                    estiloL = "Bold";
                    break;
                case 2:
                    estiloL = "Italic";
                    break;
                case 3:
                    estiloL = "Bold & Italic";
                    break;
                default:
                    break;
            }
            
            
            areaInformation.setText("\nFuente: " + fuenteV +"\n"
                                   +"Estilo: " + estiloL +"\n"
                                   +"Tamaño: " + sizeFont);
        }
    }
    
    
    private void manejo_CheckBox(ActionEvent fuenteB){
        Object fuente_boton = fuenteB.getSource();
        String stringBoton = fuenteB.getActionCommand();
        System.out.println(stringBoton);
        if(fuente_boton == bold || fuente_boton == italic){
            System.out.println("Fuente: barra de menu");
        }
        else{
            System.out.println("Fuente menu desplegable");
            if(stringBoton.equalsIgnoreCase("Bold")){
                System.out.println("Se reconoce el boton mD");
                if(bold.isSelected()){
                    bold.setSelected(false);
                }else{
                    bold.setSelected(true);
                }
            }
            else if(stringBoton.equalsIgnoreCase("Italic")){
                if(italic.isSelected()){
                    italic.setSelected(false);
                }else{
                    italic.setSelected(true);
                }
            }
        }
    }
}
