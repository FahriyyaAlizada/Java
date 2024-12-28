package dec25;

import java.util.LinkedHashSet;
import java.util.Set;

public class Collection<T> {
	
	private Set<T> hs;

	public Collection() {
		hs = new LinkedHashSet<>();
	}
	
	public void addElement(T element) {
        hs.add(element);
    }

    public void printElement() {
        for (T element : hs) {
            System.out.println(element);
        }
    }
    
    public int size() {
        return hs.size();
    }
	
}
