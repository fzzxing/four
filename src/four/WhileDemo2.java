package four;

public class WhileDemo2
{
	public static void main(String[] args) {
		int count=0;
		
		for(int x=100;x<1000;x++) {
			int ge=x%10;
			int shi=x/10%10;
			int bai=x/10/10%10;
			
			if(((ge*ge*ge)+(shi*shi*shi)+(bai*bai*bai))==x) {
				
				System.out.println(x);
				
				count++;
			}
		}
		System.out.println(count);
		
		
		
		int count2=0;
		int y=100;
		while(y<1000) {
			
			int ge=y%10;
			int shi=y/10%10;
			int bai=y/10/10%10;
			
			if(((ge*ge*ge)+(shi*shi*shi)+(bai*bai*bai))==y) {
				count2++;
				System.out.println(y);
			}
			y++;
		    
		}
		System.out.println(count2);
		

}
}
