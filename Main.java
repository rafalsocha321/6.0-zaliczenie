import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.println("Wprowadź 10 liczb całkowitych"); 
    int tab[] = new int[10];

    Scanner scanner = new Scanner(System.in);
     for(int i=0; i<10; i++)
       {
         tab[i] = scanner.nextInt();
       }

 
    int rob;

    for(int a=0; a<9; a++)
      {
      for(int i=0; i<9; i++)
        {
          if(tab[i]>tab[i+1])
          {
            rob=tab[i];            
            tab[i]=tab[i+1];
            tab[i+1]=rob;
          }
        }
      }
      
     System.out.println("Posortowane elementy wprowadzone do tablicy: "); 
      for(int i=0; i<10; i++)
        {
          System.out.print(tab[i] + " "); 
        }
  }
}
  