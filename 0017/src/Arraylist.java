import java.util.Date;

public class Arraylist {
public int age;
public String title;
public Date date;
public int getId() {
	return age;
}
public void setId(int age) {
	this.age = age;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
public Arraylist(int age,String title,Date date) {
	this.age=age;
   this. title=title;
	this. date=date;
}
@Override
public String toString() {
	return "Arraylist [age=" + age + ", title=" + title + ", date=" + date + "]";
}
}
