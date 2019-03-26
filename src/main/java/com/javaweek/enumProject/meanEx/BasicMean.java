package com.javaweek.enumProject.meanEx;
public enum BasicMean implements MathematicalMean {

    MEAN_AVERAGE {
        @Override
        public double calculate(double[] values) {
            double mean = 0.0;
            for(double d : values) {
                mean += d;
            }
            return mean / values.length;
        }
    }
}