package assignment.day2;
class VampireNumbers
{
    public static void main(String args[])
    {	
    	for (int digit=1;digit<=100;digit++)
    	{
    		if(VampireNumbers.isVampire(digit))
    		{
    	        System.out.println(digit);

    		}
    	}
    }
    
     static boolean isVampire(int number)
    {
    	int temp,remainder,i=0;
        boolean isvamp = false;
        int arr[] = new int[4];
        temp = number;
        while(temp!=0){
            remainder = temp%10;
            arr[i] = remainder;
            temp = temp/10;
            i++;
        }
        for(int z=0;z<4;z++){
            for(int j=0;j<4;j++){
                for(int k=0;k<4;k++){
                    for(int l=0;l<4;l++){
                        
                        int fang = (arr[z]*10 + arr[j]) * (arr[k]*10 + arr[l]);
                        if(fang==number){
                            isvamp = true;
                            break;
                        }
                    }
                }
            }
        }
        return isvamp;
    }
}