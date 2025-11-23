# Shopping Cart Application

A full-featured e-commerce shopping cart system built with modern web technologies, providing seamless online shopping experience with product management, cart functionality, and order processing.

## 🚀 Features

### Customer Features
- **Product Catalog**
  - Browse products by categories
  - Search and filter products

- **Shopping Cart**
  - Add/remove items from cart
  - Update product quantities
  - Real-time price calculation
  - Cart persistence across sessions

- **Order Management**
  - Order history and tracking

- **User Account**
  - User registration and login
  - Profile management

### Admin Features
- **Product Management**
  - Add, edit, delete products
  - Category management
  - Inventory tracking
  - Bulk product operations

- **Order Management**
  - View all orders
  - Update order status
  - Generate invoices

- **User Management**
  - View registered users
  - Manage user roles

## 🛠️ Tech Stack

- **Backend Framework:** Spring Boot 
- **Database:** MySQL
- **Security:** Spring Security / JWT
- **Build Tool:** Maven

## 📋 Prerequisites

Before running this application, ensure you have:

- Java 17+ (for Spring Boot) or Node.js 16+ (for Node.js)
- Maven 3.6+ or npm/yarn
- MySQL 8.0+ / PostgreSQL 12+ / MongoDB 4.4+
- Git

## ⚙️ Installation & Setup

### 1. Clone the repository

```bash
git clone https://github.com/StarBoyShiny/ShopingCart.git
cd ShopingCart
```

### 2. Configure the Database

Create a database:

```sql
CREATE DATABASE shopping_cart;
```

Update the configuration file (`application.properties` or `.env`):

```properties
# Database Configuration
spring.datasource.url=jdbc:mysql://localhost:3306/shopping_cart
spring.datasource.username=your_username
spring.datasource.password=your_password

# JPA Configuration
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

# Payment Gateway (Stripe example)
stripe.api.key=your_stripe_api_key
stripe.api.secret=your_stripe_secret_key

# Email Configuration
spring.mail.host=smtp.gmail.com
spring.mail.port=587
spring.mail.username=your_email@gmail.com
spring.mail.password=your_app_password
```

### 3. Install Dependencies

**For Spring Boot:**
```bash
mvn clean install
```

**For Node.js:**
```bash
npm install
# or
yarn install
```

### 4. Run the Application

**For Spring Boot:**
```bash
mvn spring-boot:run
```

**For Node.js:**
```bash
npm start
# or
yarn start
```

The application will start on `http://localhost:8080` 

## 📡 API Endpoints

### Authentication
- `POST /api/auth/register` - Register new user
- `POST /api/auth/login` - User login
- `POST /api/auth/logout` - User logout

### Products
- `GET /api/products` - Get all products (with pagination)
- `GET /api/products/{id}` - Get product by ID
- `GET /api/products/category/{categoryId}` - Get products by category
- `POST /api/products` - Add new product (Admin only)
- `PUT /api/products/{id}` - Update product (Admin only)
- `DELETE /api/products/{id}` - Delete product (Admin only)
- `GET /api/products/search?q={query}` - Search products

### Categories
- `GET /api/categories` - Get all categories
- `POST /api/categories` - Create category (Admin only)
- `PUT /api/categories/{id}` - Update category (Admin only)
- `DELETE /api/categories/{id}` - Delete category (Admin only)

### Shopping Cart
- `GET /api/cart` - Get user's cart (Auth required)
- `POST /api/cart/items` - Add item to cart (Auth required)
- `PUT /api/cart/items/{itemId}` - Update cart item quantity (Auth required)
- `DELETE /api/cart/items/{itemId}` - Remove item from cart (Auth required)
- `DELETE /api/cart` - Clear cart (Auth required)

### Orders
- `POST /api/orders` - Create order (Auth required)
- `GET /api/orders` - Get user's orders (Auth required)
- `GET /api/orders/{id}` - Get order details (Auth required)
- `PUT /api/orders/{id}/status` - Update order status (Admin only)
- `GET /api/orders/admin/all` - Get all orders (Admin only)

## 🗂️ Project Structure

```
ShopingCart/
├── src/
│   ├── main/
│   │   ├── java/com/shopcart/
│   │   │   ├── config/              # Configuration classes
│   │   │   ├── controller/          # REST Controllers
│   │   │   ├── dto/                 # Data Transfer Objects
│   │   │   ├── entity/              # JPA Entities
│   │   │   │   ├── User.java
│   │   │   │   ├── Product.java
│   │   │   │   ├── Cart.java
│   │   │   │   ├── Order.java
│   │   │   │   └── Category.java
│   │   │   ├── exception/           # Custom Exceptions
│   │   │   ├── repository/          # Data Access Layer
│   │   │   ├── security/            # Security & JWT
│   │   │   ├── service/             # Business Logic
│   │   │   │   ├── ProductService.java
│   │   │   │   ├── CartService.java
│   │   │   │   ├── OrderService.java
│   │   │   │   └── PaymentService.java
│   │   │   └── ShoppingCartApplication.java
│   │   └── resources/
│   │       ├── application.properties
│   │       ├── static/              # Static resources
│   │       └── templates/           # HTML templates
│   └── test/                        # Unit & Integration Tests
├── frontend/                        # Frontend application (if separate)
│   ├── src/
│   │   ├── components/
│   │   ├── pages/
│   │   ├── services/
│   │   └── App.js
│   └── package.json
├── pom.xml / package.json
└── README.md
```



**Happy Shopping! 🛒**
