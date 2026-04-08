public class UserStory extends Ticket {
	private final UserStory[] dependencies;

	public UserStory(int id, String name, int estimate, UserStory[] dependencies) {
		super(id, name, estimate);
		this.dependencies = (dependencies == null) ? new UserStory[0] : dependencies.clone();
	}

	@Override
	public void complete() {
		for (UserStory dependency : dependencies) {
			if (!dependency.isCompleted()) {
				return;
			}
		}
		super.complete();
	}

	public UserStory[] getDependencies() {
		return dependencies.clone();
	}

	@Override
	public String toString() {
		return String.format("[US %d] %s", getId(), getName());
	}
}