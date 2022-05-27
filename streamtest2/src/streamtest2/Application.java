package streamtest2;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Application {

	public static void main(String[] args) {
	
	
		List<Country> list = Arrays.asList(
				new Country("USA","kannasa", 501957),
				new Country("India", "Chennai", 70900000),
				new Country("USA","Los Angles",3970000 ),
				new Country("Nepal", "Kanmathu",1000000 ),
				new Country("India", "kolkata", 14900000),
				new Country("USA", "Denver",706000));
		
		//System.out.println(list);
		
		list.forEach(System.out::println);
		
		System.out.println("======By Place=====");
		
		
		Map<String, String> findplace = list.stream()
		.collect(Collectors.toMap(Country::getPlace,Country::getCountry));

      findplace.forEach((key,value)->System.out.println("Place=" +" "+key+" "+"Country= "+" "+ value));



        System.out.println("====country count====");
        int usaCount =(int) list.stream().filter(e->e.getCountry().equals("USA")).count();
        System.out.println("USA count ="+ usaCount);

       int indiaCount =(int) list.stream().filter(e->e.getCountry().equals("India")).count();
       System.out.println("India count ="+ indiaCount);

        int nepalCount=(int) list.stream().filter(e->e.getCountry().equals("Nepal")).count();
        System.out.println("Nepal count ="+ nepalCount);

System.out.println("============country population count========");



Long usaPop=list.stream().filter(e->e.getCountry().equals("USA"))
		.mapToLong(e->e.getPopulation()).sum();
System.out.println("USA  total Populattion = "+usaPop);

Long indiaPop=list.stream().filter(e->e.getCountry().equals("India"))
		.mapToLong(e->e.getPopulation()).sum();
System.out.println("India total Population =  "+indiaPop);

Long nepalPop=list.stream().filter(e->e.getCountry().equals("Nepal"))
		.mapToLong(e->e.getPopulation()).sum();
System.out.println("Nepal total Population=" + nepalPop);

}
		
	}


