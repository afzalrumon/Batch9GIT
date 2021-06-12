package com;
class Main {
    public static void main(String[] args) {
        int[] a = {2,7,3,8,4};
        System.out.println(avgElements(a)); //should print 4.8
    }
    public static final double avgElements(int[] a){
        int sum=0;
        for(int b:a){
            sum+=b;

        }
        double avr=sum/a.length;

        return avr;
    }
}