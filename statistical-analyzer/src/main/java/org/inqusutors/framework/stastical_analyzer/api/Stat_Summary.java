package org.inqusutors.framework.stastical_analyzer.api;

import org.apache.spark.sql.DataFrame;
import scala.tools.nsc.matching.Matrix;

import java.util.Vector;

/**
 * Created by Thilina
 * Overall description about the dataset
 */
public interface Stat_Summary {

    /*
    * give overall results and summeries of given colomns
    */
    Vector getMean();

    Vector getVariance();

    /*
    * get count of non zero values of each coloumn
    * */
    Vector getNonZeroes();

    /*
    * get correlation of given data set
    *   "pearson" or "spearman"
    * */
    Matrix getCorrelation(CorrelationMethod method);

    /*
    * get Covariance of two colomns
    * */
    double getCovariance(String col1, String col2);
    /*
     * get correlation of two colomns
     * */
    double getCorrelation(String col1, String col2, CorrelationMethod method);

    /*
    * frequent item sets in given data set
    * select convenient return type instead of Data frame
    * */
    DataFrame getFrequentItems(String col[], double support);


}
