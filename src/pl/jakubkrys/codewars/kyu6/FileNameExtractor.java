package pl.jakubkrys.codewars.kyu6;

public class FileNameExtractor {
    public static String extractFileName(String dirtyFileName) {
        return dirtyFileName.substring((dirtyFileName.indexOf("_")+1), (dirtyFileName.lastIndexOf(".")));
    }

    public static void main(String[] args) {
        System.out.println(extractFileName("1231231223123131_myFile.tar.gz2"));
    }
}
