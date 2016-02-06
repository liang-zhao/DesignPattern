package editor;

public class Line implements Shape {

	
	/**
	 * Create a line between start point and end point
	 */
	public Line(int startX, int startY, int endX, int endY) {
	
	}
	
	@Override
	public Shape[] explodeShape() {


		// making a simple shape explode would return only the shape itself, there are no parts of this shape
			
		Shape[] shapeParts = {this};
	
		return shapeParts;
	
	}

	/**
	 * this method must be implemented in this simple shape
	 */
	public void renderShapeToScreen() {


		System.out.println("\nDraw a line");

	}

	@Override
	public void addToShape(Shape shape) {
		throw new RuntimeException("Cannot add a shape to simple shapes ...");
		
	}

}


