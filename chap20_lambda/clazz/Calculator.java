package chap20_lambda.clazz;

@FunctionalInterface //함수형 인터페이스를 보장
					 //추상 메소드를 하나만 가질 수 있는 인터페이스
					 //컴파일 과정에서 추상메소드가 하나인지를 검사
public interface Calculator {
	void calculate(int a, int b);
}
