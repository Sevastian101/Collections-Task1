package Task1;

import java.util.*;

/**
 * Created by sodobescu on 3/27/2017.
 */
public class App {


    public static void main(String args[]) {


        WorkerHireDate W = new WorkerHireDate();
//		ArrayList<Task1.Worker> list = new ArrayList();
//		list=W.workersReadyForTrip(LocalDateTime.of(2000, Month.APRIL, 1, 12, 12),LocalDateTime.of(2017, Month.APRIL, 1, 12, 12));
//		System.out.println("**********************************");
//		for(int i=0;i<list.size();i++){
//			System.out.println(list.get(i).getFirstName());
//			System.out.println(list.get(i).getLastName());
//			System.out.println(list.get(i).workerCanVisit("Russia"));
//			System.out.println("--------------------------");
//
//		}
        Map<String, ArrayList<Worker>> myMap = new TreeMap(W.structureCountryAndWorkers());

        for (Map.Entry<String, ArrayList<Worker>> entry : myMap.entrySet()) {
            System.out.println("Country: " + entry.getKey() + " can be visited by " + entry.getValue());
        }

    }
}
