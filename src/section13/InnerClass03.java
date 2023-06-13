package section13;

import section13.access1.MyUtill;

public class InnerClass03 {
	public static void main(String[] args) {
		// MyUtill 클래스에 HelloPrinter 내부클래스 생성하기
		// 첫번째 방법
		MyUtill mu = new MyUtill();
		MyUtill.HelloPrinter hp = mu.new HelloPrinter();
		hp.printHello();
		
		// 두번째 방법
		MyUtill.HelloPrinter hp2 = new MyUtill().new HelloPrinter();
		hp2.printHello();
		
		MyUtill.Calculater calc = new MyUtill.Calculater();
		calc.calc(10, 20);
	}
}
