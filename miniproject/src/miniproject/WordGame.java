package miniproject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Array;

public class WordGame {
	Scanner sc = new Scanner(System.in);
	DB db = new DB();
	User user = new User();
	String answer = "";
	int score = 0;

	public void total(int j) {
		int scoreF = 5;
		int scoreS = 3;
		int scoreT = 1;

		switch (j) {
		case 0:
			score += scoreF;
			break;
		case 1:
			score += scoreS;
			break;
		case 2:
			score += scoreT;
			break;
		}
	}

	public void game(String type) {
		List<String> word = new ArrayList<String>();
		List<String> hint = new ArrayList<String>();
		String answer;
		int index = 0;

		word.addAll(db.wordList(type));

		Collections.shuffle(word);

		aa: for (int i = 0; i < word.size(); i++) {
			hint = db.hintList(word.get(i));
			System.out.println(i + 1 + "번째 문제");
			for (int j = 0; j < hint.size(); j++) {
				System.out.println(j + 1 + "번째 힌트 " + hint.get(j));
				System.out.print("정답 : ");
				answer = sc.next();
				index = db.wordGame(answer, hint.get(j), j);
				if (index == 1) {
					total(j);
					continue aa;
				}
			}

		}
		System.out.println("당신의 점수는 " + score + "점 입니다.");
		if(score <= 0){
			System.out.println("0점은 랭킹에 등록될 수 없습니다.");
		}
		else {
			db.rankInsert(score, type, user.id);
		}
		score = 0;
	}

}