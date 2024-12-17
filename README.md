# Java
Java언어 공부 일지

# 프로젝트 목록
  - 연금 복권
  - 메모장(스윙프로그래밍)

# java 기초
- entity
- dto
- record


# 1. Java 란?
## Java
- 썬 마이크로 시스템즈 사에서 1995년에 공식 발표한 객체지향 프로그래밍 언어이다.

## 자바의 역사
- 썬 마이크로시스템즈 사가 1990년 초 양방향 TV를 만드는 제어박스의 개발을 위한 그린 프로젝트를 시작.
- 초기에는 객체지향 언어로 광범위하게 이용되고 있는 C++언어를 이용하지만 그것만으론 부족하여 C++ 언어를 기반으로 오크라는 언어를 개발함.
- 이 개발의 책임자인 제임스 고슬링이 오크 언어를 발전시켜 자바라는 범용적인 프로그래밍 언어를 개발함.


## 자바의 특징
1. 단순하다.
    - C++언어를 기초로 만든 언어로 C++언어와 문법이 유사함.
    - 포인터를 이용하지 않고 메모리 관리가 보다 쉽고 편리함.
2. 객체지향 언어이다.
    - C언어는 함수를 프로그램 단위로 개발하는 절차적 언어.
    - 자바는 클래스를 프로그램 단위로 개발함
    - 여러개의 클래스를 이용하여 하나의 프로그램이 실행됨.
    - 객체지향 프로그래밍 언어: 클래스와 객체를 중심으로 프로그램을 개발
3. 시스템에 독립적이다.
    - 자바 프로그램은 다른 플랫폼에서도 다른 작업 없이 실행이 가능함.
4. 번역 언어이다.
    - 자바의 프로그램 소스는 중간 코드인 바이트코드로 변환.
    - 바이트코드는 자바 가상 기계에서 인터프리터의 도움으로 실행됨. 
    
## Java SE
1.임베디드 환경, 개인용 컴퓨터, 서버에 활용될 자바 응용 프로그램을 개발하고 구현하는 기술.
2.컴파일러, 실행환경, 클래스 라이브러리API를 제공.

## Java EE
1.다중계층의 대규모 기업 응용 시스템을 개발하기 위한 표준 플랫폼 제공.
2.기업 자바빈즈 컴포넌트, 자바 서블릿, 자바 서버페이지XML 기술에 필요한 자료 및 소프트웨어 제공.

## Java ME
1.모바일 전화기 및 PDA, TV 셋탑박스, 이동 차량에 부착된 각종 장치 및 여러 임베디드 장치를 위한 자바 소형 플랫폼,
2. 메모리 및 여러 용량이 작은 장치 및 임베디드 장치를 위한 자바 기술 제공
- 컴파일러 : 소스 파일에서 실행 파일을 생성하는 소프트웨어. (javac.exe)
- 바이트코드 : 자바 소스를 컴파일 하면 바이트 코드라 불리는 파일이 생성. (확장자 : class)
- 인터프리터 : 사람이 이해할 수 있는 고급언어로 작성된 코드를 한 단계씩 해석하여 실행시키는 방법 (java.exe)
- 컴파일과 인터프린터 과정 : 소스파일 -> 컴파일러 -> 바이트코드 -> 인터프리터 -> 실행결과

## JRE
- 자바 API, 자바 가상 기계, 자바 프로그램을 실행하기 위한 여러 컴포넌트로 구성된 자바 실행 환경.

## JDK
- 자바 언어를 이용하여 프로그램을 개발하기 위한 최소한의 환경
- 개발도구 (컴파일러, 인터프리터, 디버거)와 JRE를 제공 

# 2. 자바 구조
## 클래스
-자바의 프로그램 단위
-클래스 이름은 대소문자를 구분하며 public인 경우 반드시 파일이름과 일치해야 함.
-클래스는 필드와 메소드로 구성됨.

//헬로라는 클래스
```java
public class Hello {

}
//파일이름은 Hello.java 이어야 함.
```
## 패키지
-관련된 다양한 자바 클래스가 모여있는 폴더
-패키지 이름에서 마침표를 이용하여 하부 폴더를 정의

