 Life Hack or Urban Myth App

 Overview

The Life Hack or Urban Myth app is a native Android application developed using Kotlin in Android Studio.
It is designed to help users distinguish between real-life productivity hacks and common internet myths through an interactive flashcard quiz.

---

Objective

The purpose of this app is to:

- Educate users on safe and useful life hacks
- Debunk common urban myths
- Provide an engaging quiz-based learning experience

---

Features

1. Welcome Screen

- Displays a welcome message and app description
- Includes a Start button to begin the quiz

2. Flashcard Quiz Screen

- Presents life hack statements
- Users choose between:
  - Hack (True)
  - Myth (False)
- Displays feedback after each answer
- Tracks user score
- Allows navigation using a Next button

3. Score Screen

- Shows total correct answers
- Provides personalised feedback:
  -  Master Hacker! (high score)
  -  Great job! (average score)
  -  Stay Safe Online! (low score)

4. Review Screen

- Displays all questions
- Shows correct answers and explanations

---

Technologies Used

- Kotlin – Programming language
- Android Studio – Development environment
- XML – UI design
- GitHub – Version control
- GitHub Actions – Automated build system

---

Project Structure

app/
 └── java/com/example/lifehackapp/
     ├── MainActivity.kt
     ├── QuizActivity.kt
     ├── ScoreActivity.kt
     ├── ReviewActivity.kt
     └── Flashcard.kt

res/layout/
 ├── activity_main.xml
 ├── activity_quiz.xml
 ├── activity_score.xml
 └── activity_review.xml

---
How to Run the App

1. Open the project in Android Studio
2. Allow Gradle to sync
3. Connect an emulator or Android device
4. Click Run
5. Interact with the app

---

 GitHub & CI/CD

Version Control

- Project is managed using GitHub

GitHub Actions

- Automated build process runs on push to main branch

---

 Screenshots (Optional)

(Add screenshots of your app here if required)

---

 Future Improvements

- Add animations for smoother transitions
- Include sound effects
- Add timer for each question
- Randomize questions
- Improve UI styling

---

 Author

Your Name Here

---

 License

This project is for educational purposes.
