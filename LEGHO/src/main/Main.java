package main;


import java.io.File;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.PopupWindow;
import javafx.stage.Stage;

public class Main extends Application{
	
	ArrayList<user> userList = new ArrayList<>();
	// login page
	Label title,mail,password;
	TextField email;
	PasswordField pass; 
	Button register,login;
	HBox lgnBtn;
	Scene loginPage;
	BorderPane bp;
	VBox vb;
	GridPane gp;
	Alert error;
	
	// admin page
	ArrayList<Item> itemData = new ArrayList<>();
	Scene adminPage;
	GridPane item1,item2,item3,item4;
	HBox menu1,menu2,menu3,menu4,menuSb;
	VBox vbAdmin,itemList,pageAdmin;
	Menu adminMenu;
	MenuBar adminMenuBar;
	MenuItem adminLogout;
	Label itemName1,price1,stock1,description1;
	Label itemName2,price2,stock2,description2;
	Label itemName3,price3,stock3,description3;
	Label itemName4,price4,stock4,description4;
	TextField itemNameField1,priceField1,stockField1,descriptionField1;
	TextField itemNameField2,priceField2,stockField2,descriptionField2;
	TextField itemNameField3,priceField3,stockField3,descriptionField3;
	TextField itemNameField4,priceField4,stockField4,descriptionField4;
	Button updateBtn1,updateBtn2,updateBtn3,updateBtn4;
	File legho1,legho2,legho3,legho4;
	Image lego1,lego2,lego3,lego4;
	ImageView iv1,iv2,iv3,iv4;
	Alert success;
	
	
	public void init() {
		// login Page
		title = new Label("Legho");
		mail = new Label("Email");
		password = new Label("Password");
		email = new TextField();
		pass = new PasswordField();
		vb = new VBox();
		register = new Button("Register");
		login = new Button("Login");
		bp = new BorderPane();
		gp = new GridPane();
		lgnBtn = new HBox();
		
		
		
		// Admin Page
		item1 = new GridPane();
		item2 = new GridPane();
		item3 = new GridPane();
		item4 = new GridPane();
		menu1 = new HBox();
		menu2 = new HBox();
		menu3 = new HBox();
		menu4 = new HBox();
		menuSb = new HBox();

		
		itemName1 = new Label("Name:");
		price1 = new Label("Price:");
		stock1 = new Label("Stock:");
		description1 = new Label("Description:");
		
		itemName2 = new Label("Name:");
		price2 = new Label("Price:");
		stock2 = new Label("Stock:");
		description2 = new Label("Description:");
		
		itemName3 = new Label("Name:");
		price3 = new Label("Price:");
		stock3 = new Label("Stock:");
		description3 = new Label("Description:");
		
		itemName4 = new Label("Name:");
		price4 = new Label("Price:");
		stock4 = new Label("Stock:");
		description4 = new Label("Description:");
		
		itemNameField1 = new TextField();
		priceField1 = new TextField();
		stockField1 = new TextField();
		descriptionField1 = new TextField();
		
		itemNameField2 = new TextField();
		priceField2 = new TextField();
		stockField2 = new TextField();
		descriptionField2 = new TextField();
		
		itemNameField3 = new TextField();
		priceField3 = new TextField();
		stockField3 = new TextField();
		descriptionField3 = new TextField();
		
		itemNameField4 = new TextField();
		priceField4 = new TextField();
		stockField4 = new TextField();
		descriptionField4 = new TextField();
		
		updateBtn1 = new Button("Update");
		updateBtn2 = new Button("Update");
		updateBtn3 = new Button("Update");
		updateBtn4 = new Button("Update");
		itemList = new VBox();
		pageAdmin = new VBox();
		adminMenu = new Menu("Menu");
		adminMenuBar = new MenuBar();
		adminLogout = new MenuItem("Logout");
		vbAdmin = new VBox();
		adminMenu.getItems().addAll(adminLogout);
		adminMenuBar.getMenus().add(adminMenu);
		vbAdmin.getChildren().add(adminMenuBar);
		legho1 = new File("assets/lego5.png");
		legho2 = new File("assets/lego2.png");
		legho3 = new File("assets/lego3.png");
		legho4 = new File("assets/lego4.png");
		lego1 = new Image(legho1.toURI().toString());
		lego2 = new Image(legho2.toURI().toString());
		lego3 = new Image(legho3.toURI().toString());
		lego4 = new Image(legho4.toURI().toString());
		iv1 = new ImageView(lego1);
		iv2 = new ImageView(lego2);
		iv3 = new ImageView(lego3);
		iv4 = new ImageView(lego4);
		iv1.setFitHeight(150);
		iv1.setFitWidth(150);
		iv2.setFitHeight(150);
		iv2.setFitWidth(150);
		iv3.setFitHeight(150);
		iv3.setFitWidth(150);
		iv4.setFitHeight(150);
		iv4.setFitWidth(150);
		itemData.add(new Item("Ironman Hulkbuster",2330000,100,"Capture the scale and power of the Hulkbuster MK44 with this 4,049-piece, authentically detailed movable model, standing over 52 cm (20.5 in.) tall"));
		itemData.add(new Item("Hogwarts Icons - Collectors' Edition",4550000,80,"Bring the magical personality and elegant movement of Hedwig, the celebrated snowy owl from the Harry Potter™ movies, to life"));
		itemData.add(new Item("Mickey Mouse",1520000,500,"LEGHO feature the iconic Mickey Mouse"));
		itemData.add(new Item("Eiffel Tower",8200000,70,"Captivate fans of travel, history or architecture with the new LEGHO Eiffel tower"));
	}
	
