public class Main {
	public static void main(String[] args) {
		try {
			Point p1 = new Point(0, 0);
			Point p2 = new Point(3, 0);
			Point p3 = new Point(0, 4);
			Triangle triangle = new Triangle(p1, p2, p3);

			System.out.println(triangle.toString());
			System.out.println("Площа: " + triangle.area());
			System.out.println("Центроїд: " + triangle.centroid());

			System.out.println("---");

			Quadrilateral quad = new Quadrilateral(
					new Point(0, 0), new Point(4, 0),
					new Point(4, 4), new Point(0, 4));
			System.out.println(quad.toString());
			System.out.println("Площа: " + quad.area());
			System.out.println("Центроїд: " + quad.centroid());

			System.out.println("---");

			Circle circle = new Circle(new Point(5, 5), 10);
			System.out.println(circle.toString());
			System.out.println("Площа: " + circle.area());
			System.out.println("Центроїд: " + circle.centroid());

		} catch (IllegalArgumentException e) {
			System.out.println("Помилка створення фігури: " + e.getMessage());
		}
	}
}