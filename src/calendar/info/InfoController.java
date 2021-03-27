package calendar.info;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import calendar.common.CommonService;
import calendar.datadase.UserVO;
import calendar.login.LoginController;
import calendar.member.IMemberService;
import calendar.member.MemberService;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputDialog;

public class InfoController implements Initializable {
	
	Parent root = null;
	IMemberService ms;
	InfoService is;
	public void setRoot(Parent root) {
		this.root = root;
		is.setInfo(root);
	}
	

	
	public void confirm(){
		TextInputDialog dialog = new TextInputDialog("");
		dialog.show();
		CommonService.alert(AlertType.INFORMATION, "회원정보가 수정되었습니다.");
		is.disable();
	}
	public void modify() {
		is.enable();
	}
	
	public void cancel() {
		is.setInfo(root);
		is.disable();
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		ms = new MemberService();
		is = new InfoService();
		
	}
}
