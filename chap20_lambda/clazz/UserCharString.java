package chap20_lambda.clazz;

public class UserCharString {
    private String str;

    public UserCharString(){
    }

    public UserCharString(String str){
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public String changeStr(char ch, UserChar uc){
        str = uc.findUserChar(ch, str);
        return str;
    }

    @Override
    public String toString() {
        return "UserCharString{" +
                "str='" + str + '\'' +
                '}';
    }
}
