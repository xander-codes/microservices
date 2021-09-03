### microservices demo project

To be easier to test every service has its own in memory database:

**Microservices:**
 - product-service: hsqldb, on port 9002
 - review-service: h2, on port 9003
 - user-service: sqlite (with external dialect), on port 9001

**Discovery service** (Netflix Eureka):
 - service-registry on port 8761

**Gateway** (Spring Cloud Gateway):
 - cloud-gateway on port 9191