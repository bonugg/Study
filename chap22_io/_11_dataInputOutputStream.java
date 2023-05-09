package chap22_io;

import chap22_io.clazz.Car;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class _11_dataInputOutputStream {
    public static void main(String[] args) {
        try {
            DataOutputStream dos = new DataOutputStream(new FileOutputStream(
                    "D:/bitcamp/JavaLec" +
                            "/JavaProgramming/src/" +
                            "chap22_io/car.txt"
            ));

            dos.writeUTF("현대");
            dos.writeUTF("아반떼");
            dos.writeDouble(150.5);
            dos.writeInt(2000);

            dos.writeUTF("현대");
            dos.writeUTF("소나타");
            dos.writeDouble(189.3);
            dos.writeInt(3000);

            dos.writeUTF("현대");
            dos.writeUTF("제네시스");
            dos.writeDouble(220.7);
            dos.writeInt(5000);

            dos.flush();
            dos.close();

            DataInputStream dis = new DataInputStream(new FileInputStream(                    "D:/bitcamp/JavaLec" +
                    "D:/bitcamp/JavaLec" +
                    "/JavaProgramming/src/" +
                    "chap22_io/car.txt"));
            List<Car> carList = new ArrayList<>();

            for (int i = 0; i < 3; i++) {
                String company = dis.readUTF();
                String model = dis.readUTF();
                double maxSpeed = dis.readDouble();
                int price = dis.readInt();

                Car c = new Car(company,model,maxSpeed,price);

                carList.add(c);
            }
            System.out.println(carList.toString());
            dis.close();

        }catch (FileNotFoundException fnfe){
            System.out.println(fnfe.getMessage());
        }catch (IOException ie){
            System.out.println(ie.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
