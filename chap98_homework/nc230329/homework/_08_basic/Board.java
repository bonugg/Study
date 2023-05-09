package chap98_homework.nc230329.homework._08_basic;

public interface Board {
    //4. 게시판 인터페이스를 구현하고 게시글 저장, 수정, 삭제, 조회 메소드를 만들고
    // 게시판을 상속받는 자유게시판과 공지게시판 클래스를 만들어서 네 개의 메소드를 본인이
    //    원하는 대로 구현하세요.

    public abstract void boardInput();

    public abstract void boardModify();

    public abstract void boardDelete();

    public abstract void boardOutput();
}
