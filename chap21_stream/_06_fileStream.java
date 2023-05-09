package chap21_stream;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class _06_fileStream {
    public static void main(String[] args) {
        //hyundai.txt 경로 객체 얻기
        try {
            Path path = Paths
                    .get(_06_fileStream.class
                            .getResource("hyundaicar.txt")
                            .toURI());
            Stream<String> fileStream = Files.lines(path, Charset.defaultCharset());
            fileStream.forEach(line -> System.out.println(line));
            //File.lines() => 텍스트 파일을 행으로 분리해서 행들의 스트림을 만들어준다.
        }catch (URISyntaxException ue){
            ue.printStackTrace();
        }catch (IOException ie) {
            ie.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
