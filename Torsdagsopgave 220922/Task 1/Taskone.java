public class Taskone {  
 public static void main(String args[]){  
  int r,sum=0,temp;    
  int n=454; 
  //Tallet som variabel der skal undersøges..
  //Kan ikke sætte "Den laks skal ned, ind her dog"

  temp=n;    
  while(n>0){    
   r=n%10;  //Får restværdi  
   sum=(sum*10)+r;    
   n=n/10;    
  }    
  if(temp==sum)    
   System.out.println("Er palindrome");    
  else    
   System.out.println("Ikke palindrome");    
}  
}  
