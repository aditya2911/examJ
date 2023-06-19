package com.example.exam.Prac4A;

public class PrimeChecker {

	
	boolean check(int n) throws PrimeException{
		try {
		for(int i =2;i<=n/2;i++) {
			if(n%i == 0) {
				return false;
			}
		}
		
		
		throw new PrimeException ();
		}
		catch(PrimeException  | NumberFormatException s) {
			throw new PrimeException ();
		//	return true;

		}
	}
	
	
	public static void main(String[] args) throws PrimeException {
		// TODO Auto-generated method stub
		PrimeChecker p = new PrimeChecker();
		
		System.out.println(p.check(7));
	}

}
