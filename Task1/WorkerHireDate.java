package Task1;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.*;

/**
 * Created by sodobescu on 3/27/2017.
 */
public class WorkerHireDate {

	private LocalDateTime date;
	private Worker worker;

	public static ArrayList<WorkerHireDate> hireWorkerStructure = new ArrayList();

	public WorkerHireDate(LocalDateTime date, Worker worker) {
		this.date = date;
		this.worker = worker;
	}

	public WorkerHireDate() {

		hireWorkerStructure.add(new WorkerHireDate(LocalDateTime.of(2000, Month.APRIL, 1, 12, 12), new Worker("Petru", "Grozza")));
		hireWorkerStructure.add(new WorkerHireDate(LocalDateTime.of(2001, Month.DECEMBER, 2, 12, 12), new Worker("Petru", "Grozza")));
		hireWorkerStructure.add(new WorkerHireDate(LocalDateTime.of(2017, Month.MARCH, 3, 12, 12), new Worker("Sasa", "Doncila")));
		hireWorkerStructure.add(new WorkerHireDate(LocalDateTime.of(2003, Month.JANUARY, 4, 12, 12), new Worker("Alex", "Rotari")));
		hireWorkerStructure.add(new WorkerHireDate(LocalDateTime.of(2007, Month.MAY, 30, 12, 12), new Worker(new String[]{"Polonia", "Moldova"})));
		hireWorkerStructure.add(new WorkerHireDate(LocalDateTime.of(2005, Month.OCTOBER, 1, 12, 12), new Worker()));
		hireWorkerStructure.add(new WorkerHireDate(LocalDateTime.of(2006, Month.JANUARY, 1, 12, 12), new Worker(new String[]{"Cuba", "Moldova"})));
		hireWorkerStructure.add(new WorkerHireDate(LocalDateTime.of(2007, Month.AUGUST, 1, 12, 12), new Worker("Vica", "Cerbu")));
		hireWorkerStructure.add(new WorkerHireDate(LocalDateTime.of(2008, Month.JANUARY, 11, 12, 12), new Worker("Ion", "Ravenco")));
		hireWorkerStructure.add(new WorkerHireDate(LocalDateTime.of(2009, Month.AUGUST, 12, 12, 12), new Worker()));
		hireWorkerStructure.add(new WorkerHireDate(LocalDateTime.of(2010, Month.FEBRUARY, 13, 12, 12), new Worker()));
		hireWorkerStructure.add(new WorkerHireDate(LocalDateTime.of(2011, Month.JANUARY, 15, 12, 12), new Worker(new String[]{"Polonia", "Moldova", "Italy"})));
		hireWorkerStructure.add(new WorkerHireDate(LocalDateTime.of(2012, Month.MAY, 1, 12, 12), new Worker(new String[]{"Polonia", "Great Britaine"})));
		hireWorkerStructure.add(new WorkerHireDate(LocalDateTime.of(2013, Month.JANUARY, 1, 12, 12), new Worker()));
		hireWorkerStructure.add(new WorkerHireDate(LocalDateTime.of(2014, Month.OCTOBER, 19, 12, 12), new Worker("Ana", "Rotaru")));
		hireWorkerStructure.add(new WorkerHireDate(LocalDateTime.of(2014, Month.JANUARY, 1, 12, 12), new Worker()));
		hireWorkerStructure.add(new WorkerHireDate(LocalDateTime.of(2015, Month.JUNE, 21, 12, 12), new Worker(new String[]{"Romania", "Great Britaine"})));
		hireWorkerStructure.add(new WorkerHireDate(LocalDateTime.of(2016, Month.NOVEMBER, 1, 12, 12), new Worker()));
		hireWorkerStructure.add(new WorkerHireDate(LocalDateTime.of(2017, Month.MARCH, 21, 12, 12), new Worker("Andrian", "Miron")));
		hireWorkerStructure.add(new WorkerHireDate(LocalDateTime.of(2017, Month.JANUARY, 1, 12, 12), new Worker()));

		BubbleSort();

	}

	public WorkerHireDate(WorkerHireDate structure) {
		this.worker = new Worker(structure.worker);
		this.date = structure.date;
	}

	public static ArrayList<Worker> workersReadyForTrip(LocalDateTime startDate, LocalDateTime endDate) {

		ArrayList<Worker> workerIsReady = new ArrayList();

		for (int i = 0; i < hireWorkerStructure.size(); i++) {
			if (hireWorkerStructure.get(i).worker.isReadyForTrip() &&
					!workerIsReady.contains(hireWorkerStructure.get(i).worker) &&
					hireWorkerStructure.get(i).date.isAfter(startDate) &&
					hireWorkerStructure.get(i).date.isBefore(endDate)) {
				workerIsReady.add(hireWorkerStructure.get(i).worker);
			}

		}


		return workerIsReady;
	}

	private static void BubbleSort() {
		boolean flag = true;   // set flag to true to begin first pass
		WorkerHireDate temp;   //holding variable

		while (flag) {
			flag = false;    //set flag to false awaiting a possible swap
			for (int j = 0; j < hireWorkerStructure.size() - 1; j++) {
				if (hireWorkerStructure.get(j).date.isAfter(hireWorkerStructure.get(j + 1).date))   // change to > for ascending sort
				{
					temp = new WorkerHireDate(hireWorkerStructure.get(j));                //swap elements
					hireWorkerStructure.get(j).date = hireWorkerStructure.get(j + 1).date;
					hireWorkerStructure.get(j).worker = hireWorkerStructure.get(j + 1).worker;
					hireWorkerStructure.get(j + 1).date = temp.date;
					hireWorkerStructure.get(j + 1).worker = temp.worker;
					flag = true;              //shows a swap occurred
				}
			}
		}

	}


	public static Map<String, ArrayList<Worker>> structureCountryAndWorkers() {

		Map<String, ArrayList<Worker>> structure = new TreeMap(Collections.reverseOrder());
		String[] country = new String[]{"Russia", "Canada", "China", "United States", "Brazil", "Moldova", "Romania", "Italy", "Cuba", "Great Britaine", "Australia", "Sudan", "Sudan", "Kazakhstan", "India", "Argentina"};
		for (int i = 0; i < country.length; i++) {
			ArrayList<Worker> tempWorker = new ArrayList();
			for (int j = 0; j < hireWorkerStructure.size(); j++) {
				if (hireWorkerStructure.get(j).worker.workerCanVisit(country[i]) &&
						!tempWorker.contains(hireWorkerStructure.get(j).worker)) {
					tempWorker.add(hireWorkerStructure.get(j).worker);
				}

			}
			if (!tempWorker.isEmpty()) {
				structure.put(country[i], tempWorker);
			}


		}

		return Collections.unmodifiableMap(structure);
	}

}

