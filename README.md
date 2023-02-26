# Poolobject Pattern
==========

[![Java CI](https://github.com/P0NLEE/poolobject/actions/workflows/ci.yml/badge.svg)](https://github.com/P0NLEE/poolobject/actions/workflows/ci.yml) [![Build Status](https://app.travis-ci.com/Kencho/poolobject.svg?branch=master)](https://app.travis-ci.com/Kencho/poolobject) [![codecov](https://codecov.io/gh/P0NLEE/poolobject/branch/master/graph/badge.svg?token=QMMGA0K564)](https://codecov.io/gh/P0NLEE/poolobject)

Authors:

- Bilal Azar El Mourabit.

### Objetivo de la practica
En la práctica se va simular un pequeño desarrollo de un producto software para realizar mediciones sobre él.El objetivo es establecer un caso de estudio que sirva para caracterizar y evaluar tanto el producto desarrollado como el proceso seguido.
### Proceso
Para la realización de esta practica se nos ha proporcionado un proyecto de Eclipse con el patrón PoolObject. Con esto se ha realizado en una clase java los test sobre las funciones de la clase ReusablePool. Se ha realizado test sobre tres funciones de la clase antes mencionada. El fin de los test es cubririr la mayor parte del código escrito y los distintos outcomes.

    - AcquireReusable : Este método devuelve un objeto Reusable en caso de que haya alguno disponible o excpeción en caso contrario. Por lo que se ha enfocado los test de modo que se obtengan los objetos si existen y que se capte una excepción cuando se ha sobrepasado el número de reusables.
    - GetInstance : Este método nos devuelve una instancia del Pool, por lo que se han hecho las pruebas, teniendo en cuenta que la instancia es nula y viceversa.
    - ReleaseReusable : Este método libera un reusable, por lo que se ha comprobado los casos en los que si que se puede liberar un obbjeto y los casos en los que no.

Para monitorizar el coverage del test se ha utilizado codecov que nos muestra el porcentaje de codigo cubierto.

Esta práctica la he realizado solo. El conjunto de pruebas realizado se ha realizado intenando situarnos en todas las salidas posibles con un planteamiento  de caja negra, por lo que la calidad es bastante alta. Para la realización de esta actividad he invertido un aproximado de 8-10 horas, la mayoría de estas horas montando y vinculando el repositorio.

### Conclusión

En esta práctica hemos podido aprender ciertos conceptos básicos de las pruebas de un patrón y como se puede hacer una monitorización adecuada de dichas pruebas con codecov. Estos conceptos resultan interesantes y bastante importante para el desarrollo de cualquier software.
