package Task2;

import java.time.LocalDateTime;


/**
 * Created by sodobescu on 3/29/2017.
 */
public class User {
	private String firstNamae;
	private String lastName;
	private LocalDateTime createdDate;

	public User(LocalDateTime createdDate, String lastName, String firstNamae) {
		this.lastName = lastName;
		this.firstNamae = firstNamae;
		this.createdDate = LocalDateTime.now();
	}

	public User(String firstNamae) {
		this.firstNamae=firstNamae;
		this.lastName="Odobescu";
		this.createdDate = LocalDateTime.now();

	}

	@Override
	public String toString() {
		return this.firstNamae;
	}

	public String getFirstNamae() {
		return firstNamae;
	}

	public void setFirstNamae(String firstNamae) {
		this.firstNamae = firstNamae;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}
}
