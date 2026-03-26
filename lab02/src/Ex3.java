public class Ex3 {
	public static void main(String[] args) {
		try {
			Point a = new Point(0, 0);
			Point b = new Point(4, 0);
			Point c = new Point(0, 3);

			Triangle triangle = new Triangle(a, b, c);

			System.out.println("Площа трикутника: " + triangle.area());
			System.out.println("Центроїд трикутника: " + triangle.centroid());

		} catch (IllegalArgumentException e) {
			System.out.println("Помилка: " + e.getMessage());
		}
	}
}
