package MainPackage;

public class MyInteger2 {
		private int value;
		
		public MyInteger2(int value)
		{
				this.value = value;
		}
		public int getValue()
		{
			return value;
		}
		
		public boolean isEven() {
			if (this.value % 2 == 0)
			{
					return true;
			}
			else
			{
			return false;		
			}
		}
	
		public boolean isOdd() {
			if (this.value % 2 == 1)
			{
				return true;
			}
			else
			{
			return false;
			}
		}
		
		public boolean isPrime()
		{
			if (this.value % 2 == 0)
			{
				return false;
			}
			for (int i = 3; i * i <= this.value; i+=2)
			{
				if (this.value % i == 0)
					return false;
			}
			return true;
		}

		public static boolean isEven(int value)
		{
			if (value % 2 == 0)
			{
				return true;	
			}
			else
			{
			return false;
			}
		}
		
		public static boolean isOdd(int value)
		{
			if (value % 2 == 1)
			{
				return true;
			}
			else
			{
			return false;	
			}
		}
		
		public static boolean isPrime(int value)
		{
			if (value % 2 == 0)
			{
				return false;
			}
			for (int i = 3; i * i <= value; i+=2)
			{
				if (value % i == 0)
					return false;
			}
			return true;
		}
		public static boolean isEven(MyInteger2 myInt)
		{
			if (myInt.getValue() % 2 == 0)
			{
				return true;
			}
			else
			{
			return false;
			}
		}
		
		public static boolean isOdd(MyInteger2 myInt)
		{
			if (myInt.getValue() % 2 == 1)
			{
				return true;
			}
			else
			{
			return false;
			}
		}
		
		public static boolean isPrime(MyInteger2 myInt)
		{
			if (myInt.getValue() % 2 == 0)
			{
				return false;
			}
			for (int i = 3; i * i <= myInt.value; i+=2)
			{
				if (myInt.getValue() % i == 0)
					return false;
			}
			return true;
		}
		
		public static int parseInt(char[] myInt)
		{
		int j = 0;
		for (int i = 0; i< myInt.length; i++ )
		{
			j += myInt[i];
		}
		return j;
		}
		
		public static int parseInt(String myInt)
		{
			int j = parseInt(myInt);
			return j;
		}
}
