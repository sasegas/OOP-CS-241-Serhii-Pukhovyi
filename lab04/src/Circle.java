class Circle extends Figure {
	Point center;
	double radius;

	public Circle(Point center, double radius) {
		this.center = center;
		this.radius = radius;
		if (radius <= 0) {
			throw new IllegalArgumentException("Радіус має бути більшим за 0.");
		}
	}

	@Override
	public double area() {
		return Math.PI * radius * radius;
	}

	@Override
	public Point centroid() {
		return center;
	}

	@Override
	public String toString() {
		return String.format("Circle[%s %.1f]", center, radius);
	}
}