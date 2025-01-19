# 📇 Smart Contact Manager

Smart Contact Manager is a Spring Boot-based web application designed to efficiently manage and organize your contacts. The application provides a user-friendly interface to add, edit, delete, and search contacts, making it ideal for personal or professional use.

## ✨ Features

- **🔒 User Authentication**: Secure user registration and login functionality with Google OAuth and GitHub OAuth integration.
- **🖋️ CRUD Operations**: Create, Read, Update, and Delete contacts.
- **🔍 Search Functionality**: Easily search contacts by name, email, or phone number.
- **📜 Pagination**: Navigate through large sets of contacts with ease.
- **📱 Responsive Design**: Fully responsive UI for desktop and mobile devices.
- **🔐 Secure Application**: Password encryption with BCrypt, prevention of SQL injection, and CSRF protection.
- **🖼️ Image Storage**: Store and manage contact images securely using Cloudinary.
- **✉️ Email Verification**: Email verification using Mailtrap.

## 💻 Tech Stack

- **Backend**: Spring Boot, Spring Security, Hibernate, MySQL
- **Frontend**: Thymeleaf, Bootstrap, HTML, CSS, JavaScript
- **Tools**: Maven
- **Database**: MySQL
- **OAuth Providers**: Google OAuth, GitHub OAuth
- **Image Storage**: Cloudinary
- **Email Verification**: Mailtrap
- **Deployment**: Apache Tomcat (or other web servers)

## 🛠️ Installation

### Prerequisites

- ☕ Java 17 or later
- 🧰 Maven 3.6 or later
- 🗄️ MySQL database
- 🖥️ IDE (e.g., IntelliJ IDEA, Eclipse)

### Steps to Run the Application

1. **📂 Clone the Repository**
   ```bash
   git clone https://github.com/your-username/smart-contact-manager.git
   cd smart-contact-manager
   ```

2. **⚙️ Configure MySQL Database**
   - Create a database named `smart_contact_manager`.
   - Update `application.properties` with your MySQL credentials:
     ```properties
     spring.datasource.url=jdbc:mysql://localhost:3306/scm
     spring.datasource.username=your_username
     spring.datasource.password=your_password
     ```

3. **🔑 Configure OAuth Providers**
   - Add your Google and GitHub OAuth credentials to `application.properties`:
     ```properties
     spring.security.oauth2.client.registration.google.client-id=your_google_client_id
     spring.security.oauth2.client.registration.google.client-secret=your_google_client_secret
     spring.security.oauth2.client.registration.github.client-id=your_github_client_id
     spring.security.oauth2.client.registration.github.client-secret=your_github_client_secret
     ```

4. **☁️ Configure Cloudinary**
   - Add your Cloudinary credentials to `application.properties`:
     ```properties
     cloudinary.cloud-name=your_cloud_name
     cloudinary.api-key=your_api_key
     cloudinary.api-secret=your_api_secret
     ```

5. **📧 Configure Mailtrap**
   - Add your Mailtrap credentials to `application.properties`:
     ```properties
     spring.mail.host=your_hostname
     spring.mail.port=your_port_number
     spring.mail.username=your_mailtrap_username
     spring.mail.password=your_mailtrap_password
     spring.mail.properties.mail.smtp.auth=true
     spring.mail.properties.mail.smtp.starttls.enable=true
     spring.mail.properties.domain_name=your_domain_name
     ```

6. **🔨 Build the Application**
   ```bash
   mvn clean install
   ```

7. **🚀 Run the Application**
   ```bash
   mvn spring-boot:run
   ```

8. **🌐 Access the Application**
   - Open your browser and go to `http://localhost:8080`.

## 🏗️  Application Structure

