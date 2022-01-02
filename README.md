# Java
Java언어 공부 일지

# 프로젝트 목록
  - 연금 복권
  - 메모장(스윙프로그래밍)

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
클래스

-자바의 프로그램 단위

-클래스 이름은 대소문자를 구분하며 public인 경우 반드시 파일이름과 일치해야 함.

-클래스는 필드와 메소드로 구성됨.

//헬로라는 클래스
public class Hello {

}
//파일이름은 Hello.java 이어야 함.
패키지

-관련된 다양한 자바 클래스가 모여있는 폴더

-패키지 이름에서 마침표를 이용하여 하부 폴더를 정의

//패키지 이름
package Project1.hi;
//클래스 Hello는 Project1/hi 폴더에 생성.
public class Hello {

}
필드

-소속변수

​

메소드

-함수와 같은 기능

-main()메소드는 자바 프로그램이 실행되는 문장이 기술.

-메소드 헤드 : 메소드의 여러 특성을 표현한 수정자 반환형 메소드이름(인자목록)으로 구성

public class Hello {
   //필드 선언
   static String fd = "필드";

   // 메소드 main()의 메소드 헤드
   // 수정자     반환형  이름(메소드인자)
   public static  void   main(String[] args) {
     write(fd);
   }
}

출력 결과 :
 
필드
키워드

-문법적으로 의미 있는 단어

-사용하기 위해 미리 정의해 놓은 단어 48개

​

식별자

-프로그래머가 정의하여 사용하는 단어

-규칙

  1) 키워드는 식별자로 사용x

  2) 식별자의 첫문자는 숫자x

  3) 식별자는 대소문자를 구별, 중간에 공백문자 삽입x

  4) 유니코드를 지원, 한글 사용은 가능하지만 자제.

​

문장

-컴퓨터에게 명령을 내리는 최소 단위

-세미콜론 ;으로 종료

​

블록

-중괄호를 사용하며 여러 문장으로 구성된다.

​

들여쓰기

-클래스 정의에서 필드나 메소드의 첫 글자는 탭만큼 들여쓰는 방식

​

주석

//한줄주석

/* 
* 여러줄 주석
*/
