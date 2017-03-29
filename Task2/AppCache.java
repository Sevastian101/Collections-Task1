package Task2;

/**
 * Created by sodobescu on 3/29/2017.
 */
public class AppCache {

	public static void main(String args[]){

		LRUCache myCache=new LRUCache<String,User>();

		for(int i=0;i<400;i++){

			myCache.put("User"+i,new User("User"+i));
		}

		myCache.displayCache();




	}


}
