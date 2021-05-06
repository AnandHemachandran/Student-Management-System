package application;
import javafx.fxml.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.effect.ColorInput;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.*;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.*;

public class Admin_MainController {
	
	@FXML
	private Label uid;
	
	
	@FXML
	private Button homeButton;
	
	@FXML
	private Button profileButton;

	@FXML
	private Button studentButton;
	
	@FXML
	private Button studentButton1;
	
	@FXML
	private Button attendanceButton;
	
	@FXML
	private Button attendanceButton1;
	
	@FXML
	private Button courseButton;
	
	@FXML
	private Button courseButton1;
	
	@FXML
	private Button marksButton;
	
	@FXML
	private Button marksButton1;
	
	@FXML
	private Button logoutButton;
	
	@FXML
	private AnchorPane tempPane;
	
	
	@FXML
	public void initialize(URL url, ResourceBundle rb)
	{
		
	}
	


	@FXML
	private void homeButtonOnAction(ActionEvent event) throws IOException
	{
		//AnchorPane homePane = FXMLLoader.load(getClass().getResource("Admin_Home.fxml"));
		//tempPane.getChildren().setAll(homePane);
		FXMLLoader loader =new FXMLLoader(getClass().getResource("Admin_Home.fxml"));
		AnchorPane homePane = loader.load();
		Admin_HomeController c = loader.getController();
		c.set(uid.getText());
		tempPane.getChildren().setAll(homePane);
	}
	
	@FXML
	private void profileButtonOnAction(ActionEvent event) throws IOException
	{
		FXMLLoader loader =new FXMLLoader(getClass().getResource("Admin_Profile.fxml"));
		AnchorPane profilePane = loader.load();
		Admin_ProfileController c = loader.getController();
		c.setProfile(uid.getText());
		tempPane.getChildren().setAll(profilePane);
	}
	
	@FXML
	private void studentButtonOnAction(ActionEvent event) throws IOException
	{
		//AnchorPane studentPane = FXMLLoader.load(getClass().getResource("Admin_Student.fxml"));
		//tempPane.getChildren().setAll(studentPane);
		FXMLLoader loader =new FXMLLoader(getClass().getResource("Admin_Student.fxml"));
		AnchorPane studentPane = loader.load();
		Admin_StudentController c = loader.getController();
		c.set(uid.getText());
		tempPane.getChildren().setAll(studentPane);
	}
	
	@FXML
	private void attendanceButtonOnAction(ActionEvent event) throws IOException
	{
		//AnchorPane attendancePane = FXMLLoader.load(getClass().getResource("Admin_Attendance.fxml"));
		//tempPane.getChildren().setAll(attendancePane);
		FXMLLoader loader =new FXMLLoader(getClass().getResource("Admin_Attendance.fxml"));
		AnchorPane attendancePane = loader.load();
		Admin_AttendanceController c = loader.getController();
		c.set(uid.getText());
		tempPane.getChildren().setAll(attendancePane);
	}
	
	@FXML
	private void courseButtonOnAction(ActionEvent event) throws IOException
	{
		//AnchorPane coursesPane = FXMLLoader.load(getClass().getResource("Admin_Courses.fxml"));
		//tempPane.getChildren().setAll(coursesPane);
		FXMLLoader loader =new FXMLLoader(getClass().getResource("Admin_Courses.fxml"));
		AnchorPane coursesPane = loader.load();
		Admin_CoursesController c = loader.getController();
		c.set(uid.getText());
		tempPane.getChildren().setAll(coursesPane);
	}
	
	
	@FXML
	private void marksButtonOnAction(ActionEvent event) throws IOException
	{
		//AnchorPane marksPane = FXMLLoader.load(getClass().getResource("Admin_Marks.fxml"));
		//tempPane.getChildren().setAll(marksPane);
		FXMLLoader loader =new FXMLLoader(getClass().getResource("Admin_Marks.fxml"));
		AnchorPane marksPane = loader.load();
		Admin_MarksController c = loader.getController();
		c.set(uid.getText());
		tempPane.getChildren().setAll(marksPane);
	}
	
	
	public void logoutButtonOnAction(ActionEvent event)
	{
		Stage stage = (Stage) logoutButton.getScene().getWindow();
		stage.close();
		try {
			Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
			Stage LoginStage = new Stage();
			Scene scene = new Scene(root,1048,897);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			LoginStage.setScene(scene);
			LoginStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void showInfo(String id)
	{
		uid.setText(id);
	}
	
}
