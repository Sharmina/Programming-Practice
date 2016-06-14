import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
 * Write a function condenseMeetingTimes() that takes a list of meeting time ranges and returns a list of condensed ranges.

For example, given:

  [(0, 1), (3, 5), (4, 8), (10, 12), (9, 10)]

your function would return:

  [(0, 1), (3, 8), (9, 12)]

Do not assume the meetings are in order. The meeting times are coming from multiple teams.

In this case the possibilities for startTime and endTime are bounded by the number of 30-minute slots in a day. But soon you plan to refactor HiCal to store times as Unix timestamps (which are big numbers). Write something that's efficient even when we can't put a nice upper bound on the numbers representing our time ranges.
 */
class Meeting {

    int startTime;
    int endTime;

    public Meeting(int startTime, int endTime) {
        // number of 30 min blocks past 9:00 am
        this.startTime = startTime;
        this.endTime   = endTime;
    }

    public String toString() {
        return String.format("(%d, %d)", startTime, endTime);
    }
}
public class Problem4 {

	static ArrayList<Meeting> condenseMeetingTimes(ArrayList<Meeting> meetings)
	{
		ArrayList<Meeting> sortedList=new ArrayList<Meeting>(meetings);
		
		Collections.sort(sortedList,new Comparator<Meeting>()
				{

					@Override
					public int compare(Meeting arg0, Meeting arg1) {
						// TODO Auto-generated method stub
						return arg0.startTime-arg1.startTime;
					}
					
				});
		
		int passOn=0;
		int startTime=0,endTime;
		ArrayList<Meeting> mergedList=new ArrayList<Meeting>();
		for(int i=0;i<sortedList.size();i++)
		{
			if(passOn==0)
				startTime=sortedList.get(i).startTime;			
			if(i==sortedList.size()-1 ||sortedList.get(i+1).startTime >sortedList.get(i).endTime)
			{
				endTime=sortedList.get(i).endTime;
				mergedList.add(new Meeting(startTime,endTime));
				passOn=0;
			}
			else
			{
				passOn=1;
			}
			
		}
		return mergedList;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Meeting> meetings=new ArrayList<Meeting>();
		
		meetings.add(new Meeting(0,1));
		meetings.add(new Meeting(3,5));
		meetings.add(new Meeting(4,8));
		meetings.add(new Meeting(10,12));
		meetings.add(new Meeting(9,10));
		
		ArrayList<Meeting> condensedMeeting=condenseMeetingTimes(meetings);
		
		for(Meeting meeting:condensedMeeting)
		{
			System.out.print(meeting.toString());
		}
		
	}

}
