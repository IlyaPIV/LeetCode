package problems.easy.p1603;


/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */
public class JavaParkingSystem {
    private int[] parking = new int[3];

    public JavaParkingSystem(int big, int medium, int small) {
        this.parking[0] = big;
        this.parking[1] = medium;
        this.parking[2] = small;
    }

    public boolean addCar(int carType) {
        if (this.parking[carType - 1] == 0) return false;

        this.parking[carType - 1] -= 1;
        return true;
    }
}
