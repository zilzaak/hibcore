package testh.testh;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Comment {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private int cid;
private String comment;

@OneToOne(mappedBy="comment")
private Post post;


public Post getPost() {
	return post;
}
public void setPost(Post post) {
	this.post = post;
}


public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getComment() {
	return comment;
}
public void setComment(String comment) {
	this.comment = comment;
}
public Comment(String comment) {
	super();
	this.comment = comment;
}
public Comment() {
	super();
	// TODO Auto-generated constructor stub
}

}
