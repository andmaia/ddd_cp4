package Ex09;

public class Circle implements Operarations {
	public float radius;
	public final float PI=(float) 3.14;
	public Circle(float radius) {
	
		this.radius = radius;
	}

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

	@Override
	public float getArea() {
		
		return PI*(radius*radius);
	}

	@Override
	public float getPerimetro() {
		// TODO Auto-generated method stub
		return 2*PI*radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", PI=" + PI + "]";
	}
	
	
	
	
}
