# **Crypto Info App**

This is a simple crypto app which you can use to see the information about various crypto currencies.

## **Features**

- Use to know the information about different crypto currencies like Bitcoin, Ethereum, XRP, Tether, Solana, etc.
- Information Displayed for Each Coin

     1. **Active Status**: Indicates whether the coin is currently active.
     2. **Market Rank**: The rank of the coin in the market based on its performance.
     3. **Description**: A brief overview of the coin, its purpose, and background.
     4. **Tags**: Relevant tags or categories associated with the coin.  
     5. **Team Members**: Information about the team members behind the cryptocurrency.

--- 

## **Demo**

<video src="https://github.com/user-attachments/assets/2ad62a01-ceb8-4e07-bbd0-11af7871c25e" controls="controls" style="max-width: 100%; height: auto;">
    Demo how the app works.
</video>

--- 
  
## **Libraries and Methods Used**
1. **Kotlin**: First-class and official programming language for Android development.
2. **Jetpack compose**: A toolkit for building Android apps that uses a declarative API to simplify and speed up UI development
3. **Retrofit**: It is a type-safe HTTP client for Android and Java that simplifies making network requests to RESTful APIs by converting API responses into Kotlin or Java objects.
4. **Material Components for Android**: For modular and customizable Material Design UI components.
5. **Dagger Hilt**: It is a dependency injection library for Android that simplifies providing and managing dependencies across the app's lifecycle.
6. **MVI**: It is an architectural pattern in Android development that ensures unidirectional data flow by processing user intents to produce a single state for the UI.
7. **Clean Architecture**: It is a design approach that separates an application into layers (e.g., presentation, domain, data) to ensure scalability, maintainability, and independence from frameworks or external libraries.
8. **Kotlin Coroutines**: They are a concurrency framework that simplifies asynchronous programming by allowing tasks to be written sequentially while managing threading and suspensions efficiently.
9. **API**: CoinPaprika

--- 

## Lessons Learned

While building this app, I learned about:

- **Implementation of Clean Architecture**: Implemented a clean architecture approach by dividing the project into 3 layers, Data layer, Domain layer, and Presentation layer
- **Mapping**: UI Optimization for Data and Process Automation. Developed Mappers to convert API DTOs to thin Domain models so that only required data is used in UI and No overhead.
- **State Management with Kotlin Flow**: Implemented Flow to manage and emit loading, success and error states in a dynamic way, improving the user experience with real-time adjustments.
- **Resuable Use Cases**: Use Case Layer to keep business logic in use case and can be reuseable across multiple ViewModels, even new features integration.
- **Jetpack Compose Navigation**: Integrated navigation with dynamic route parameters and used saveStateHandle to manage navigation arguments and restore app state seamlessly.
- **Results Handling with Resource wrapper**: Created a class Resource to handle success, error and loading state in a consistent manner injecting some sanity across app cutting down on air management.


--- 

## **Contact**
For any questions or feedback, feel free to contact me at sakhare2likhit@gmail.com and also connect with me on Twitter at https://x.com/likhit_sakhare
