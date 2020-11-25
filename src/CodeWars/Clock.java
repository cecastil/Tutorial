package CodeWars;

//Clock shows 'h' hours, 'm' minutes and 's' seconds after midnight.
//Your task is to make 'Past' function which returns time converted to milliseconds

//Example: Past (0, 1, 1) == 61000
//input constrains 0<=h<=23, 0<=m<=59, 0<=s<=59

import java.time.Duration;

public class Clock {

     static int Past (int h, int m, int s){

         //int convert= (h*3_600_000) + (m*60_000) + (s*1_000);
         //return convert;
         return (int) Duration.ofHours(h).plusMinutes(m).plusSeconds(s).toMillis();
    }
    public static void main(String[] args) {
        Watch clock = new Watch();
        clock.setH(0);
        clock.setM(1);
        clock.setS(1);

        System.out.println("The time is: ");
        System.out.println( clock.getH()+":"+ clock.getM()+":"+clock.getS());
        int con = Past(clock.getH(), clock.getM(), clock.getS());
        System.out.println("The time on milliseconds: "+con);

    }

    public static class Watch{
        private int h;
        private int m;
        private int s;

        public void setH(int h){
            this.h= h;
        }
        public void setM (int m){
            this.m= m;
        }
        public void setS(int s){
            this.s= s;
        }
        public int getH(){
            return h;
        }
        public int getM(){
            return m;
        }
        public int getS(){
            return s;
        }


    }

}
