package ru.unlimit.golovach.javacore.lab08.exceptions;

class FailClose implements AutoCloseable{

	private String msg="";
	public FailClose(String s){
		msg=s;
		System.err.println("new:"+msg);
	}
	
	@Override
	public void close(){
		System.err.println("close:"+msg);
		throw new Error(msg);
	}
}

public class Lab8_4_FailClose_TryWithRes {
	

	public static void main(String[] args){
		
//		try(FailClose x = new FailClose("X")){
//			try(FailClose y = new FailClose("Y")){
//				/*NOP*/
//			}
//			catch(Error e){//попробовать закомментировать блок catch
//				System.err.println("catch-y");
//			}
//		}
		
//		try(FailClose x = new FailClose("X")){
//			try(FailClose y = new FailClose("Y")){
//				/*NOP*/
//			}
//		}
//		finally{
//			return;
//		}

		try(FailClose x = new FailClose("X")){
			try(FailClose y = new FailClose("Y")){
				/*NOP*/
			}
		}
		catch(Error e){
			RuntimeException re = (e.getCause()!=null)	
					? new RuntimeException(e.getMessage())
					: new RuntimeException(e.getMessage(),e.getCause());
			for(Throwable t: e.getSuppressed()){
				re.addSuppressed(t);
			}
			throw re;
		}
		finally{
			System.err.println("finally");
		}
			
	
	}
}
