## 📦 개발 환경 구성

| 항목 | 상세 내용 |
|------|-----------|
| **개발 언어** | Java 17+, TypeScript, JavaScript |
| **프레임워크** | Spring Boot (Spring MVC, Spring Security 포함), React, Next.js |
| **ORM** | MyBatis |
| **데이터베이스** | Oracle 11g 이상 |
| **모델 환경** | TensorFlow |
| **빌드 도구** | Gradle |
| **WAS** | Spring Boot Embedded Tomcat |
| **형상 관리** | Git, GitHub |
| **협업 도구** | Jira, Notion, Slack |
| **API 테스트** | Postman |


## 🛠️ 기술 스택 (Tech Stack)

### 🌐 Frontend

| 기술 | 설명 |
|------|------|
| **React** | 컴포넌트 기반 UI 라이브러리 |
| **Next.js** | 서버 사이드 렌더링(SSR) 및 정적/동적 라우팅 지원 |
| **TypeScript** | 	정적 타입을 지원하는 JavaScript 상위 언어로 안정적인 개발 가능 |
| **Tailwind CSS** | 유틸리티 퍼스트 CSS 프레임워크로 반응형 UI 스타일링 지원 |

### ⚙ Backend

| 기술 | 설명 |
|------|------|
| **Spring Boot** | RESTful API 구현, 설정 자동화, 내장 톰캣 기반 서버 환경 |
| **Spring MVC** | 계층화된 컨트롤러-서비스 구조로 웹 애플리케이션 구현 |
| **MyBatis** | SQL 중심 ORM, DB 연동 및 동적 쿼리 처리 |
| **Oracle** | 게시글/댓글/좋아요/거래 데이터 관리용 RDBMS |
| **Spring Security** | 사용자 인증/인가 및 세션 관리 구현 |
| **JWT** | 토큰 기반 인증 구조, 무상태 인증 처리 방식 적용 |
| **TensorFlow** | 	사용자 표정 기반 감정 분석 모델 학습 및 표 |

## 🔌 외부 연동 API
| API | 설명 |
|------|------|
| **Naver SMTP** | 이메일 인증 시스템 구현  |
| **Kakao 주소 API** | 회원가입 주소 자동입력  |
| **Face API** | 표정 인식 후 감정 값 추출  |
| **Youtube RSS  API** | 사용자 감정에 따라 음악 추천을 위한 유튜브 링크 제공  |

## 💻 개발 도구

| 도구 | 역할 |
|------|------|
| **IntelliJ IDEA / Eclipse** | Java 백엔드 및 Spring Boot 개발 |
| **Visual Studio Code** | 프론트엔드, 모델 구현 |
| **Postman** | API 테스트 및 디버깅 |
| **GitHub / Sourcetree** | 프로젝트 버전 관리 및 협업 |
| **Notion / Jira / Slack** | 프로젝트 문서화, 일정 관리 및 실시간 커뮤니케이션 |

## ✅ 개발 특징

- **사용자 감정 분석 기반**의 개인화 추천 시스템
- **표정 인식 및 AI 분석 모델(TensorFlow)** 을 활용한 실시간 감정 추론
- 감정 상태에 따라 활동, 도서, 음악을 맞춤 추천
- JWT + OAuth2 **기반 로그인/인증 시스템**
- Spring Security **기반 권한 분기 및 접근 제어 구현**
- Oracle + MyBatis **활용한 데이터 핸들링**
- **REST API 설계 최적화 및 클린 아키텍처 적용**

## 📊 데이터베이스 
<a name="trade-section-top-erd"></a>
<details>
<summary>ERD</summary>
  <br>
<ul>
  <li><b>사용자 관리</b>
    <ul>
      <li>USERINFO: 사용자 기본 정보</li>
      <li>USER_SESSIONS: 유저 세션 관리</li>
    </ul>
  </li>
<br>
  <li><b>도서 관리</b>
    <ul>
      <li>BOOKINFO: 도서 정보</li>
      <li>BOOK_BORROW / BOOK_RECORD: 도서 대출 및 반납 기록</li>
      <li>BOOK_REVIEW / BOOK_WISHLIST: 도서 리뷰 및 관심 도서 목록</li>
    </ul>
  </li>
<br>
  <li><b>커뮤니티 기능</b>
    <ul>
      <li>BOARD: 게시판</li>
      <li>BOARD_COMMENT: 댓글</li>
      <li>BOARD_LIKES: 게시글 추천</li>
    </ul>
  </li>
<br>
  <li><b>공지사항</b>
    <ul>
      <li>NOTICE: 운영자 공지사항 관리</li>
    </ul>
  </li>
<br>
  <li><b>중고 도서 거래</b>
    <ul>
      <li>TRADE_POST: 중고 도서 게시글</li>
      <li>TRADE_FAVORITE: 관심 등록 기능</li>
      <li>TRADE_RECORD: 거래 완료 기록</li>
    </ul>
  </li>
<br>
  <li><b>실시간 채팅</b>
    <ul>
      <li>TRADE_CHATROOM: 채팅방</li>
      <li>TRADE_CHATMESSAGE: 채팅 메시지</li>
    </ul>
  </li>
<br>
  <li><b>사용자 알림</b>
    <ul>
      <li>NOTIFICATIONS: 이벤트 및 메시지 알림 시스템</li>
    </ul>
  </li>
</ul>
<br>
  
## 📌 전체 ERD
![InkTree ERD](https://github.com/pingpingeee/MoodSync/blob/main/lib/images/erd/ERD.png?raw=true)

### 🔝 [이 섹션 맨 위로 이동](#trade-section-top-erd)
</details>

## 🖥 주요 화면 및 기능 상세

<a name="trade-section-top1"></a>
<details>
<summary>🔐 로그인 & 회원가입</summary>



### 🔝 [이 섹션 맨 위로 이동](#trade-section-top1)
---
</details>

