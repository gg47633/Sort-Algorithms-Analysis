public class FileCreation {

  public static void main(String[] args) {
    //Creates FileGenerator object
    FileGenerator fileGen = new FileGenerator();
    String smallLocation = "src/src/SmallFiles/";
    String mediumLocation = "src/src/MediumFiles/";
    String largeLocation = "src/src/LargeFiles/";

    //Generate files
    for(int i = 1; i <= 30; i++) {
      fileGen.generate(10000, smallLocation + "smallFile" + i );
      fileGen.generate(100000, mediumLocation + "mediumFile" + i);
      fileGen.generate(1000000, largeLocation + "largeFile" + i);
    }
  }
}
