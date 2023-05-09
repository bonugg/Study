package chap98_homework.nc230329;

import chap98_homework.nc230329.clazz.GradeOne;
import chap98_homework.nc230329.clazz.GradeTwo;
import chap98_homework.nc230329.clazz.InputStudent;
import chap98_homework.nc230329.clazz.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
public class _01_main {

    public static void main(String[] args) {
        List<Student> stdlist = new ArrayList<>();
        InputStudent is = new InputStudent();
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("---------------");
            System.out.println("1. 학생 정보 입력");
            System.out.println("2. 학생 점수 입력");
            System.out.println("3. 학생 상세 보기");
            System.out.println("4. 모든 학생 출력");
            System.out.println("5. 종료\n");
            System.out.print("번호를 입력하세요 : ");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    stdlist.add(is.inputStu());
                    break;
                case 2:
                    System.out.println("---------------");
                    System.out.print("학생 번호 입력 : ");
                    no = sc.nextInt();
                    System.out.print("학생 이름 입력 : ");
                    name = sc.next();
                    while (true){
                        System.out.print("학년 입력 : ");
                        grade = sc.nextInt();
                        if(grade == 0 || grade > 3){
                            System.out.println("1~3학년 사이로 입력해주세요.");
                            continue;
                        }
                        break;
                    }
                    for (int i = 0; i < std.length ; i++) {
                        if(std[i] != null) {
                            if (std[i].getNo() == no && std[i].getName().equals(name) &&
                                    std[i].getGrade() == grade) {
                                if(grade == 1){
                                    System.out.println("---------------");
                                    System.out.print("자바 점수 : ");
                                    java = sc.nextInt();
                                    System.out.print("네트워크 점수 : ");
                                    network = sc.nextInt();
                                    System.out.print("C언어 점수 : ");
                                    c_lang = sc.nextInt();
                                    std[i] = new GradeOne(no,name,grade,java, network, c_lang);
                                } else if (grade == 2) {
                                    System.out.println("---------------");
                                    System.out.print("리눅스 점수 : ");
                                    linux = sc.nextInt();
                                    System.out.print("네트워크응용 점수 : ");
                                    network_ex = sc.nextInt();
                                    System.out.print("C언어응용 점수 : ");
                                    c_lang_ex = sc.nextInt();
                                    std[i] = new GradeTwo(no,name,grade,linux, network_ex, c_lang_ex);
                                }

                            }else {
                                System.out.println("없는 학생입니다.");
                            }
                        }

                    }
                    break;
                case 3:
                    System.out.println("---------------");
                    while (true) {
                        System.out.print("학년 입력 : ");
                        grade = sc.nextInt();
                        if (grade == 0 || grade > 3) {
                            System.out.println("1~3학년 사이로 입력해주세요.");
                            continue;
                        }
                        break;
                    }
                    System.out.print("학생 번호 입력 : ");
                    no = sc.nextInt();
                    for (int i = 0; i <std.length ; i++) {
                        if(std[i] != null){
                            if (std[i].getNo() == no && std[i].getGrade() == grade) {
                                std[i].showstinfo();
                            }

                        }

                    }
                    break;
                case 4:
                    for (int i = 0; i < std.length; i++) {
                        if(std[i] != null){
                            std[i].showstinfo();
                            System.out.println("---------------");
                        }
                    }
                    break;
                case 5:
                    System.exit(0);
            }

        }
    }
}*/
