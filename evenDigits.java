public class even_digits {
    public static void main(String[] args) {
        int nums[]={12,345,2,6,28,96};
        System.out.println(findNumbers(nums));
        System.out.println(digits(453535));
    }

    static int findNumbers(int [] nums)
    {
        int count =0;
        for(int num : nums)
        {
            if(isEven(num))
            {
                count++;
            }
        }
        return count;
    }

    static boolean isEven(int num)
    {
        int numOfDigits=digits(num);
        if(numOfDigits % 2 == 0)
        {
            return true;
        }
        return false;
    }

    static int digits (int num)
    {
        int count =0;
        if(num<0)
        {
            num = num *-1;
        }
        while(num>0)
        {
            count ++;
            num = num/10;
        }
        return count;

    }
}
