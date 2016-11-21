import java.util.ArrayList;

public class MainMemory {
	
	private static ArrayList<MixedBuffer> mainMemory = new ArrayList<MixedBuffer>();
	private int loadedElement;
	
	public int load(String x) {
		
		for (int n = 0; n < mainMemory.size(); n++) {
			
			if(mainMemory.get(n).variable == x) {
				
				loadedElement = mainMemory.get(n).value;
				//mainMemory.remove(n);
				
				return loadedElement;
			}

		}

		//Variable doesn't exist in buffer
		return -1;
	}
	
	
	public void store(String x, int v) {
		
		MixedBuffer memValue = new MixedBuffer(x,v);
		boolean test = false;
		
		if (mainMemory.size() == 0)
			mainMemory.add(memValue);
		
		else {
			
			
			for (int n = 0; n < mainMemory.size(); n++) {
				
				if(mainMemory.get(n).variable == x) {
					
					mainMemory.set(n, memValue);
				test = true;
				}
				
			}
		
		
			if (test == false)
				mainMemory.add(memValue);		
		}
	}

}