	public void loginPage(Stage arg0) {
		lgnBtn.getChildren().addAll(register,login);
		gp.setAlignment(Pos.CENTER);
		bp.setCenter(vb);
		vb.getChildren().addAll(title,gp);
		gp.add(mail, 0, 1);
		gp.add(email, 1, 1);
		gp.add(password, 0, 2);
		gp.add(pass, 1, 2);
		gp.add(lgnBtn, 1, 3);
		vb.setAlignment(Pos.CENTER);
		BorderPane.setAlignment(gp, Pos.CENTER);
		gp.setHgap(10);
		gp.setVgap(10);
		lgnBtn.setSpacing(10);
		login.setMinWidth(70);
		register.setMinWidth(70);
		login.setStyle("-fx-background-color: grey;-fx-text-fill:white");
		register.setStyle("-fx-background-color: grey;-fx-text-fill:white");
		title.setStyle("-fx-font-weight:bold;-fx-font-size:20px");
		loginPage = new Scene(bp,300,200);
		arg0.setScene(loginPage);
		arg0.setTitle("Login");
		arg0.getIcons().add(new Image("file:assets/logo.png"));
		arg0.show();
	}
	
	
	public void adminPage(Stage arg0) {
		menu1.getChildren().add(item1);
		menu2.getChildren().add(item2);
		menu3.getChildren().add(item3);
		menu4.getChildren().add(item4);
		itemList.getChildren().addAll(menu1,menu2,menu3,menu4);
		pageAdmin.getChildren().addAll(vbAdmin,itemList);
		
		
		item1.add(iv1, 0, 0);
		item1.add(itemName1, 1, 0);
		item1.add(itemNameField1, 2, 0);
		item1.add(price1, 3, 0);
		item1.add(priceField1, 4, 0);
		item1.add(stock1, 5, 0);
		item1.add(stockField1, 6, 0);
		item1.add(description1, 1, 1);
		item1.add(descriptionField1, 2, 1);
		item1.add(updateBtn1, 2, 2);
		
		
		item2.add(iv2, 0, 0);
		item2.add(itemName2, 1, 0);
		item2.add(itemNameField2, 2, 0);
		item2.add(price2, 3, 0);
		item2.add(priceField2, 4, 0);
		item2.add(stock2, 5, 0);
		item2.add(stockField2, 6, 0);
		item2.add(description2, 1, 1);
		item2.add(descriptionField2, 2, 1);
		item2.add(updateBtn2, 2, 2);
		
		item3.add(iv3, 0, 0);
		item3.add(itemName3, 1, 0);
		item3.add(itemNameField3, 2, 0);
		item3.add(price3, 3, 0);
		item3.add(priceField3, 4, 0);
		item3.add(stock3, 5, 0);
		item3.add(stockField3, 6, 0);
		item3.add(description3, 1, 1);
		item3.add(descriptionField3, 2, 1);
		item3.add(updateBtn3, 2, 2);
		
		item4.add(iv4, 0, 0);
		item4.add(itemName4, 1, 0);
		item4.add(itemNameField4, 2, 0);
		item4.add(price4, 3, 0);
		item4.add(priceField4, 4, 0);
		item4.add(stock4, 5, 0);
		item4.add(stockField4, 6, 0);
		item4.add(description4, 1, 1);
		item4.add(descriptionField4, 2, 1);
		item4.add(updateBtn4, 2, 2);
		
		
		menu1.setAlignment(Pos.CENTER);
		menu2.setAlignment(Pos.CENTER);
		menu3.setAlignment(Pos.CENTER);
		menu4.setAlignment(Pos.CENTER);
		VBox.setMargin(menu1, new Insets(30,10,30,10));
		VBox.setMargin(menu2, new Insets(30,10,30,10));
		VBox.setMargin(menu3, new Insets(30,10,30,10));
		VBox.setMargin(menu4, new Insets(30,10,30,10));
		
		itemNameField1.setText(itemData.get(0).getNameItem());
		priceField1.setText(String.valueOf(itemData.get(0).getPrice()));
		stockField1.setText(String.valueOf(itemData.get(0).getStock()));
		descriptionField1.setText(itemData.get(0).getDescription());
		
		itemNameField2.setText(itemData.get(1).getNameItem());
		priceField2.setText(String.valueOf(itemData.get(1).getPrice()));
		stockField2.setText(String.valueOf(itemData.get(1).getStock()));
		descriptionField2.setText(itemData.get(1).getDescription());
		
		itemNameField3.setText(itemData.get(2).getNameItem());
		priceField3.setText(String.valueOf(itemData.get(2).getPrice()));
		stockField3.setText(String.valueOf(itemData.get(2).getStock()));
		descriptionField3.setText(itemData.get(2).getDescription());
		
		itemNameField4.setText(itemData.get(3).getNameItem());
		priceField4.setText(String.valueOf(itemData.get(3).getPrice()));
		stockField4.setText(String.valueOf(itemData.get(3).getStock()));
		descriptionField4.setText(itemData.get(3).getDescription());
		
		itemNameField1.setDisable(true);
		itemNameField2.setDisable(true);
		itemNameField3.setDisable(true);
		itemNameField4.setDisable(true);
		
		
		adminPage = new Scene(pageAdmin,900,900);
		arg0.setScene(adminPage);
		arg0.setTitle("ADMIN");
		arg0.getIcons().add(new Image("file:assets/logo.png"));
		arg0.show();
		
	}
	
