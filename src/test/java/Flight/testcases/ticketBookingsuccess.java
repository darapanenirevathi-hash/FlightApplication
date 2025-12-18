package Flight.testcases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Flight.library.BookingTicket;
import utils.AppUtils;



public class ticketBookingsuccess  extends BookingTicket

{
	@Parameters({"flydate","text","text1"})
	@Test
 public void ticketBooking(String flydate,String text,String text1) throws Exception
 {
	 Flight.library.BookingTicket bt = new Flight.library.BookingTicket();
	 bt.bookTicket(flydate);
     bt.flyFrom(text);
	 bt.flyTo(text1);
	 bt.click();
	 bt.reservationFlightPage();
	 AppUtils.takeScreenShot("img1.png");
	 
	 
	 
 }
	
	
	
}
