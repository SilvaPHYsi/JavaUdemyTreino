package RedeSocial;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;

public class Post {
	private LocalDateTime moment;
	private String title;
	private String content;
	private Integer likes;
	ArrayList<Comments> comments = new ArrayList<>();
	
	DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
	
	
	public LocalDateTime getMoment() {
		return moment;
	}
	public void setMoment(LocalDateTime moment) {
		this.moment = moment;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Integer getLikes() {
		return likes;
	}
	public void setLikes(Integer likes) {
		this.likes = likes;
	}
	
	
	public ArrayList<Comments> getComments() {
		return comments;
	}
	
	private LocalDateTime parseTime(String timeStr) {
        try {
            return LocalDateTime.parse(timeStr, fmt);
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Hora inválida: " + timeStr);
        }
    }
	
	public Post(String  momentStr, String title, String content, Integer likes ) {
		this.content = content;
		this.moment = parseTime(momentStr);
		this.title = title;
		this.likes = likes;
		
	}
	
	public void addComments(Comments comment) {
		comments.add(comment);
	}
	
	public void removeComments(Comments comment) {
		comments.remove(comment);
	}
	
	public String toString() {
		StringBuilder strB = new StringBuilder();
		strB.append(moment.format(fmt) + "\n");
		strB.append(title + "\n");
		strB.append(content + "\n");
		strB.append(likes + " likes" + "\n");
		for(Comments i : comments) {
			strB.append(i.getText() + "\n");
		}
		return strB.toString();
		
		
	}
	

}
