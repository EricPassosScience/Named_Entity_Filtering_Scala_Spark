# Exercício de Filtragem de Entidadedes Nomeadas com Linguagem Scala e Apache Spark
## Objetivo
O objetivo é extrair de um texto (livro) as principais entidades nomeadas (nomes próprios) e contar a ocorrência de cada entidade. Quais nomes aparecem com mais frequência no texto? Essa é normalmente uma das primeiras perguntas feitas em Processamento de Linguagem Natural (NLP) de grandes conjuntos de texto e o resultado é usado para diversas tarefas em NLP.

A filtragem de entidades nomeadas em textos é útil para determinar a similaridade de documentos com palavras de alto valor. Portanto, esse processo de filtragem de entidade nomeada será a base para muitos algoritmos de relacionamento de documentos, por exemplo.

## Fonte de dados
Usaremos como fonte o livro "All for Love" extraído gratuitamente do Projeto Gutenberg. O arquivo pode ser encontrado no link a seguir -> https://www.gutenberg.org/ebooks/67646

## Algoritmo de Machine Learning
O nosso trabalho aqui será filtrar os nomes e fazer a contagem, mas a extração de entidades normalmente requer um modelo de Machine Learning para realizar essa tarefa. Usaremos um modelo pré-treinado disponível com o pacote John Snow Labs, pacote para Processamento de Linguagem Natural com o Apache Spark.

Documentação do John Snow Labs -> https://nlp.johnsnowlabs.com/docs/en/quickstart

Documentação do John Snow Labs -> https://www.johnsnowlabs.com

Obs. Verificar a documentação para descobrir como instalar o pacote John Snow

Exemplo de saída esperada:

![Print 21](https://user-images.githubusercontent.com/97414922/220506548-6516f994-999f-429d-b229-03f345bb6196.png)

## Español: 
# Ejercicio de filtrado de entidades nombradas con Scala Language y Apache Spark
## Meta
El objetivo es extraer de un texto (libro) las principales entidades nombradas (nombres propios) y contabilizar la ocurrencia de cada entidad. ¿Qué nombres aparecen con mayor frecuencia en el texto? Esta suele ser una de las primeras preguntas que se hacen en el procesamiento del lenguaje natural (NLP) de grandes conjuntos de texto, y el resultado se usa para varias tareas en NLP.

Filtrar entidades nombradas en textos es útil para determinar la similitud de documentos con palabras de alto valor. Por lo tanto, este proceso de filtrado de entidades nombradas será la base para muchos algoritmos de relación de documentos, por ejemplo.

## Fuente de datos
Usaremos como fuente el libro "All for Love" extraído gratuitamente del Proyecto Gutenberg. El archivo se puede encontrar en el siguiente enlace -> https://www.gutenberg.org/ebooks/67646

## Algoritmo de aprendizaje automático
Nuestro trabajo aquí será filtrar los nombres y hacer el conteo, pero la extracción de entidades generalmente requiere un modelo de aprendizaje automático para realizar esta tarea. Usaremos un modelo preentrenado disponible con el paquete John Snow Labs para procesamiento de lenguaje natural con Apache Spark.

Documentación de John Snow Labs -> https://nlp.johnsnowlabs.com/docs/en/quickstart

Documentación de John Snow Labs -> https://www.johnsnowlabs.com

Obs. Consulta la documentación para saber cómo instalar el paquete John Snow

Ejemplo de salida esperada:

![Print 21](https://user-images.githubusercontent.com/97414922/220506548-6516f994-999f-429d-b229-03f345bb6196.png)
