package chap98_homework.nc230329.homework._08_basic;

import java.util.Scanner;

public class NoticeBoard implements Board{

    public String post;
    public int post_num;

    public String admin = "admin";

    @Override
    public void boardInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("-공지게시판-");
        System.out.println("어드민 계정을 입력해주세요.");
        String admin = sc.next();
        if(admin.equals(this.admin)){
            System.out.print("게시글을 입력하세요 : ");
            String post = sc.next();
            this.post = post;
            post_num++;
        }else
            System.out.println("틀린 계정입니다.");
    }

    @Override
    public void boardModify() {
        Scanner sc = new Scanner(System.in);
        System.out.println("-공지게시판-");
        System.out.println("어드민 계정을 입력해주세요.");
        String admin = sc.next();
        if(admin.equals(this.admin)){
            System.out.println("게시글을 수정합니다.");
            System.out.print("게시글을 입력하세요 : ");
            String post = sc.next();
            this.post = post;
        }else
            System.out.println("틀린 계정입니다.");
    }

    @Override
    public void boardDelete() {
        Scanner sc = new Scanner(System.in);
        System.out.println("-공지게시판-");
        System.out.println("어드민 계정을 입력해주세요.");
        String admin = sc.next();
        if(admin.equals(this.admin)){
            System.out.println("게시글을 삭제합니다.");
            this.post = "";
            post_num--;
        }else
            System.out.println("틀린 계정입니다.");
    }

    @Override
    public void boardOutput() {
        System.out.println("-공지게시판-");
        System.out.println("게시글 보기");
        System.out.println(post);
    }
}
