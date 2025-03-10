## RFC 사양을 이해하며 만드는 인증서버


## 구제척인 기능

1. 핵심 인증 기능
   * OAuth2.0 인증
   * JWT 토큰 발급/검증
   * API Key 관리
   * SSO(Single Sign-On)
   * 서비스 클라이언트 관리
2. 토큰 관리
   * Access Token 발급/갱신
   * Refresh Token 관리
   * 토큰 만료 관리
   * 토큰 폐기(Revoke)
   * 토큰 검증 API
3. 클라이언트 관리 
   * 클라이언트 등록/관리
   * Redirect URI 관리 
   * Scope 관리
   * API 사용량 제한
   * 클라이언트 인증
4. 보안 기능
   * Rate Limiting
   * IP 기반 접근 제어
   * 로그인 이상 감지
   * 토큰 Blacklist 관리
   * 감사(Audit) 로그


## Reference Documentation

For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/3.4.3/gradle-plugin)
* [Create an OCI image](https://docs.spring.io/spring-boot/3.4.3/gradle-plugin/packaging-oci-image.html)
* [Spring Data JPA](https://docs.spring.io/spring-boot/3.4.3/reference/data/sql.html#data.sql.jpa-and-spring-data)
* [Spring Data Redis (Access+Driver)](https://docs.spring.io/spring-boot/3.4.3/reference/data/nosql.html#data.nosql.redis)
* [OAuth2 Authorization Server](https://docs.spring.io/spring-boot/3.4.3/reference/web/spring-security.html#web.security.oauth2.authorization-server)
* [Spring Security](https://docs.spring.io/spring-boot/3.4.3/reference/web/spring-security.html)
* [Spring Web](https://docs.spring.io/spring-boot/3.4.3/reference/web/servlet.html)

### Guides

The following guides illustrate how to use some features concretely:

* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [Messaging with Redis](https://spring.io/guides/gs/messaging-redis/)
* [Securing a Web Application](https://spring.io/guides/gs/securing-web/)
* [Spring Boot and OAuth2](https://spring.io/guides/tutorials/spring-boot-oauth2/)
* [Authenticating a User with LDAP](https://spring.io/guides/gs/authenticating-ldap/)
* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)

### Additional Links

These additional references should also help you:

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)

