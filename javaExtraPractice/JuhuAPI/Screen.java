//package in.cdac;

public class Screen {
	public static void main(String[] args) {
		Button loginBtn = new Button("Login");
		Button registeBtn = new Button("Register");
		Button logoutBtn = new Button("Logout");
		
		LoginClickListener loginClickListener = new LoginClickListener();
		loginBtn.setOnClickListener(loginClickListener);
				
		ClickListener l = new ClickListener() {
			//implementation
			@Override
			public void onClick() {
				System.out.println("You successfully registered!");
			}
		};
		registeBtn.setOnClickListener(l);
		
		logoutBtn.setOnClickListener(new ClickListener() {
			@Override
			public void onClick() {
				System.out.println("You are successfully Logged out!");
			}
		});
		
		
		//user is performing the operations
		registeBtn.click();
		loginBtn.click();
		logoutBtn.click();
	}

}

class LoginClickListener implements ClickListener{
	@Override
	public void onClick() {
		System.out.println("You successfully logged in!");
	}
}
