package ru.unlimit.golovach.javacore.lab02;

public class Lab2_6_Parser {

	public static void main(String[] args) {
		System.out.println("10-(10/4)=" +eval("10-(10/4)"));
		System.out.println("123=" +eval("123"));
		System.out.println("(123)=" +eval("(123)"));		
		System.out.println("2*(1+3)=" +eval("2*(1+3)"));
		System.out.println("1+(5-2*(13/6))=" +eval("1+(5-2*(13/6))"));
		System.out.println("1+2+3=" +eval("1+2+3"));
		//System.out.println("(1+3)*2=" +eval("(1+3)*2"));
		
		System.out.println();
		
		System.out.println("123=" +eval_advanced("123"));
		System.out.println("(123)=" +eval_advanced("(123)"));
		System.out.println("(1+3)*2=" +eval_advanced("(1+3)*2"));
		System.out.println("((13/6)*2-3)+1="+eval_advanced("((13/6)*2-3)+1"));
		System.out.println("(10/4)+6="+eval_advanced("(10/4)+6"));

	}

	public static int eval(String expr){
		if(expr.startsWith("(") && expr.endsWith(")")){
			return eval(expr.substring(1,expr.length()-1));
		}
		else if(expr.startsWith("(") && !expr.endsWith(")")){
			throw new RuntimeException("Если выражение начинается с (, должно заканчиваться )");
		}
		else
		{
			int pos=0;
			while(pos<expr.length()-1){
				if(Character.isDigit(expr.charAt(pos))){
					pos++;
				}
				else{
					int leftOperand = Integer.valueOf(expr.substring(0,pos));
					char operation=expr.charAt(pos);
					int rightOperand = eval(expr.substring(pos+1));
					switch(operation){
						case '+': return leftOperand+rightOperand;
						case '-': return leftOperand-rightOperand;
						case '*': return leftOperand*rightOperand;
						case '/': return leftOperand/rightOperand;
					}
							
				}
			}
			return Integer.valueOf(expr);
		}
	}
	public static int eval_advanced(String expr){
		if(expr.startsWith("(") && expr.endsWith(")")){
			return eval_advanced(expr.substring(1,expr.length()-1));
		}
		else if(expr.endsWith(")") && !expr.startsWith("(")){
			throw new RuntimeException("Если выражение заканчивается на ), должно начинаться с (");
		}
		else
		{
			int pos=expr.length()-1;
			while(pos>0){
				if(Character.isDigit(expr.charAt(pos))){
					pos--;
				}
				else{
					int leftOperand = eval_advanced(expr.substring(0,pos));
					int rightOperand = Integer.valueOf(expr.substring(pos+1,expr.length()));
					char operation=expr.charAt(pos);
					
					switch(operation){
						case '+': return leftOperand+rightOperand;
						case '-': return leftOperand-rightOperand;
						case '*': return leftOperand*rightOperand;
						case '/': return leftOperand/rightOperand;
					}
							
				}
			}
			return Integer.valueOf(expr);
		}
	}

}
