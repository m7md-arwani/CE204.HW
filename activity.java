import java.util.* ; 
import java.io.*  ; 

public class activity {
   
    public static void main(String[] args) {

         Hashtable <Integer,stu> h = new Hashtable<Integer,stu>() ;

        h.put(1,new stu("Mohammad","Makkah")) ;  // Manual addition for testing.
        Set<Integer> keys = h.keySet() ; // will be used to iterate over the hastable

        int oper ; // will select the operation
        Scanner get = new Scanner(System.in) ; 
        System.out.println("1 for adding\n2 for removing\n3 for searching\n4 for updating") ; 
        oper = get.nextInt() ; 

        switch(oper) {
            case 1:
            System.out.println("Enter the key") ; 
            int k = get.nextInt() ; 
            get.nextLine() ; 
            System.out.println("Enter the name") ;
            String n = get.nextLine() ;
            System.out.println("Enter the address") ; 
            String ad = get.nextLine() ; 
            h.put(k, new stu(n,ad)) ; 
            System.out.println("Added Sucessfuly") ;
            break ;  

            case 2 :
                System.out.println("Ente the key you want to remove") ; 
                int kToRm = get.nextInt() ; 
                h.remove(kToRm) ; 
                System.out.println("Done!") ; 
                break; 

            case 3 :
            System.out.println("Enter the key to show its info") ; 
            int kToRe = get.nextInt() ; 
            System.out.println(h.get(kToRe).getName()+" "+ h.get(kToRe).getAddress()) ; 

            break;

            case 4 :
            System.out.println("Enter the key to modify") ; 
            int km = get.nextInt() ; 
            get.nextLine() ; 
            System.out.println("Enter the name") ;
            String nam = get.nextLine() ;
            System.out.println("Enter the address") ; 
            String addd = get.nextLine() ; 
            h.put(km, new stu(nam,addd)) ; 
            System.out.println("Updated! New value is \n") ;
            System.out.println(h.get(km).getName()+" "+ h.get(km).getAddress()) ; 
            break ; 



        }
        get.close();  
        
     // file updating process will run everytime.
         
        try {
         FileWriter writer = new FileWriter("C:/Users/Arwani/Desktop/Spring_Semester2021/CE204/CE204,MED/vs/std.txt") ; // change file path if needed. 
         writer.write("Number    Name    Address\n"); // the head of the text file. 
         for(Integer key:keys) {
             
        writer.write(key+"        "+h.get(key).getName()+"    "+h.get(key).getAddress()+"\n") ;
             
         } 
         writer.close();
        
        }

        catch(Exception ex) { ex.printStackTrace(); }
      
        
        
    }

    
}





