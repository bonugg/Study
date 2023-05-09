package chap20_lambda;

import java.util.function.Function;

public class _09_referMultiMethod {
    public static void main(String[] args) {
/*        Function<String , String> func = s->{
            String result = s.concat("aa");
            result = s.toUpperCase();
            return result;
        };*/
        Function<String, String> func = String::toUpperCase;
        func = func.andThen(s->s.concat("AA"));

        String result = func.apply("bbb");

        System.out.println(result);
    }
}
