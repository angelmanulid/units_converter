package unitsconverter_v1_03;

import java.awt.*;


import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class UnitsConverter_GUI implements ListSelectionListener, DocumentListener {
    final static String LENGTHPANEL = "Length";
    final static String VOLPANEL = "Volume";
    final static String PRESSUREPANEL = "Pressure";
    final static String FLOWRATEPANEL = "Flow Rate";

    
    // Create Tabbed Pane, Labels and Text Field
    JTabbedPane tabbedPane = new JTabbedPane();
    JLabel labelLengthFrom = new JLabel("From:");
    JLabel labelLengthTo = new JLabel("To:");
    JTextField fieldLengthFrom = new JTextField();
    JTextField fieldLengthTo = new JTextField();
    JLabel labelVolumeFrom = new JLabel("From:");
    JLabel labelVolumeTo = new JLabel("To:");
    JTextField fieldVolumeFrom = new JTextField();
    JTextField fieldVolumeTo = new JTextField();
    JLabel labelPressureFrom = new JLabel("From:");
    JLabel labelPressureTo = new JLabel("To:");
    JTextField fieldPressureFrom = new JTextField();
    JTextField fieldPressureTo = new JTextField();
    JLabel labelFlowRateFrom = new JLabel("From:");
    JLabel labelFlowRateTo = new JLabel("To:");
    JTextField fieldFlowRateFrom = new JTextField();
    JTextField fieldFlowRateTo = new JTextField();
    
    
    // Declaration of JLists
    private JList<String> listLengthFrom;
    private JList<String> listLengthTo;
    private JList<String> listVolumeFrom;
    private JList<String> listVolumeTo;
    private JList<String> listPressureFrom;
    private JList<String> listPressureTo;
    private JList<String> listFlowRateFrom;
    private JList<String> listFlowRateTo;
    
    //Declaration of ListModels
    private DefaultListModel<String> listModelLength;
    private DefaultListModel<String> listModelVolume;
    private DefaultListModel<String> listModelPressure;
    private DefaultListModel<String> listModelFlowRate;
    private JScrollPane listScrollPaneLengthFrom;
    private JScrollPane listScrollPaneLengthTo;
    private JScrollPane listScrollPaneVolumeFrom;
    private JScrollPane listScrollPaneVolumeTo;
    private JScrollPane listScrollPanePressureFrom;
    private JScrollPane listScrollPanePressureTo;
    private JScrollPane listScrollPaneFlowRateFrom;
    private JScrollPane listScrollPaneFlowRateTo;
    
   

    public void createAndShowGUI() {
    	
    	// Prohibit editing of To field
    	fieldLengthTo.setEditable(false);
    	fieldVolumeTo.setEditable(false);
    	fieldPressureTo.setEditable(false);
    	fieldFlowRateTo.setEditable(false);
    	
    	//Add document listener to From field
    	fieldLengthFrom.getDocument().addDocumentListener(this);
    	fieldVolumeFrom.getDocument().addDocumentListener(this);
    	fieldPressureFrom.getDocument().addDocumentListener(this);
    	fieldFlowRateFrom.getDocument().addDocumentListener(this);
    	
        // Create and set up the window.
        JFrame frame = new JFrame("Units Converter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Setup selected Tab color
        Color YELLOW = new Color(255 ,255, 191);
        UIManager.put("TabbedPane.selected", YELLOW);
        
       
        
    
//------------------------------- LENGTH TAB ------------------------------------//
        
        // Create the "cards".
        JPanel cardLength = new JPanel();
        cardLength.setLayout(new BorderLayout());
        
        // Create top panel for LENGTH TAB
        JPanel cardLengthTop = new JPanel();
        
        GridLayout gridlayoutTOP = new GridLayout(2,2);
        GridLayout gridlayoutBOTTOM = new GridLayout(1,2);
        cardLengthTop.setLayout(gridlayoutTOP);
        cardLengthTop.setPreferredSize(new Dimension(600, 80));
        cardLengthTop.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        cardLengthTop.add(labelLengthFrom);
        cardLengthTop.add(labelLengthTo);
        cardLengthTop.add(fieldLengthFrom);
        cardLengthTop.add(fieldLengthTo);
        
        // Add top panel to Length Panel
        cardLength.add(cardLengthTop, BorderLayout.PAGE_START);
        
        // Create and layout bottom panel for LENGTH TAB
        JPanel cardLengthBottom = new JPanel();
        cardLengthBottom.setLayout(gridlayoutBOTTOM);
        cardLengthBottom.setPreferredSize(new Dimension(600, 425));
        
        // List of Length Units
        listModelLength = new DefaultListModel<String>();
        listModelLength.addElement("Meter");
        listModelLength.addElement("Kilometer");
        listModelLength.addElement("Centimeter");
        listModelLength.addElement("Millimeter");
        listModelLength.addElement("Micrometer");
        listModelLength.addElement("Nanometer");
        listModelLength.addElement("Mile");
        listModelLength.addElement("Yard");
        listModelLength.addElement("Foot");
        listModelLength.addElement("Inch");
        
        //Create the list and put it in a scroll pane (LENGTH TAB)
        listLengthFrom = new JList<String>(listModelLength);
        listLengthFrom.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        listLengthFrom.setSelectedIndex(0);
        listLengthFrom.addListSelectionListener(this);
        listLengthFrom.setVisibleRowCount(5);
        
        listLengthTo = new JList<String>(listModelLength);
        listLengthTo.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        listLengthTo.setSelectedIndex(0);
        listLengthTo.addListSelectionListener(this);
        listLengthTo.setVisibleRowCount(5);     
        
        // Create Scroll Pane (LENGTH TAB)
        listScrollPaneLengthFrom = new JScrollPane(listLengthFrom);
        listScrollPaneLengthTo = new JScrollPane(listLengthTo);
        listScrollPaneLengthFrom.setPreferredSize(new Dimension(180, 400));
        listScrollPaneLengthTo.setPreferredSize(new Dimension(180, 400));

        // Add and layout scroll panes to bottom panel
        cardLengthBottom.add(listScrollPaneLengthFrom);
        cardLengthBottom.setLayout(new BoxLayout(cardLengthBottom,
                BoxLayout.LINE_AXIS));
        cardLengthBottom.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        cardLengthBottom.add(listScrollPaneLengthTo);
        
        // Add bottom panel to Whole Panel
        cardLength.add(cardLengthBottom);
        
//------------------------------ VOLUME TAB --------------------------------------//        
        // Create the "cards".
        JPanel cardVolume = new JPanel();
        cardVolume.setLayout(new BorderLayout());
        
        // Create top panel for LENGTH TAB
        JPanel cardVolumeTop = new JPanel();
        
        gridlayoutTOP = new GridLayout(2,2);
        gridlayoutBOTTOM = new GridLayout(1,2);
        cardVolumeTop.setLayout(gridlayoutTOP);
        cardVolumeTop.setPreferredSize(new Dimension(600, 80));
        cardVolumeTop.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        cardVolumeTop.add(labelVolumeFrom);
        cardVolumeTop.add(labelVolumeTo);
        cardVolumeTop.add(fieldVolumeFrom);
        cardVolumeTop.add(fieldVolumeTo);
        
        // Add top panel to Volume Panel
        cardVolume.add(cardVolumeTop, BorderLayout.PAGE_START);
        
        // Create bottom panel for LENGTH TAB
        JPanel cardVolumeBottom = new JPanel();
        
        cardVolumeBottom.setLayout(gridlayoutBOTTOM);
        cardVolumeBottom.setPreferredSize(new Dimension(600, 400));
             
        // List of Volume Units
        listModelVolume = new DefaultListModel<String>();
        listModelVolume.addElement("Cubic meter (m\u00B3)");
        listModelVolume.addElement("Cubic feet (ft\u00B3)");
        listModelVolume.addElement("Cubic inch (in\u00B3)");
        listModelVolume.addElement("Liter");
        listModelVolume.addElement("Milliliter");
        listModelVolume.addElement("Gallon (US)");
        listModelVolume.addElement("Quart");
        listModelVolume.addElement("Million Liter");
     
        //Create the Jlists (VOLUME TAB)
        listVolumeFrom = new JList<String>(listModelVolume);
        listVolumeFrom.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        listVolumeFrom.setSelectedIndex(0);
        listVolumeFrom.addListSelectionListener(this);
        listVolumeFrom.setVisibleRowCount(5);
        
        listVolumeTo = new JList<String>(listModelVolume);
        listVolumeTo.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        listVolumeTo.setSelectedIndex(0);
        listVolumeTo.addListSelectionListener(this);
        listVolumeTo.setVisibleRowCount(5);
    
        
        // Create Scroll Pane 
        listScrollPaneVolumeFrom = new JScrollPane(listVolumeFrom);
        listScrollPaneVolumeTo = new JScrollPane(listVolumeTo);
        listScrollPaneVolumeFrom.setPreferredSize(new Dimension(180, 400));
        listScrollPaneVolumeTo.setPreferredSize(new Dimension(180, 400));

        // Add and layout scroll panes to bottom panel
        cardVolumeBottom.add(listScrollPaneVolumeFrom);
        cardVolumeBottom.setLayout(new BoxLayout(cardVolumeBottom,
                BoxLayout.LINE_AXIS));
        cardVolumeBottom.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        cardVolumeBottom.add(listScrollPaneVolumeTo);
        
        // Add bottom panel to Whole Panel
        cardVolume.add(cardVolumeBottom);
        
//-------------------------------- PRESSURE TAB --------------------------------------//        
        // Create the "cards".
        JPanel cardPressure = new JPanel();
        cardPressure.setLayout(new BorderLayout());
        
        // Create top panel for LENGTH TAB
        JPanel cardPressureTop = new JPanel();
        
        gridlayoutTOP = new GridLayout(2,2);
        gridlayoutBOTTOM = new GridLayout(1,2);
        cardPressureTop.setLayout(gridlayoutTOP);
        cardPressureTop.setPreferredSize(new Dimension(600, 80));
        cardPressureTop.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        cardPressureTop.add(labelPressureFrom);
        cardPressureTop.add(labelPressureTo);
        cardPressureTop.add(fieldPressureFrom);
        cardPressureTop.add(fieldPressureTo);
        
        // Add top panel to Pressure Panel
        cardPressure.add(cardPressureTop, BorderLayout.PAGE_START);
        
        // Create bottom panel for LENGTH TAB
        JPanel cardPressureBottom = new JPanel();
        
        cardPressureBottom.setLayout(gridlayoutBOTTOM);
        cardPressureBottom.setPreferredSize(new Dimension(600, 400));
             
        // List of Pressure Units
        listModelPressure = new DefaultListModel<String>();
        listModelPressure.addElement("atm");
        listModelPressure.addElement("Pa");
        listModelPressure.addElement("kPa");
        listModelPressure.addElement("bar");
        listModelPressure.addElement("Torr");
        listModelPressure.addElement("N/m\u00B2");
        listModelPressure.addElement("mm Hg");
        listModelPressure.addElement("cm Hg");
        listModelPressure.addElement("in Hg");
        listModelPressure.addElement("psi");
        listModelPressure.addElement("ft H\u2082O at 39.1\u00B0F");
        listModelPressure.addElement("m H\u2082O");
     
        //Create the Jlists (PRESSURE TAB)
        listPressureFrom = new JList<String>(listModelPressure);
        listPressureFrom.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        listPressureFrom.setSelectedIndex(0);
        listPressureFrom.addListSelectionListener(this);
        listPressureFrom.setVisibleRowCount(5);
        
        listPressureTo = new JList<String>(listModelPressure);
        listPressureTo.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        listPressureTo.setSelectedIndex(0);
        listPressureTo.addListSelectionListener(this);
        listPressureTo.setVisibleRowCount(5);
    
        
        // Create Scroll Pane 
        listScrollPanePressureFrom = new JScrollPane(listPressureFrom);
        listScrollPanePressureTo = new JScrollPane(listPressureTo);
        listScrollPanePressureFrom.setPreferredSize(new Dimension(180, 400));
        listScrollPanePressureTo.setPreferredSize(new Dimension(180, 400));

        // Add and layout scroll panes to bottom panel
        cardPressureBottom.add(listScrollPanePressureFrom);
        cardPressureBottom.setLayout(new BoxLayout(cardPressureBottom,
                BoxLayout.LINE_AXIS));
        cardPressureBottom.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        cardPressureBottom.add(listScrollPanePressureTo);
        
        // Add bottom panel to Whole Panel
        cardPressure.add(cardPressureBottom);
        
//----------------------------- FLOW RATE TAB --------------------------------------//        
        // Create the "cards".
        JPanel cardFlowRate = new JPanel();
        cardFlowRate.setLayout(new BorderLayout());
        
        // Create top panel for LENGTH TAB
        JPanel cardFlowRateTop = new JPanel();
        
        gridlayoutTOP = new GridLayout(2,2);
        gridlayoutBOTTOM = new GridLayout(1,2);
        cardFlowRateTop.setLayout(gridlayoutTOP);
        cardFlowRateTop.setPreferredSize(new Dimension(600, 80));
        cardFlowRateTop.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        cardFlowRateTop.add(labelFlowRateFrom);
        cardFlowRateTop.add(labelFlowRateTo);
        cardFlowRateTop.add(fieldFlowRateFrom);
        cardFlowRateTop.add(fieldFlowRateTo);
        
        // Add top panel to FlowRate Panel
        cardFlowRate.add(cardFlowRateTop, BorderLayout.PAGE_START);
        
        // Create bottom panel for LENGTH TAB
        JPanel cardFlowRateBottom = new JPanel();
        
        cardFlowRateBottom.setLayout(gridlayoutBOTTOM);
        cardFlowRateBottom.setPreferredSize(new Dimension(600, 400));
             
        // List of Flow Rate Units
        listModelFlowRate = new DefaultListModel<String>();
        listModelFlowRate.addElement("m\u00B3/s");
        listModelFlowRate.addElement("m\u00B3/min");
        listModelFlowRate.addElement("m\u00B3/hr");
        listModelFlowRate.addElement("ft\u00B3/s");
        listModelFlowRate.addElement("ft\u00B3/min");
        listModelFlowRate.addElement("ft\u00B3/hr");
        listModelFlowRate.addElement("gal/s (gps)");
        listModelFlowRate.addElement("gal/min (gpm)");
        listModelFlowRate.addElement("gal/hr (gph)");
        listModelFlowRate.addElement("L/s");
        listModelFlowRate.addElement("L/min");
        listModelFlowRate.addElement("L/hr");
        listModelFlowRate.addElement("ML/day");
     
        //Create the Jlists (FLOW RATE TAB)
        listFlowRateFrom = new JList<String>(listModelFlowRate);
        listFlowRateFrom.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        listFlowRateFrom.setSelectedIndex(0);
        listFlowRateFrom.addListSelectionListener(this);
        listFlowRateFrom.setVisibleRowCount(5);
        
        listFlowRateTo = new JList<String>(listModelFlowRate);
        listFlowRateTo.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        listFlowRateTo.setSelectedIndex(0);
        listFlowRateTo.addListSelectionListener(this);
        listFlowRateTo.setVisibleRowCount(5);
    
        
        // Create Scroll Pane 
        listScrollPaneFlowRateFrom = new JScrollPane(listFlowRateFrom);
        listScrollPaneFlowRateTo = new JScrollPane(listFlowRateTo);
        listScrollPaneFlowRateFrom.setPreferredSize(new Dimension(180, 400));
        listScrollPaneFlowRateTo.setPreferredSize(new Dimension(180, 400));

        // Add and layout scroll panes to bottom panel
        cardFlowRateBottom.add(listScrollPaneFlowRateFrom);
        cardFlowRateBottom.setLayout(new BoxLayout(cardFlowRateBottom,
                BoxLayout.LINE_AXIS));
        cardFlowRateBottom.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        cardFlowRateBottom.add(listScrollPaneFlowRateTo);
        
        // Add bottom panel to Whole Panel
        cardFlowRate.add(cardFlowRateBottom);
        
        
//-------------------------- TABBED PANE ---------------------------------------------//        
        
        // Create Font and set Font of all elements
        Font f = new Font("serif", Font.PLAIN, 20);   
        tabbedPane.setFont(f);
        labelLengthFrom.setFont(f);
        labelLengthTo.setFont(f);
        fieldLengthFrom.setFont(f);
        fieldLengthTo.setFont(f);
        labelVolumeFrom.setFont(f);
        labelVolumeTo.setFont(f);
        fieldVolumeFrom.setFont(f);
        fieldVolumeTo.setFont(f);
        labelPressureFrom.setFont(f);
        labelPressureTo.setFont(f);
        fieldPressureFrom.setFont(f);
        fieldPressureTo.setFont(f);
        labelFlowRateFrom.setFont(f);
        labelFlowRateTo.setFont(f);
        fieldFlowRateFrom.setFont(f);
        fieldFlowRateTo.setFont(f);
        listLengthFrom.setFont(f);
        listLengthTo.setFont(f);
        listVolumeFrom.setFont(f);
        listVolumeTo.setFont(f);
        listPressureFrom.setFont(f);
        listPressureTo.setFont(f);
        listFlowRateFrom.setFont(f);
        listFlowRateTo.setFont(f);
        
        // Set BackGround Colors
        frame.getContentPane().setBackground(YELLOW);
        cardLength.setBackground(YELLOW);
        cardVolume.setBackground(YELLOW);
        cardPressure.setBackground(YELLOW);
        cardFlowRate.setBackground(YELLOW);
        cardLengthTop.setBackground(YELLOW);
        cardLengthBottom.setBackground(YELLOW);
        cardVolumeTop.setBackground(YELLOW);
        cardVolumeBottom.setBackground(YELLOW);
        cardPressureTop.setBackground(YELLOW);
        cardPressureBottom.setBackground(YELLOW);
        cardFlowRateTop.setBackground(YELLOW);
        cardFlowRateBottom.setBackground(YELLOW);
        
        // Add and layout the Tab Panels to TabbedPane
        tabbedPane.add(LENGTHPANEL, cardLength);
        tabbedPane.addTab(VOLPANEL, cardVolume);
        tabbedPane.addTab(PRESSUREPANEL, cardPressure);
        tabbedPane.addTab(FLOWRATEPANEL, cardFlowRate);
        frame.add(tabbedPane, BorderLayout.CENTER);     
        
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }





	@Override
	public void valueChanged(ListSelectionEvent e) {
		// TODO Auto-generated method stub
		try {
			
			switch (tabbedPane.getSelectedIndex()) {
			case 0:				
				Length.convert(fieldLengthFrom, fieldLengthTo, listLengthFrom, listLengthTo);
				break;
				
			case 1:
				Volume.convert(fieldVolumeFrom, fieldVolumeTo, listVolumeFrom, listVolumeTo);
				break;
				
			case 2:
				Pressure.convert(fieldPressureFrom, fieldPressureTo, listPressureFrom, listPressureTo);
				break;
				
			case 3:
				FlowRate.convert(fieldFlowRateFrom, fieldFlowRateTo, listFlowRateFrom, listFlowRateTo);
				break;
			}

		} catch (Exception ex) {
			System.err.print(ex);
		}
	}

	

	@Override
	public void insertUpdate(DocumentEvent e) throws NumberFormatException {
		// TODO Auto-generated method stub
		try {
			
			switch (tabbedPane.getSelectedIndex()) {
			case 0:				
				Length.convert(fieldLengthFrom, fieldLengthTo, listLengthFrom, listLengthTo);
				break;
				
			case 1:
				Volume.convert(fieldVolumeFrom, fieldVolumeTo, listVolumeFrom, listVolumeTo);
				break;
				
			case 2:
				Pressure.convert(fieldPressureFrom, fieldPressureTo, listPressureFrom, listPressureTo);
				break;
				
			case 3:
				FlowRate.convert(fieldFlowRateFrom, fieldFlowRateTo, listFlowRateFrom, listFlowRateTo);
				break;
			}

		} catch (Exception ex) {
			System.err.print(ex);
		}
		
	}

	@Override
	public void removeUpdate(DocumentEvent e) {
		// TODO Auto-generated method stub
		try {
			
			switch (tabbedPane.getSelectedIndex()) {
			case 0:				
				Length.convert(fieldLengthFrom, fieldLengthTo, listLengthFrom, listLengthTo);
				break;
				
			case 1:
				Volume.convert(fieldVolumeFrom, fieldVolumeTo, listVolumeFrom, listVolumeTo);
				break;
				
			case 2:
				Pressure.convert(fieldPressureFrom, fieldPressureTo, listPressureFrom, listPressureTo);
				break;
				
			case 3:
				FlowRate.convert(fieldFlowRateFrom, fieldFlowRateTo, listFlowRateFrom, listFlowRateTo);
				break;
			}

		} catch (Exception ex) {
			System.err.print(ex);
		}
		
	}

	@Override
	public void changedUpdate(DocumentEvent e) {
		// TODO Auto-generated method stub
		try {
			
			switch (tabbedPane.getSelectedIndex()) {
			case 0:				
				Length.convert(fieldLengthFrom, fieldLengthTo, listLengthFrom, listLengthTo);
				break;
				
			case 1:
				Volume.convert(fieldVolumeFrom, fieldVolumeTo, listVolumeFrom, listVolumeTo);
				break;
				
			case 2:
				Pressure.convert(fieldPressureFrom, fieldPressureTo, listPressureFrom, listPressureTo);
				break;
				
			case 3:
				FlowRate.convert(fieldFlowRateFrom, fieldFlowRateTo, listFlowRateFrom, listFlowRateTo);
				break;
			}

		} catch (Exception ex) {
			System.err.print(ex);
		}
		
	}


}