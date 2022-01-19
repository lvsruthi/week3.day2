package week3.day2;

import java.nio.channels.MulticastChannel;

public class Automation extends MultipleLangauge implements Language, TestTool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Automation auto = new Automation();
		auto.Java();
		auto.ruby();
		auto.Selenium();
		auto.python();
	}

	public void Java() {
		// TODO Auto-generated method stub
		System.out.println("Java is implemented in class");
		
	}

	public void Selenium() {
		// TODO Auto-generated method stub
		System.out.println("Selenium is implemented in class");
		
	}
	public void ruby()
	{
		System.out.println("Ruby implemented in class");
	}

}
