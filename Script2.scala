// Databricks notebook source
// OBS - > deve consultar a documentação para verificar a instalação do pacote John Snow
// Esse pacote deve ser instalado de maneiras diferentes, a depender da onde vc decida executar o código

// Imports
import com.johnsnowlabs.nlp.pretrained.PretrainedPipeline
import com.johnsnowlabs.nlp.SparkNLP
import org.apache.spark.sql.{Row, SparkSession}
import org.apache.spark.sql.types._

// Carrega o pipeline de extração de entidades pré-treinado fornecido pelo johnsnowlabs
val pipeline = PretrainedPipeline("recognize_entities_dl", labg="en")

// Carrega os dados
val input = sc.textFile("dbfs:/FileStore/shared_uploads/eric.passos@dataside.com.br/allforlove.txt")

// Separa as palavras por pontuação
val words = input.flatMap(line => line.split("""\W+"""))

// Cria um dataframe de arrays de palavras chamado workable
val workable = words.toDF("text")

// Aplica o pipeline de extração de entidades nomeadas
val results = pipeline.transform(workable)

// Extrai somente o nome das entidades (consultar a documentação do John Snow)
val interest = results.select("entities.result")

// Transforma o dataframe de arrays em um dataframe de strings e filtra valores vazios
val df = interest.map(f => {
  val result = f.getList(0).toArray.mkString(",")
  (result)
}).filter("value != ''")

// Contagem das entidades e ordenação através do MapReduce
val result = df

  // Transforma cada linha em uma chave
  .rdd.map(x => (x,1))

  // Faz a agregação de contagem por chave (reduceBykey)
  .reduceByKey((count1, count2) => (count1+count2))

  // Ordena por ordem decrescente de contagem
  .sortBy(-_._2)

  // Converte em um dataframe de 2 colunas
  .toDF("Entidade", "Contagem")

// Filtragem para remover valores nulos que ainda restarem
val df = interest.map(f => {
  val result = f.getList(0).toArray.mkString(",")
  (result)
}).filter("value != ''")

// Novo mapeamento e redução para o resultado final
val result = df.rdd.map(x => (x,1)).reduceByKey((count1, count2) => (count1+count2)).sortBy(-_._2).toDF("Entidade", "Contagem")

// Converte para dataframe
val df = result.toDF()
df.printSchema()
df.show(10)

// Salva o resultado em disco no formato csv
df.write.format("csv").save("resultado")
