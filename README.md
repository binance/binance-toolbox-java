# Binance Toolbox in Java

A collection of examples for `binance-connector-java`.

- Github repository: https://github.com/binance/binance-connector-java
- Maven repository: https://repo1.maven.org/maven2/io/github/binance/binance-connector-java/
- Javadoc: https://www.javadoc.io/doc/io.github.binance/binance-connector-java/latest/index.html

## Installation

Replace `LATEST_VERSION` with the latest version number and paste the snippet below in `pom.xml`
```
<dependency>
    <groupId>io.github.binance</groupId>
    <artifactId>binance-connector-java</artifactId>
    <version>LATEST_VERSION</version>
</dependency>
```
Run `mvn install` where `pom.xml` is located to install the dependency.

## Running a java file

`mvn compile exec:java -Dexec.mainClass="<java_file_name>"`

## API key & secret

To get user's information, e.g account balance, you will need to setup API key/secret from

Production: https://www.binance.com/en/my/settings/api-management
<br>
Testnet: https://testnet.binance.vision/


Fill up the API/Secret key parameters in `PrivateConfig.java`

If you see API server returns error "Invalid API-key, IP, or permissions for action.", please check this topic https://dev.binance.vision/t/why-do-i-see-this-error-invalid-api-key-ip-or-permissions-for-action/93 <br/>
This forum has plenty of topics covering most of common questions, it's the best place to ask or search API related questions.

## License

MIT