public class Segment {
	private final Point start;
	private final Point end;

	public Segment(Point start, Point end) {
		if (start.x == end.x && start.y == end.y) {
			throw new IllegalArgumentException("Точки збігаються");
		}
		this.start = start;
		this.end = end;
	}

	public double length() {
		return Math.sqrt(Math.pow(end.x - start.x, 2) + Math.pow(end.y - start.y, 2));
	}

	public Point middle() {
		return new Point((start.x + end.x) / 2, (start.y + end.y) / 2);
	}

	public Point intersection(Segment another) {
		double x1 = this.start.x, y1 = this.start.y;
		double x2 = this.end.x, y2 = this.end.y;
		double x3 = another.start.x, y3 = another.start.y;
		double x4 = another.end.x, y4 = another.end.y;

		double den = (x1 - x2) * (y3 - y4) - (y1 - y2) * (x3 - x4);
		if (den == 0)
			return null;

		double t = ((x1 - x3) * (y3 - y4) - (y1 - y3) * (x3 - x4)) / den;
		double u = -((x1 - x2) * (y1 - y3) - (y1 - y2) * (x1 - x3)) / den;

		if (t >= 0 && t <= 1 && u >= 0 && u <= 1) {
			return new Point(x1 + t * (x2 - x1), y1 + t * (y2 - y1));
		}
		return null;
	}
}