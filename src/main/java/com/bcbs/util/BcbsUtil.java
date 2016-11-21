package com.bcbs.util;

import java.util.List;

import com.bcbs.model.User;

public class BcbsUtil {

	public static List<User> sort(List<User> list)
	{
		UserComparator uc= new UserComparator();
		// bubble sort logic
		for(int i=0;i<list.size();i++)
		{
			for(int j=i+1;j<list.size();j++)
			{
				
				if(uc.compare(list.get(i), list.get(j)) > 0)
				{
					User u =list.get(i);
					list.set(i, list.get(j));
					list.set(j, u);
				}
			}
		}
		return list;
	}
}
