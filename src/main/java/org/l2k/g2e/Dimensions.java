package org.l2k.g2e;

public class Dimensions {
	
	private final int width; 
	private final int length;
	
	public Dimensions(int width, int length) {
		this.width = width;
		this.length = length;
	}
		
	public int getWidth() {
		return width;
	}
	
	public int getLength() {
		return length;
	}
	
	public boolean equals(Dimensions otherDimensions) {
		return this.width == otherDimensions.getWidth() &&
				this.length == otherDimensions.getLength();
	}
	
	@Override
	public int hashCode() {
		return width * 31 + length * 29;
	}
	
}
