package gui.util;

import javafx.scene.control.TextField;

public class Contraints {
	
	public static void setTextFielInteger(TextField txt) {
		txt.textProperty().addListener((obs,oldValue, newValue)->{
			if(newValue != null && !newValue.matches("\\d*")){
				txt.setText(oldValue);
			}
		});		
	}
	
	public static void setTextFielDouble(TextField txt) {
		txt.textProperty().addListener((obs,oldValue, newValue)->{
			if(newValue != null && !newValue.matches("\\d*([\\.]\\d*)?")){
				txt.setText(oldValue);
			}
		});		
	}
	
	public static void setTextFieldMaxLength(TextField txt, int max) {
		txt.textProperty().addListener((obs,oldValue, newValue)->{
			if(newValue != null && newValue.length() > max){
				txt.setText(oldValue);
			}
		});		
	}

}
