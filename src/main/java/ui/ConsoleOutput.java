package ui;

import java.util.List;

public class ConsoleOutput implements Output{

    @Override
    public void printMessage(String message) {
        System.out.print(message);
    }
    @Override
    public void printStartMessage() {
        printMessage("숫자 야구 게임을 시작합니다.\n");
    }
    @Override
    public void printRequestNumberInput() {
        printMessage("숫자를 입력해주세요 : ");
    }
    @Override
    public void printEndGame() {
        printMessage("3개의 숫자를 모두 맞히셨습니다! 게임 종료\n");
    }
    @Override
    public void printRequestRestartGameInput() {
        printMessage("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.\n");
    }
    @Override
    public void printGameResult(String buffer) {
        printMessage(buffer+"\n");
    }
}
