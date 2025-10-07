# 🧩 PrestaShop_TestAutomation_BDD

## 🧠 Overview
This project is a **BDD-style test automation framework** designed for executing end-to-end testing scenarios on the **PrestaShop Demo web application**.  
It validates critical user journeys such as **account creation, product search, add-to-cart, and checkout flow**.

---

## 🧱 Project Structure

```
src
├── main
│ └── java
│ ├── base
│ ├── pages
│
└── test
├── java
│ ├── steps
│ └── runners
└── resources
└── features
└── EndToEnd.feature

```
### 📁 Folders Description
- **base** → contains setup and teardown logic  
- **pages** → follows Page Object Model (POM) for UI elements and actions  
- **steps** → step definitions implementing Gherkin steps  
- **runners** → TestNG or Cucumber runners to execute scenarios  
- **features** → Gherkin feature files describing test cases  

---

## ⚙️ Tools & Technologies
- Java  
- Selenium WebDriver  
- Cucumber (BDD)  
- TestNG  
- Maven  
- Chrome Browser  

---

## ▶️ Execution Options

### 🔹 Clone the Project
```bash
# clone the repository
git clone https://github.com/Mohammed-Nabil99/PrestaShop_TestAutomation_BDD.git

# move into the project folder
cd PrestaShop_TestAutomation_BDD

# pull latest updates (anytime later)
git pull origin main
```

### 🔹 Run the Tests

You can execute the tests in multiple ways:

- Using **TestNG XML** → `HappyScenario.xml`
- Using **Cucumber Runner Class**
- Directly from **Feature Files** in the IDE (with Cucumber plugin)

---

### 📊 Reporting

Test execution results are generated using **TestNG default reports**, located under:
```
/test-output
```
---

### 👤 Author

**Mohammed Nabil**  
QA & Test Automation Specialist

