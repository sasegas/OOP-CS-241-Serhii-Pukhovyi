public class Triangle {
	private final Point a;
	private final Point b;
	private final Point c;

	public Triangle(Point a, Point b, Point c) {
		double area = calculateArea(a, b, c);

		if (area <= 0) {
			throw new IllegalArgumentException("Трикутник вироджений або точки збігаються.");
		}

		this.a = a;
		this.b = b;
		this.c = c;
	}

	private double calculateArea(Point a, Point b, Point c) {
		return Math.abs((a.x * (b.y - c.y) + b.x * (c.y - a.y) + c.x * (a.y - b.y)) / 2.0);
	}

	public double area() {
		return calculateArea(a, b, c);
	}

	public Point centroid() {
		double cx = (a.x + b.x + c.x) / 3.0;
		double cy = (a.y + b.y + c.y) / 3.0;
		return new Point(cx, cy);
	}
}
