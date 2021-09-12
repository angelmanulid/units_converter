package unitsconverter_v1_03;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JList;
import javax.swing.JTextField;

public class Length {
	
	private static DecimalFormat df = new DecimalFormat("0.0000");
	
	public static void convert (JTextField fieldLengthFrom, JTextField fieldLengthTo, JList<String> listLengthFrom, JList<String> listLengthTo) {
		
		NumberFormat sciFormat = new DecimalFormat("0.####E0");
		
		// Calculations for Length Tab
		Double fromLengthValue = Double.parseDouble(fieldLengthFrom.getText());
		Double toLengthValue = fromLengthValue;
		String selectedLengthFrom = listLengthFrom.getSelectedValue().toString();
		String selectedLengthTo = listLengthTo.getSelectedValue().toString();
		switch (selectedLengthFrom) {
			case "Meter":
				switch (selectedLengthTo) {
					case "Meter":
						toLengthValue = fromLengthValue;
						break;
					case "Kilometer":
						toLengthValue = fromLengthValue/1000;
						break;
					case "Centimeter":
						toLengthValue = fromLengthValue*100;
						break;
					case "Millimeter":
						toLengthValue = fromLengthValue*1000;
						break;
					case "Micrometer":
						toLengthValue = fromLengthValue*1E+6;
						break;
					case "Nanometer":
						toLengthValue = fromLengthValue*1E+9;
						break;
					case "Mile":
						toLengthValue = fromLengthValue/1609.34;
						break;
					case "Yard":
						toLengthValue = fromLengthValue/(0.3048*3);
						break;
					case "Foot":
						toLengthValue = fromLengthValue/0.3048;
						break;
					case "Inch":
						toLengthValue = fromLengthValue/0.0254;
						break;
					default: 
						fieldLengthTo.setText("Please select units.");
					}
				break;
			case "Kilometer":
				switch (selectedLengthTo) {
					case "Meter":
						toLengthValue = fromLengthValue*1000;
						break;
					case "Kilometer":
						toLengthValue = fromLengthValue/1000*1000;
						break;
					case "Centimeter":
						toLengthValue = fromLengthValue*100*1000;
						break;
					case "Millimeter":
						toLengthValue = fromLengthValue*1000*1000;
						break;
					case "Micrometer":
						toLengthValue = fromLengthValue*1E+6*1000;
						break;
					case "Nanometer":
						toLengthValue = fromLengthValue*1E+9*1000;
						break;
					case "Mile":
						toLengthValue = fromLengthValue/1609.34*1000;
						break;
					case "Yard":
						toLengthValue = fromLengthValue/(0.3048*3)*1000;
						break;
					case "Foot":
						toLengthValue = fromLengthValue/0.3048*1000;
						break;
					case "Inch":
						toLengthValue = fromLengthValue/0.0254*1000;
						break;
					default: 
						fieldLengthTo.setText("Please select units.");
					}
				break;
			case "Centimeter":
				switch (selectedLengthTo) {
					case "Meter":
						toLengthValue = fromLengthValue/100;
						break;
					case "Kilometer":
						toLengthValue = fromLengthValue/1000/100;
						break;
					case "Centimeter":
						toLengthValue = fromLengthValue*100/100;
						break;
					case "Millimeter":
						toLengthValue = fromLengthValue*1000/100;
						break;
					case "Micrometer":
						toLengthValue = fromLengthValue*1E+6/100;
						break;
					case "Nanometer":
						toLengthValue = fromLengthValue*1E+9/100;
						break;
					case "Mile":
						toLengthValue = fromLengthValue/1609.34/100;
						break;
					case "Yard":
						toLengthValue = fromLengthValue/(0.3048*3)/100;
						break;
					case "Foot":
						toLengthValue = fromLengthValue/0.3048/100;
						break;
					case "Inch":
						toLengthValue = fromLengthValue/0.0254/100;
						break;
					default: 
						fieldLengthTo.setText("Please select units.");
					}
				break;
			case "Millimeter":
				switch (selectedLengthTo) {
					case "Meter":
						toLengthValue = fromLengthValue/1000;
						break;
					case "Kilometer":
						toLengthValue = fromLengthValue/1000/1000;
						break;
					case "Centimeter":
						toLengthValue = fromLengthValue*100/1000;
						break;
					case "Millimeter":
						toLengthValue = fromLengthValue*1000/1000;
						break;
					case "Micrometer":
						toLengthValue = fromLengthValue*1E+6/1000;
						break;
					case "Nanometer":
						toLengthValue = fromLengthValue*1E+9/1000;
						break;
					case "Mile":
						toLengthValue = fromLengthValue/1609.34/1000;
						break;
					case "Yard":
						toLengthValue = fromLengthValue/(0.3048*3)/1000;
						break;
					case "Foot":
						toLengthValue = fromLengthValue/0.3048/1000;
						break;
					case "Inch":
						toLengthValue = fromLengthValue/0.0254/1000;
						break;
					default: 
						fieldLengthTo.setText("Please select units.");
					}
				break;
			case "Micrometer":
				switch (selectedLengthTo) {
					case "Meter":
						toLengthValue = fromLengthValue/1E+6;
						break;
					case "Kilometer":
						toLengthValue = fromLengthValue/1000/1E+6;
						break;
					case "Centimeter":
						toLengthValue = fromLengthValue*100/1E+6;
						break;
					case "Millimeter":
						toLengthValue = fromLengthValue*1000/1E+6;
						break;
					case "Micrometer":
						toLengthValue = fromLengthValue*1E+6/1E+6;
						break;
					case "Nanometer":
						toLengthValue = fromLengthValue*1E+9/1E+6;
						break;
					case "Mile":
						toLengthValue = fromLengthValue/1609.34/1E+6;
						break;
					case "Yard":
						toLengthValue = fromLengthValue/(0.3048*3)/1E+6;
						break;
					case "Foot":
						toLengthValue = fromLengthValue/0.3048/1E+6;
						break;
					case "Inch":
						toLengthValue = fromLengthValue/0.0254/1E+6;
						break;
					default: 
						fieldLengthTo.setText("Please select units.");
					}
				break;
			case "Nanometer":
				switch (selectedLengthTo) {
					case "Meter":
						toLengthValue = fromLengthValue/1E+9;
						break;
					case "Kilometer":
						toLengthValue = fromLengthValue/1000/1E+9;
						break;
					case "Centimeter":
						toLengthValue = fromLengthValue*100/1E+9;
						break;
					case "Millimeter":
						toLengthValue = fromLengthValue*1000/1E+9;
						break;
					case "Micrometer":
						toLengthValue = fromLengthValue*1E+6/1E+9;
						break;
					case "Nanometer":
						toLengthValue = fromLengthValue*1E+9/1E+9;
						break;
					case "Mile":
						toLengthValue = fromLengthValue/1609.34/1E+9;
						break;
					case "Yard":
						toLengthValue = fromLengthValue/(0.3048*3)/1E+9;
						break;
					case "Foot":
						toLengthValue = fromLengthValue/0.3048/1E+9;
						break;
					case "Inch":
						toLengthValue = fromLengthValue/0.0254/1E+9;
						break;
					default: 
						fieldLengthTo.setText("Please select units.");
					}
				break;
			case "Mile":
				switch (selectedLengthTo) {
					case "Meter":
						toLengthValue = fromLengthValue*1609.34;
						break;
					case "Kilometer":
						toLengthValue = fromLengthValue/1000*1609.34;
						break;
					case "Centimeter":
						toLengthValue = fromLengthValue*100*1609.34;
						break;
					case "Millimeter":
						toLengthValue = fromLengthValue*1000*1609.34;
						break;
					case "Micrometer":
						toLengthValue = fromLengthValue*1E+6*1609.34;
						break;
					case "Nanometer":
						toLengthValue = fromLengthValue*1E+9*1609.34;
						break;
					case "Mile":
						toLengthValue = fromLengthValue/1609.34*1609.34;
						break;
					case "Yard":
						toLengthValue = fromLengthValue/(0.3048*3)*1609.34;
						break;
					case "Foot":
						toLengthValue = fromLengthValue/0.3048*1609.34;
						break;
					case "Inch":
						toLengthValue = fromLengthValue/0.0254*1609.34;
						break;
					default: 
						fieldLengthTo.setText("Please select units.");
					}
				break;
			case "Yard":
				switch (selectedLengthTo) {
					case "Meter":
						toLengthValue = fromLengthValue*(0.3048*3);
						break;
					case "Kilometer":
						toLengthValue = fromLengthValue/1000*(0.3048*3);
						break;
					case "Centimeter":
						toLengthValue = fromLengthValue*100*(0.3048*3);
						break;
					case "Millimeter":
						toLengthValue = fromLengthValue*1000*(0.3048*3);
						break;
					case "Micrometer":
						toLengthValue = fromLengthValue*1E+6*(0.3048*3);
						break;
					case "Nanometer":
						toLengthValue = fromLengthValue*1E+9*(0.3048*3);
						break;
					case "Mile":
						toLengthValue = fromLengthValue/1609.34*(0.3048*3);
						break;
					case "Yard":
						toLengthValue = fromLengthValue;
						break;
					case "Foot":
						toLengthValue = fromLengthValue/0.3048*(0.3048*3);
						break;
					case "Inch":
						toLengthValue = fromLengthValue/0.0254*(0.3048*3);
						break;
					default: 
						fieldLengthTo.setText("Please select units.");
					}
				break;
			case "Foot":
				switch (selectedLengthTo) {
					case "Meter":
						toLengthValue = fromLengthValue*0.3048;
						break;
					case "Kilometer":
						toLengthValue = fromLengthValue/1000*0.3048;
						break;
					case "Centimeter":
						toLengthValue = fromLengthValue*100*0.3048;
						break;
					case "Millimeter":
						toLengthValue = fromLengthValue*1000*0.3048;
						break;
					case "Micrometer":
						toLengthValue = fromLengthValue*1E+6*0.3048;
						break;
					case "Nanometer":
						toLengthValue = fromLengthValue*1E+9*0.3048;
						break;
					case "Mile":
						toLengthValue = fromLengthValue/1609.34*0.3048;
						break;
					case "Yard":
						toLengthValue = fromLengthValue/(0.3048*3)*0.3048;
						break;
					case "Foot":
						toLengthValue = fromLengthValue;
						break;
					case "Inch":
						toLengthValue = fromLengthValue/0.0254*0.3048;
						break;
					default: 
						fieldLengthTo.setText("Please select units.");
					}
				break;
			case "Inch":
				switch (selectedLengthTo) {
					case "Meter":
						toLengthValue = fromLengthValue*0.0254;
						break;
					case "Kilometer":
						toLengthValue = fromLengthValue/1000*0.0254;
						break;
					case "Centimeter":
						toLengthValue = fromLengthValue*100*0.0254;
						break;
					case "Millimeter":
						toLengthValue = fromLengthValue*1000*0.0254;
						break;
					case "Micrometer":
						toLengthValue = fromLengthValue*1E+6*0.0254;
						break;
					case "Nanometer":
						toLengthValue = fromLengthValue*1E+9*0.0254;
						break;
					case "Mile":
						toLengthValue = fromLengthValue/1609.34*0.0254;
						break;
					case "Yard":
						toLengthValue = fromLengthValue/(0.3048*3)*0.0254;
						break;
					case "Foot":
						toLengthValue = fromLengthValue/0.3048*0.0254;
						break;
					case "Inch":
						toLengthValue = fromLengthValue/0.0254*0.0254;
						break;
					default: 
						fieldLengthTo.setText("Please select units.");
					}
				break;
			}
		System.out.println("Converting from " + selectedLengthFrom + " to " + selectedLengthTo);
		if (fieldLengthFrom.getText().isEmpty()) {
			fieldLengthTo.setText("");
		}
		
		if (toLengthValue < 0.01) {
			fieldLengthTo.setText((sciFormat.format(toLengthValue)).toString());
		} else fieldLengthTo.setText((df.format(toLengthValue)).toString());

	}

}
