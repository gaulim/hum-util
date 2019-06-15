# hum-util

> 공통 유틸 라이브러리

[![](https://jitpack.io/v/io.ssaragi/hum-util.svg?label=Release)][지트팩]

공통적으로 자주 쓰이는 기능들을 모아놓은 유틸성 라이브러리입니다.

[https://jitpack.io/#io.ssaragi/hum-util][지트팩]


## 설치 방법

`build.gradle` 파일에 아래 내용을 삽입한다.
```gradle
allprojects {
    repositories {
        maven { url 'https://jitpack.io' }
    }
}

dependencies {
    implementation io.ssaragi:hum-util:0.0.0
}
```


## 사용 예제

스크린 샷과 코드 예제를 통해 사용 방법을 자세히 설명합니다.

_더 많은 예제와 사용법은 [깃허브 위키][위키]를 참고하세요._


### 개발 및 테스트 환경

* macOS High Sierra
* adoptopenjdk-12.0.1.jdk
* Gradle 5.4.1
* Groovy 2.5.7


### 클린 및 빌드(테스트 포함) 방법

```sh
./gradlew clean
```

```sh
./gradlew build
```


### 문서화 방법

```sh
./gradlew groovydoc
```
또는
```sh
./gradlew javadoc
```


## 업데이트 내역

* 0.0.0
  * 개발중...


## 정보

가울림([전자우편][전자우편], [트위터][트위터], [페이스북][페이스북])

MIT 라이센스를 준수하며 ``LICENSE``에서 자세한 정보를 확인할 수 있습니다.

[https://github.com/gaulim/hum-util][여기]


## 기여 방법

* 이 저장소에는 작은 규모를 유지하기 위해 다른 라이브러리 의존성은 허용하지 않습니다. 단, 개발 및 디버깅을 편하게 할 목적으로 테스트 의존성은 허용합니다.

1. (<https://github.com/gaulim/hum-util/fork>)을 포크합니다.
2. (`git checkout -b feature/<브랜치명>`) 명령어로 새 브랜치를 만드세요.
3. (`git commit`) 명령어로 커밋하세요.
4. (`git push origin feature/<브랜치명>`) 명령어로 브랜치에 푸시하세요. 
5. 풀 리퀘스트를 보내주세요.


<!-- 마크다운이나 그림 링크 모음들 -->
[여기]: https://github.com/gaulim/hum-util "바로 이곳"
[지트팩]: https://jitpack.io/#io.ssaragi/hum-util "지트팩"
[전자우편]: mailto:mrjozzz@gmail.com "주인장 전자우편"
[위키]: https://github.com/gaulim/hum-util/wiki "주인장 깃허브 위키 페이지"
[트위터]: https://twitter.com/mrjozzz "주인장 트위터"
[페이스북]: https://www.facebook.com/mrjozzz "주인장 페이스북"

