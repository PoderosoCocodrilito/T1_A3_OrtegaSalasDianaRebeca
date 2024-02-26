import java.awt.*;
	import javax.swing.*;
	
	class VentanaPrincipal extends JFrame {
		GridBagLayout gbl = new GridBagLayout();
		GridBagConstraints gbc = new GridBagConstraints();
		
		public void componentes (JComponent c, int x, int y, int ancho, int heigh, int tamañoLetra ) {
			gbc.gridx = x;
			gbc.gridy = y;
			gbc.gridwidth = ancho;
			gbc.gridheight = heigh;
			gbl.setConstraints(c, gbc);
			c.setFont(new Font("Arial", Font.BOLD, tamañoLetra));
			add(c);
		}
		
		public VentanaPrincipal () {
			getContentPane().setLayout(gbl);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			//setSize(300,  300);
			//setLocationRelativeTo(null);
			setTitle("GridBagLayout");
			setVisible(true);
			

			JLabel txtFormulario = new JLabel ("The Classic Form includes all visible fields for ");
			
			componentes(txtFormulario,0,0 , 1,1,9);
			
			JLabel txtFormulario1 = new JLabel ("this list.");
			gbc.fill = GridBagConstraints.HORIZONTAL;
			componentes(txtFormulario1,0,1 , 1,1,9);
			
			JLabel txtOpcionesFormulario = new JLabel ("Form options");
			gbc.ipady=15;
			componentes(txtOpcionesFormulario,0,2 , 1, 1,12);
			
			JLabel txtIncluyaLoSiguiente = new JLabel ("Include the following:");
			gbc.ipady=0;
			componentes(txtIncluyaLoSiguiente,0,3 , 1, 1,9);
			
			JCheckBox cajaTituloParaTuFormulario = new JCheckBox ("a title for your form ");
			componentes(cajaTituloParaTuFormulario,0,4 , 1, 1,9);
			
			JTextField cajaSuscribase = new JTextField(10);
			componentes(cajaSuscribase,0,5 , 1,1,9);
			
			JLabel espacio2 = new JLabel ("   ");
			gbc.ipady=5;
			componentes(espacio2,0,6 , 1,1,7); 
			
			ButtonGroup bg = new ButtonGroup();
			
			JRadioButton op1 = new JRadioButton ("only required fields");
			gbc.ipady=-4;
			componentes(op1,0,7 , 1, 1,9);
			
			
			JRadioButton op2 = new JRadioButton ("all fields");
			componentes(op2,0,8 , 1, 1,9);
			gbc.ipady=-4;
			JLabel txtOp3 = new JLabel ("    (edit required fields in the form builder)");
			componentes(txtOp3,0,9 , 1,1,7);
			
			JLabel espacio = new JLabel ("   ");
			gbc.ipady=6;
			componentes(espacio,0,10 , 1,1,7);
			
			JCheckBox cuadro1 = new JCheckBox ("interest group fields ");
			gbc.ipady=-9;
			componentes(cuadro1,0,11 ,1, 1,9);
		
			JCheckBox cuadro2 = new JCheckBox ("required field indicators");
			gbc.ipady=0;
			componentes(cuadro2,0,12 , 1, 1,9);
			
			
			JLabel espacio3 = new JLabel ("   ");
			gbc.ipady=4;
			componentes(espacio3,0,13 , 1,1,7);
			JLabel txtAnchoFormulario = new JLabel ("Set form width");
			componentes(txtAnchoFormulario,0,14 , 1, 1,9);
			
			JTextField caja2 = new JTextField(10);
			componentes(caja2,0,15 , 1, 1,6);
		
			JLabel espacio4 = new JLabel ("   ");
			gbc.ipady=4;
			componentes(espacio4,0,16 , 1,1,7);
			JLabel txtMejoraTuForma = new JLabel ("Enhance your form");
			componentes(txtMejoraTuForma,0,17 , 1,1,9);
			gbc.ipady=-6;
			JCheckBox caja1 = new JCheckBox ("enable evil popup mode");
			componentes(caja1,0,18 ,1,1,9);
			
			JCheckBox caja02 = new JCheckBox ("disable all JavaScript Info");
			componentes(caja02,0,19 , 1,1,9);
			
			JCheckBox caja3 = new JCheckBox ("include archive link Info");
			componentes(caja3,0,20 ,1, 1,9);
			
			JCheckBox caja4 = new JCheckBox ("include Monkey Rewards link");
			componentes(caja4,0,21 , 1, 1,9);
			
			JLabel espacio5 = new JLabel ("           ");
			componentes(espacio5,1,0 , 1, 1,12);
			JLabel txtPreview = new JLabel ("Preview");
			gbc.ipady=4;
			componentes(txtPreview,2,0 , 2, 1,12);
			
			JLabel espacio6 = new JLabel ("           ");
			componentes(espacio6,1,0 , 2, 1,12);
			
			JLabel txtEmail = new JLabel ("   Email Address");
			componentes(txtEmail,2,1 , 2, 1,11);
			
			JTextField cajaEmail = new JTextField(30);//***********
			componentes(cajaEmail,2,2 , 2, 1,9);
			
			
			JLabel txtFirsName = new JLabel ("   First Name");
			componentes(txtFirsName,2,3 , 2, 1,11);
			
			JTextField cajaFirsName = new JTextField(30);//*****************
			componentes(cajaFirsName,2,4 ,2, 1,9);
			
			JLabel txtLastName = new JLabel ("   Last Name");
			componentes(txtLastName,2,5 , 2, 1,11);
			
			JTextField cajaLastName = new JTextField(30);//****************
			componentes(cajaLastName,2,6 , 2, 1,9);
			
			JLabel espacio7 = new JLabel ("           ");
			componentes(espacio7,4,7 , 1, 1,12);
			JButton btnSubscribe = new JButton ("Subscribe");
			componentes(btnSubscribe,2,8, 1, 1,9);
			
			
			
			JLabel txtCopy = new JLabel ("Copy/paste onto your site");
			componentes(txtCopy,2,11 , 1, 1,12);
			gbc.ipady=-5;
			JLabel txt1 = new JLabel ("</form>");
			componentes(txt1,2,12 , 2, 1,9);
			
			JLabel txt2 = new JLabel ("</div>");
			componentes(txt2,2,13 , 2, 1,9);
			
			JLabel txt3 = new JLabel ("<script type='text/javascript\" src=\"//s3.amazonaws.com/downloads.mailchimp.com/js/mc ");
			componentes(txt3,2,14 ,2, 1,9);
			
			JLabel txt4 = new JLabel ("validate js'></script><script type=\"text/javascript> (function($) {window.fnames = new ");
			componentes(txt4,2,15 , 2, 1,9);
			
			JLabel txt5 = new JLabel ("Array(); window.ftypes = new ");
			componentes(txt5,2,16 , 2, 1,9);
			
			JLabel txt6 = new JLabel ("Array(); fnames[0]='EMAIL',ftypes[0]='email' fnames[1]='FNAME\" ftypes[1]='text':fnames[2]=L");
			componentes(txt6,2,17 , 2, 1,9);
			
			JLabel txt7 = new JLabel ("NAME ftypes[2]='text')(jQuery)) var Smcj = jQuery.noConflict(true); </script>");
			componentes(txt7,2,18 , 2, 1,9);
			
			JLabel txt8 = new JLabel ("<1--End mc_embed_signup-->");
			componentes(txt8,2,19 , 2, 1,9);
			
			
			pack();
			setLocationRelativeTo(null);
		}
	}
	public class T1_A3_OrtegaSalasDianaRebeca {
		public static void main(String[] args) {
			SwingUtilities.invokeLater(new Runnable() {
				@Override
				public void run() {
					new VentanaPrincipal();
				}});

		}//MAIN
	}
