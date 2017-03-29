package Task2;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by sodobescu on 3/29/2017.
 */
public class LRUCache<K,V> {

	private static final LinkedHashMap cache = new LinkedHashMap(50,
			0.5f, true) {


		@Override
		protected boolean removeEldestEntry(final Map.Entry eldest) {
			return size() > 50;
		}
	};


	public void put(final K key, final V value) {


		cache.put(key, value);
	}

	public V get(final K key) {
		return (V) cache.get(key);
	}


	public boolean containsKey(final K key) {
		return cache.containsKey(key);
	}

	public void displayCache(){

		cache.forEach((s, m) -> System.out.println(m.toString()));
	}


}