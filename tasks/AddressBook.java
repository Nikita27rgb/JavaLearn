import java.time.LocalDate;

public class AddressBook {
	String firstName;
	String secondName;
	long phoneNumber;

	String email;
	private static int countContact = 0;
	private LocalDate birthday;

	protected void setBirthday(int year, int month, int day) {
		this.birthday = LocalDate.of(year, month, day);
	}

	public void newContact(String firstName, String secondName, long phoneNumber, String email) {
		this.firstName = firstName;
		this.secondName = secondName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		countContact++;
	}

	public void call() {
		//звонок контакту
	}

	public void sendMassage() {
		//отправка смс
	}

	public void notificationBirthday() {
		LocalDate today = LocalDate.now();
		LocalDate birthday = getBirthday();

		if (today.getMonthValue() == birthday.getMonthValue() && today.getDayOfMonth() == birthday.getDayOfMonth())
			System.out.println("Новое уведомление: " + this.firstName + " "
					+ this.secondName + " отмечает День Рождения. Испольнилось: " + (today.getYear() - birthday.getYear()));
	}

	protected LocalDate getBirthday() {
		return this.birthday;
	}

	public static void main(String[] argv) {
		AddressBook ivan = new AddressBook();
		ivan.newContact("Иван", "Сидоров", 89998887766L, "test@gmail.com");
		ivan.setBirthday(1985, 9, 16);
		ivan.notificationBirthday();

		AddressBook oleg = new AddressBook();
		oleg.newContact("Олег", "Андреев", 89998887765L, "test2@gmail.com");
		oleg.setBirthday(2003, 9, 16);
		oleg.notificationBirthday();

		AddressBook kate = new AddressBook();
		oleg.newContact("Екатерина", "Попова", 89998887745L, "test3@gmail.com");
		oleg.setBirthday(2013, 8, 16);
		oleg.notificationBirthday();

		System.out.println("Количество контактов в записной книжке: " + AddressBook.countContact);

		oleg.call();
		oleg.sendMassage();


	}
}
