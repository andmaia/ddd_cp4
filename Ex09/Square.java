package Ex09;

public class Square extends Quadrilateral implements Operarations  {
	private float side;
	

	public Square(float[] sides, float side) {
		super(sides);
		this.side = side;
	}

	public float getSide() {
		return side;
	}

	public void setSide(float side) {
		this.side = side;
	}

	@Override
	public float getArea() {
		// TODO Auto-generated method stub
		return side*side;
	}

	@Override
	public float getPerimetro() {
		// TODO Auto-generated method stub
		return 4*side;
	}

	@Override
	public String toString() {
		return "Square [side=" + side + "]";
	}
	
	
	
	
}
