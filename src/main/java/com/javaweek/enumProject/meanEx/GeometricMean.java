package com.javaweek.enumProject.meanEx;

public enum GeometricMean implements MathematicalMean{
    GEOMETRIC_AVERAGE {
        @Override
        public double calculate(double[] values) {
            double product = 1.0;
            for(double d : values) {
                product = product * d;
            }
            return Math.pow(product, 1.0 / values.length);
        }
    }
}
