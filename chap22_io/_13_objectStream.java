package chap22_io;

import chap22_io.clazz.Car;

import java.io.*;

public class _13_objectStream {
    public static void main(String[] args) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(
                    "D:/bitcamp/JavaLec" +
                            "/JavaProgramming/src/" +
                            "chap22_io/object.txt"
            ));
            Car c1 = new Car("현대", "아반떼", 155.6, 2000);
            Car c2 = new Car("현대", "소타나", 185.3, 3000);

            oos.writeObject(c1);
            oos.writeObject(c2);
            oos.flush();
            oos.close();

            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
                    "D:/bitcamp/JavaLec" +
                            "/JavaProgramming/src/" +
                            "chap22_io/object.txt"
            ));
            Car c3 = (Car)ois.readObject();
            Car c4 = (Car)ois.readObject();
            System.out.println(c3.toString());
            System.out.println(c4.toString());
            ois.close();

        }catch (FileNotFoundException fnfe){
            System.out.println(fnfe.getMessage());
        }catch (IOException ie){
            System.out.println(ie.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
