package unitsconverter_v1_03;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JList;
import javax.swing.JTextField;

public class FlowRate {
	
	private static DecimalFormat df = new DecimalFormat("0.0000");
	
	public static void convert (JTextField fieldFlowRateFrom, JTextField fieldFlowRateTo, JList<String> listFlowRateFrom, JList<String> listFlowRateTo) {
		
		NumberFormat sciFormat = new DecimalFormat("0.####E0");
		
		// Calculations for Flow Rate Tab
					Double fromFlowRateValue = Double.parseDouble(fieldFlowRateFrom.getText());
					Double toFlowRateValue = fromFlowRateValue;
					String selectedFlowRateFrom = listFlowRateFrom.getSelectedValue().toString();
					String selectedFlowRateTo = listFlowRateTo.getSelectedValue().toString();
					switch (selectedFlowRateFrom) {
					case "m\u00B3/s":
						switch (selectedFlowRateTo) {
							case "m\u00B3/s":
								toFlowRateValue = fromFlowRateValue;
								break;
							case "m\u00B3/min":
								toFlowRateValue = fromFlowRateValue*60;
								break;
							case "m\u00B3/hr":
								toFlowRateValue = fromFlowRateValue*3600;
								break;
							case "ft\u00B3/s":
								toFlowRateValue = fromFlowRateValue*35.3147;
								break;
							case "ft\u00B3/min":
								toFlowRateValue = fromFlowRateValue*2118.882;
								break;
							case "ft\u00B3/hr":
								toFlowRateValue = fromFlowRateValue*127_132.92;
								break;
							case "gal/s (gps)":
								toFlowRateValue = fromFlowRateValue*264.172;
								break;
							case "gal/min (gpm)":
								toFlowRateValue = fromFlowRateValue*264.172*60;
								break;
							case "gal/hr (gph)":
								toFlowRateValue = fromFlowRateValue*264.172*3600;
								break;
							case "L/s":
								toFlowRateValue = fromFlowRateValue*1000;
								break;
							case "L/min":
								toFlowRateValue = fromFlowRateValue*1000*60;
								break;
							case "L/hr":
								toFlowRateValue = fromFlowRateValue*1000*3600;
								break;
							case "ML/day":
								toFlowRateValue = fromFlowRateValue*86.4;
								break;
							default: 
								fieldFlowRateTo.setText("Please select units.");
							}
						break;
					case "m\u00B3/min":
						switch (selectedFlowRateTo) {
							case "m\u00B3/s":
								toFlowRateValue = fromFlowRateValue/60;
								break;
							case "m\u00B3/min":
								toFlowRateValue = fromFlowRateValue*60/60;
								break;
							case "m\u00B3/hr":
								toFlowRateValue = fromFlowRateValue*3600/60;
								break;
							case "ft\u00B3/s":
								toFlowRateValue = fromFlowRateValue*35.3147/60;
								break;
							case "ft\u00B3/min":
								toFlowRateValue = fromFlowRateValue*2118.882/60;
								break;
							case "ft\u00B3/hr":
								toFlowRateValue = fromFlowRateValue*127_132.92/60;
								break;
							case "gal/s (gps)":
								toFlowRateValue = fromFlowRateValue*264.172/60;
								break;
							case "gal/min (gpm)":
								toFlowRateValue = fromFlowRateValue*264.172*60/60;
								break;
							case "gal/hr (gph)":
								toFlowRateValue = fromFlowRateValue*264.172*3600/60;
								break;
							case "L/s":
								toFlowRateValue = fromFlowRateValue*1000/60;
								break;
							case "L/min":
								toFlowRateValue = fromFlowRateValue*1000*60/60;
								break;
							case "L/hr":
								toFlowRateValue = fromFlowRateValue*1000*3600/60;
								break;
							case "ML/day":
								toFlowRateValue = fromFlowRateValue*86.4/60;
								break;
							default: 
								fieldFlowRateTo.setText("Please select units.");
							}
						break;
					case "m\u00B3/hr":
						switch (selectedFlowRateTo) {
							case "m\u00B3/s":
								toFlowRateValue = fromFlowRateValue/3600;
								break;
							case "m\u00B3/min":
								toFlowRateValue = fromFlowRateValue*60/3600;
								break;
							case "m\u00B3/hr":
								toFlowRateValue = fromFlowRateValue*3600/3600;
								break;
							case "ft\u00B3/s":
								toFlowRateValue = fromFlowRateValue*35.3147/3600;
								break;
							case "ft\u00B3/min":
								toFlowRateValue = fromFlowRateValue*2118.882/3600;
								break;
							case "ft\u00B3/hr":
								toFlowRateValue = fromFlowRateValue*127_132.92/3600;
								break;
							case "gal/s (gps)":
								toFlowRateValue = fromFlowRateValue*264.172/3600;
								break;
							case "gal/min (gpm)":
								toFlowRateValue = fromFlowRateValue*264.172*60/3600;
								break;
							case "gal/hr (gph)":
								toFlowRateValue = fromFlowRateValue*264.172*3600/3600;
								break;
							case "L/s":
								toFlowRateValue = fromFlowRateValue*1000/3600;
								break;
							case "L/min":
								toFlowRateValue = fromFlowRateValue*1000*60/3600;
								break;
							case "L/hr":
								toFlowRateValue = fromFlowRateValue*1000*3600/3600;
								break;
							case "ML/day":
								toFlowRateValue = fromFlowRateValue*86.4/3600;
								break;
							default: 
								fieldFlowRateTo.setText("Please select units.");
							}
						break;
					case "ft\u00B3/s":
						switch (selectedFlowRateTo) {
							case "m\u00B3/s":
								toFlowRateValue = fromFlowRateValue/35.3147;
								break;
							case "m\u00B3/min":
								toFlowRateValue = fromFlowRateValue*60/35.3147;
								break;
							case "m\u00B3/hr":
								toFlowRateValue = fromFlowRateValue*3600/35.3147;
								break;
							case "ft\u00B3/s":
								toFlowRateValue = fromFlowRateValue*35.3147/35.3147;
								break;
							case "ft\u00B3/min":
								toFlowRateValue = fromFlowRateValue*2118.882/35.3147;
								break;
							case "ft\u00B3/hr":
								toFlowRateValue = fromFlowRateValue*127_132.92/35.3147;
								break;
							case "gal/s (gps)":
								toFlowRateValue = fromFlowRateValue*264.172/35.3147;
								break;
							case "gal/min (gpm)":
								toFlowRateValue = fromFlowRateValue*264.172*60/35.3147;
								break;
							case "gal/hr (gph)":
								toFlowRateValue = fromFlowRateValue*264.172*3600/35.3147;
								break;
							case "L/s":
								toFlowRateValue = fromFlowRateValue*1000/35.3147;
								break;
							case "L/min":
								toFlowRateValue = fromFlowRateValue*1000*60/35.3147;
								break;
							case "L/hr":
								toFlowRateValue = fromFlowRateValue*1000*3600/35.3147;
								break;
							case "ML/day":
								toFlowRateValue = fromFlowRateValue*86.4/35.3147;
								break;
							default: 
								fieldFlowRateTo.setText("Please select units.");
							}
						break;
					case "ft\u00B3/min":
						switch (selectedFlowRateTo) {
							case "m\u00B3/s":
								toFlowRateValue = fromFlowRateValue/2118.882;
								break;
							case "m\u00B3/min":
								toFlowRateValue = fromFlowRateValue*60/2118.882;
								break;
							case "m\u00B3/hr":
								toFlowRateValue = fromFlowRateValue*3600/2118.882;
								break;
							case "ft\u00B3/s":
								toFlowRateValue = fromFlowRateValue*35.3147/2118.882;
								break;
							case "ft\u00B3/min":
								toFlowRateValue = fromFlowRateValue*2118.882/2118.882;
								break;
							case "ft\u00B3/hr":
								toFlowRateValue = fromFlowRateValue*127_132.92/2118.882;
								break;
							case "gal/s (gps)":
								toFlowRateValue = fromFlowRateValue*264.172/2118.882;
								break;
							case "gal/min (gpm)":
								toFlowRateValue = fromFlowRateValue*264.172*60/2118.882;
								break;
							case "gal/hr (gph)":
								toFlowRateValue = fromFlowRateValue*264.172*3600/2118.882;
								break;
							case "L/s":
								toFlowRateValue = fromFlowRateValue*1000/2118.882;
								break;
							case "L/min":
								toFlowRateValue = fromFlowRateValue*1000*60/2118.882;
								break;
							case "L/hr":
								toFlowRateValue = fromFlowRateValue*1000*3600/2118.882;
								break;
							case "ML/day":
								toFlowRateValue = fromFlowRateValue*86.4/2118.882;
								break;
							default: 
								fieldFlowRateTo.setText("Please select units.");
							}
						break;
					case "ft\u00B3/hr":
						switch (selectedFlowRateTo) {
							case "m\u00B3/s":
								toFlowRateValue = fromFlowRateValue/127_132.92;
								break;
							case "m\u00B3/min":
								toFlowRateValue = fromFlowRateValue*60/127_132.92;
								break;
							case "m\u00B3/hr":
								toFlowRateValue = fromFlowRateValue*3600/127_132.92;
								break;
							case "ft\u00B3/s":
								toFlowRateValue = fromFlowRateValue*35.3147/127_132.92;
								break;
							case "ft\u00B3/min":
								toFlowRateValue = fromFlowRateValue*2118.882/127_132.92;
								break;
							case "ft\u00B3/hr":
								toFlowRateValue = fromFlowRateValue*127_132.92/127_132.92;
								break;
							case "gal/s (gps)":
								toFlowRateValue = fromFlowRateValue*264.172/127_132.92;
								break;
							case "gal/min (gpm)":
								toFlowRateValue = fromFlowRateValue*264.172*60/127_132.92;
								break;
							case "gal/hr (gph)":
								toFlowRateValue = fromFlowRateValue*264.172*3600/127_132.92;
								break;
							case "L/s":
								toFlowRateValue = fromFlowRateValue*1000/127_132.92;
								break;
							case "L/min":
								toFlowRateValue = fromFlowRateValue*1000*60/127_132.92;
								break;
							case "L/hr":
								toFlowRateValue = fromFlowRateValue*1000*3600/127_132.92;
								break;
							case "ML/day":
								toFlowRateValue = fromFlowRateValue*86.4/127_132.92;
								break;
							default: 
								fieldFlowRateTo.setText("Please select units.");
							}
						break;
					case "gal/s (gps)":
						switch (selectedFlowRateTo) {
							case "m\u00B3/s":
								toFlowRateValue = fromFlowRateValue/264.172;
								break;
							case "m\u00B3/min":
								toFlowRateValue = fromFlowRateValue*60/264.172;
								break;
							case "m\u00B3/hr":
								toFlowRateValue = fromFlowRateValue*3600/264.172;
								break;
							case "ft\u00B3/s":
								toFlowRateValue = fromFlowRateValue*35.3147/264.172;
								break;
							case "ft\u00B3/min":
								toFlowRateValue = fromFlowRateValue*2118.882/264.172;
								break;
							case "ft\u00B3/hr":
								toFlowRateValue = fromFlowRateValue*127_132.92/264.172;
								break;
							case "gal/s (gps)":
								toFlowRateValue = fromFlowRateValue*264.172/264.172;
								break;
							case "gal/min (gpm)":
								toFlowRateValue = fromFlowRateValue*264.172*60/264.172;
								break;
							case "gal/hr (gph)":
								toFlowRateValue = fromFlowRateValue*264.172*3600/264.172;
								break;
							case "L/s":
								toFlowRateValue = fromFlowRateValue*1000/264.172;
								break;
							case "L/min":
								toFlowRateValue = fromFlowRateValue*1000*60/264.172;
								break;
							case "L/hr":
								toFlowRateValue = fromFlowRateValue*1000*3600/264.172;
								break;
							case "ML/day":
								toFlowRateValue = fromFlowRateValue*86.4/264.172;
								break;
							default: 
								fieldFlowRateTo.setText("Please select units.");
							}
						break;
					case "gal/min (gpm)":
						switch (selectedFlowRateTo) {
							case "m\u00B3/s":
								toFlowRateValue = fromFlowRateValue/264.172/60;
								break;
							case "m\u00B3/min":
								toFlowRateValue = fromFlowRateValue*60/264.172/60;
								break;
							case "m\u00B3/hr":
								toFlowRateValue = fromFlowRateValue*3600/264.172/60;
								break;
							case "ft\u00B3/s":
								toFlowRateValue = fromFlowRateValue*35.3147/264.172/60;
								break;
							case "ft\u00B3/min":
								toFlowRateValue = fromFlowRateValue*2118.882/264.172/60;
								break;
							case "ft\u00B3/hr":
								toFlowRateValue = fromFlowRateValue*127_132.92/264.172/60;
								break;
							case "gal/s (gps)":
								toFlowRateValue = fromFlowRateValue*264.172/264.172/60;
								break;
							case "gal/min (gpm)":
								toFlowRateValue = fromFlowRateValue*264.172*60/264.172/60;
								break;
							case "gal/hr (gph)":
								toFlowRateValue = fromFlowRateValue*264.172*3600/264.172/60;
								break;
							case "L/s":
								toFlowRateValue = fromFlowRateValue*1000/264.172/60;
								break;
							case "L/min":
								toFlowRateValue = fromFlowRateValue*1000*60/264.172/60;
								break;
							case "L/hr":
								toFlowRateValue = fromFlowRateValue*1000*3600/264.172/60;
								break;
							case "ML/day":
								toFlowRateValue = fromFlowRateValue*86.4/264.172/60;
								break;
							default: 
								fieldFlowRateTo.setText("Please select units.");
							}
						break;
					case "gal/hr (gph)":
						switch (selectedFlowRateTo) {
							case "m\u00B3/s":
								toFlowRateValue = fromFlowRateValue/264.172/3600;
								break;
							case "m\u00B3/min":
								toFlowRateValue = fromFlowRateValue*60/264.172/3600;
								break;
							case "m\u00B3/hr":
								toFlowRateValue = fromFlowRateValue*3600/264.172/3600;
								break;
							case "ft\u00B3/s":
								toFlowRateValue = fromFlowRateValue*35.3147/264.172/3600;
								break;
							case "ft\u00B3/min":
								toFlowRateValue = fromFlowRateValue*2118.882/264.172/3600;
								break;
							case "ft\u00B3/hr":
								toFlowRateValue = fromFlowRateValue*127_132.92/264.172/3600;
								break;
							case "gal/s (gps)":
								toFlowRateValue = fromFlowRateValue*264.172/264.172/3600;
								break;
							case "gal/min (gpm)":
								toFlowRateValue = fromFlowRateValue*264.172*60/264.172/3600;
								break;
							case "gal/hr (gph)":
								toFlowRateValue = fromFlowRateValue*264.172*3600/264.172/3600;
								break;
							case "L/s":
								toFlowRateValue = fromFlowRateValue*1000/264.172/3600;
								break;
							case "L/min":
								toFlowRateValue = fromFlowRateValue*1000*60/264.172/3600;
								break;
							case "L/hr":
								toFlowRateValue = fromFlowRateValue*1000*3600/264.172/3600;
								break;
							case "ML/day":
								toFlowRateValue = fromFlowRateValue*86.4/264.172/3600;
								break;
							default: 
								fieldFlowRateTo.setText("Please select units.");
							}
						break;
					case "L/s":
						switch (selectedFlowRateTo) {
							case "m\u00B3/s":
								toFlowRateValue = fromFlowRateValue/1000;
								break;
							case "m\u00B3/min":
								toFlowRateValue = fromFlowRateValue*60/1000;
								break;
							case "m\u00B3/hr":
								toFlowRateValue = fromFlowRateValue*3600/1000;
								break;
							case "ft\u00B3/s":
								toFlowRateValue = fromFlowRateValue*35.3147/1000;
								break;
							case "ft\u00B3/min":
								toFlowRateValue = fromFlowRateValue*2118.882/1000;
								break;
							case "ft\u00B3/hr":
								toFlowRateValue = fromFlowRateValue*127_132.92/1000;
								break;
							case "gal/s (gps)":
								toFlowRateValue = fromFlowRateValue*264.172/1000;
								break;
							case "gal/min (gpm)":
								toFlowRateValue = fromFlowRateValue*264.172*60/1000;
								break;
							case "gal/hr (gph)":
								toFlowRateValue = fromFlowRateValue*264.172*3600/1000;
								break;
							case "L/s":
								toFlowRateValue = fromFlowRateValue*1000/1000;
								break;
							case "L/min":
								toFlowRateValue = fromFlowRateValue*1000*60/1000;
								break;
							case "L/hr":
								toFlowRateValue = fromFlowRateValue*1000*3600/1000;
								break;
							case "ML/day":
								toFlowRateValue = fromFlowRateValue*86.4/1000;
								break;
							default: 
								fieldFlowRateTo.setText("Please select units.");
							}
						break;
					case "L/min":
						switch (selectedFlowRateTo) {
							case "m\u00B3/s":
								toFlowRateValue = fromFlowRateValue/1000/60;
								break;
							case "m\u00B3/min":
								toFlowRateValue = fromFlowRateValue*60/1000/60;
								break;
							case "m\u00B3/hr":
								toFlowRateValue = fromFlowRateValue*3600/1000/60;
								break;
							case "ft\u00B3/s":
								toFlowRateValue = fromFlowRateValue*35.3147/1000/60;
								break;
							case "ft\u00B3/min":
								toFlowRateValue = fromFlowRateValue*2118.882/1000/60;
								break;
							case "ft\u00B3/hr":
								toFlowRateValue = fromFlowRateValue*127_132.92/1000/60;
								break;
							case "gal/s (gps)":
								toFlowRateValue = fromFlowRateValue*264.172/1000/60;
								break;
							case "gal/min (gpm)":
								toFlowRateValue = fromFlowRateValue*264.172*60/1000/60;
								break;
							case "gal/hr (gph)":
								toFlowRateValue = fromFlowRateValue*264.172*3600/1000/60;
								break;
							case "L/s":
								toFlowRateValue = fromFlowRateValue*1000/1000/60;
								break;
							case "L/min":
								toFlowRateValue = fromFlowRateValue*1000*60/1000/60;
								break;
							case "L/hr":
								toFlowRateValue = fromFlowRateValue*1000*3600/1000/60;
								break;
							case "ML/day":
								toFlowRateValue = fromFlowRateValue*86.4/1000/60;
								break;
							default: 
								fieldFlowRateTo.setText("Please select units.");
							}
						break;
					case "L/hr":
						switch (selectedFlowRateTo) {
							case "m\u00B3/s":
								toFlowRateValue = fromFlowRateValue/1000/3600;
								break;
							case "m\u00B3/min":
								toFlowRateValue = fromFlowRateValue*60/1000/3600;
								break;
							case "m\u00B3/hr":
								toFlowRateValue = fromFlowRateValue*3600/1000/3600;
								break;
							case "ft\u00B3/s":
								toFlowRateValue = fromFlowRateValue*35.3147/1000/3600;
								break;
							case "ft\u00B3/min":
								toFlowRateValue = fromFlowRateValue*2118.882/1000/3600;
								break;
							case "ft\u00B3/hr":
								toFlowRateValue = fromFlowRateValue*127_132.92/1000/3600;
								break;
							case "gal/s (gps)":
								toFlowRateValue = fromFlowRateValue*264.172/1000/3600;
								break;
							case "gal/min (gpm)":
								toFlowRateValue = fromFlowRateValue*264.172*60/1000/3600;
								break;
							case "gal/hr (gph)":
								toFlowRateValue = fromFlowRateValue*264.172*3600/1000/3600;
								break;
							case "L/s":
								toFlowRateValue = fromFlowRateValue*1000/1000/3600;
								break;
							case "L/min":
								toFlowRateValue = fromFlowRateValue*1000*60/1000/3600;
								break;
							case "L/hr":
								toFlowRateValue = fromFlowRateValue*1000*3600/1000/3600;
								break;
							case "ML/day":
								toFlowRateValue = fromFlowRateValue*86.4/1000/3600;
								break;
							default: 
								fieldFlowRateTo.setText("Please select units.");
							}
						break;
					case "ML/day":
						switch (selectedFlowRateTo) {
							case "m\u00B3/s":
								toFlowRateValue = fromFlowRateValue/86.4;
								break;
							case "m\u00B3/min":
								toFlowRateValue = fromFlowRateValue*60/86.4;
								break;
							case "m\u00B3/hr":
								toFlowRateValue = fromFlowRateValue*3600/86.4;
								break;
							case "ft\u00B3/s":
								toFlowRateValue = fromFlowRateValue*35.3147/86.4;
								break;
							case "ft\u00B3/min":
								toFlowRateValue = fromFlowRateValue*2118.882/86.4;
								break;
							case "ft\u00B3/hr":
								toFlowRateValue = fromFlowRateValue*127_132.92/86.4;
								break;
							case "gal/s (gps)":
								toFlowRateValue = fromFlowRateValue*264.172/86.4;
								break;
							case "gal/min (gpm)":
								toFlowRateValue = fromFlowRateValue*264.172*60/86.4;
								break;
							case "gal/hr (gph)":
								toFlowRateValue = fromFlowRateValue*264.172*3600/86.4;
								break;
							case "L/s":
								toFlowRateValue = fromFlowRateValue*1000/86.4;
								break;
							case "L/min":
								toFlowRateValue = fromFlowRateValue*1000*60/86.4;
								break;
							case "L/hr":
								toFlowRateValue = fromFlowRateValue*1000*3600/86.4;
								break;
							case "ML/day":
								toFlowRateValue = fromFlowRateValue*86.4/86.4;
								break;
							default: 
								fieldFlowRateTo.setText("Please select units.");
							}
						break;
						}
					System.out.println("Converting from " + selectedFlowRateFrom + " to " + selectedFlowRateTo);
					if (toFlowRateValue < 0.01) {
						fieldFlowRateTo.setText((sciFormat.format(toFlowRateValue)).toString());
					} else fieldFlowRateTo.setText((df.format(toFlowRateValue)).toString());
	}

}
