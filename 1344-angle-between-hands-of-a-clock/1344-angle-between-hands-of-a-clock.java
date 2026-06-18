class Solution {
    public double angleClock(int hour, int minutes) {
        double ang1=Math.abs(30*hour- 5.5 *minutes);
        return Math.min(ang1,360-ang1);
    }
}