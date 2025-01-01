
import java.util.Scanner;

// 짝수 홀수 구별하기

// public class Number {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.println("숫자를 입력하세요");
//         int num = scanner.nextInt();

//         if (num % 2 == 0 ) {
//             System.out.println("홀수입니다");
//         } else {
//             System.out.println("짝수입니다");
//         }

        
//         scanner.close();
    
    
//     }
// }

// import java.util.Scanner;  // Scanner 클래스를 임포트

// import java.util.Scanner;  // Scanner 클래스를 임포트

public class Number {
    public static void main(String[] args) {
        // Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);
        
        // 사용자에게 숫자 입력 받기
        System.out.print("숫자를 입력하세요: ");
        int num = scanner.nextInt();  // 사용자가 입력한 값을 정수로 받음
        
        // 입력된 숫자가 짝수인지 홀수인지 판별
        if (num % 2 == 0) {
            System.out.println("짝수입니다.");
        } else {
            System.out.println("홀수입니다.");
        }
        
        // Scanner 객체 닫기
        scanner.close();
    }
}


