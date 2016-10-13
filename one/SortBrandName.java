package com.java.assignmentnine.one;

import java.util.Comparator;

public class SortBrandName implements Comparator<Object>{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		HDTV hdtv1 = (HDTV)o1;
		HDTV hdtv2 = (HDTV)o2;
		return hdtv1.brandName.compareTo(hdtv2.brandName);
	}

}
