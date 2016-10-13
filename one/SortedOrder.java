package com.java.assignmentnine.one;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SortedOrder extends HDTV {

	public SortedOrder(String brandName, int size) {
		super(brandName, size);
		// TODO Auto-generated constructor stub
	}

	public static BufferedReader br ;
	public static ArrayList<Object> object1 ;
	public static String[] input = new String[2] ;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		input();

		System.out.println("Brand Name :");
		Collections.sort(object1, new SortBrandName());
		Iterator<Object> i = object1.iterator(); 
		while (i.hasNext()) {
			HDTV hdtv = (HDTV)i.next();		
			System.out.println(hdtv.brandName);	
		}
		
		System.out.println("Brand Size :");

		i = object1.iterator(); 
		while (i.hasNext()) {
			HDTV hdtv = (HDTV)i.next();		
			System.out.println(hdtv.size);	
		}		
	}

	private static void input() {
		// TODO Auto-generated method stub
		br = new BufferedReader(new InputStreamReader(System.in));
		object1 = new ArrayList<>();
		try {
			System.out.println("Enter brandName and size(mandatory in Integer Values "
					+ "(Example : Sony 45)) :");
			input = br.readLine().split(" ");
			object1.add(new HDTV(input[0] , Integer.parseInt(input[1])));
			
			System.out.println("Enter brandName and size(mandatory in Integer Values"
					+ " (Example : Sony 45)) :");
			input = br.readLine().split(" ");
			object1.add(new HDTV(input[0] , Integer.parseInt(input[1])));
			
			System.out.println("Enter brandName and size(mandatory in Integer Values "
					+ "(Example : Sony 45)) :");
			input = br.readLine().split(" ");
			object1.add(new HDTV(input[0] , Integer.parseInt(input[1])));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
