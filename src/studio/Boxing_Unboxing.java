package studio;

public class Boxing_Unboxing {

	public static void main(String[] args) {
		int x = 20;
		
		//BOXING
//		Object obj = x;

		//WRAPPER CLASS
		Integer obj = x;		
		
		System.out.println(obj);


		//UNBOXING
		int y = (int)obj;
		        //^CASTING
		//USANDO TIPO WRAPPER CLASS NAO PRECISA DO CASTING
		//int y = obj;
		

		System.out.println(y);
		System.out.println("Bom dia!!");
	}

}
