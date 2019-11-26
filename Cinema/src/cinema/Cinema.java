/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinema;
import java.util.*;
import java.io.*;
class Cinema
{
 public static void main(String[]args)  throws IOException, InterruptedException
 { 

   Scanner scan =new Scanner(System.in);

   
    	System.out.print("  WELCOME TO ONLINE MOVIE TICKET BOOKING :\n" );
            for(int i=0;i<30;i++){System.out.print("*");}
	    System.out.println("\n 1) Booking                                 | \n");
	    System.out.println(" 2) Seats details                               | \n");
	    System.out.println(" 3) Movie                                       | \n");
	    System.out.println(" 4)Receipts                                     | \n");
	    System.out.println(" 5)Exit                                  | \n");
	    for(int i=0;i<30;i++){System.out.print("*");}
	    System.out.println("\nenter your choice ");
		int choice= scan.nextInt();
		int arr[];
		String name;
		int  number;
		 PriorityQueue q=new PriorityQueue();
                 

    switch(choice  ) // outer swicth
	    {
	    	case 1:  // case 1 of outer switch
	    	{
	    	 while(true)   
	    	 {             // while body 
	    	 	
				   
	    	    System.out.println("1) person details  \n\n2) Go back to main menu   ");
	    	    System.out.println("enter your choice ");
	            int choice1=scan.nextInt();
				    
              
	    	 	switch(choice1)
	    	 	{   // inner switch 
	    	 		 case 1:            // inner case 
	    	 		 {
	    	 		 	 Peoples p=new Peoples();
                         System.out.print("\t\t\t\t\t\tGIVE YOUR DETAILS HERE " );  
                         System.out.println("\n enter your name \n\n");
                         name =scan.next();
                         p.setName(name );
                         System.out.println("enter your Phone number\n\n");
                         number  =scan.nextInt();
                         p.setphone_number(Integer.toString(number));		 	
                         

                         
                          q.add(p.getName());
                          q.add(p.getphone_number());
                          System.out.println("your detail is ");
                          Iterator iter=q.iterator();
                          while(iter.hasNext())
                          {
                          	System.out.println(iter.next());
                          }
                          Thread.sleep(4000);
	                             break;
                          
	    	 		 }

	    	 		  case 2:
	    	 		   {

	
	    	 		   	 String[] arguments = new String[] {"123"};
                            main(arguments);   
		    	 			break;


	    	 		   }

  
	    	 		


	    	   } // inner switch of booking 
             } // inner while of booking 
           }  // case of booking 
	    	 		  case 2:
	    	 		  {
                            
                             while(true)
                             {
				        System.out.println("\t\t\t\t TICKETING AND SEATS INFORMATION ");
				        System.out.println("1) Time  of movie  ");
				          System.out.println("2) go back to main menu ");
				          System.out.println("enter your choice \n\n\n");
	                        int choice3=scan.nextInt();
				         

				        
				        	  switch(choice3)
				        	  
				        	 {
				        	 	case 1:
				        	 	{   
				    	 		  	 System.out.println("TIMING OF MOVIE \n\n");
				    	 		  	 System.out.println("MON TO THUR");
				    	 		  	 System.out.println("1) 12.00  - 3.00 PM");
				    	 		  	 System.out.println("2) 6.00   - 9.00 PM");
				    	 		  	   
				    	 		  	 System.out.println("FRIDAY TIMING\n\n ");
				    	 		  	 System.out.println("3) 2.00 - 5.00 PM");
			                        

			                        System.out.println("\n\nenter your choice ");
			                        int choice4=scan.nextInt();
			                         switch(choice4)
			                         {

			                         	 case 1:
			                         	 {
			                         	 System.out.println("Congratulations your seat is reserved ");
			                         	 
			                         	 
			                              q.add("12.00  - 3.00 PM");
			                              System.out.println("Time of ticket is ");
			                              Iterator iter=q.iterator();
			                              while(iter.hasNext())
			                              {
			                              	 System.out.println(iter.next());
			                              }
			                               Thread.sleep(4000);
				                             break;

			                             }
			                              case 2:
				                           {
				                         	 System.out.println("Congratulations your seat is reserved ");
				                         	 
				                             q.add("2.00  - 4.00 PM");
					                            Thread.sleep(4000);
						                                break;
					                        }

					                         case 3:
				                           {
				                         	 System.out.println("Congratulations your seat is reserved ");
                                                                 
				                         	  
				                         	 
				                           q.add("6.00  - 9.00 PM");
				                           System.out.println("Time of ticket is ");
				                              Iterator iter=q.iterator();
				                              while(iter.hasNext())
				                              {
				                              	 System.out.println(iter.next());
				                              }
				                           Thread.sleep(4000);
					                             break;

				                          }
			                         }	
			                         break;
                         
                                 } 

			                         	 


			                         	 

                                    case 2:
			                        {
			                        	
				    	 		   	 String[] arguments = new String[] {"123"};
			                            main(arguments);   
					    	 			break;


			                        }
                            
                	 	     }  // choice4 

                         
   
                       } // while of case 2 
 


               }  // main case 2 
				        	 
  
            	  
            	    case 3:
            	    {

                          
                          while(true)
                          {//names of movies
                              	 System.out.println("MOVIE CHOICES ");
                          System.out.println("1) TOY STORY ");
                          System.out.println("2) AVENGERSENDGAME");
                          System.out.println("3) HARRY POTTER");
                          System.out.println("4) go to main menu");
				          System.out.println("enter your choice ");
                                          
				           int choice6=scan.nextInt();

                          	  switch(choice6)
                          	  {
                          	  	  case 1:
                          	  	  {

                                   System.out.println("movie booked ");
                                   q.add("TOY STORY");
                                    Thread.sleep(1000);
                          	  	  	break;
                          	  	  }
                     
                                  case 2:
                          	  	  {

                                   System.out.println("movie booked ");
                                   q.add("AVNGERSENDGAME ");
                                    Thread.sleep(1000);
                          	  	  	break;
                          	  	  }

                                  case 3:
                          	  	  {

                                   System.out.println("movie booked ");
                                   q.add("HARRY POTTER");
                                    Thread.sleep(1000);
                                           
                          	  	  	break;
                          	  	  }
                                  case 4: {
                                      System.out.println();
                                      q.add("go to main menu");
                                      Thread.sleep(1000);
                                      break;
                                  }

                          	  }
                          }
                          


                       
            	    } 

            	     case 4:
            	     {
            	     	   Iterator iter=q.iterator();
            	     	  while(iter.hasNext())  {
            	     	  	 System.out.println(iter.next());

            	     	   }
            	     }


       case 5:
       {
       	  System.exit(0);
       }

    }
 }
	
}
