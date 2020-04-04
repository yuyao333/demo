package Tset2;

import java.util.Scanner;

public class AccountManager {
	public static void main(String[] args) {
		Acount zhang3=new Acount("001","张三",1000);
		Acount li4 = new Acount("002","李四",300);

		zhang3.cun(500);
		li4.cun(500);
		zhang3.qu(200);
		zhang3.zhuan(li4,300);
		zhang3.print();
		li4.print();
		Scanner s = new Scanner(System.in);
		char a = s.next().charAt(0);
	}
}
