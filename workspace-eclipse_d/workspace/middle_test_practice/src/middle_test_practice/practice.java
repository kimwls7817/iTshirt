package middle_test_practice;

public class practice {
	//자바 시작
	public static void main(String[] args) {
		//화면출력
		
		//println
		
		//변수의 이름 규칙
		
		//-오류
		
		//상수의 이름규칙 (권고사항: 모두 대문자)
		
		//변수의 생명주기(a가 사라진 줄, b가 사라진 줄.)
		int a=3;
		{
			a=8;
			int b=5;
			b=9;
			System.out.println(a);  //8
			System.out.println(b);  //9
		}
		System.out.println(a);  //3
		System.out.println(b);  //X
		
		//boolean
		boolean a=true;  //ture
		boolean b=false;  //flase
		
		//정수 자료형 4개
		byte c=3;  //3
		short d=5;  //5
		int e=100;  //100
		long f=-100;  //-100
		
		//실수 자료형 2개
		float g=2.8F;  //2.8
		double h=11.2;  //11.2
		double i=3;  //3.0
		
		//char 자료형
		char a='A';  //A
		char b=65;  //A
		char c='a';  //a
		char d=97;  //a
		char e='1';  //?
		
		//업캐스팅(up casting)
		long a = 10;  //10
		double b = 3.5F;  //3.5
		float c = 3;  //3.0
		
		//다운캐스팅(down casting)
		int d = (int)2.8;  //2
		float e = (float)5.9;  //5.9
		short f = (short)2.3;  //2
		byte g = (byte)130;  //130
		
		//자료형간 연산
		System.out.println(3+2);  //5
		System.out.println(3-2);  //1
		System.out.println(3*2);  //6
		System.out.println(3/2);  //1
		System.out.println((double)3/(double)2);  //1.5
		System.out.println(3.0/2.0);  //1
		System.out.println(3.0/2);  //1
		System.out.println((double)(3/2+(int)2.8));  //3.0
		
		//산술연산자
		System.out.println(7+4);  //11
		System.out.println(7-4);  //3
		System.out.println(7*4);  //28
		System.out.println(7/4);  //1
		System.out.println(7%4);  //3
				
		//증감연산자
		int a = 3;  
		int b = a++;
		System.out.println(a);  //3
		System.out.println(b);  //3
				
		a=3;
		b=++a;
		System.out.println(a);  //3
		System.out.println(b);  //4
				
		a=3;
		System.out.println(a++);  //3
		System.out.println(++a);  //4
				
		a=2;
		b=3;
		int c = a++ + ++b;
		System.out.println(a);  //2
		System.out.println(b);  //3
		System.out.println(c);  //6
				
		//비교연산자
		int a = 3;
		System.out.println(a>3);  //
		System.out.println(a>=3);  
		System.out.println(a<3);  
		System.out.println(a<=3);  
		System.out.println(a==3);  
		System.out.println(a!=3);  
				
		System.out.println(a=5);  
				
		//논리연산자
		System.out.println(true && true);  
		System.out.println(true || (3<2));  
		System.out.println(!(5>=2) ^ (7>2));  
		System.out.println(false || (4<=4));
				
		//비트연산자를 이용한 놀리연산
		int a=3, b=5, c=7;
		System.out.println(false & a++>3);
		System.out.println(true | ++b>5);
		System.out.println(false ^ c++>7);
		System.out.println(a);
		System.out.println(b); 
		System.out.println(c); 
				
		//논리연산자를 이용한 논리연산
		a=3, b=5, c=7;
		System.out.println(false && a++>3);
		System.out.println(false && a++>3);
				
		//삼항연산자
		int a = 3;  
		int b = (a<5)? 10:20;
		System.out.println(b);
				
		a=5;
		b=(a<5)? 30:40;
				
		a=5; b=7;
		int c = (a>5)?(b<5)?10:20:(b>2)?30:40; 
		System.out.println(c);
		
		//제어문의 중괄호 생략
		int a = 3;
		if (a>3) { //flase
			System.out.println("A");
			System.out.println("B");
		}
		if (a>3)
			System.out.println("A");  //컴파일에 의한 중괄호 내부(중괄호 생략)
			System.out.println("B");  //B
			
			
			
		//if 제어문 type1
		a=3;
		if(a>2) {
			System.out.println("실행1");
		}  //실행1
		if(a>5) {
			System.out.println("실행2");
		}
			
			
		//if 제어문 type2
		a=3;
		if(a<2) {
			a=3;
			if(a>2) {
				System.out.println("실행3");
			}
			else {
				System.out.println("실행4");
			}
		}
			
			
		//if 제어문 type3-1
		int s = 85;
		if(s>=90) {
			System.out.println("A학점");
		}
		else if(s>=80) {
			System.out.println("B학점"); //여기까지만 읽음.
		}
		else if(s>=70) {
			System.out.println("C학점");
		}
		else {
			System.out.println("F학저");
		}
			
		//if 제어문 type3-2
		int s = 85;
		if(s>=70) {
			System.out.println("C학점");
		}
		else if(s>=80) {
			System.out.println("B학점");
		}
		else if(s>=90) {
			System.out.println("A학점");
		}
		else {
			System.out.println("F학저");
		}  //C학점
			
		//if 제어문 type3-3
		int s = 85;
		if(s>=70 && s<80) {
			System.out.println("C학점");
		}
		else if(s>=80 && s<90) {
			System.out.println("B학점");
		}
		else if(s>=90) {
			System.out.println("A학점");
		}
		else {
			System.out.println("F학저");
		}
		
		//switch
		int a=2;
		switch(a) {
		case 1:
			System.out.println("A");
		case 2:
			System.out.println("B");
		case 3:
			System.out.println("C");
		default:
			System.out.println("D");	
		}
		
		char b='C';
		switch(b) {
		case 'A':
			System.out.println("A");
		case 'B':
			System.out.println("B");
		case 'C':
			System.out.println("C");
		default:
			System.out.println("D");
		}
		
		//switch <--> if
		
		//미션1
		int a=8;
		if(a>=9) {
			System.out.println("A");
		}
		else if(a==8) {
			System.out.println("B");
		}
		else if(a==7) {
			System.out.println("C");
		}
		else {
			System.out.println("D");
		}
		
		//미션2
		a=8;
		switch(a) {
		case 10:
			System.out.println("A"); break;
		case 9:
		case 8:
			System.out.println("B"); break;
		case 7:
			System.out.println("C");
		case 6:
			System.out.println("D");
		}
		
		//미션3
		a=85;
		if(a>=90) {
			System.out.println("A");
		}
		else if(a>=80) {
			System.out.println("B");
		}
		else if(a>=70) {
			System.out.println("C");
		}
		else {
			System.out.println("F");
		}
		
		//for 반복제어문
		int a;
		for(a=0;a<10;a++) {
			System.out.println(a);
		}
		for(int i=0; i<10; i++) {
			System.out.println(i);
		} 
		
		//다음 결과에서 A의 출력 개수를 말하세요.
		for(int i=0; i<10; i++) {
			System.out.println("A");
		}
		
		for(int i=0; i<10; i+=2) {
			System.out.println("A");
		}
		
		for(int i=10; i>0; i--) {
			System.out.println("A");
		}
		
		for(int i=10; i>0; i-2) {
			System.out.println("A");
		}
		
		for(int i=0; i>10; i++) {
			System.out.println("A");
		} 
		
		for(int i=10; i>0; i++) {
			System.out.println("A");
		} 
		
		for(int i=0; ; i++) {
			System.out.println("A");
		} 
		for(;;) {
			System.out.println("A");
		} 
		
		//while <--> for
		//미션1 (for문으로 변환)
		//#1
		int a=0;
		while(a<10) {
			System.out.println(a);
			a++
		}
		//답1-1
		
		
		//#2 
		a=10;
		while(a>0) {
			System.out.println(a);
			a-=2;
		}
		//답
		
		
		
		//미션2 (while문으로 변환)
		//#1
		for(int i=0; i<5; i++) {
			System.out.println("A");
		}
		//답
		
		
		//#2
		for(int i=10; i>0; i-=2) {
			System.out.println("A");
		}
		//답
		
		
		//#3
		for(;;) {
			System.out.println("A");
		}
		//답
		
		//do-while
		//#1
		int a;
		
		a=0;
		while(a<3) { 
			System.out.println(a);
			a++; 
		}
		//#1-do
		a=0;
		do {
			System.out.println(a);
			a++; 
		} while(a<3);
		
		//#2
		a=0;
		while(a<1) { 
			System.out.println(a);
			a++;
		}
		//#2-do
		a=0;
		do { 
			System.out.println(a);
			a++;
		} while(a<1);
		
		//while과 do-while이 다른 유일한 부분
		//#3
		a=0;
		while(a<0) { 
			System.out.println(a);
			a++;
		}	
		//#3-do
		a=0;
		do { 
			System.out.println(a);
			a++;
		} while(a<0);
		
		//break 제어문
		//다음 for문의 출력 회수를 써라.
		for(int i=0; i<10; i++) { 
			if(i>4) 
				break;			
			System.out.println(i);
		}
		
		for(int i=0; i<10; i++) { 
			System.out.println(i);
			if(i==5) {
				break;
			}
		}
		
		for(int i=0; i<5; i++) { 
			for(int j=0; j<4; j++) {
				if(j==2) {
					break;
				}
				System.out.println("A");
			}
		}
		
		for(int i=0; i<5; i++) { 
			for(int j=0; j<4; j++) {
				if(i==2) {
					break;
				}
				System.out.println("A");
			}
		}
		
		for(int i=0; i<5; i++) { 
			for(int j=0; j<4; j++) {
				if(i==1 || j==1) {
					break;
				}
				System.out.println("A");
			}
		}
		
		//break을 만났을때 이중for문을 한꺼번에 탈출하도록 코드를 수정하라. 
		for(int i=0; i<5; i++) {
			for(int j=0; j<4; j++) {
				if(j==3) { 
					i=10;
					break;
				}				
				System.out.println("A");
			}
		}
		
		abc: for(int i=0; i<5; i++) {
			for(int j=0; j<4; j++) {
				if(j==3) {
					break abc;
				}
				System.out.println("A");
			}
		}
		
		//continue 제어문
		//다음 for문의 출력 회수를 써라.
		for(int i=0; i<10; i++) { //번
			if(i>4) 
				continue;			
			System.out.println(i);
		}
		
		for(int i=0; i<10; i++) { //번
			System.out.println(i);
			if(i==5) {
				continue;
			}
		}
		
		for(int i=0; i<5; i++) { //번
			for(int j=0; j<4; j++) {
				if(j==2) {
					continue;
				}
				System.out.println("A");
			}
		}
		
		for(int i=0; i<5; i++) { //번
			for(int j=0; j<4; j++) {
				if(i==2) {
					continue;
				}
				System.out.println("A");
			}
		}
		
		for(int i=0; i<5; i++) { //번
			for(int j=0; j<4; j++) {
				if(i==1 || j==1) {
					continue;
				}
				System.out.println("A");
			}
		}
		//실행회수를 써라.
		for(int i=0; i<5; i++) {
			for(int j=0; j<4; j++) {
				if(j==3) { 
					i=10;
					continue;
				}				
				System.out.println("A");
			}
		}
		
		abc: for(int i=0; i<5; i++) {
			for(int j=0; j<4; j++) {
				if(j==3) {
					continue abc;
				}
				System.out.println("A");
			}
		}
		//배열의 선언
		int[] a1;
		int a2[];
		
		//배열의 생성
		int[] a = new int[3];
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		
		double[] b = new double[3];
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);
		
