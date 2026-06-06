# SistemaLlanquihueTour

## Descripción

Sistema orientado a objetos desarrollado en Java para representar y gestionar información básica relacionada con la agencia de turismo Llanquihue Tour.

El proyecto aplica conceptos fundamentales de Programación Orientada a Objetos (POO), incluyendo encapsulamiento, herencia, composición, constructores, sobrescritura de métodos y organización modular mediante paquetes.

---

## Objetivo

Modelar las personas vinculadas a la agencia de turismo mediante clases reutilizables y estructuradas, permitiendo representar sus datos de forma organizada y escalable.


## Estructura del Proyecto
```text
SistemaLlanquihueTour
│
├── src
│   ├── App
│   │   └── Main.java
│   │
│   └── Modelo
│       ├── Persona.java
│       ├── Direccion.java
│       └── GuiaTuristico.java
│
├── nbproject
├── build.xml
└── manifest.mf

---

## Clases Implementadas

### Persona

Clase base que representa una persona vinculada a la agencia.

*Atributos:*

- nombre
- rut
- direccion

*Características:*

- Encapsulamiento mediante atributos privados.
- Métodos getters y setters.
- Método toString() para mostrar información.

---

### Direccion

Clase utilizada mediante composición para almacenar la dirección de una persona.

*Atributos:*

- calle
- numero
- ciudad

---

### GuiaTuristico

Clase que hereda de Persona.

*Atributos adicionales:*

- especialidad

Representa a un guía turístico perteneciente a la agencia.

---

### Main

Clase principal encargada de crear objetos y demostrar el funcionamiento del sistema.

---

## Conceptos de POO Aplicados

- Encapsulamiento.
- Herencia.
- Composición.
- Constructores.
- Getters y Setters.
- Sobrescritura de toString().
- Organización en paquetes.

---

## Ejecución

1. Abrir el proyecto en Apache NetBeans.
2. Compilar el proyecto.
3. Ejecutar la clase principal:

java
App.Main


4. Observar la salida por consola con la información de los objetos creados.

---

## Autor

*Sebastián Estrada*

Proyecto académico desarrollado para la asignatura de Programación Orientada a Objetos
