//
import java.util.Scanner;
class VampireNumbers
{
    public static void main(String args[])
    {	int count=0;
    int digit=1;
    int length;
            while (count<=100)
            {length=VampireNumbers.getLength(digit);
            System.out.println(digit);
            if (length%2==0) {
                if (VampireNumbers.isVampire(digit,length)) {
                    System.out.println(digit);

                    count++;

                }
            }
            digit++;
   	}
    }
    
     static boolean isVampire(int number,int length)
    {
    	int temp,remainder,i=0,fact1,fact2;
        boolean isvamp = false;
        int arr[] = new int[length];
        temp = number;
        while(temp!=0){
            remainder = temp%10;
            arr[i] = remainder;
            temp = temp/10;

            i++;
        }

        if(length<=4) {
            for (int z = 0; z < length; z++) {
                for (int j = 0; j < length; j++) {
                    for (int k = 0; k < length; k++) {
                        for (int l = 0; l < length; l++) {
                            fact1 = (arr[z] * 10 + arr[j]);
                            fact2 = (arr[k] * 10 + arr[l]);
                            int fang = fact1 * fact2;
                            if (fang == number && VampireNumbers.getLength(fact1) == length / 2 && VampireNumbers.getLength(fact2) == length / 2) {
                                isvamp = true;
                                break;
                            }
                        }
                    }
                }
            }
        }
        if (length>4&&length<=6)
        {
            for (int a = 0; a < length; a++) {
                for (int b = 0; b < length; b++) {
                    for (int c = 0; c < length; c++) {
                        for (int d = 0; d < length; d++) {
                            for(int e=0;e<length;e++){
                                for(int f=0;f<length;f++){

                                    fact1 = (arr[a] * 100 + arr[b]*10 +arr[c]);
                                    fact2 = (arr[d]*100+arr[e] * 10 + arr[f]);
                                    int fang = fact1 * fact2;


                                    if (fang == number ) {
                                        isvamp = true;
                                        break;
                                }
                            }


                            }
                        }
                    }
                }
            }
        }
        return isvamp;
    }
    static int getLength(int digit)
    {
        return (int)(Math.log10(digit)+1);

    }
}