package com.java.assignmentnine.one;

import java.util.Comparator;

public class SortSize implements Comparator<Object>{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		HDTV hdtv1 = (HDTV)o1;
		HDTV hdtv2 = (HDTV)o2;
		
		if (hdtv1.size > hdtv2.size) {
			return 1;
		}else if(hdtv1.size < hdtv2.size){
			return -1;
		}else if(hdtv1.size == hdtv2.size){
			return 0;
		}
		return 0;
	}

}
