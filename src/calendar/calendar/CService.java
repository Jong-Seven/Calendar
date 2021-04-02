package calendar.calendar;

import java.time.LocalDate;

import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.stage.Stage;


public class CService {


	public void setCalendar(LocalDate date, Label[] labelList) {

		// 라벨을 리스트로 만들어 날자를 표시할때 사용합니다.
		int datenum =  (LocalDate.of(date.getYear(), date.getMonthValue(), 1).getDayOfWeek().getValue())%7;

		for (int j = 0; j < labelList.length; j++){ // 캘린더 모든칸을 빈칸으로
			labelList[j].setText(" ");
		}

		for (int i = datenum; i < date.lengthOfMonth() + datenum; i++) {
			labelList[i].setText("" + (i - (datenum - 1))); // 요일변수에서 이걸 빼서 날짜를 계산
		}
	}

	// 선택 날짜 가져오기
	public void mouseOnClicked(Label label, DatePicker dp) {
		LocalDate date = dp.getValue();

		int selectYear = date.getYear();
		int selectMonth = date.getMonthValue();
		int selectDate = Integer.parseInt(label.getText());

		date = dp.getValue();
		selectYear = date.getYear();
		selectMonth = date.getMonthValue(); 
		new Stage().show();

		System.out.println("라벨 클릭 : " + selectYear + selectMonth + selectDate );




	}


}




