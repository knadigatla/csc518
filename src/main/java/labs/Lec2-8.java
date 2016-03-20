import java.io.*;

class Main
{
  public static void main(String[] args) throws IOException
  {
    File outFile = new File("sample1.data");
    FileOutputStream outStream = new FileOutputStream(outFile);
    byte[] ba = {10,20,30,40,50,65,66,67};
    outStream.write(ba);
    outStream.close();

  //  File inFile
  }
}
