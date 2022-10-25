package ladder.domain;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by seungwoo.song on 2022-10-25
 */
class PersonsTest {

	@Test
	void get() {
		List<Person> list = List.of(
			new Person("일", 0),
			new Person("이", 1));

		Persons persons = Persons.of(list);

		assertThat(persons.get("일").isSameName("일")).isTrue();
	}
}