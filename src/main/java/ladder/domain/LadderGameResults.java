package ladder.domain;

import ladder.util.StringUtil;

import java.util.AbstractList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Created by seungwoo.song on 2022-10-24
 */
public class LadderGameResults extends AbstractList<LadderGameResult> {

	private List<LadderGameResult> ladderGameResults;

	private LadderGameResults(List<LadderGameResult> ladderGameResults) {
		this.ladderGameResults = ladderGameResults;
	}

	public static LadderGameResults of(List<String> ladderGameResults) {
		List<LadderGameResult> results = ladderGameResults.stream()
			.filter(StringUtil::isNotBlank)
			.map(LadderGameResult::of)
			.collect(Collectors.toList());

		return new LadderGameResults(results);
	}

	@Override public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		LadderGameResults that = (LadderGameResults)o;
		return Objects.equals(ladderGameResults, that.ladderGameResults);
	}

	@Override public int hashCode() {
		return Objects.hash(ladderGameResults);
	}

	@Override public LadderGameResult get(int index) {
		return ladderGameResults.get(index);
	}

	@Override public int size() {
		return ladderGameResults.size();
	}

	public LadderGameResult get(Person person) {
		int position = person.getPosition();
		if (position < 0 || position >= ladderGameResults.size()) {
			throw new IllegalArgumentException("잘못된 위치값입니다 " + position);
		}

		return get(position);
	}

	@Deprecated
	public String values() {
		return
	}
}
