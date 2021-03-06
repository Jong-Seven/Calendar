package calendar.main;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import calendar.calendar.CalendarMain;
import calendar.calendar.CService;
import calendar.calendar.CalendarController;
import calendar.graph.GraphMain;
import calendar.info.InfoMain;
import calendar.login.LoginController;
import calendar.login.LoginMain;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class MainFromController implements Initializable{
	Parent root;


	@FXML BorderPane borderPane;
	@FXML Button homeBtn01;
	@FXML Button homeBtn02;
	@FXML Button homeBtn03;
	@FXML Button logout;
	

	

	public void setRoot(Parent root) {
		this.root = root;
		btn01();
		
		
	}

	public void btn01() {
		borderPane.setCenter(new CalendarMain().getRoot());
		CalendarController.setdpNow();	
		btn1Click();
		System.out.println("캘린더 화면으로 이동");
		

	}

	public void btn02() {
		System.out.println("그래프로 화면 이동");
		try {
			borderPane.setCenter(new GraphMain().getGraphScene());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void btn03() {
		borderPane.setCenter((new InfoMain()).getRoot());
	
	}
	
	public void logout() {
		LoginController.user = null;
		((Stage)root.getScene().getWindow()).close();
		new LoginMain().start(new Stage());
		}
	
	public void btn1Click() {
		homeBtn01.setFont(new Font(18));
		homeBtn02.setFont(new Font(15));
		homeBtn03.setFont(new Font(15));
	}
	
	public void btn2Click() {
		homeBtn01.setFont(new Font(15));
		homeBtn02.setFont(new Font(18));
		homeBtn03.setFont(new Font(15));
	}
	
	public void btn3Click() {
		homeBtn01.setFont(new Font(15));
		homeBtn02.setFont(new Font(15));
		homeBtn03.setFont(new Font(18));
	}
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		CService.bp = borderPane;
	}
	
	
}
