package unitsconverter_v1_03;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JList;
import javax.swing.JTextField;

public class Volume {
	
	private static DecimalFormat df = new DecimalFormat("0.0000");
	
	public static void convert (JTextField fieldVolumeFrom, JTextField fieldVolumeTo, JList<String> listVolumeFrom, JList<String> listVolumeTo) {
		
		NumberFormat sciFormat = new DecimalFormat("0.####E0");
		
		// Calculations for Volume Tab
		Double fromVolumeValue = Double.parseDouble(fieldVolumeFrom.getText());
		Double toVolumeValue = fromVolumeValue;
		String selectedVolumeFrom = listVolumeFrom.getSelectedValue().toString();
		String selectedVolumeTo = listVolumeTo.getSelectedValue().toString();
		switch (selectedVolumeFrom) {
		case "Cubic meter (m\u00B3)":
			switch (selectedVolumeTo) {
				case "Cubic meter (m\u00B3)":
					toVolumeValue = fromVolumeValue;
					break;
				case "Cubic feet (ft\u00B3)":
					toVolumeValue = fromVolumeValue*35.3147;
					break;
				case "Cubic inch (in\u00B3)":
					toVolumeValue = fromVolumeValue*61023.7;
					break;
				case "Liter":
					toVolumeValue = fromVolumeValue*1000;
					break;
				case "Milliliter":
					toVolumeValue = fromVolumeValue*1E+6;
					break;
				case "Gallon (US)":
					toVolumeValue = fromVolumeValue*264.172;
					break;
				case "Quart":
					toVolumeValue = fromVolumeValue*1056.69;
					break;
				case "Million Liter":
					toVolumeValue = fromVolumeValue*1000/1E+6;
					break;
				default: 
					fieldVolumeTo.setText("Please select units.");
				}
			break;
		case "Cubic feet (ft\u00B3)":
			switch (selectedVolumeTo) {
				case "Cubic meter (m\u00B3)":
					toVolumeValue = fromVolumeValue/35.3147;
					break;
				case "Cubic feet (ft\u00B3)":
					toVolumeValue = fromVolumeValue*35.3147/35.3147;
					break;
				case "Cubic inch (in\u00B3)":
					toVolumeValue = fromVolumeValue*61023.7/35.3147;
					break;
				case "Liter":
					toVolumeValue = fromVolumeValue*1000/35.3147;
					break;
				case "Milliliter":
					toVolumeValue = fromVolumeValue*1E+6/35.3147;
					break;
				case "Gallon (US)":
					toVolumeValue = fromVolumeValue*264.172/35.3147;
					break;
				case "Quart":
					toVolumeValue = fromVolumeValue*1056.69/35.3147;
					break;
				case "Million Liter":
					toVolumeValue = fromVolumeValue*1000/35.3147/1E+6;
					break;
				default: 
					fieldVolumeTo.setText("Please select units.");
				}
			break;
		case "Cubic inch (in\u00B3)":
			switch (selectedVolumeTo) {
				case "Cubic meter (m\u00B3)":
					toVolumeValue = fromVolumeValue/61023.7;
					break;
				case "Cubic feet (ft\u00B3)":
					toVolumeValue = fromVolumeValue*35.3147/61023.7;
					break;
				case "Cubic inch (in\u00B3)":
					toVolumeValue = fromVolumeValue*61023.7/61023.7;
					break;
				case "Liter":
					toVolumeValue = fromVolumeValue*1000/61023.7;
					break;
				case "Milliliter":
					toVolumeValue = fromVolumeValue*1E+6/61023.7;
					break;
				case "Gallon (US)":
					toVolumeValue = fromVolumeValue*264.172/61023.7;
					break;
				case "Quart":
					toVolumeValue = fromVolumeValue*1056.69/61023.7;
					break;
				case "Million Liter":
					toVolumeValue = fromVolumeValue*1000/61023.7/1E+6;
				default: 
					fieldVolumeTo.setText("Please select units.");
				}
			break;
		case "Liter":
			switch (selectedVolumeTo) {
				case "Cubic meter (m\u00B3)":
					toVolumeValue = fromVolumeValue/1000;
					break;
				case "Cubic feet (ft\u00B3)":
					toVolumeValue = fromVolumeValue*35.3147/1000;
					break;
				case "Cubic inch (in\u00B3)":
					toVolumeValue = fromVolumeValue*61023.7/1000;
					break;
				case "Liter":
					toVolumeValue = fromVolumeValue*1000/1000;
					break;
				case "Milliliter":
					toVolumeValue = fromVolumeValue*1E+6/1000;
					break;
				case "Gallon (US)":
					toVolumeValue = fromVolumeValue*264.172/1000;
					break;
				case "Quart":
					toVolumeValue = fromVolumeValue*1056.69/1000;
					break;
				case "Million Liter":
					toVolumeValue = fromVolumeValue*1000/1000/1E+6;
					break;
				default: 
					fieldVolumeTo.setText("Please select units.");
				}
			break;
		case "Milliliter":
			switch (selectedVolumeTo) {
				case "Cubic meter (m\u00B3)":
					toVolumeValue = fromVolumeValue/1E+6;
					break;
				case "Cubic feet (ft\u00B3)":
					toVolumeValue = fromVolumeValue*35.3147/1E+6;
					break;
				case "Cubic inch (in\u00B3)":
					toVolumeValue = fromVolumeValue*61023.7/1E+6;
					break;
				case "Liter":
					toVolumeValue = fromVolumeValue*1000/1E+6;
					break;
				case "Milliliter":
					toVolumeValue = fromVolumeValue*1E+6/1E+6;
					break;
				case "Gallon (US)":
					toVolumeValue = fromVolumeValue*264.172/1E+6;
					break;
				case "Quart":
					toVolumeValue = fromVolumeValue*1056.69/1E+6;
					break;
				case "Million Liter":
					toVolumeValue = fromVolumeValue*1000/1E+6/1E+6;
				default: 
					fieldVolumeTo.setText("Please select units.");
				}
			break;
		case "Gallon (US)":
			switch (selectedVolumeTo) {
				case "Cubic meter (m\u00B3)":
					toVolumeValue = fromVolumeValue/264.172;
					break;
				case "Cubic feet (ft\u00B3)":
					toVolumeValue = fromVolumeValue*35.3147/264.172;
					break;
				case "Cubic inch (in\u00B3)":
					toVolumeValue = fromVolumeValue*61023.7/264.172;
					break;
				case "Liter":
					toVolumeValue = fromVolumeValue*1000/264.172;
					break;
				case "Milliliter":
					toVolumeValue = fromVolumeValue*1E+6/264.172;
					break;
				case "Gallon (US)":
					toVolumeValue = fromVolumeValue*264.172/264.172;
					break;
				case "Quart":
					toVolumeValue = fromVolumeValue*1056.69/264.172;
					break;
				case "Million Liter":
					toVolumeValue = fromVolumeValue*1000/264.172/1E+6;
					break;
				default: 
					fieldVolumeTo.setText("Please select units.");
				}
			break;
		case "Quart":
			switch (selectedVolumeTo) {
				case "Cubic meter (m\u00B3)":
					toVolumeValue = fromVolumeValue/1056.69;
					break;
				case "Cubic feet (ft\u00B3)":
					toVolumeValue = fromVolumeValue*35.3147/1056.69;
					break;
				case "Cubic inch (in\u00B3)":
					toVolumeValue = fromVolumeValue*61023.7/1056.69;
					break;
				case "Liter":
					toVolumeValue = fromVolumeValue*1000/1056.69;
					break;
				case "Milliliter":
					toVolumeValue = fromVolumeValue*1E+6/1056.69;
					break;
				case "Gallon (US)":
					toVolumeValue = fromVolumeValue*264.172/1056.69;
					break;
				case "Quart":
					toVolumeValue = fromVolumeValue*1056.69/1056.69;
					break;
				case "Million Liter":
					toVolumeValue = fromVolumeValue*1000/1056.69/1E+6;
					break;
				default: 
					fieldVolumeTo.setText("Please select units.");
				}
			break;
		case "Million Liter":
			switch (selectedVolumeTo) {
				case "Cubic meter (m\u00B3)":
					toVolumeValue = fromVolumeValue/1000*1E+6;
					break;
				case "Cubic feet (ft\u00B3)":
					toVolumeValue = fromVolumeValue*35.3147/1000*1E+6;
					break;
				case "Cubic inch (in\u00B3)":
					toVolumeValue = fromVolumeValue*61023.7/1000*1E+6;
					break;
				case "Liter":
					toVolumeValue = fromVolumeValue*1000/1000*1E+6;
					break;
				case "Milliliter":
					toVolumeValue = fromVolumeValue*1E+6/1000*1E+6;
					break;
				case "Gallon (US)":
					toVolumeValue = fromVolumeValue*264.172/1000*1E+6;
					break;
				case "Quart":
					toVolumeValue = fromVolumeValue*1056.69/1000*1E+6;
					break;
				case "Million Liter":
					toVolumeValue = fromVolumeValue*1000/1E+6/1000*1E+6;
					break;
				default: 
					fieldVolumeTo.setText("Please select units.");
				}
			break;
		}
		System.out.println("Converting from " + selectedVolumeFrom + " to " + selectedVolumeTo);
		if (toVolumeValue < 0.01) {
			fieldVolumeTo.setText((sciFormat.format(toVolumeValue)).toString());
		} else fieldVolumeTo.setText((df.format(toVolumeValue)).toString());
		
	}

}
