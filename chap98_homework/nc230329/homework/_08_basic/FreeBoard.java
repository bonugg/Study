package chap98_homework.nc230329.homework._08_basic;

import java.util.Scanner;

public class FreeBoard implements Board{

    public int post_num = 0;
    public String post;

    @Override
    public void boardInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("-자유게시판-");
        System.out.print("게시글을 입력하세요 : ");
        String post = sc.next();
        this.post = post;
        post_num++;
    }

    @Override
    public void boardModify() {
        Scanner sc = new Scanner(System.in);
        System.out.println("-자유게시판-");
        System.out.println("게시글을 수정합니다.");
        System.out.print("게시글을 입력하세요 : ");
        String post = sc.next();
        this.post = post;
    }

    @Override
    public void boardDelete() {
        System.out.println("-자유게시판-");
        System.out.println("게시글을 삭제합니다.");
        this.post = "";
        post_num--;
    }

    @Override
    public void boardOutput() {
        System.out.println("-자유게시판-");
        System.out.println("게시글 보기");
        System.out.println(post);
    }
}
