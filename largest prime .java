
class prime {
	
	public static long findprime(long number)
	{
		for(long count=2; count<=number/2; count++)
		{
			if(number%count==0)
			{
				return (0) ;
			}
		}
		System.out.println(number+" is a prime number");
		return (number);
	}
	
	public static void main(String[] args) {
		
		System.out.println("prg starts");
		long num = 600851L, large = 0;
		System.out.println(num);
		for(long repeat = 2; repeat < num; repeat++)
		{
			if(num % repeat == 0)
			{
				if(repeat == 2)
				{
					System.out.println(repeat+" is a prime number");
				}
				else if(repeat % 2 != 0)
				{
					long check = findprime(repeat);
					if(large < check)
					{
						large = check;
					}
				}
			}
		}
		System.out.println("largest prime number is "+ large);
		System.out.println("prg ends");
	}

}
