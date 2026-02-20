# Clean Core ERP  🇺🇸

[![Java](https://img.shields.io/badge/Java-25-000?style=for-the-badge\&logo=openjdk)]()
[![Spring Boot](https://img.shields.io/badge/Spring_Boot-4.x-6DB33F?style=for-the-badge\&logo=springboot)]()
[![Maven](https://img.shields.io/badge/Maven-3.9+-C71A36?style=for-the-badge\&logo=apachemaven)]()
[![PostgreSQL](https://img.shields.io/badge/PostgreSQL-17+-316192?style=for-the-badge\&logo=postgresql)]()
[![Docker](https://img.shields.io/badge/Docker-Enabled-2496ED?style=for-the-badge\&logo=docker)]()
[![AWS](https://img.shields.io/badge/Deployed_on-AWS-232F3E?style=for-the-badge\&logo=amazonaws)]()

---

## About the Project

<p align="center">
  <img src="https://cdn.hashnode.com/res/hashnode/image/upload/v1710343480050/57af3ed5-0205-4cab-b206-686fc9431c5d.png" 
       alt="Clean Architecture Diagram" 
       width="700"/>
</p>

**Clean Core ERP** is a production-grade multi-tenant ERP SaaS built following **Clean Architecture principles** and modern backend engineering best practices.

The purpose of this project is to demonstrate:

* Strong architectural organization
* Clear separation of concerns
* Framework-independent domain logic
* Robust security implementation
* Scalable and production-ready design

The system simulates a real-world enterprise management platform including:

* Company management (multi-tenant)
* User and role management
* Service orders
* Payments
* Audit logging
* Reports

---

## Architecture

The project strictly follows **Clean Architecture**, ensuring that business rules are completely independent from external frameworks.

### Applied Principles

* Clean Architecture
* SOLID
* Dependency Inversion
* Use Case Driven Design
* Domain isolation
* Separation between business logic and frameworks

---

## Security

* Spring Security
* JWT-based authentication
* Role-based authorization (RBAC)
* Refresh tokens
* Multi-tenant access control
* Audit trail for critical actions

---

## Multi-Tenant Design

Designed as a SaaS platform:

* Logical data isolation per company
* Tenant-based filtering
* Company-scoped authorization

---

## Testing Strategy

* Unit tests for use cases
* Integration tests
* Testcontainers
* Business rule validation coverage

---

## Infrastructure

* Dockerized application
* PostgreSQL
* Flyway migrations
* AWS-ready deployment
* Environment-based configuration

---

## Technical Goal

This project was built to demonstrate:

* Backend engineering maturity
* Enterprise-level architecture
* Clean code and modularity
* Security best practices
* Real-world domain modeling
* Production readiness

---

## 👨‍💻 Autor

Felipe Vargas
Software Engineer
