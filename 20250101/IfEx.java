// 1번
// public class IfEx {
//     public static void main(String[] args) {
//         int age = 20;
//         if(age >= 18) {
//             System.out.println("성인입니다.");
//         }
//         else if (age >= 14) {
//             System.out.println("청소년");
//         }
//         else {
//             System.out.println("어린이");
//         }
//     }
// }

// 2번
// import java.util.Scanner;  // Scanner 클래스를 임포트

// public class IfEx {
//     public static void main(String[] args) {
//         // Scanner 객체 생성
//         Scanner scanner = new Scanner(System.in);
        
//         // 사용자에게 나이를 입력받기
//         System.out.print("나이를 입력하세요: ");
//         int age = scanner.nextInt();  // 사용자 입력값을 int로 받음
        
//         // 입력된 나이에 따라 조건문 실행
//         if (age >= 18) {
//             System.out.println("성인입니다.");
//         }
//         else if (age >= 14) {
//             System.out.println("청소년입니다.");
//         }
//         else {
//             System.out.println("어린이입니다.");
//         }
        
//         // Scanner 객체 닫기 (사용이 끝났으면 닫는 것이 좋습니다)
//         scanner.close();
//     }
// }


// 3번
import java.util.Scanner;  // Scanner 클래스를 임포트

public class IfEx {
    public static void main(String[] args) {
        // Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("나이를 입력하세요 (종료하려면 'exit' 입력): ");
            
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;  
            }

            
            try {
                int age = Integer.parseInt(input);  
                if (age >= 18) {
                    System.out.println("성인입니다.");
                }
                else if (age >= 14) {
                    System.out.println("청소년입니다.");
                }
                else {
                    System.out.println("어린이입니다.");
                }
            } catch (NumberFormatException e) {
                
                System.out.println("잘못된 입력입니다. 숫자를 입력해주세요.");
            }
        }
        scanner.close();
    }
}