```java
//패키지 이름
package Project1.hi;
//클래스 Hello는 Project1/hi 폴더에 생성.
public class Hello {

}
```
## 필드
-소속변수

## 메소드
-함수와 같은 기능
-main()메소드는 자바 프로그램이 실행되는 문장이 기술.
-메소드 헤드 : 메소드의 여러 특성을 표현한 수정자 반환형 메소드이름(인자목록)으로 구성

```java
public class Hello {
   //필드 선언
   static String fd = "필드";

   // 메소드 main()의 메소드 헤드
   // 수정자     반환형  이름(메소드인자)
   public static  void   main(String[] args) {
     write(fd);
   }
}

/*
출력 결과 :
필드
*/
```
## 키워드
-문법적으로 의미 있는 단어
-사용하기 위해 미리 정의해 놓은 단어 48개

## 식별자
-프로그래머가 정의하여 사용하는 단어
-규칙
  1) 키워드는 식별자로 사용x
  2) 식별자의 첫문자는 숫자x
  3) 식별자는 대소문자를 구별, 중간에 공백문자 삽입x
  4) 유니코드를 지원, 한글 사용은 가능하지만 자제.

## 문장
- 컴퓨터에게 명령을 내리는 최소 단위
- 세미콜론 ;으로 종료

## 블록
- 중괄호를 사용하며 여러 문장으로 구성된다.

## 들여쓰기
- 클래스 정의에서 필드나 메소드의 첫 글자는 탭만큼 들여쓰는 방식

## 주석
//한줄주석

/* 
* 여러줄 주석
*/

# 자료형 / 변수 / 입출력

## 기본형
- 변수의 저장공간에 값 자체가 저장

분류   키워드
기본형 
논리형  boolean 
문자형  char
정수형  byte, short, int, long
실수형  float, double
참조형  배열 int [], float [] 등
클래스  String, Date 등
인터페이스 Runnable, Enumeration 등

## 참조형
-변수의 저장공간에 참조 값 저장 
(참조값: 실제 값이 저장된 객체(object)를 가리키는 값)

## 자료형 크기
- 표현범위가 달라 정수와 실수를 표현하는 자료형이 많음.

키워드  최소~최대  
논리형  boolean  1바이트   false, true
문자형  char     2바이트   \u0000 ~\uffff, [0 ~ 65,535]
정수형  byte     1바이트   -128 ~ 127
        short    2바이트   -32,768 ~ 32,767
        int      4바이트   -2,147,483,648 ~ 2,147,483,647
        long     8바이트   -2의 63승 ~ 2의 63승-1
실수형  float    4바이트   (+, -)1.4E-45 ~ 3.4028235E38
        double   8바이트   (+, -)4.9E-324 ~ 1.7976931348623157E308

​## 상수(literals)
-소스에 그대로 표현할수 있는 다양한 자료 값
-정수 상수에서 숫자 앞의 0은 8진수,0x 나 16진수 0X 를 나타냄.
-0과 1로만 구성되는 수 앞에 0b를 붙이면 이진수 표현방법으로 사용가능


분류   자료형      상수         비고
논리형 boolean true, false 2개 이외에는 없음
문자형 char    ‘A',’자‘,’%‘,'|','|n','|23'(8진수 코드값) |u2344 (16진수 코드 값) 작은 따옴표로 표기
정수형 int     10,45(십진수),0b1010(이진수 1010), 020(8진수 20), 0x1d(16진수 1d) 0X1D와 같이 대문자도 가능
       long    32l,220000000L 정수 뒤에 l이나 L표기
실수형 float   3.14f, 5.25F   반드시 실수 뒤에 f나 F 표기 
       double  2.98e2(2.98*10의 2승) 5.8E-2(5.8*10의 -2승) 3.75, 3.2d, 5.78D e와 E모두가능, 실수 뒤에 d나 D도 사용 가능
문자열 String  “문자열!”      큰 따옴표로 표기, 


숫자에 사용하는 밑줄
-자릿수를 구분하는 구분자로 사용
ex) 35,217 => 35_217 (어디든 사용 가능)

