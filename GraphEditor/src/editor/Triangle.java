package editor;

public class Triangle implements Shape{

	// List of shapes forming the triangle
	Shape[] triangleEdges = {new Line(0,0,0,1),new Line(0,0,1,0),new Line(0,1,1,0)};
	
	

	@Override
	public Shape[] explodeShape() {
		
		
		return triangleEdges; 
	
	}

	/**
	 * this method is implemented directly in basic shapes 
	 * in complex shapes this method is implemented using delegation
	 */
	public void renderShapeToScreen() {


		for(Shape s : triangleEdges){
		
	           // delegate to child objects
			s.renderShapeToScreen();
			
		}
		System.out.println("This is a trangle!");
		
	}

	@Override
	public void addToShape(Shape shape) {
		
		
	}

}
