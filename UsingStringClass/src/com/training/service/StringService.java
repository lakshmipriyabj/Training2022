package com.training.service;

public class StringService {
	//direct method 
	public void stringEquals(String str1, String str2) {
		
		System.out.println("Is Values Same:=" +str1.equals(str2));
		
		System.out.println("are they pointing to same location :=" + (str1==str2));
	}
	//constructor method 
	public void stringObjectEquals()
	{
		String ram = new String("Ram");
		String ramudu = new String("Ram");
		
		System.out.println("Is Values Same:=" +ram.equals(ramudu));
		System.out.println("Are they pointed to same location :=" + (ram==ramudu));
		
		
	}
//trim means it will delete the spaces
	
	public void usingTrim(String name) { //string
		System.out.println("without trim:=" +name);
		System.out.println("Trim:=" +name.trim());
	//	return name.trim();
	}
	
	public void lengthOfString(String name) {
//	String resp= usingTrim(name); 
//	//	System.out.println("Sting length:="+name.length());
//		System.out.println("String length:=" + resp.length());
		System.out.println("String length:=" +name.trim().length());
	}
	
	public void usingSubString(String name){
		System.out.println("Substring:=" +name.substring(3));
		System.out.println("Substring:=" +name.substring(1,4));
	}
	
	public void usingCharAtAndIndexOf(String name) {
		System.out.println("char at position:of 3:=" +name.charAt(3));
		System.out.println("index  position:of @:=" +name.indexOf('@'));
	}
	
	public void usingReplace(String str1,String str2) {
		System.out.println(str1.replace(".com", ".org"));
		System.out.println(str2.replace('c', 'o'));
	}
	
	public void usingConcat(String str1,String str2)
	{ //string is immutable -cannot change
		System.out.println("Concat:="+str1.concat(str2));
		//string builder is mutable -can change
		StringBuilder builder = new StringBuilder(str1);
		builder.append(str2);
		System.out.println(builder.toString());
	}
	
	public void usingCompareTo(String str1,String str2) {
		
		System.out.println("compareTo:="+str1.compareTo(str2));
	}
	
	public void usingStringFormat(String str1,double mark) {
		String frmtString = String.format("%S",str1);
		System.out.println(frmtString);
		
		String frmtString2 = String.format("%.2f",mark );
		System.out.println(frmtString2);
	}
	
	public void usingStingFormat(int mark) {
		System.out.println(String.format("octal %o",mark));
		System.out.println(String.format("hexaDecimal %x",mark));
	}
	public void usingStringFormat(int mark1,int mark2) {
		
		
		System.out.println(String.format("octal %1$o, hexa %2$x", +mark1,mark2));
	}
	
	public void usingStringFormat(String str1,String str2) {
		System.out.println(String.format(" %1$s, %2$S",str1,str2));
	}
	
	public void usingStringFormat(long value) {
		System.out.println(String.format("%+d",value));
	}
}

