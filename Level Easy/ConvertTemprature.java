//https://leetcode.com/problems/convert-the-temperature

class Solution {
    public double[] convertTemperature(double celsius) {
        double[] output = new double[2];
        output[0] = celsius + 273.15;
        output[1] = celsius * 1.80 + 32.00;
        return output;
    }
}
