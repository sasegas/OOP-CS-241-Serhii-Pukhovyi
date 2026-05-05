public class Quadrilateral extends Figure {
	private final Point a;
	private final Point b;
	private final Point c;
	private final Point d;

	public Quadrilateral(Point a, Point b, Point c, Point d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		if (area() <= 0) {
			throw new IllegalArgumentException("Чотирикутник вироджений.");
		}
	}

	@Override
	public double area() {
		return 0.5
				* Math.abs(a.x * b.y + b.x * c.y + c.x * d.y + d.x * a.y - (b.x * a.y + c.x * b.y + d.x * c.y + a.x * d.y));
	}

	@Override
	public Point centroid() {
		Triangle t1 = new Triangle(a, b, c);
		Triangle t2 = new Triangle(a, c, d);
		double area1 = t1.area();
		double area2 = t2.area();
		Point c1 = t1.centroid();
		Point c2 = t2.centroid();

		double cx = (c1.x * area1 + c2.x * area2) / (area1 + area2);
		double cy = (c1.y * area1 + c2.y * area2) / (area1 + area2);
		return new Point(cx, cy);
	}

	@Override
	public String toString() {
		return String.format("Quadrilateral[A%s B%s C%s D%s]", a, b, c, d);
	}
}
