package ErrorTest;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
	private Integer roomNumber;
	private Date checkOut;
	private Date checkIn;
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public Reservation() {

	}

	public Reservation(Integer roomNumber, Date checkIn, Date checkOut) {
		validateDates(checkIn, checkOut);
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		this.roomNumber = roomNumber;
	}

	private void validateDates(Date checkIn, Date checkOut) {
		Date now = new Date();
		if (checkOut.before(checkIn)) {
			throw new DomainException("Check-out date must be after check-in date");
		}
		if (checkIn.before(now) || checkOut.before(now)) {
			throw new DomainException("Check-Out and Check-In need to be dates in the future");
		}
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Date getCheckOut() {
		return checkOut;
	}

	public void setCheckOut(Date checkOut) {
		this.checkOut = checkOut;
	}

	public Date getCheckIn() {
		return checkIn;
	}

	public void setCheckIn(Date checkIn) {
		this.checkIn = checkIn;
	}

	public long duration() {
		long difference = checkOut.getTime() - checkIn.getTime();
		return TimeUnit.DAYS.convert(difference, TimeUnit.MILLISECONDS);
	}

	public void updateDates(int roomNumber, Date checkIn, Date checkOut) {
		validateDates(checkIn, checkOut);
		setCheckIn(checkIn);
		setCheckOut(checkOut);
		setRoomNumber(roomNumber);

	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("The room number is: ").append(getRoomNumber()).append("\n");
		sb.append("The check-in Date is: ").append(sdf.format(getCheckIn())).append("\n");
		sb.append("The check-out Date is: ").append(sdf.format(getCheckOut())).append("\n");
		sb.append("The duration is: ").append(duration()).append(" days\n");
		sb.append("Thank you for choosing us. Have a great day");
		return sb.toString();
	}
}
