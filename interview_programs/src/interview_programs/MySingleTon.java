package interview_programs;

public class MySingleTon {

	private static MySingleTon mySingleTon=null;
	private MySingleTon(){
		
	}
	public static MySingleTon getInstance(){
		if(mySingleTon==null){
			System.out.println("1st time object created");
			mySingleTon=new MySingleTon();
			return mySingleTon;
		}else{
			System.out.println("already object created");
			return mySingleTon;
		}
	}
	public static void main(String[] args) {
		MySingleTon mySingleTon1=getInstance();
		MySingleTon mySingleTon2=getInstance();
		if(mySingleTon1==mySingleTon2){
			System.out.println("both objects are same");
		}else{
			System.out.println("both objects are not same");
		}

	}

}