특수문자
-인쇄할수 없는 문자나 특수한 문자를 표현하고자 하는 경우 역슬래시(\)를 이용하여 표현

문자표현 의미
\n       새로운 행으로 이동
\t       탭만큼 이동
\b       하나 뒤로 이동
\r       현재 행의 처음으로 이동
\f       새 페이지의 처음으로 이동
\\       \(역슬래시) 문자
\'       '(작은 인용부호) 문자
\"       "(큰 인용부호) 문자
\ddd     \0에서 \377(\u00ff)까지, 8비트의 정보만 입력가능 
\udddd   반드시 4자리를 기술

## 변수 선언
-변수 : 자료값을 저장하는 공간
```java
//변수 선언문
//변수자료형 변수이름
     int       a;
//대입문
//변수이름 = 저장값
    a     =   4;
초기값 지정

-변수를 선언한 이후 바로 값지정

//변수선언후 초기화
  int b;
  b = 5;
//변수선언 및 초기화
  int b = 5;

//여러 변수 선언
 int a, b, c;
 double d = 2, e = 3;
```
소속변수(필드)
-클래스 내부에 소속된 변수로 대부분의 메소드에서 사용.

지역변수
-메소드 내부에서 선언되는 변수로 선언된 메소드에서만 사용
-초기값을 저장하지 않고 사용시 컴파일 오류 발생

```java
public class java4 {
  //필드선언
  static int a;  //static를 빼면 문법오류발생
  static String b;
  
  public static void main(String[] args) {
  //지역변수 선언
  int c = 3;

  //출력
  System.out.println(a);
  System.out.println(b);
  System.out.println(c);
  }
}

/*
결과
0
null
3
자료의 입력
*/
```

-클래스 java.util.Scanner을 사용
```java
public class java4 {
  public static void main(String[] args) {
  //자료형          변수이름 = new       클래스이름(인자)
  java.util.Scanner input = new java.util.Scanner(System.in);
  System.out.println("이름을 입력하세요.");
  //이름(반환 값)을 문자열 변수에 저장.
  String name = input.next();
  //출력
  System.out.print("이름 : " + name);

  }
}
```
## Scanner의 메소드
- String next() : 토큰을 읽어서 문자열로 반환
- int nextInt() : 정수를 읽어 int로 반환
- long nextLong() : 정수를 읽어 long로 반환 
- float nextFloat() : 실수를 읽어 float로 반환
- double nextDouble() : 실수를 읽어 double로 반환
- String nextLine() : 줄의 내용을 모두 읽어 문자열로 반환
- boolean nextBoolean() : 논리 값을 읽어 boolean으로 반환
- int nextInt(int radix), long nextLong(int radix) : 정수를 인자인 radix 진법으로 읽어 변환

## 자료의 출력 메소드
-보통 System.out.println()를 사용.
- print() : 자료형을 출력
- println() : 자료형을 출력후 다음줄로 이동
- format() : format문자열 형식에 맞게 출력
- printf() : 출력형태를 문자열로 표시

```java
public class java4 {
  public static void main(String[] args) {
  int weight = 60;

  System.out.print("무게 : " + weight + "\n");
  System.out.println("무게 : " + weight);
  System.out.printf("무게 : %d \n", weight);
  System.out.format("무게 :%3d", weight);
  }
}

/*
결과
무게 : 60
무게 : 60
무게 : 60
무게 : 60
*/
```
## import문
-java.lang 을 제외한 모든 패키지는 클래스 이름 앞에 모두 패키지 이름을 기술해야 하지만 간단하게 하기위해 사용하는 문장.

```java
import java util.Scanner;
//import문은 [ctrl] + [shift] + [o]로 삽입 가능

public class java4 {
  public static void main(String[] args) {
  //자료형 변수이름 = new 클래스이름(인자)
  Scanner input = new Scanner(System.in);
  System.out.println("이름을 입력하세요.");
  //이름(반환 값)을 문자열 변수에 저장.
  String name = input.next();
  //출력
  System.out.print("이름 : " + name);

  }
}
```
