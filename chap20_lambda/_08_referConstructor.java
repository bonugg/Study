package chap20_lambda;

import chap20_lambda.clazz.Academy;
import chap20_lambda.clazz.ComAcademy;
import chap20_lambda.clazz.EngAcademy;

public class _08_referConstructor {
    public static void main(String[] args) {
        //comLectureInfo((str, num) -> new Academy(str, num));
        comLectureInfo(Academy::new);
        System.out.println("-----------------");
        //engLectureInfo((str) -> new Academy(str));
        engLectureInfo(Academy::new);


    }
    public static void comLectureInfo(ComAcademy ca){
        Academy ac = ca.getComAcademy("컴퓨터", 50);
        ac.setLecTime(10);
        ac.lectureInfo();
    }

    public static void engLectureInfo(EngAcademy ea){
        Academy ac = ea.getEngAcademy("영어");
        ac.setStuCnt(40);
        ac.setLecTime(5);
        ac.lectureInfo();
    }
}
