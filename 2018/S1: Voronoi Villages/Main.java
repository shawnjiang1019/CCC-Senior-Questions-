import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    //store villages;
    int n = scan.nextInt();

    int [] villages = new int[n]; 
    int a = 0;
    for (int i = 0; i < n; i++){
      a = scan.nextInt();
      villages[i] = a; 
    }
    //sort village
    int temp = 0;  
    for(int i=0; i < villages.length; i++){  
      for(int j=1; j < (villages.length-i); j++){  
        if(villages[j-1] > villages[j]){  
          //swap elements  
          temp = villages[j-1];  
          villages[j-1] = villages[j];  
          villages[j] = temp;  
        }    
      }  
    }
    
    //Look for smallest village
    double size = 0;
    double smallest = villages[villages.length - 1];
    double p1 = 0;
    double p2 = 0;
    for (int i = 1; i < villages.length - 1; i++){
      p1 = (villages[i] - villages[i - 1]) / 2;
      p2 = (villages[i + 1] - villages[i]) / 2;
      size = p1 + p2;
      if (size < smallest){
        smallest = size;
      }
      size = 0;
    }
    System.out.println(smallest + 1);
  }
}
