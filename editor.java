import java.io.*;
import java.util.*;

public class editor {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n,c;
        int a;
        String mainstring="";
        String temp,prev1="",prev2="",parts="";
        int token,obj,point;
        token = 0;
        n = sc.nextInt();
        String buffer[] = new String[n];
        int ctr = 0;

        Stack<String> st =new Stack<String>();

        while(n!=0)
            {
                a = sc.nextInt();
	
                switch(a)
                    {
                        case 1:{
                   //                 prev1 = mainstring;
                                    token = 1;
				    parts = sc.nextLine();
				    parts = parts.substring(1);
                                    mainstring = mainstring + parts;
                 //   System.out.println("mainstring is "+mainstring+"\n");
                            st.push(mainstring);
                            //buffer[ctr]=mainstring;
                            //ctr++;
                            break;
                               }
                    
                        case 2:{
                            point = sc.nextInt();

                        //    prev2 = mainstring;
                            token = 2;

			    //if(point!=mainstring.length()-1)
                  //          	temp = mainstring.substring(0,point-1) +mainstring.substring(point+1,mainstring.length()-1);        
			    //else
				temp = mainstring.substring(0,mainstring.length()-point);        

                            mainstring = temp;
                            st.push(mainstring);
                           // buffer[ctr]=mainstring;
                           // ctr++;
                            break;
                                }
                                    
                        case 3: {
                                    point = sc.nextInt();
                                    System.out.println(mainstring.charAt(point-1));
                                    break;
                        }
                    
                        case 4: {
                                  
			   // if((ctr-2) >= 0)
			                st.pop(); 
                            if(st.size()!=0)
                            {
                            
                             mainstring = st.peek();}
                            else
                                {mainstring = "";}
                           // ctr--;
//}
			 //  System.out.println("mainstring is "+mainstring+"\n");
                            /*
                            if(token == 1)
                                        {
                                            mainstring = prev1;
                                    }
                                    else if(token == 2)
                                        {
                                            mainstring = prev2;
                                    }*/
                            break;
                        }
                    
                        
                }
        n--;

        }
    }
}
