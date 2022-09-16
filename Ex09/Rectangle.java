package Ex09;

public class Rectangle extends Quadrilateral implements Operarations  {
	private float base;
	private float height;
	
	public Rectangle(float[] sides, float base, float height) {
		super(sides);
		this.base = base;
		this.height = height;
	}

	public float getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	@Override
	public float getArea() {
		return this.base * this.height;
	}

	@Override
	public float getPerimetro() {
		// TODO Auto-generated method stub
		return 2*this.getArea();
	}

	@Override
	public String toString() {
		return "Rectangle [base=" + base + ", height=" + height + "]";
	}
	
	
	
	
	
	
}
