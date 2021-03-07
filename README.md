<p align="center">
  <img src="https://i.imgur.com/lbwNTNl.jpg" width="480" title="Hi I'm Pedro">
</p>

<h1 align="center">
  <a href="https://github.com/pedromaironi/appChat-AndroidN">
     Uber clone
  </a>
</h1>

<p align="center">
  <strong>Coding to Learn, learn to coding</strong><br>
</p>

<p align="center">
  <a href="https://github.com/pedromaironi/UberApp-AndroidN">
    <img src="https://img.shields.io/badge/license-MIT-blue.svg" alt="Uber clone is released under the MIT license." />
  </a>
  <a href="https://twitter.com/intent/follow?screen_name=pedromaironi">
    <img src="https://img.shields.io/twitter/follow/pedromaironi.svg?label=Follow%20@pedromaironi" alt="Follow @pedromaironi" />
  </a>
</p>

## Overview
Uber clone consists of what it is called, in uber. Therefore, this app will be oriented to everything that uber already has.

## Table of Contents

- [Getting Started](#getting-started)
  - [Add firebase to the project](#add-firebase-to-the-project)
  - [Create a similar UI to the login of the app](#create-a-similar-ui-to-the-login-of-the-app)
- [Best Practices](#best-practices)
- [Features at a Uber app](#features-at-a-uber-app)
  - [License](#license)
  - [Credits](#credits)
  - [Thanks](#thanks)

## Getting Started
If you want to start working to create a similar application or add functionalities similar to that of this app to your project, you must go to the docs folder, there will be the documentation to implement each component.

## Add Firebase to the project
- First step go to the console of firebase
<p align="left">
  <img src="https://i.pinimg.com/564x/5f/6d/94/5f6d945d9cc695faa1bb96a38fe39859.jpg" width="480" title="Firebase">
</p>

- Second step, You are going to click continue, this is just routine for firebase
<p align="left">
  <img src="https://i.pinimg.com/originals/94/3f/6e/943f6e3c076d1ac43f0a978c3d6120f2.png" width="480" title="Firebase">
</p>

- Thirth step
We are going tu desactivate Google Analytics, At least I won't use it. Before, click in add to firebase.

<p align="left">
  <img src="https://i.pinimg.com/originals/e4/94/3e/e4943e9b03ae987ea8c7ef3e15169f55.png" width="480" title="Firebase">
</p>

### Add Firebase in Android Studio

- You are going to write the name of the package of your project. To get it, you need to go to Android Studio and see your package name

[Get your SHA-01](https://stackoverflow.com/questions/36146794/i-cannot-get-my-sha1-fingerprint-in-android-studio-using-windows-10)

<p align="left">
  <img src="https://i.pinimg.com/originals/10/ac/97/10ac978184b46accf086eb9945d900b7.png" width="480" title="Firebase">
</p>

- Before, you are going to download the file google-service.json and you are going to put it here

<p align="left">
  <img src="https://i.pinimg.com/originals/a3/70/a5/a370a5ccc555d8929a2514ef0e4659e7.png" width="480" title="Firebase">
  <img src="https://i.pinimg.com/originals/6f/d5/74/6fd574b3f789a4c28a06754955315cd6.png" width="180" title="Firebase">
</p>

### Add dependencies to the project

- Go to the Gradle Scripts > buld.gradle(Module: package-name)

```
 buildscript {
  repositories {
    // Check that you have the following line (if not, add it):
    google()  // Google's Maven repository
  }
  dependencies {
    ...
    // Add this line
    classpath 'com.google.gms:google-services:4.3.5'
  }
}

allprojects {
  ...
  repositories {
    // Check that you have the following line (if not, add it):
    google()  // Google's Maven repository
    ...
  }
}
```

- Go to the Gradle Scripts > buld.gradle(Module: app)

```
apply plugin: 'com.android.application'
// Add this line
apply plugin: 'com.google.gms.google-services'

dependencies {
  // Import the Firebase BoM
  implementation platform('com.google.firebase:firebase-bom:26.6.0')

  // Add the dependencies for the desired Firebase products
  // https://firebase.google.com/docs/android/setup#available-libraries
}
```

- DONE

