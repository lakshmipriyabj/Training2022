package com.training.service;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringService service = new StringService();
		String city = "CHENNAI";
		System.out.println(String.format("%s", city));
		System.out.println(String.format("%3$.f  %2$.3F %1$.2f", 100.456,200.4567,300.56789));
		int key = 14;
		switch (key) {
		case 1:
			service.stringEquals("ram", "ram");
			break;
		case 2:
			service.stringObjectEquals();
			break;
		case 3:
			service.usingTrim(" ramesh ");
			break;
		case 4:
			service.lengthOfString("  ramesh  ");
		case 5:
			service.usingSubString(" jerisha ");
			break;
		case 6:
			service.usingCharAtAndIndexOf("jerisha@.com");
			break;
		case 7:
			service.usingReplace("jerisha@.com","welcome to chennai");
			break;
		case 8:
			service.usingConcat("haripriya"," rajesh");
			break;
		case 9:
			service.usingCompareTo("b","d");
			break;
		case 10:
			service.usingStringFormat("Mark", 45.297);
			break;
		case 11:
			service.usingStingFormat(17);
			break;
		case 12:
			service.usingStringFormat(17,17);
			break;
		
		case 13:
			service.usingStringFormat("ram","ram");
			break;
		case 14:
			service.usingStringFormat(+421L);
			break;
		default:
			break;
		}

	}

}
