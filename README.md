# Taller 1 – Lenguajes y Gramáticas

## Guía rápida (cómo correr)

### Requisitos
- Java 17+ instalado.
- (Opcional) ANTLR4 en la terminal (`antlr4`). Solo necesario si modifican `MiLenguaje.g4`.

### 1) Regenerar (solo si cambiaste el `.g4`)
```bash
antlr4 -no-listener -visitor MiLenguaje.g4
```

### 2) Compilar
En este repo basta con:
```bash
javac *.java
```

> Si alguien ve errores de `org.antlr.v4.runtime`:
> ```bash
> JAR="$(brew --prefix antlr)/libexec/antlr-4.13.1-complete.jar"
> javac -cp "$JAR" *.java
> ```

### 3) Ejecutar
```bash
java Main
```

---

## Documentación corta del lenguaje

### Filosofía
Lenguaje imperativo, sintaxis en español, sentencias terminan con `;`.

### Lo que **ya funciona** en el intérprete (Visitor actual)
- **Variables** y **asignación**: 
  ``` 
  x = 5;
  ```
- **Literales**: enteros (`5`), decimales (`3.14`), cadenas (`"hola"`), booleanos (`verdadero`, `falso`).
- **Uso de variables en expresiones simples**.
- **Impresión en consola**:
  ```
  imprimir(x);
  ```

> Nota: La gramática ya define operadores aritméticos, lógicos y estructuras de control (`si`, `sino`, `mientras`, `para`, `funcion`), pero el Visitor actual solo implementa lo básico (asignación, literales, imprimir). Los demás se deben completar.

### Sintaxis soportada (base)
- **Asignación**: `variable = expresion;`
- **Imprimir**: `imprimir(expresion);`
- **Bloques**: `{ ... }`
- **Condicional**: 
  ```
  si (condicion) { ... } 
  sino { ... }
  ```
- **Bucle mientras**: 
  ```
  mientras (condicion) { ... }
  ```
- **Bucle para (estilo C)**:
  ```
  para (i = 0; i < 10; i = i + 1) { ... }
  ```
- **Funciones**:
  ```
  funcion sumar(a, b) {
    retornar a + b;
  }
  ```

---

## Programas de prueba requeridos
1. **Área de un círculo**  
   ``` 
   radio = 10;
   area = 3 * radio * radio;
   imprimir(area);
   ```

2. **Sucesión de Fibonacci (50 primeros números)**  
   ```
   n = 50;
   imprimir("Fibonacci hasta 50 (pendiente)");
   ```
