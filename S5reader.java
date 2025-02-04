import java.io.*;

class S5reader {
   public static void main (String[] args) throws FileNotFoundException, IOException {
   FileReader file = new FileReader("students5.csv");
   BufferedReader buff = new BufferedReader(file);
   String line = buff.readLine();
   
   while (line != null) {
      System.out.println(line);
      line = buff.readLine();
      String[] fields = line.split(",");
      Students5 student = new Students5(fileds[0], Integer.parseInt(field[1]), field[2], Double.parseDouble(fields[3]), fields[4]);
     // System.out.println(fields[0]);
      System.out.println(student.getName() + " --- " + student.getTown());
      line = buff.readLine();
      
     // System.out.println(fields[4]);
      }
      buff.close();
      file.close();
   }
}