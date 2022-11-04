package baseball;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

class GameResultJudgementTest {

  GameResultJudgement judge;
  @BeforeEach
  void GameResultJudgmentCreate() {
    judge = new GameResultJudgement(3);
  }

  @Test
  @Order(1)
  @DisplayName("스트라이크 3 확인")
  void JudgeStrikeCount3() {
    assertEquals(3, judge.judgeStrike("123", "123"));
    assertEquals(3, judge.judgeStrike("456", "456"));
    assertEquals(3, judge.judgeStrike("789", "789"));
  }
  @Test
  @Order(2)
  @DisplayName("스트라이크 2 확인")
  void JudgeStrikeCount2() {
    assertEquals(2, judge.judgeStrike("123", "143"));
    assertEquals(2, judge.judgeStrike("456", "356"));
    assertEquals(2, judge.judgeStrike("789", "782"));
  }
  @Test
  @Order(3)
  @DisplayName("스트라이크 1 확인")
  void JudgeStrikeCount1() {
    assertEquals(1, judge.judgeStrike("125", "143"));
    assertEquals(1, judge.judgeStrike("451", "356"));
    assertEquals(1, judge.judgeStrike("719", "782"));
  }
}