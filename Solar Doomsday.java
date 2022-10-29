/*
to sole the problem 
-find the largest square root of the input number using the Math.sqrt() function
-then subtract from the orginal input and repeat the process untill the total area equals to the first input

*/

public class Solution {

public static void main(String[] args) {
        int response[] = solution(15324);
        System.out.println(Arrays.toString(response) );
    }
    
    static int[] solution(int area){
	    
        String numbers = "" ;
        int startingNumber = (int)Math.sqrt(area) ; 
        int largestSquare =0;
        int subAreas =0;
        int newArea = area;
        while(true ){
            largestSquare = startingNumber*startingNumber;
            
            if(largestSquare <= newArea) {
                numbers = numbers +  largestSquare + ",";
                subAreas +=largestSquare;
                newArea = newArea - largestSquare;
                if(subAreas == area){
                    break;
                }
                startingNumber = (int)Math.sqrt(newArea) +1;
                
            }
            
       if(startingNumber>1)
             startingNumber--;
       else 
           startingNumber =1;

        }
        numbers = numbers.substring(0,numbers.length()-1);
        String newNumbers[] = numbers.split(",") ;
        int arrayNum[] = new int[newNumbers.length];
        for(int i=0; i<newNumbers.length ; i++){
            arrayNum[i] = Integer.parseInt( newNumbers[i] );
        }
        
        return arrayNum ;

    }
	
	}