```
Directory structure:
└── Smart-Contact-Manager/
    ├── mvnw
    ├── mvnw.cmd
    ├── package.json
    ├── pom.xml
    ├── tailwind.config.js
    ├── src/
    │   ├── main/
    │   │   ├── java/
    │   │   │   └── com/
    │   │   │       └── cypher/
    │   │   │           └── scm/
    │   │   │               ├── SmartContactManagerApplication.java
    │   │   │               ├── config/
    │   │   │               │   ├── AppConfig.java
    │   │   │               │   ├── AuthFailureHandler.java
    │   │   │               │   ├── OAuthAuthenticationSuccessHandler.java
    │   │   │               │   └── SecurityConfig.java
    │   │   │               ├── controllers/
    │   │   │               │   ├── ApiController.java
    │   │   │               │   ├── AuthController.java
    │   │   │               │   ├── ContactController.java
    │   │   │               │   ├── PageController.java
    │   │   │               │   ├── RootController.java
    │   │   │               │   └── UserController.java
    │   │   │               ├── entities/
    │   │   │               │   ├── Contact.java
    │   │   │               │   ├── Providers.java
    │   │   │               │   ├── SocialLink.java
    │   │   │               │   └── User.java
    │   │   │               ├── forms/
    │   │   │               │   ├── ContactForm.java
    │   │   │               │   ├── ContactSearchForm.java
    │   │   │               │   └── UserForm.java
    │   │   │               ├── helpers/
    │   │   │               │   ├── AppConstants.java
    │   │   │               │   ├── Helper.java
    │   │   │               │   ├── Message.java
    │   │   │               │   ├── MessageType.java
    │   │   │               │   ├── ResourceNotFoundException.java
    │   │   │               │   └── SessionHelper.java
    │   │   │               ├── repositories/
    │   │   │               │   ├── ContactRepo.java
    │   │   │               │   └── UserRepo.java
    │   │   │               ├── services/
    │   │   │               │   ├── ContactService.java
    │   │   │               │   ├── EmailService.java
    │   │   │               │   ├── ImageService.java
    │   │   │               │   ├── UserService.java
    │   │   │               │   └── impl/
    │   │   │               │       ├── ContactServiceImpl.java
    │   │   │               │       ├── EmailServiceImpl.java
    │   │   │               │       ├── ImageServiceImpl.java
    │   │   │               │       ├── SecurityCustomUserDetailService.java
    │   │   │               │       └── UserServiceImpl.java
    │   │   │               └── validators/
    │   │   │                   ├── FileValidator.java
    │   │   │                   └── ValidFile.java
    │   │   └── resources/
    │   │       ├── application.properties
    │   │       ├── static/
    │   │       │   ├── css/
    │   │       │   │   ├── input.css
    │   │       │   │   ├── output.css
    │   │       │   │   └── style.css
    │   │       │   ├── images/
    │   │       │   └── js/
    │   │       │       ├── admin.js
    │   │       │       ├── contacts.js
    │   │       │       └── script.js
    │   │       └── templates/
    │   │           ├── about.html
    │   │           ├── base.html
    │   │           ├── contact.html
    │   │           ├── error_page.html
    │   │           ├── home.html
    │   │           ├── login.html
    │   │           ├── message.html
    │   │           ├── navbar.html
    │   │           ├── register.html
    │   │           ├── services.html
    │   │           ├── success_page.html
    │   │           └── user/
    │   │               ├── add_contact.html
    │   │               ├── contact_modals.html
    │   │               ├── contacts.html
    │   │               ├── dashboard.html
    │   │               ├── profile.html
    │   │               ├── search.html
    │   │               ├── sidebar.html
    │   │               ├── update_contact_view.html
    │   │               └── user_navbar.html
    │   └── test/
    │       └── java/
    │           └── com/
    │               └── cypher/
    │                   └── scm/
    │                       └── SmartContactManagerApplicationTests.java
    └── .mvn/
        └── wrapper/
            └── maven-wrapper.properties

```


## 🤝 Contributing

Contributions are welcome! Follow these steps:

1. Fork the repository.
2. Create a feature branch (`git checkout -b feature-branch-name`).
3. Commit your changes (`git commit -m 'Add some feature'`).
4. Push to the branch (`git push origin feature-branch-name`).
5. Create a pull request.

## 🤩 Don't forget to give ⭐ to this repository
<img src="https://forthebadge.com/images/badges/built-with-love.svg">
<img src="https://forthebadge.com/images/badges/made-with-java.svg">
