class Solution {
    public double angleClock(int hour, int minutes) {
       double minAngle=minutes*6;
       double hourAngle=0.5*(60*hour+minutes);
       System.out.println(hourAngle);
       double ang1=Math.abs(hourAngle-minAngle);
        return Math.min(ang1,360-ang1);
    }
}