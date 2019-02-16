
import org.apache.spark.mllib.evaluation.BinaryClassificationMetrics
import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}
import org.apache.spark.sql.hive.HiveContext
import spire.math.UInt

/**
  * Author: guoxinpeng
  * Date: 2019/02/14
  */
object EvalMetrics {

  def auc(pctrLabel: RDD[(Double, Double)]): Double = {
    val auc = new BinaryClassificationMetrics(pctrLabel).areaUnderROC
    auc
  }

  def gauc(userPctrLabel: RDD[(String, Double, Double)]): Double = {
    val gauc = 0.0
    gauc
  }

  def pcopc(pctrLabel: RDD[(Double, Double)]): Double = {
    val pcopc = 0.0
    pcopc
  }

  def logloss(pctrLabel: RDD[(Double, Double)]): Double = {
    val logloss = 0.0
    logloss
  }

  def qdistr(pctrLabel: RDD[(Double, Double)]): String = {
    val qDistrHDFS: String = "test"
    qDistrHDFS
  }

  def consistency(pctrLabel: RDD[(Double, Double)]): String = {
    val consisHDFS: String = "test2"
    consisHDFS
  }

  def diversityGiniCoefficient(itemPctrLabel: RDD[(String, Double, Double)]): String = {
    val diversityGiniCoefficientHDFS: String = "test3"
    diversityGiniCoefficientHDFS
  }

  def diversityGiniSimpson(itemPctrLabel: RDD[(String, Double, Double)]): String = {
    val diversityGiniSimpsonHDFS: String = "test4"
    diversityGiniSimpsonHDFS
  }

  def diversityExpoNumGreaterThanX(itemPctrLabel: RDD[(String, Double, Double)]): String = {
    val diversityExpoNumGreaterThanXHDFS: String = "test5"
    diversityExpoNumGreaterThanXHDFS
  }

  def ecpm(): Double = {
    val ecpm = 0.0
    ecpm
  }

  def arpu(): Double = {
    val arpu = 0.0
    arpu
  }


  def runEval(in: String, out: String): Unit = {

  }

  def main(args: Array[String]): Unit = {
    println("Hello World!")

    val pctrHdfs = args(0) // UserId, ItemId, pctr, label
    val evalFolder = args(1)

    runEval(pctrHdfs, evalFolder)

    return 0
  }

}