	public void eventLogin(Stage arg0) {
		login.setOnMouseClicked(e->{
			if(email.getText().isEmpty()) {
				error = new Alert(AlertType.ERROR);
				error.setContentText("Email must be filled!");
				error.setTitle("Login Failed");
				error.showAndWait();
			}
			if(pass.getText().isEmpty()) {
				error = new Alert(AlertType.ERROR);
				error.setContentText("Password must be filled!");
				error.setTitle("Login Failed");
				error.showAndWait();
			}
			for (user user : userList) {
				if(user.getEmail().equals(email.getText())  && user.getPassword().equals(pass.getText())) {
					error = new Alert(AlertType.ERROR);
					error.setContentText("Email and Password must be correct!!");
					error.setTitle("Login Failed");
					error.showAndWait();
				}
			}
			if(email.getText().equals("admin") && pass.getText().equals("admin")) {
				adminPage(arg0);
			}
		});
		
	}
	
	public void adminEvent(Stage arg0) {
		updateBtn1.setOnMouseClicked(e->{
			
			if(priceField1.getText().isEmpty()) {
				error = new Alert(AlertType.ERROR);
				error.setContentText("Price must be filled!");
				error.setTitle("Update Failed");
				error.showAndWait();
			}else if(!priceField1.getText().matches("[0-9]*")) {
				error = new Alert(AlertType.ERROR);
				error.setContentText("Price must be numeric!");
				error.setTitle("Update Failed");
				error.showAndWait();
			}else if(Integer.parseInt(priceField1.getText()) <= 0) {
				error = new Alert(AlertType.ERROR);
				error.setContentText("Price must be more than 0!");
				error.setTitle("Update Failed");
				error.showAndWait();
			}else if(stockField1.getText().isEmpty()) {
				error = new Alert(AlertType.ERROR);
				error.setContentText("Stock must be filled!");
				error.setTitle("Update Failed");
				error.showAndWait();
			}else if(!stockField1.getText().matches("[0-9]*")) {
				error = new Alert(AlertType.ERROR);
				error.setContentText("Stock must be numeric!");
				error.setTitle("Update Failed");
				error.showAndWait();
			}else if(Integer.parseInt(stockField1.getText()) < 0) {
				error = new Alert(AlertType.ERROR);
				error.setContentText("Stock must be more than or equal 0!");
				error.setTitle("Update Failed");
				error.showAndWait();
			}else if(descriptionField1.getText().isEmpty()) {
				error = new Alert(AlertType.ERROR);
				error.setContentText("Description must be filled!");
				error.setTitle("Update Failed");
				error.showAndWait();
			}else {
				int index = 0;
				itemData.set(index, new Item("Ironman Hulkbuster",Integer.parseInt(priceField1.getText()),Integer.parseInt(stockField1.getText()),descriptionField1.getText()));
				success = new Alert(AlertType.INFORMATION);
				success.setContentText("Update Success");
				success.setTitle("Update Success");
				success.showAndWait();
			}
			
		});
		
		updateBtn2.setOnMouseClicked(e->{
			
			if(priceField2.getText().isEmpty()) {
				error = new Alert(AlertType.ERROR);
				error.setContentText("Price must be filled!");
				error.setTitle("Update Failed");
				error.showAndWait();
			}else if(!priceField2.getText().matches("[0-9]*")) {
				error = new Alert(AlertType.ERROR);
				error.setContentText("Price must be numeric!");
				error.setTitle("Update Failed");
				error.showAndWait();
			}else if(Integer.parseInt(priceField2.getText()) <= 0) {
				error = new Alert(AlertType.ERROR);
				error.setContentText("Price must be more than 0!");
				error.setTitle("Update Failed");
				error.showAndWait();
			}else if(stockField2.getText().isEmpty()) {
				error = new Alert(AlertType.ERROR);
				error.setContentText("Stock must be filled!");
				error.setTitle("Update Failed");
				error.showAndWait();
			}else if(!stockField2.getText().matches("[0-9]*")) {
				error = new Alert(AlertType.ERROR);
				error.setContentText("Stock must be numeric!");
				error.setTitle("Update Failed");
				error.showAndWait();
			}else if(Integer.parseInt(stockField2.getText()) < 0) {
				error = new Alert(AlertType.ERROR);
				error.setContentText("Stock must be more than or equal 0!");
				error.setTitle("Update Failed");
				error.showAndWait();
			}else if(descriptionField2.getText().isEmpty()) {
				error = new Alert(AlertType.ERROR);
				error.setContentText("Description must be filled!");
				error.setTitle("Update Failed");
				error.showAndWait();
			}else {
				int index = 1;
				itemData.set(index, new Item(itemData.get(index).getNameItem(),Integer.parseInt(priceField2.getText()),Integer.parseInt(stockField2.getText()),descriptionField2.getText()));
				success = new Alert(AlertType.INFORMATION);
				success.setContentText("Update Success");
				success.setTitle("Update Success");
				success.showAndWait();
			}
			
		});
		
		updateBtn3.setOnMouseClicked(e->{
			
			if(priceField3.getText().isEmpty()) {
				error = new Alert(AlertType.ERROR);
				error.setContentText("Price must be filled!");
				error.setTitle("Update Failed");
				error.showAndWait();
			}else if(!priceField3.getText().matches("[0-9]*")) {
				error = new Alert(AlertType.ERROR);
				error.setContentText("Price must be numeric!");
				error.setTitle("Update Failed");
				error.showAndWait();
			}else if(Integer.parseInt(priceField3.getText()) <= 0) {
				error = new Alert(AlertType.ERROR);
				error.setContentText("Price must be more than 0!");
				error.setTitle("Update Failed");
				error.showAndWait();
			}else if(stockField3.getText().isEmpty()) {
				error = new Alert(AlertType.ERROR);
				error.setContentText("Stock must be filled!");
				error.setTitle("Update Failed");
				error.showAndWait();
			}else if(!stockField3.getText().matches("[0-9]*")) {
				error = new Alert(AlertType.ERROR);
				error.setContentText("Stock must be numeric!");
				error.setTitle("Update Failed");
				error.showAndWait();
			}else if(Integer.parseInt(stockField3.getText()) < 0) {
				error = new Alert(AlertType.ERROR);
				error.setContentText("Stock must be more than or equal 0!");
				error.setTitle("Update Failed");
				error.showAndWait();
			}else if(descriptionField3.getText().isEmpty()) {
				error = new Alert(AlertType.ERROR);
				error.setContentText("Description must be filled!");
				error.setTitle("Update Failed");
				error.showAndWait();
			}else {
				int index = 2;
				itemData.set(index, new Item(itemData.get(index).getNameItem(),Integer.parseInt(priceField3.getText()),Integer.parseInt(stockField3.getText()),descriptionField3.getText()));
				success = new Alert(AlertType.INFORMATION);
				success.setContentText("Update Success");
				success.setTitle("Update Success");
				success.showAndWait();
			}
			
		});
		
		updateBtn4.setOnMouseClicked(e->{
			
			if(priceField4.getText().isEmpty()) {
				error = new Alert(AlertType.ERROR);
				error.setContentText("Price must be filled!");
				error.setTitle("Update Failed");
				error.showAndWait();
			}else if(!priceField4.getText().matches("[0-9]*")) {
				error = new Alert(AlertType.ERROR);
				error.setContentText("Price must be numeric!");
				error.setTitle("Update Failed");
				error.showAndWait();
			}else if(Integer.parseInt(priceField4.getText()) <= 0) {
				error = new Alert(AlertType.ERROR);
				error.setContentText("Price must be more than 0!");
				error.setTitle("Update Failed");
				error.showAndWait();
			}else if(stockField4.getText().isEmpty()) {
				error = new Alert(AlertType.ERROR);
				error.setContentText("Stock must be filled!");
				error.setTitle("Update Failed");
				error.showAndWait();
			}else if(!stockField4.getText().matches("[0-9]*")) {
				error = new Alert(AlertType.ERROR);
				error.setContentText("Stock must be numeric!");
				error.setTitle("Update Failed");
				error.showAndWait();
			}else if(Integer.parseInt(stockField4.getText()) < 0) {
				error = new Alert(AlertType.ERROR);
				error.setContentText("Stock must be more than or equal 0!");
				error.setTitle("Update Failed");
				error.showAndWait();
			}else if(descriptionField4.getText().isEmpty()) {
				error = new Alert(AlertType.ERROR);
				error.setContentText("Description must be filled!");
				error.setTitle("Update Failed");
				error.showAndWait();
			}else {
				int index = 3;
				itemData.set(index, new Item(itemData.get(index).getNameItem(),Integer.parseInt(priceField4.getText()),Integer.parseInt(stockField4.getText()),descriptionField4.getText()));
				success = new Alert(AlertType.INFORMATION);
				success.setContentText("Update Success");
				success.setTitle("Update Success");
				success.showAndWait();
			}
			
		});
		
		
		adminLogout.setOnAction(e->{
			loginPage(arg0);
		});
	}
	

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		init();
		eventLogin(arg0);
		adminEvent(arg0);
		loginPage(arg0);
		
	}

}
