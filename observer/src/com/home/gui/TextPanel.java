package com.home.gui;

import com.home.TextObserver;
import com.home.WeatherForecast;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class TextPanel extends JPanel {

	public TextPanel() {
		JTextField txtTemperature = new JTextField(20);
		txtTemperature.setEnabled(false);
		add(txtTemperature);
		
		TextObserver observer = new TextObserver(txtTemperature);
		WeatherForecast.getInstance().registerObserver(observer);
	}
}
