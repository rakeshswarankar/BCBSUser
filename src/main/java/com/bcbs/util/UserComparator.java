package com.bcbs.util;

import java.util.Comparator;

import com.bcbs.model.User;

public class UserComparator implements Comparator<User>{

	
	//Over ride the unimplemented method 
	// Compare user object first with first name then last name
	public int compare(User o1, User o2) {		
		int diff=o1.getFirstName().compareTo(o2.getFirstName());
		if(diff == 0)
		{
			diff=o1.getLastName().compareTo(o2.getLastName());
			return diff;
		}
		else return diff;		
	}
	
}
