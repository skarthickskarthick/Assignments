
UserApp - Servlet + JSP + MySQL + Redis example
------------------------------------------------
How to run (recommended using Docker):

1. Start MySQL and Redis:
   docker-compose up -d

2. Update DB credentials if needed in src/main/java/com/example/util/DBUtil.java

3. Create 'users' table (the project expects database 'servlet_demo').
   Use the SQL provided in earlier instructions or run this SQL manually:
   CREATE TABLE users (
     id INT AUTO_INCREMENT PRIMARY KEY,
     name VARCHAR(100) NOT NULL,
     email VARCHAR(150) NOT NULL UNIQUE,
     password_hash VARCHAR(255) NOT NULL,
     phone VARCHAR(20),
     role ENUM('USER','ADMIN') DEFAULT 'USER',
     created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
   );

4. Build the project:
   mvn clean package

5. Deploy the generated UserApp.war from target/ to your Tomcat webapps/ folder, or use Run on Server in IDE.

6. Access in browser:
   http://localhost:8080/UserApp/register.jsp
   http://localhost:8080/UserApp/login.jsp

Notes:
- JWT secret uses environment variable JWT_SECRET or a default in code. Set JWT_SECRET in your environment for security.
- In production, set cookies to Secure and use HTTPS.
- This project is for learning and demonstration. Harden for production before using.
