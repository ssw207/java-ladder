package ladder.view;

import ladder.dto.InputDTO;

import java.util.Scanner;

/**
 * Created by seungwoo.song on 2022-10-17
 */
public class InputView {

	private static final Scanner SCANNER = new Scanner(System.in);

	public InputDTO read() {
		String names = inputName();
		System.out.println();
		String ladderGameResults = inputLadderGameResults();
		System.out.println();
		int height = inputLadderHeight();
		return new InputDTO(names, height, ladderGameResults);
	}

	private String inputLadderGameResults() {
		System.out.println("실행 결과를 입력하세요. (결과는 쉼표(,)로 구분하세요)");
		return SCANNER.nextLine();
	}

	private int inputLadderHeight() {
		System.out.println("최대 사다리 높이는 몇 개인가요?");
		int height = SCANNER.nextInt();
		SCANNER.nextLine();
		return height;
	}

	private String inputName() {
		System.out.println("참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)");
		return SCANNER.nextLine();
	}
}
