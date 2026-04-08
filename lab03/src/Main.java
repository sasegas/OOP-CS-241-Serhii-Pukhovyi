public class Main {
	public static void main(String[] args) {
		Sprint sprint = new Sprint(20, 3);

		UserStory loginPage = new UserStory(1, "Сторінка входу", 4, null);

		UserStory profilePage = new UserStory(2, "Профіль користувача", 5, new UserStory[] { loginPage });

		System.out.println("Додаємо US 1: " + sprint.addUserStory(loginPage));
		System.out.println("Додаємо US 2: " + sprint.addUserStory(profilePage));
		Bug bug = Bug.createBug(3, "Кнопка з'їхала", 2, loginPage);
		System.out.println("Чи створено баг до завершення US?: " + (bug != null));

		loginPage.complete();
		Bug actualBug = Bug.createBug(3, "Кнопка з'їхала", 2, loginPage);

		System.out.println("Баг (перевищення ліміту часу): " + sprint.addBug(actualBug));

		System.out.println("\nТікети у спринті:");
		for (Ticket t : sprint.getTickets()) {
			System.out.println(t.toString());
		}
	}
}