package com.mase.oop1.code2;

public class Laptop {

	private class MemoryImpl implements Memoryl {
		private String memoryCapacity;
		private String getMemoryCapacity;

		public MemoryImpl(String memoryCapacity, String getMemoryCapacity) {
			this.memoryCapacity = memoryCapacity;
			this.getMemoryCapacity = getMemoryCapacity;
		}

		@Override
		public String getMemoryCapacity() {
			return getMemoryCapacity;
		}
	}

	public MemoryImpl getMemoryCapacity(String memoryCapacity,String getMemoryCapacity){
		return new MemoryImpl(memoryCapacity, getMemoryCapacity);
	}
}
