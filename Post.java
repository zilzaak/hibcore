package testh.testh;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Post {
	
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int pid;
private String poster;


@OneToOne
@JoinColumn
private Comment comment;
public Post(String poster) {
	super();
	this.poster = poster;
	
}


public Post() {
	super();
	// TODO Auto-generated constructor stub
}


public int getPid() {
	return pid;
}


public void setPid(int pid) {
	this.pid = pid;
}


public String getPoster() {
	return poster;
}


public void setPoster(String poster) {
	this.poster = poster;
}


public Comment getComment() {
	return comment;
}


public void setComment(Comment comment) {
	this.comment = comment;
}





}
