package beginners;

public class oddtree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp1=0,temp=0;
		for(int i=1;i<15;i++){
		temp1=temp1+i;
		}
		System.out.println(temp1);
		for(int i=15;i<45;i++){
		if(i%2!=0){
			temp=temp+i;
		}
				
		}
		System.out.println(temp);
		

	}

}
