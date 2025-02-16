# 🏠 육아/가사 분담 플랫폼, 두더집(Do the 집)

![image](https://github.com/Team-Soong-Kor-Dan-of-10th-K-Hackathon/do-the-jip/assets/81142151/523f1235-ef7e-44fb-ac50-3bf1228905c1)

> [제 10회 K-해커톤](http://www.k-hackathon.com/view.asp?idx=450&boardcode=notice&page=2)에서 수도권 권역 300팀 중 본선 진출 14팀에 선정되었습니다.

<br>

## 프로젝트 소개

* 두더집(Do the 집)은 가족 구성원들이 육아/가사 노동, 즉 집안일을 분담할 수 있도록 도와주는 플랫폼 서비스입니다.
* 그래프 자료를 통해 집안일 분담 및 해결 비율을 한 눈에 확인할 수 있습니다. 이를 기반으로 분담 비율을 효율적으로 조정할 수 있습니다.
* 해결한 집안일에 대해 이모지 반응을 남기고, 직접 만든 가족 쿠폰을 제공하여 집안일에 적극 참여하는 구성원에게 칭찬 및 응원할 수 있습니다.
* 경험치와 레벨 등 게이미피케이션 요소를 추가해 어린 자녀들도 집안일에 적극적으로 참여할 수 있도록 돕고자 했습니다.

<br>

## 핵심 기능 및 프로토타입

![image](https://github.com/Team-Soong-Kor-Dan-of-10th-K-Hackathon/do-the-jip/assets/81142151/926c2932-9596-486d-86a4-a983343a5f31)

![image](https://github.com/Team-Soong-Kor-Dan-of-10th-K-Hackathon/do-the-jip/assets/81142151/5c3402ce-7684-4862-9cf0-c0880fc941cd)

<br>

## 기술 스택

### 클라이언트
* 언어 : TypeScript
* 프레임워크 : React Native
* 라이브러리 및 기타 도구 : Recoil, Prettier, Axios, npm

### 백엔드
* 언어 : Java
* 프레임워크 : Spring(Spring Boot)
* 라이브러리 및 기타 도구 : Spring Data JPA, lombok, JUnit, gradle
* 데이터베이스 : AWS RDS(MySQL)
* 배포 : AWS Lambda(Serverless)

<br>

## 팀원 구성 및 역할 분담

### [김자헌](https://github.com/KoreaUniNeo)
#### 기획, 모바일 앱 개발
* 집안일(할 일) 통계 정보 화면 UI 구현
* 로그인 API 연동

### [최소정](https://github.com/daisyHyeseul)
#### 기획, 디자인, 모바일 앱 개발
* 집안일 통계 정보 화면, 가족 쿠폰 목록 화면 프로토타입 디자인
* 할 일 추가 화면, 할 일 카테고리 선택 화면 UI 구현
* 할 일 목록 조회 API 연동

### [하채영](https://github.com/ChaeyoungHa)
#### 기획, 디자인, 모바일 앱 개발
* 로그인 화면, 회원 가입 화면, 할 일 목록 화면, 할 일 추가 화면, 할 일 정보 모달 프로토타입 디자인
* 할 일 컴포넌트, 프로필 아이콘 컴포넌트, 로그인 화면, 할 일 목록 화면, 할 일 정보 모달 UI 구현

### [박정운](https://github.com/jwpark1211)
#### 기획, 백엔드 개발
* 가족 생성/조회/수정 API, 가족 구성원 추가/조회/수정 API, 할 일 목록 조회/수정/삭제 API 구현
* 회원 조회 테스트, 가족 생성/조회/수정 테스트, 가족 구성원 추가/조회/수정 테스트, 할 일 추가/수정/조회/삭제 테스트 코드 작성

### [이동재](https://github.com/LouiMinister)
#### 기획, 백엔드 개발
* 가족, 가족 구성원, 회원, 할 일 도메인 엔티티 구현
* 회원 생성/조회 API, 로그인 API, 카테고리 생성/조회 API 구현
* 회원 조회 테스트, 카테고리 생성/조회 테스트, 할 일 생성/조회/삭제 테스트 코드 작성
