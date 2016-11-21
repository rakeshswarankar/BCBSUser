package com.bcbs.test;

import java.util.Iterator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bcbs.database.DBUtil;
import com.bcbs.model.User;
import com.bcbs.util.BcbsUtil;

/* Run this application for sort User list based on First name and Last name in Ascending order Using Bubble sort algorithm */
public class TestUser {

	public static void main(String[] args) {
		
		Logger logger= LoggerFactory.getLogger(TestUser.class);
		
		logger.debug("Getting the User list.");
		List<User> list= DBUtil.getUserList(); // Getting the static list because no db connection
		
		if(list == null)
		{
			logger.error("List is empty");			
		}
		
		// Iterating the list in insert order.
		logger.debug("Iterating the list in insert order");
		Iterator<User> itr= list.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		// Sort in Ascending order using First name and last name
		BcbsUtil.sort(list); 
		System.out.println("=========== After Sorting   ============");
		
		// Iterate the list after sorting
		logger.debug("Iterating the list in after sorting in Ascending Order (First name and Last Name).");
		itr= list.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		logger.debug("Sorting successful!");
	}

}
