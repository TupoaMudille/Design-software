
class JpegConvert{
    void convertToJpeg(String pathSource){
        System.out.println("File: " + pathSource);
        System.out.println("Converting to JPEG...\nSuccess!");}
    void saveJpeg(String pathSave){System.out.println("Saved into "+pathSave+"\n");}
}

class BinConvert{
    void convertToBin(String pathSource){
        System.out.println("File: " + pathSource);
        System.out.println("Converting to BIN...\nSuccess!");}
    void saveBin(String pathSave){System.out.println("Saved into "+pathSave+"\n");}
}
enum FORMAT{
    JPEG, BIN;
}
class Converter{

    public void converter(String pathSource, FORMAT format, String pathSave){

        switch(format){
            case JPEG:{
                JpegConvert jpegConvert= new JpegConvert();
                jpegConvert.convertToJpeg(pathSource);
                jpegConvert.saveJpeg(pathSave);
                break;}
            case BIN:{
                BinConvert pngConvert = new BinConvert();
                pngConvert.convertToBin(pathSource);
                pngConvert.saveBin(pathSave);
                break;}
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Converter converter = new Converter();
        converter.converter("C:/test_place/anywhere/here/file.jpeg",FORMAT.BIN, "C:/test_place/anywhere/here");
    }
}

