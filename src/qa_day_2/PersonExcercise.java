package qa_day_2;

public class PersonExcercise {
		private String name;

		private int age;
		private String jobTitle;
		public PersonExcercise(String name, int age, String jobTitle) {

		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
		}

		public String toString() {
		return " Name: " + name + " Age: " +age + " JobTitle ;"+jobTitle;
		}
}
