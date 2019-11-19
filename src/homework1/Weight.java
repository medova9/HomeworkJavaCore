package homework1;

class Weight {
    private static final int DEFAULT_GRAVITY_ON_MOON_VALUE = 16;
    private double weightOnMoon;
    private int myWeight;


    int getMyWeight() {
        return myWeight;
    }

    double getWeightOnMoon() {
        return weightOnMoon;
    }

    Weight(int weight) {
        this.myWeight = weight;
        weightOnMoon();
    }

    private void weightOnMoon() {
        this.weightOnMoon = myWeight * (1 - (double) DEFAULT_GRAVITY_ON_MOON_VALUE / 100);
    }
}