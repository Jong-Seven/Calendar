package calendar.login;

import javafx.scene.Parent;

public interface ILoginService {
	

	boolean loginCheck(Parent root);
	void setLogin(Parent root);
	void setStyle(Parent root, LoginController lc);

}
