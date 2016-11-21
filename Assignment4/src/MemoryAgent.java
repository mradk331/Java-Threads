
public class MemoryAgent implements Runnable {
	
	private WriteBuffer writeBuffer;
	private MixedBuffer storeValue;
	private MainMemory mainMem = new MainMemory();
	
	public MemoryAgent(WriteBuffer writeBuffer){
		
		this.writeBuffer = writeBuffer;
	}
	@Override
	public void run() {

		if (writeBuffer.isEmpty())	
			return;
			
		else {
			storeValue = writeBuffer.pop();	
			mainMem.store(storeValue.variable, storeValue.value);
		}
			
		
		
		
		
	}

}