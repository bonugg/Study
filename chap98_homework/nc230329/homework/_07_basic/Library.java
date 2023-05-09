package chap98_homework.nc230329.homework._07_basic;

public class Library {
//    2. 도서의 제목, 저자, 출판사, 가격을 속성으로 가지고 정보를
//    저장하는 메소드와 정보를 출력하는 메소드를 갖는 도서 클래스를 생성하세요.
    public String title;
    public String author;
    public String publisher;
    public int price;

    public void inputLibraryInfo(String title, String author, String publisher, int price){
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
    }

    public void outputLibraryInfo(){
        System.out.println(title);
        System.out.println(author);
        System.out.println(publisher);
        System.out.println(price);
    }

}
