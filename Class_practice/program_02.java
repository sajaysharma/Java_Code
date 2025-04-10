public class program_02{
  public static void main(String args[]){
    System.out.println("My first Args is: "+args[0]);
    System.out.println("My second Args is: "+args[1]);
    System.out.println("My third Args is: "+args[2]);
    System.out.println("My fourth Args is: "+args[3]);

    int length = args.length;

    System.out.println("Length of command line args: " + length);
}
}