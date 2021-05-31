package co.yedam.star3;

public class StarApp {

	//삼각형 출력
//	void draw(int cnt) {
//		for(int i=1;i<=cnt; i++)	{
//			System.out.println(pad('*',i));
//		}
//	}
//	//"*"*3
//	//(*,10) ---> "**********"
	String pad(char s, double cnt) {
		String result = "";
		for(int i=0;i<cnt; i++) {
			result += s ;
		}
		return result;
	}
	
//	
//	//역삼각형
//	void drawInvert(int cnt) {
//		for(int i=1;i<cnt; i++)	{
//			System.out.println(pad('*',cnt-i));
//		}
//	}
	
	//이등변삼각형
//	void drawEq(int cnt) {
//		for(int i=1;i<=cnt; i++) {
//			System.out.println(pad(' ',cnt-i)+pad('*',2*i-1)); //공백
//			System.out.println(pad('*',i));
//		}
//		
//	}
//	//이등변역삼각형
//	void drawEqInvert(int cnt) {
//		for(int i=1;i<=cnt; i++) {
//			System.out.println(pad(' ',cnt+1-i)); //공백
//			System.out.println(pad('*',cnt+1-i));
//		}
//	}
	
//	나무그리기 (지그재그형)
	void drawEq1(int cnt) {
		for(int i=0;i<=cnt; i++) {
			System.out.println(pad(' ',50-i)+pad('*',2*i-1)); //공백
		}
		
	}
	
	void drawEq2(int a,int b) {
		for(int i=a;i<=b; i++) {
			System.out.println(pad(' ',50-i)+pad('*',2*i-1)); //공백
		}
		
	}
	void drawRect(int cnt) {
		for(int i=1;i<4; i++) {
			System.out.println(pad(' ',50-0.5*cnt)+pad('*',cnt-1));
		}
	}
	
}
