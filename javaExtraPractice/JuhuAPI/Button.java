//package in.cdac;


public class Button {
	ClickListener listener;
	String name;
	public Button(String name){
		this.name = name;
	}
	
	public void setOnClickListener(ClickListener l){
		listener = l;
	}
	
	public void click(){
		listener.onClick();
	}
}
