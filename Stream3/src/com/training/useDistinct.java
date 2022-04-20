package com.training;
import java.util.*;
import java.util.stream.*;

import com.training.model.Book;

import static java.util.stream.Collectors.*;

public class useDistinct {

	
		public static void useDistinct(List<Book> bookList) {
		
		bookList.stream().distinct().forEach(System.out::println);
		}
		
		public static void collectToSet(List<Book> bookList) {
			
			Set<Book> bookSet = (Set<Book>) bookList
					.stream()
					.filter(e-> e.getPrice()>500)
					.collect(toSet());
			
			bookSet.forEach(System.out::println);
		}
		public static void collectToMap(List<Book> bookList) {
			Map<String,Double> values=bookList
					.stream()
					  .filter(e -> e.getPrice()>500).distinct()
					  .collect(toMap(Book::getBookName, Book::getPrice));
			values.forEach((key,value)-> System.out.println(key +","+value));
		}
		
		public static void findMaxPrice(List<Book> bookList) {
			Optional<Book> optional = 
					bookList
					.stream()
					.max(Comparator.comparing(Book::getPrice));
			if(optional.isPresent()) {
				System.out.println("Maximum Price:" +optional.get().getPrice());
			}
		}
		public static void findMinPrice(List<Book> bookList) {
			Optional<Book> optional = 
					bookList
					.stream()
					.min(Comparator.comparing(Book::getPrice));
			if(optional.isPresent()) {
				System.out.println("Min Price:" +optional.get().getPrice());
			}
		}
		public static void countBookStartWith(List<Book> bookList,String srch) {
			 long  count= bookList.stream().
	                 filter(e->e.getBookName().contains(srch)).count();
	 
	 
	                         System.out.println(srch+"occurs:"+ count +"times");
		}
		public static void main(String[] args) {
		     
			Book java = new Book(101,"Java","Suba",450);
			Book spring= new Book(102,"Spring","Mad",650);
			Book maven= new Book(103,"Maven","Harish",550);
			Book html= new Book(104,"Html","Priya",1450);
			Book python = new Book(105,"Python","Sathya",850);
			Book mavenNew = new Book(103,"Maven","Harish",550);
			Book htmlNew = new Book(104,"Html","Priya",1450);
			
			List<Book> bookList = Arrays.asList(java,spring,maven,html,python,mavenNew,html);
			//useDistinct(bookList);
			int  key = 6;
			switch(key)
			{
			case 1:
				useDistinct(bookList);
				break;
			case 2:
				collectToSet(bookList);
				break;
			case 3:
				collectToMap(bookList);
			
			case 4:
				findMaxPrice(bookList);
				break;
			case 5:
				findMinPrice(bookList);
				break;
			case 6:
				countBookStartWith(bookList,"v");
				break;
		    default:
					break;
			}
				
				
//			System.out.println("=========Set=========");
//			//set
//			collectToSet(bookList);
//			System.out.println("======Map========");
//			collectToMap(bookList);
//			System.out.println("=========Max======");
//			findMaxPrice(bookList);
//			System.out.println("===========min======");
//			findMinPrice(bookList);
//			
			
	}

}
