package com.online.practise;

public abstract class Father {
	public abstract void familyName();
	
	public static void main(String[] args){
		Father S= new Son();
		((Son) S).Naan();
		S.familyName();
	    
	    
		Father M=new Middle();
		M.familyName();
		
		}

	

	
		
	}


