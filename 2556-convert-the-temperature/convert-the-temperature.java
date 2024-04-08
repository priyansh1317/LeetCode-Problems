class Solution {
    public double[] convertTemperature(double celsius) {
        return new double[]{celsius + 273.15, celsius * 1.80 + 32 };
        // arr[0] = celsius + 273.15;
        // arr[1] = celsius * 1.80 + 32;
        // return arr;
    }
}