# Cuestionario sobre Git

## 1. ¿Qué diferencia existe entre git add y git commit?

`git add` prepara los cambios seleccionados para el próximo commit. `git commit` registra esos cambios preparados en el historial local del repositorio.

## 2. ¿Qué hace git push? ¿Por qué puede ser rechazado?

`git push` publica en el repositorio remoto los commits que existen localmente. Puede ser rechazado si el repositorio remoto contiene commits que la copia local todavía no ha integrado, o si el usuario no tiene permisos.

## 3. ¿En qué se diferencian git fetch y git pull?

`git fetch` descarga la información y los commits remotos, pero no modifica la rama local. `git pull` descarga esos cambios y además los integra en la rama actual.

## 4. ¿Qué significa origin/main?

`origin/main` es la referencia local que representa el estado conocido de la rama `main` del repositorio remoto llamado `origin`.

## 5. ¿Qué muestra git status antes y después de git add?

Antes de `git add`, muestra los archivos modificados o no rastreados como cambios no preparados. Después de `git add`, los muestra dentro de los cambios preparados para el próximo commit.

## 6. ¿Qué información muestra git diff --cached?

Muestra las diferencias entre el último commit y los cambios que han sido preparados mediante `git add`.

## 7. ¿Para qué sirve git log --oneline HEAD..origin/main?

Sirve para mostrar los commits que existen en `origin/main` pero que todavía no están integrados en la rama local actual.

## 8. ¿Por qué conviene usar commits pequeños y descriptivos?

Porque facilitan comprender el historial, localizar errores, revisar los cambios y deshacer únicamente una modificación concreta.

## 9. ¿Cómo has resuelto el push rechazado?

Primero ejecuté `git fetch origin` para descargar la información remota. Después inspeccioné las diferencias y utilicé `git pull --no-rebase origin main` para integrar los cambios mediante un merge. Finalmente repetí `git push origin main` sin utilizar `--force`.

## 10. ¿En qué carpeta y ventana de IntelliJ estabas cuando ocurrió el rechazo?

El rechazo ocurrió en la segunda ventana de IntelliJ, dentro de la carpeta `C:/Users/Adrián/git/dam-pro-equipo2`, que representaba el equipo 2.