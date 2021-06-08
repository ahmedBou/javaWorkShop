package com.company.interview;

public class Meeting {
    private int startTime;
    private int endTime;

    public Meeting(int startTime, int endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public Meeting() {
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    public void mergeRanges(Meeting[] multipleMeeting){
    int[] res = new int[multipleMeeting.length];
   for(int i = 0; i < multipleMeeting.length; i++){
       //System.out.println(multipleMeeting[i].startTime);
       //System.out.println(multipleMeeting[i].endTime);

       if(multipleMeeting[i].endTime == multipleMeeting[i].startTime){
           res[i] = multipleMeeting[i].endTime;
           res[i] = multipleMeeting[i].startTime;
           System.out.println(res);
       }

   }


    }


    public static void main(String[] args) {


        Meeting[] meet = {
                new Meeting(0,1), new Meeting(3, 5),
                new Meeting(4, 8), new Meeting(10, 12),
                new Meeting(9, 10)
        };

        Meeting multipleMeet = new Meeting();
        multipleMeet.mergeRanges(meet);

    }
}
