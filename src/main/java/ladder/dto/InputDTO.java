package ladder.dto;

import ladder.domain.LadderGameResults;
import ladder.domain.Person;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by seungwoo.song on 2022-10-17
 */
public class InputDTO {

	public static final String SEPARATOR = ",";

	private List<Person> persons;
	private int height;
	private LadderGameResults ladderGameResults;

	private InputDTO(List<Person> persons, int height, LadderGameResults ladderGameResults) {
		this.persons = persons;
		this.height = height;
		this.ladderGameResults = ladderGameResults;
	}

	public static InputDTO from(String names, int height, String ladderGameResults) {
		return new InputDTO(toPersons(names), height, toLadderGameResults(ladderGameResults));
	}

	private static LadderGameResults toLadderGameResults(String ladderGameResults) {
		return LadderGameResults.of(Arrays.asList(ladderGameResults.split(SEPARATOR)));
	}

	private static List<Person> toPersons(String names) {
		return Arrays.stream(names.split(","))
			.map(Person::new)
			.collect(Collectors.toList());
	}

	public List<Person> getPersons() {
		return persons;
	}

	public int personCount() {
		return persons.size();
	}

	public int getHeight() {
		return height;
	}

	public LadderGameResults getLadderGameResults() {
		return ladderGameResults;
	}
}
