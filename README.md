# Kata 1
__Autora__: Elena Díaz Batista  
__Enlace a video explicativo__: https://drive.google.com/file/d/1VUVmoqX7pgJ36wbrHZZQhZOLrB8leI6G/view?usp=sharing 

---

## 1. Objetivo de la entrega
El objetivo principal de esta kata es automatizar el uso de IntelliJ IDEA y Git/GitHub. A través de la implementación repetida de un microproyecto en Java practicando:
- La creación y configuración de proyectos desde cero.
- Uso de shortcuts de teclado para navegación, ejecución y refactorización.
- Depuración con breakpoints.
- Gestión de ramas Git (main/develop).

---

## 2. Requisitos y configuración
### Dependencias y entorno de desarrollo
__JDK__: Oracle OpenJDK 25.0.1  
__IDE Recomendado__: IntelliJ IDEA  
__Sistema de Construcción__: Maven  
__Sistema de Control de Versiones__: Git  

### Paquete base
El código fuente se encuentra en el paquete:   
software.ulpgc.katas

---

## 3. Estructura del proyecto y clases principales
El proyecto implementa una clase sencilla Person para calcular un valor derivado age a partir de la fecha de nacimiento.  
La clase Main se usa como entrada.

---

## 4. Compilación y ejecución
Desde IntelliJ IDEA:
1. Abrir la carpeta raíz kata1 en IntelliJ IDEA.
2. Navegar a src/main/java/software/ulpgc/katas/Main.java.
3. Ejecutar la clase utilizando el shortcut Shift + F10.

---

## 5. Clonar
1. Abrir IntelliJ IDEA
2. Si tienes un proyecto abierto haz: File > Close Project
3. En la pantalla principal ve a: Clone Repository
4. En el campo URL introduce la dirección del repositorio
5. Haz clic en clone
6. Si es necesario verifica la configuración del JDK

---

## 6. Flujo Git y repetición
La kata se ha repetido 6 veces, visibles en las distintas ramas develop_numeroDeRepeticion

### Variaciones entre ramas: 
- __clase Person__: en algunas ramas el atributo que representa a la fecha de nacimiento se llama birthdate y en otras birthday
- __clase Main__: en algunas ramas cambia la fecha de nacimiento con la que se prueba el funcionamiento de la clase Person

---

## 7. Verificación de funcionamiento
Se adjuntan dos imágenes, en la primera se muestra la clase Main y en la segunda la salida por pantalla al ejecutar, como podemos ver el resultado es el esperado (una persona nacida en abril del 2001 tiene actualmente 25 años (a 30 de septiembre de 2026)).
<img width="1072" height="312" alt="image" src="https://github.com/user-attachments/assets/19d6e61a-1b83-4e78-a65a-c89c7d40efee" />
<img width="260" height="53" alt="image" src="https://github.com/user-attachments/assets/c18ecc2e-e325-4f93-a104-7aeda4f1c0a6" />

---

## 8. Shortcut empleados:
__CTRL__ + __K__ para seleccionar los archivos de un commit y escribir el mensaje  
__CTRL__ + __ENTER__ para finalizar el commit o el push  
__SHIFT__ + __CTRL__ + __K__ para realizar un push  
__ALT__ + __ENTER__ para convertir una clase a record y otras utilidades como añadir métodos  
__SHIFT__ + __ALT__ + __FLECHAS__ para mover una línea arriba o abajo  
__ALT__ + __1__ abrir y cerrar la barra lateral del proyecto  
__ALT__ + __9__ abrir y cerrar la barra inferior Git  
__SHIFT__ + __F6__ refractor rename  
