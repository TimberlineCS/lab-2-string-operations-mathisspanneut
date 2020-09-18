/* Mathis Spanneut 
AP CSA
September 1st*/
public class wordScramble{
  public static void main(String args[]){
    String a = "Scissors";
    String ab = a.toLowerCase();
    String firstHalf = ab.substring(0, ab.length()/2);
    String secondHalf = ab.substring(ab.length()/2);
    System.out.println(secondHalf+firstHalf);
    String b = "Picture";
    String bc = b.toLowerCase();
    String firstHall = bc.substring(0, bc.length()/2);
    String secondHall = bc.substring(bc.length()/2);
    System.out.println(secondHall+firstHall);
    String c = "Computer";
    String cd = c.toLowerCase();
    String firstHally = cd.substring(0, cd.length()/2);
    String secondHally = cd.substring(cd.length()/2);
    System.out.println(secondHally+firstHally);
    System.out.println("$$$--------$$$");
    System.out.println("$$$$$----$$$$$");
    System.out.println("$$$$$$$$$$$$$$");
    System.out.println("$$$$$----$$$$$");
    System.out.println("$$$--------$$$");
  }
}