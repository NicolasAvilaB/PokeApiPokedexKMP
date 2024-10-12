This is a Kotlin Multiplatform project targeting Android, iOS.

* `/composeApp` is for code that will be shared across your Compose Multiplatform applications.
  It contains several subfolders:
  - `commonMain` is for code that’s common for all targets.
  - Other folders are for Kotlin code that will be compiled for only the platform indicated in the folder name.
    For example, if you want to use Apple’s CoreCrypto for the iOS part of your Kotlin app,
    `iosMain` would be the right folder for such calls.

* `/iosApp` contains iOS applications. Even if you’re sharing your UI with Compose Multiplatform, 
  you need this entry point for your iOS app. This is also where you should add SwiftUI code for your project.


Learn more about [Kotlin Multiplatform](https://www.jetbrains.com/help/kotlin-multiplatform-dev/get-started.html)…

# Kotlin MultiPlatform

Proyecto desarrollado en Koltin multiplatform con target Android e iOS.

Project developed at Kotlin Multiplatform with targeting Android and iOS.

# PokeApi Pokédex (Español)

Atrapalos a todos, pokedex desarrollada usando como base los endpoints Api del sitio https://pokeapi.co/, carga una lista de Pokemons de un total de 1302 (incluye megaevoluciones, gigamax etc), si pinchas cada pokémon podrás ver el detalle de cada uno, ofreciendo descripción de habilidades, tipos, stats, sprites, grito del mismo, etc.

El resultado se ve reflejado en un LazyColumn con 20 primeros Pokémons, incluye paginación (usando key offert ofrecida por el sitio) con 2 botones de navegación "Atras" y "Siguiente" con carga de lista de 20 Pokémons.

## Para construir este proyecto se basaron en arquitectura y patrones:

- MVI.
- @Serialization
- Módulos Shared (Multiplatform)
- Patrón Singleton
- SOLID
- Kotlin.
- Jetpack Compose.
- Corrutinas o flows.
- Inyección de dependencias con Koin (Automáticas).
- Ktor.
- KMP (Kotlin MultiPlatform)
- Clean Architecture.

# PokeApi Pokédex (English)

Catch 'm all, Pokédex developed using as base the Api endpoints of the site https://pokeapi.co/, loads a list of Pokemons of a total of 1302 (includes megaevolutions, gigamax etc), if you click on each pokémon you can see the detail of each one, offering description of abilities, types, stats, sprites, cry of the same one, etc.

The result is reflected in a LazyColumn with 20 first Pokémons, includes pagination (using key offert offered by the site) with 2 navigation buttons "Back" and "Next" with loading list of 20 Pokémons.

## To build this project were based on architecture and patterns:

- MVI.
- @Serialization
- Módulos Shared (Multiplatform)
- Singleton Pattern
- SOLID
- Kotlin.
- Jetpack Compose.
- Corrutines or flows.
- Dependencies Inyection with Koin (Auto).
- Ktor.
- KMP (Kotlin MultiPlatform)
- Clean Architecture.
