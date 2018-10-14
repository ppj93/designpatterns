
public class test {
	
	public static int poly(int[] c, int x, int i){
		if(i == c.length-1)
			return c[i];
		
		return c[i] + x*poly(c, x, i+1);
	}
	
	public static void findRamanuj(double n){
		double i=1, j=Math.ceil(Math.cbrt(n));
		
		while(i <= j){
			double cub = (i*i*i) + (j*j*j);
			if(cub > n)
				j--;
			else if(cub < n)
				i++;
			else {
				System.out.println(i + " " + j);
				i++; j--;
			}
		}
	}
	
	public static int findNumberOfCarries(int n1, int n2){ 
		int carries = 0;
		
		while(n1 >0 && n2 > 0){
			int firstDigitN1 = n1 % 10;
			int firstDigitN2 = n2 % 10;
			
			if(firstDigitN1 + firstDigitN2 >= 10)
				carries++;
			
			n1 /= 10;
			n2 /= 10;
		}
		
		return carries;
	}
	
	public static void StanOllieveWins(double d){
		double k =  Math.ceil(Math.log(d) / Math.log(9));
		
		if(k % 2 == 1)
			System.out.print("Stanleyyyy");
		else
			System.out.print("OLIIIIE");

	}
	
	public static void BulbOnOff(long n) {
		boolean isBulbOn=false;
		
		for(int i=2; i<=n/2; i++)
			if(n % i == 0)
				isBulbOn = !isBulbOn;
		
		System.out.println(isBulbOn);
			
	}
	
	public static void main(String[] args) {
		/*Scanner s = new Scanner(System.in);
		int total = Integer.parseInt(s.nextLine());
		*/
		
		/*
		int[] c = {1,2,3,4,5};
		System.out.println(poly(c, 2, 0));
		*/
		
		//findRamanuj(6963472309248.0);
		//System.out.print(findNumberOfCarries(123, 594));
		
		//StanOllieveWins(34012226);
		
		BulbOnOff(8191);
		
	}
}
