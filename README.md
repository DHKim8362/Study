# Study

1. vscode 및 확장프로그램 설치
2. jdk 설치
   cmd 실행 및 명령어 입력
    ```bath
    tar -xvzf jdk-23_linux-x64_bin.tar.gz
    ```
    위 방법 아님 linux 꺼 잘못 다운받음
    windows 용으로 exe 파일 다시 다운 및 실행
3. 설치 확인
   cmd로 설치 확인
   ```bath
   java -version
   ```
   배치 파일이 아니라고함
4. 환경변수 설정
   window 바탕화면 검색으로 '시스템 환경 변수' 편집
   환경변수 클릭
   시스템 변수에 새로만들기 클릭
   ```
   JAVA_HOME 변수 추가:
      JAVA_HOME 값을 C:\Program Files\Java\jdk-23로 설정합니다.
   PATH 변수 수정:
      PATH에 %JAVA_HOME%\bin을 추가하여 명령어가 잘 실행되도록 설정합니다.
   ```
   설정완료
   
   
