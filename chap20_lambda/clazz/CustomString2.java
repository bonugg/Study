package chap20_lambda.clazz;

@FunctionalInterface
public interface CustomString2 {
	int indexOf(String a, String b, char c);
	//함수형 인터페이스는 메소드 하나만 존재
	//void print();
}
