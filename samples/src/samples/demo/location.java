package samples.demo;

public class location {
	 private int postcode;
	 private String address;
	 private String state;

	 public int getPost() {
		 return this.postcode;
	 }

	 public void setPost(int post) {
		 this.postcode = post;
	 }
	 
	 public String getAdd() {
		 return this.address;
	 }

	 public void setAdd(String add) {
		 this.address = add;
	 }
	 
	 public String getState() {
		 return this.state;
	 }

	 public void setState(String state) {
		 this.state = state;
	 }
}