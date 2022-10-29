


public class Solution {

public static void main(String[] args) {
        System.out.println("Hello World!");
        int response[] = solution(15324);
        System.out.println(Arrays.toString(response) );
    }
    
    static int[] solution(int area){
        //ArrayList<Integer> list = new ArrayList<>();
        String numbers = "" ;
        int startingNumber = (int)Math.sqrt(area) ; 
        int largestSquare =0;
        int subAreas =0;
        int newArea = area;
        while(true ){
            largestSquare = startingNumber*startingNumber;
            
            if(largestSquare <= newArea) {
                //list.add((Integer)largestSquare);
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
        //System.err.println(" value: " + numbers );
        numbers = numbers.substring(0,numbers.length()-1);
        String newNumbers[] = numbers.split(",") ;
        //System.err.println(" value: " + numbers );
        int arrayNum[] = new int[newNumbers.length];
        for(int i=0; i<newNumbers.length ; i++){
            arrayNum[i] = Integer.parseInt( newNumbers[i] );
        }
        
        return arrayNum ;

        //return list.stream().mapToInt(i->i).toArray();
    }
	
	}