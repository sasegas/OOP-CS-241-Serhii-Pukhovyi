public class Ex2 {
	public static void main(String[] args) {
		Point p1 = new Point(0, 0);
		Point p2 = new Point(4, 4);
		Point p3 = new Point(0, 4);
		Point p4 = new Point(4, 0);

		Segment segment1 = new Segment(p1, p2);
		Segment segment2 = new Segment(p3, p4);

		System.out.println("Довжина segment1: " + segment1.length());
		System.out.println("Середина segment1: " + segment1.middle());

		Point intersect = segment1.intersection(segment2);
		if (intersect != null) {
			System.out.println("Точка перетину: " + intersect);
		} else {
			System.out.println("Відрізки не перетинаються.");
		}
	}
}
