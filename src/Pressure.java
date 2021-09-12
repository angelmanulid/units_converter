package unitsconverter_v1_03;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JList;
import javax.swing.JTextField;

public class Pressure {
	
	private static DecimalFormat df = new DecimalFormat("0.0000");
	
	public static void convert (JTextField fieldPressureFrom, JTextField fieldPressureTo, JList<String> listPressureFrom, JList<String> listPressureTo) {
		
		NumberFormat sciFormat = new DecimalFormat("0.####E0");
		
		// Calculations for Pressure Tab
		Double fromPressureValue = Double.parseDouble(fieldPressureFrom.getText());
		Double toPressureValue = fromPressureValue;
		String selectedPressureFrom = listPressureFrom.getSelectedValue().toString();
		String selectedPressureTo = listPressureTo.getSelectedValue().toString();
		switch (selectedPressureFrom) {
		case "atm":
			switch (selectedPressureTo) {
				case "atm":
					toPressureValue = fromPressureValue;
					break;
				case "Pa":
				case "N/m\\u00B2":
					toPressureValue = fromPressureValue*101_325;
					break;
				case "kPa":
					toPressureValue = fromPressureValue*101.325;
					break;
				case "bar":
					toPressureValue = fromPressureValue*1.01325;
					break;
				case "Torr":
				case "mm Hg":
					toPressureValue = fromPressureValue*760;
					break;
				case "cm Hg":
					toPressureValue = fromPressureValue*76;
					break;
				case "in Hg":
					toPressureValue = fromPressureValue*29.92;
					break;
				case "psi":
					toPressureValue = fromPressureValue*14.7;
					break;
				case "ft H\u2082O at 39.1\u00B0F":
					toPressureValue = fromPressureValue*33.899;
					break;
				case "m H\u2082O":
					toPressureValue = fromPressureValue*10.33;
					break;
				default: 
					fieldPressureTo.setText("Please select units.");
				}
			break;
		case "Pa":
		case "N/m\u00B2":
			switch (selectedPressureTo) {
				case "atm":
					toPressureValue = fromPressureValue/101_325;
					break;
				case "Pa":
				case "N/m\u00B2":
					toPressureValue = fromPressureValue*101_325/101_325;
					break;
				case "kPa":
					toPressureValue = fromPressureValue*101.325/101_325;
					break;
				case "bar":
					toPressureValue = fromPressureValue*1.01325/101_325;
					break;
				case "Torr":
				case "mm Hg":
					toPressureValue = fromPressureValue*760/101_325;
					break;
				case "cm Hg":
					toPressureValue = fromPressureValue*76/101_325;
					break;
				case "in Hg":
					toPressureValue = fromPressureValue*29.92/101_325;
					break;
				case "psi":
					toPressureValue = fromPressureValue*14.7/101_325;
					break;
				case "ft H\u2082O at 39.1\u00B0F":
					toPressureValue = fromPressureValue*33.899/101_325;
					break;
				case "m H\u2082O":
					toPressureValue = fromPressureValue*10.33/101_325;
					break;
				default: 
					fieldPressureTo.setText("Please select units.");
				}
			break;
		case "bar":
			switch (selectedPressureTo) {
				case "atm":
					toPressureValue = fromPressureValue/1.01325;
					break;
				case "Pa":
				case "N/m\u00B2":
					toPressureValue = fromPressureValue*101_325/1.01325;
					break;
				case "kPa":
					toPressureValue = fromPressureValue*101.325/1.01325;
					break;
				case "bar":
					toPressureValue = fromPressureValue*1.01325/1.01325;
					break;
				case "Torr":
				case "mm Hg":
					toPressureValue = fromPressureValue*760/1.01325;
					break;
				case "cm Hg":
					toPressureValue = fromPressureValue*76/1.01325;
					break;
				case "in Hg":
					toPressureValue = fromPressureValue*29.92/1.01325;
					break;
				case "psi":
					toPressureValue = fromPressureValue*14.7/1.01325;
					break;
				case "ft H\u2082O at 39.1\u00B0F":
					toPressureValue = fromPressureValue*33.899/1.01325;
					break;
				case "m H\u2082O":
					toPressureValue = fromPressureValue*10.33/1.01325;
					break;
				default: 
					fieldPressureTo.setText("Please select units.");
				}
			break;
		case "Torr":
		case "mm Hg":
			switch (selectedPressureTo) {
				case "atm":
					toPressureValue = fromPressureValue/760;
					break;
				case "Pa":
				case "N/m\u00B2":
					toPressureValue = fromPressureValue*101_325/760;
					break;
				case "kPa":
					toPressureValue = fromPressureValue*101.325/760;
					break;
				case "bar":
					toPressureValue = fromPressureValue*1.01325/760;
					break;
				case "Torr":
				case "mm Hg":
					toPressureValue = fromPressureValue*760/760;
					break;
				case "cm Hg":
					toPressureValue = fromPressureValue*76/760;
					break;
				case "in Hg":
					toPressureValue = fromPressureValue*29.92/760;
					break;
				case "psi":
					toPressureValue = fromPressureValue*14.7/760;
					break;
				case "ft H\u2082O at 39.1\u00B0F":
					toPressureValue = fromPressureValue*33.899/760;
					break;
				case "m H\u2082O":
					toPressureValue = fromPressureValue*10.33/760;
					break;
				default: 
					fieldPressureTo.setText("Please select units.");
				}
			break;
		case "cm Hg":
			switch (selectedPressureTo) {
				case "atm":
					toPressureValue = fromPressureValue/76;
					break;
				case "Pa":
				case "N/m\u00B2":
					toPressureValue = fromPressureValue*101_325/76;
					break;
				case "kPa":
					toPressureValue = fromPressureValue*101.325/76;
					break;
				case "bar":
					toPressureValue = fromPressureValue*1.01325/76;
					break;
				case "Torr":
				case "mm Hg":
					toPressureValue = fromPressureValue*760/76;
					break;
				case "cm Hg":
					toPressureValue = fromPressureValue*76/76;
					break;
				case "in Hg":
					toPressureValue = fromPressureValue*29.92/76;
					break;
				case "psi":
					toPressureValue = fromPressureValue*14.7/76;
					break;
				case "ft H\u2082O at 39.1\u00B0F":
					toPressureValue = fromPressureValue*33.899/76;
					break;
				case "m H\u2082O":
					toPressureValue = fromPressureValue*10.33;
					break;
				default: 
					fieldPressureTo.setText("Please select units.");
				}
			break;
		case "in Hg":
			switch (selectedPressureTo) {
				case "atm":
					toPressureValue = fromPressureValue/29.92;
					break;
				case "Pa":
				case "N/m\\u00B2":
					toPressureValue = fromPressureValue*101_325/29.92;
					break;
				case "kPa":
					toPressureValue = fromPressureValue*101.325/29.92;
					break;
				case "bar":
					toPressureValue = fromPressureValue*1.01325/29.92;
					break;
				case "Torr":
				case "mm Hg":
					toPressureValue = fromPressureValue*760/29.92;
					break;
				case "cm Hg":
					toPressureValue = fromPressureValue*76/29.92;
					break;
				case "in Hg":
					toPressureValue = fromPressureValue*29.92/29.92;
					break;
				case "psi":
					toPressureValue = fromPressureValue*14.7/29.92;
					break;
				case "ft H\u2082O at 39.1\u00B0F":
					toPressureValue = fromPressureValue*33.899/29.92;
					break;
				case "m H\u2082O":
					toPressureValue = fromPressureValue*10.33/29.92;
					break;
				default: 
					fieldPressureTo.setText("Please select units.");
				}
			break;
		case "psi":
			switch (selectedPressureTo) {
				case "atm":
					toPressureValue = fromPressureValue/14.7;
					break;
				case "Pa":
				case "N/m\\u00B2":
					toPressureValue = fromPressureValue*101_325/14.7;
					break;
				case "kPa":
					toPressureValue = fromPressureValue*101.325/14.7;
					break;
				case "bar":
					toPressureValue = fromPressureValue*1.01325/14.7;
					break;
				case "Torr":
				case "mm Hg":
					toPressureValue = fromPressureValue*760/14.7;
					break;
				case "cm Hg":
					toPressureValue = fromPressureValue*76/14.7;
					break;
				case "in Hg":
					toPressureValue = fromPressureValue*29.92/14.7;
					break;
				case "psi":
					toPressureValue = fromPressureValue*14.7/14.7;
					break;
				case "ft H\u2082O at 39.1\u00B0F":
					toPressureValue = fromPressureValue*33.899/14.7;
					break;
				case "m H\u2082O":
					toPressureValue = fromPressureValue*10.33/14.7;
					break;
				default: 
					fieldPressureTo.setText("Please select units.");
				}
			break;
		case "ft H\u2082O at 39.1\u00B0F":
			switch (selectedPressureTo) {
				case "atm":
					toPressureValue = fromPressureValue/33.899;
					break;
				case "Pa":
				case "N/m\\u00B2":
					toPressureValue = fromPressureValue*101_325/33.899;
					break;
				case "kPa":
					toPressureValue = fromPressureValue*101.325/33.899;
					break;
				case "bar":
					toPressureValue = fromPressureValue*1.01325/33.899;
					break;
				case "Torr":
				case "mm Hg":
					toPressureValue = fromPressureValue*760/33.899;
					break;
				case "cm Hg":
					toPressureValue = fromPressureValue*76/33.899;
					break;
				case "in Hg":
					toPressureValue = fromPressureValue*29.92/33.899;
					break;
				case "psi":
					toPressureValue = fromPressureValue*14.7/33.899;
					break;
				case "ft H\u2082O at 39.1\u00B0F":
					toPressureValue = fromPressureValue*33.899/33.899;
					break;
				case "m H\u2082O":
					toPressureValue = fromPressureValue*10.33/33.899;
					break;
				default: 
					fieldPressureTo.setText("Please select units.");
				}
			break;
		case "m H\u2082O":
			switch (selectedPressureTo) {
				case "atm":
					toPressureValue = fromPressureValue/10.33;
					break;
				case "Pa":
				case "N/m\\u00B2":
					toPressureValue = fromPressureValue*101_325/10.33;
					break;
				case "kPa":
					toPressureValue = fromPressureValue*101.325/10.33;
					break;
				case "bar":
					toPressureValue = fromPressureValue*1.01325/10.33;
					break;
				case "Torr":
				case "mm Hg":
					toPressureValue = fromPressureValue*760/10.33;
					break;
				case "cm Hg":
					toPressureValue = fromPressureValue*76/10.33;
					break;
				case "in Hg":
					toPressureValue = fromPressureValue*29.92/10.33;
					break;
				case "psi":
					toPressureValue = fromPressureValue*14.7/10.33;
					break;
				case "ft H\u2082O at 39.1\u00B0F":
					toPressureValue = fromPressureValue*33.899/10.33;
					break;
				case "m H\u2082O":
					toPressureValue = fromPressureValue*10.33/10.33;
					break;
				default: 
					fieldPressureTo.setText("Please select units.");
				}
			break;
		}
		
		System.out.println("Converting from " + selectedPressureFrom + " to " + selectedPressureTo);
		if (toPressureValue < 0.01) {
			fieldPressureTo.setText((sciFormat.format(toPressureValue)).toString());
		} else fieldPressureTo.setText((df.format(toPressureValue)).toString());
	}

}