		String[] c = new String[3];
		System.out.println(c[0]);
		System.out.println(c[1]);
		System.out.println(c[2]);
		
		a[0]=3;   a[1]=4;    a[2]=5;
		b[0]=3.5;  	b[1]=4.5;  	b[2]=5.5;
		c[0]="땡큐";  	c[1]="베리";  	c[2]="감사";
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);
		
		System.out.println(c[0]);
		System.out.println(c[1]);
		System.out.println(c[2]);
		
		//1차원 배열 생성 3가지 방법
		
		//a --> [1.1, 2.2, 3.3]
		//#방법1
		double[] a = new double[3];
		a[0]=1.1;
		a[1]=2.2;
		a[3]=3.3;
		//선언과 값의 대입 분리
		double[] a1;
		a1 = new double[3];
		
		//#방법2
		double[] b = new double[] {1.1, 2.2, 3.3};
		//선언과 값의 대입 분리
		double[] b1;
		b1 = new double[] {1.1, 2.2, 3.3};
		
		//#방법3
		double[] c = {1.1, 2.2, 3.3};
		//선언과 값의 대입 분리 --> 불가능
		//double[] c1;
		//c1 = {1.1, 2.2, 3.3};
		
		//기본자료셩 vs 참조자료형
		int a=3;
		int b=a;
		b=5;
		System.out.println(a);
		System.out.println(b); 
		
		//
		int[] c = {1,2,3};
		int[] d=c;
		d[0]=5;
		c[1]=6;
		c[2]=7;
		System.out.println(c[0]); 
		System.out.println(c[1]); 
		System.out.println(c[2]); 
		System.out.println(d[0]); 
		System.out.println(d[1]);
		System.out.println(d[2]); 
		
		int[] a = {1,2,3,4,5,6,7};
		System.out.println(a.length); 
		
		for(int i=0; i<7; i++) {
			System.out.println(a[i]);
		}
		//....100라인
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		//....100라인
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
		//for-each 구문을 이용한 출력
		for(int k:a) {
			System.out.println(k);
		}
	} 
}
