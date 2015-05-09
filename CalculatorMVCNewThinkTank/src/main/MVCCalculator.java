package main;

import controller.CalculatorController;
import view.CalculatorView;
import model.CalculatorModel;

public class MVCCalculator {
	
	public static void main(String[] args) {
		
		CalculatorView theView = new CalculatorView();
		
		CalculatorModel theModel = new CalculatorModel();
		
		CalculatorController theController = new CalculatorController(theView, theModel);
		
		theView.setVisible(true);
	}

}
