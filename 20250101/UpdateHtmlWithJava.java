import java.io.*;

public class UpdateHtmlWithJava {
    public static void main(String[] args) {
        // Java에서 출력할 내용
        String output = "Hello, World from Java!";

        // HTML 파일 경로
        String htmlFilePath = "index.html";

        try {
            // HTML 파일 읽기
            BufferedReader reader = new BufferedReader(new FileReader(htmlFilePath));
            StringBuilder htmlContent = new StringBuilder();
            String line;

            // HTML 파일 내용 읽기
            while ((line = reader.readLine()) != null) {
                // Java 출력 내용을 삽입할 부분 찾기
                line = line.replace("<!-- Placeholder for Java output -->", output);
                htmlContent.append(line).append("\n");
            }

            reader.close();

            // 수정된 HTML 내용 파일로 저장
            FileWriter writer = new FileWriter(htmlFilePath);
            writer.write(htmlContent.toString());
            writer.close();

            System.out.println("HTML file updated with Java output.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
