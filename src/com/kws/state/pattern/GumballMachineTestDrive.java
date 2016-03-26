package com.kws.state.pattern;
import java.util.Scanner;

// 테스트용 코드
public class GumballMachineTestDrive {
  public static void main(String[] args) {
    // 알맹이를 5개 넣고 인스턴스 화
    GumballMachine gumballMachine = new GumballMachine(5);

    Scanner scanner = new Scanner(System.in);
    String input;

    do {
      System.out.println(gumballMachine); // 기계의 상태 출력
      System.out.println();
      System.out.println("1: 동전투입, 2:손잡이돌림, 3:동전반환, Q:종료");
      System.out.print("선택: ");
      input = scanner.next();

      System.out.println();
      switch (input) {
        case "1":
          gumballMachine.insertQuarter();
          break;
        case "2":
          gumballMachine.turnCrank();
          break;
        case "3":
          gumballMachine.ejectQuarter();
          break;
        default:
          System.out.println("잘못 입력하셨습니다.");
          break;
      }
    } while(!input.toUpperCase().equals("Q"));
  }
}
