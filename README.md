# 🌩️ CloudVista — Cloud Instance Monitoring Dashboard

CloudVista is a Spring Boot web application that helps monitor cloud instances efficiently.  
It displays real-time information such as CPU usage, memory utilization, disk usage, and instance status through a clean and interactive dashboard.

It’s similar in concept to AWS CloudWatch, Azure Monitor, or Google Cloud Console, but built at a smaller scale for demonstration and learning.
---

## 🚀 Features

- 📊 **Dashboard View:** Displays all cloud instances in a tabular format  
- 💾 **MySQL Integration:** Stores and retrieves instance metrics dynamically  
- 🧠 **Smart Indicators:** Highlights high CPU or memory usage with alert styling  
- ⚙️ **Modular Spring Boot Structure:** Follows MVC architecture (Controller, Service, Repository)  
- 🌐 **Thymeleaf Templates:** Used for dynamic rendering of data in HTML pages  

---

## 🏗️ Tech Stack

| Component | Technology Used |
|------------|-----------------|
| Backend | Java 17, Spring Boot |
| Frontend | Thymeleaf, HTML, CSS |
| Database | MySQL |
| Build Tool | Maven |
| Server | Embedded Tomcat |
| IDE | VS Code / IntelliJ IDEA |

---

## ⚙️ Setup Instructions

1. **Clone the repository**
   ```bash
   git clone https://github.com/<your-username>/CloudVista.git
   cd CloudVista
2. **Configure MySQL**

Create a database named cloudvista
Update your MySQL username & password in application.properties

spring.datasource.url=jdbc:mysql://localhost:3306/cloudvista?createDatabaseIfNotExist=true
spring.datasource.username=root
spring.datasource.password=root
spring.jpa.hibernate.ddl-auto=update

3. **Run the Application**
mvn spring-boot:run


4. **Access in Browser**
http://localhost:1234/
   
