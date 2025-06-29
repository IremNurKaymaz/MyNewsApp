## 📱 MyNewsApp

**MyNewsApp** is a modern Android news application that allows users to browse and read the latest news from various categories. It provides a clean user interface, real-time updates via a news API, and the ability to save favorite articles.

---

### 📰 Features

* 🔍 Browse news by category (e.g. Sports, Technology, Business)
* 🗞️ View article details with full content and images
* ⭐ Add and manage favorite articles
* 🌐 Real-time updates via News API
* 📱 Modern UI optimized for Android devices

---

### 📸 Screenshots

| Home                          | Article Details                     | Favorites                               |
| ----------------------------- | ----------------------------------- | --------------------------------------- |
| ![home](screenshots/home.png) | ![details](screenshots/details.png) | ![favorites](screenshots/favorites.png) |

> *(Add your own screenshots in the `/screenshots` directory)*

---

### ⚙️ Getting Started

#### Prerequisites

* Android Studio (latest version recommended)
* A valid [NewsAPI](https://newsapi.org/) API key

#### Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/your-username/MyNewsApp.git
   ```

2. Open the project in **Android Studio**.

3. Navigate to `Constants.java` (or wherever the API key is stored) and add your own News API key:

   ```java
   public static final String API_KEY = "YOUR_API_KEY_HERE";
   ```

4. Build and run the project on an emulator or Android device.

---

### 🔧 Built With

* **Java / Kotlin**
* **Android SDK**
* **Retrofit** – HTTP client for API calls
* **Glide** – Image loading library
* **Room** – Local database for storing favorites
* **ViewModel & LiveData** – MVVM architecture components

---

### 🔐 API Reference

This app uses the [NewsAPI](https://newsapi.org/) to fetch news content.

> You must register and use your own API key to avoid request limitations.

---

### 🤝 Contributing

Contributions are welcome! If you'd like to improve this project:

1. Fork the repository
2. Create a new branch (`git checkout -b feature-name`)
3. Make your changes
4. Push the branch (`git push origin feature-name`)
5. Create a Pull Request

---

### 📄 License

This project is licensed under the [MIT License](LICENSE).

---
