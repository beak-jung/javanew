package cls;

public class MyFile {
    private String fileName;
    private int fileSize;

    public MyFile() {
        fileName = "";
        fileSize = 0;
    }

    public MyFile(String fileName, int fileSize){
        this.fileName = fileName;
        this.fileSize = fileSize;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }

    public int getFileSize() {
        return fileSize;
    }

    @Override
    public String toString() {
        return String.format("File name %s, file size %d", fileName, fileSize);
    }

//    @Override
//    public boolean equals(Object o) {
//        if (o == null || getClass() != o.getClass())
//            return false;
//
//        MyFile myFile = (MyFile) o;
//        return fileSize == myFile fileSize &&
//                fileName.equals(myFile.getFileName());
//
//    }
}
