Legacy RHEL6 Java EE Demo

Legacy environment:
- OS: RHEL 6
- Java: OpenJDK 8
- Spring Boot 2.5
- Uses EJB (javax.ejb)
- Uses JAXB (javax.xml.bind)
- Uses Oracle DB
- Hardcoded paths: /etc/app/conf, /opt/app/logs
- Startup script assumes RHEL6 paths

Target migration:
- RHEL 9
- Java 17
- Remove javax.* APIs
- Replace EJB with Spring services
- Replace JAXB with jakarta.xml.bind
- Externalize paths/config

Used for MTA demo: RHEL6 -> RHEL9