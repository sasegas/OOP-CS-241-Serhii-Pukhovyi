public class Ex1 {
	public static void main(String[] args) {
		Line line1 = new Line(1, 1);
		Line line2 = new Line(-1, 3);
		System.out.println(line1.intersection(line2));
	}
}

class Line {
	private final int k;
	private final int b;

	public Line(int k, int b) {
		this.k = k;
		this.b = b;
	}

	public Point intersection(Line other) {
		if (this.k == other.k) {
			return null;
		}

		int x = (other.b - this.b) / (this.k - other.k);
		int y = this.k * x + this.b;

		return new Point(x, y);
	}
}