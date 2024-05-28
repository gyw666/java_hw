package fileOperator;

public class Test {
    public static void main(String[] args) {
        String filePath="D:\\java\\IdeaProjects\\fileout\\output1.txt";
        String content="我是私人\n我爱赤石\n";
        System.out.println(fileUtil.fileWrite(filePath, content));

        String readContent = fileUtil.fileRead(filePath);
        System.out.println(readContent);
    }
}
