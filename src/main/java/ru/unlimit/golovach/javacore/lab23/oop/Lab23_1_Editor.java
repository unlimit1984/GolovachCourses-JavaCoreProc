package ru.unlimit.golovach.javacore.lab23.oop;

import java.util.ArrayList;
import java.util.List;

public class Lab23_1_Editor {

	public static void main(String[] args) {
		Editor editor = new Editor();
		editor.addFigure(new Rect(100,100,300,300));
		editor.addFigure(new Rect(10,5,30,20));
		editor.addFigure(new Rect(220,100,100,70));
		editor.addFigure(new Rect(65,20,20,40));
		editor.addEffect(new ZoomEffect(2));
		editor.addEffect(new ZoomEffect(5));
		
		
		editor.printAll(new ConsolePrinter());
	}

}

class Editor{
	private List<Figure> allFigures = new ArrayList<>();
	private List<Effect> allEffects = new ArrayList<>();
	void addFigure(Figure fig){
		allFigures.add(fig);
	}
	void addEffect(Effect eff){
		allEffects.add(eff);
	}
	void printAll(Printer printer){
		for(Effect eff : allEffects){
			printer = eff.decorate(printer);
		}
		for(Figure fig : allFigures){
			fig.print(printer);
		}
	}
}
interface Figure{
	void print(Printer printer);
}
class Rect implements Figure{
	int centerX;
	int centerY;
	int width;
	int height;
	

	public Rect(int centerX, int centerY, int width, int height) {
		this.centerX = centerX;
		this.centerY = centerY;
		this.width = width;
		this.height = height;
	}


	@Override
	public void print(Printer printer) {
		int xLeft = centerX-width/2;
		int yBottom = centerY-height/2;
		int xRight = centerX+width/2;
		int yTop = centerY+height/2;
		printer.printLine(xLeft,yBottom,xRight,yBottom);
		printer.printLine(xLeft,yBottom,xLeft,yTop);
		printer.printLine(xRight,yTop,xRight,yBottom);
		printer.printLine(xRight,yTop,xLeft,yTop);
	}
	
}
interface Effect{
	Printer decorate(Printer printer);
}
class ZoomEffect implements Effect{

	double zoomFactor;
	
	public ZoomEffect(double zoom) {
		this.zoomFactor = zoom;
	}

	@Override
	public Printer decorate(Printer origin) {
		return new Printer() {
			
			@Override
			public void printLine(int x0, int y0, int x1, int y1) {
				origin.printLine((int)(x0*zoomFactor), (int)(y0*zoomFactor), (int)(x1*zoomFactor), (int)(y1*zoomFactor));
			}
		};
	}
	
}
interface Printer{
	void printLine(int x0, int y0, int x1, int y1);
}

class ConsolePrinter implements Printer{
	public void printLine(int x0, int y0,int x1, int y1){
		System.out.println("Рисуем линию: "+x0+","+y0+","+x1+","+y1);
	}
}