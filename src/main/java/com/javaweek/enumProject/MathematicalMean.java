package com.javaweek.enumProject;
public enum MathematicalMean {

    SIMPLE_MEAN {
        @Override
        public double calculate(double[] values) {
            double mean = 1.0;
            for(double d : values) {
                mean += d;
            }
            return mean / values.length;
        }
    }, GEOMETRIC_AVERAGE {
        @Override
        public double calculate(double[] values) {
            double product = 1.0;
            for(double d : values) {
                product = product * d;
            }
            return Math.pow(product, 1.0 / values.length);
        }
    };

    public abstract double calculate(double[] values);

}