package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import application.Driver;

public class Main extends Application {
	static public LinkedList westS = new LinkedList();
	static public LinkedList westL = new LinkedList();
	static public LinkedList gazaS = new LinkedList();
	static public LinkedList gazaL = new LinkedList();

	@Override

	public void start(Stage primaryStage) {
		try {
			fileReadW("WestBank_2022 (1).csv");
			fileReadG("Gaza_2022 (2).csv");
			BorderPane root = new BorderPane();

			Label l1 = new Label("Tawjihi Records");
			l1.setFont(Font.font("Verdana", 20));
			l1.setAlignment(Pos.TOP_CENTER);
			HBox mHB = new HBox(40);
			VBox vb = new VBox(20);
			vb.getChildren().addAll(l1);

			Button wBTN = new Button("West Bank");
			wBTN.setPrefSize(300, 50);
			wBTN.setStyle("-fx-background-color:green;");
			wBTN.setFont(Font.font("Verdana", 20));
			wBTN.setTextFill(Color.WHITE);
			Button gBTN = new Button("Gaza");
			gBTN.setPrefSize(300, 50);
			gBTN.setStyle("-fx-background-color:green;");
			gBTN.setFont(Font.font("Verdana", 20));
			gBTN.setTextFill(Color.WHITE);
			mHB.getChildren().addAll(wBTN, gBTN);
			mHB.setAlignment(Pos.CENTER);
			root.setCenter(mHB);
			root.setTop(vb);

			Button goToL = new Button("Literary");
			Button ins = new Button("Insert");
			Button del = new Button("Delete");
			Button sea = new Button("Search");
			Button dis = new Button("Top Ten");
			Button mean = new Button("Average");
			Button mod = new Button("Mode");
			Button per = new Button("Percentage");
			Button back = new Button("Back");

			Button goToS = new Button("Scientific");
			Button ins1 = new Button("Insert");
			Button del1 = new Button("Delete");
			Button sea1 = new Button("Search");
			Button dis1 = new Button("Top Ten");
			Button mean1 = new Button("Average");
			Button mod1 = new Button("Mode");
			Button per1 = new Button("Percentage");
			Button back1 = new Button("Back");

			Button goToL1 = new Button("Literary");
			Button ins2 = new Button("Insert");
			Button del2 = new Button("Delete");
			Button sea2 = new Button("Search");
			Button dis2 = new Button("Top Ten");
			Button mean2 = new Button("Average");
			Button mod2 = new Button("Mode");
			Button per2 = new Button("Percentage");
			Button back2 = new Button("Back");

			Button goToS1 = new Button("Scientific");
			Button ins3 = new Button("Insert");
			Button del3 = new Button("Delete");
			Button sea3 = new Button("Search");
			Button dis3 = new Button("Top Ten");
			Button mean3 = new Button("Average");
			Button mod3 = new Button("Mode");
			Button per3 = new Button("Percentage");
			Button back3 = new Button("Back");

			goToL.setPrefSize(300, 50);
			goToL.setStyle("-fx-background-color:green;");
			goToL.setFont(Font.font("Verdana", 20));
			goToL.setTextFill(Color.WHITE);

			ins.setPrefSize(300, 50);
			ins.setStyle("-fx-background-color:green;");
			ins.setFont(Font.font("Verdana", 20));
			ins.setTextFill(Color.WHITE);

			del.setPrefSize(300, 50);
			del.setStyle("-fx-background-color:green;");
			del.setFont(Font.font("Verdana", 20));
			del.setTextFill(Color.WHITE);

			sea.setPrefSize(300, 50);
			sea.setStyle("-fx-background-color:green;");
			sea.setFont(Font.font("Verdana", 20));
			sea.setTextFill(Color.WHITE);

			dis.setPrefSize(300, 50);
			dis.setStyle("-fx-background-color:green;");
			dis.setFont(Font.font("Verdana", 20));
			dis.setTextFill(Color.WHITE);

			mean.setPrefSize(300, 50);
			mean.setStyle("-fx-background-color:green;");
			mean.setFont(Font.font("Verdana", 20));
			mean.setTextFill(Color.WHITE);

			mod.setPrefSize(300, 50);
			mod.setStyle("-fx-background-color:green;");
			mod.setFont(Font.font("Verdana", 20));
			mod.setTextFill(Color.WHITE);

			per.setPrefSize(300, 50);
			per.setStyle("-fx-background-color:green;");
			per.setFont(Font.font("Verdana", 20));
			per.setTextFill(Color.WHITE);

			back.setPrefSize(300, 50);
			back.setStyle("-fx-background-color:green;");
			back.setFont(Font.font("Verdana", 20));
			back.setTextFill(Color.WHITE);

			goToL1.setPrefSize(300, 50);
			goToL1.setStyle("-fx-background-color:green;");
			goToL1.setFont(Font.font("Verdana", 20));
			goToL1.setTextFill(Color.WHITE);

			ins1.setPrefSize(300, 50);
			ins1.setStyle("-fx-background-color:green;");
			ins1.setFont(Font.font("Verdana", 20));
			ins1.setTextFill(Color.WHITE);

			del1.setPrefSize(300, 50);
			del1.setStyle("-fx-background-color:green;");
			del1.setFont(Font.font("Verdana", 20));
			del1.setTextFill(Color.WHITE);

			sea1.setPrefSize(300, 50);
			sea1.setStyle("-fx-background-color:green;");
			sea1.setFont(Font.font("Verdana", 20));
			sea1.setTextFill(Color.WHITE);

			dis1.setPrefSize(300, 50);
			dis1.setStyle("-fx-background-color:green;");
			dis1.setFont(Font.font("Verdana", 20));
			dis1.setTextFill(Color.WHITE);

			mean1.setPrefSize(300, 50);
			mean1.setStyle("-fx-background-color:green;");
			mean1.setFont(Font.font("Verdana", 20));
			mean1.setTextFill(Color.WHITE);

			mod1.setPrefSize(300, 50);
			mod1.setStyle("-fx-background-color:green;");
			mod1.setFont(Font.font("Verdana", 20));
			mod1.setTextFill(Color.WHITE);

			per1.setPrefSize(300, 50);
			per1.setStyle("-fx-background-color:green;");
			per1.setFont(Font.font("Verdana", 20));
			per1.setTextFill(Color.WHITE);

			back1.setPrefSize(300, 50);
			back1.setStyle("-fx-background-color:green;");
			back1.setFont(Font.font("Verdana", 20));
			back1.setTextFill(Color.WHITE);

			goToS.setPrefSize(300, 50);
			goToS.setStyle("-fx-background-color:green;");
			goToS.setFont(Font.font("Verdana", 20));
			goToS.setTextFill(Color.WHITE);

			ins2.setPrefSize(300, 50);
			ins2.setStyle("-fx-background-color:green;");
			ins2.setFont(Font.font("Verdana", 20));
			ins2.setTextFill(Color.WHITE);

			del2.setPrefSize(300, 50);
			del2.setStyle("-fx-background-color:green;");
			del2.setFont(Font.font("Verdana", 20));
			del2.setTextFill(Color.WHITE);

			sea2.setPrefSize(300, 50);
			sea2.setStyle("-fx-background-color:green;");
			sea2.setFont(Font.font("Verdana", 20));
			sea2.setTextFill(Color.WHITE);

			dis2.setPrefSize(300, 50);
			dis2.setStyle("-fx-background-color:green;");
			dis2.setFont(Font.font("Verdana", 20));
			dis2.setTextFill(Color.WHITE);

			mean2.setPrefSize(300, 50);
			mean2.setStyle("-fx-background-color:green;");
			mean2.setFont(Font.font("Verdana", 20));
			mean2.setTextFill(Color.WHITE);

			mod2.setPrefSize(300, 50);
			mod2.setStyle("-fx-background-color:green;");
			mod2.setFont(Font.font("Verdana", 20));
			mod2.setTextFill(Color.WHITE);

			per2.setPrefSize(300, 50);
			per2.setStyle("-fx-background-color:green;");
			per2.setFont(Font.font("Verdana", 20));
			per2.setTextFill(Color.WHITE);

			back2.setPrefSize(300, 50);
			back2.setStyle("-fx-background-color:green;");
			back2.setFont(Font.font("Verdana", 20));
			back2.setTextFill(Color.WHITE);

			goToS1.setPrefSize(300, 50);
			goToS1.setStyle("-fx-background-color:green;");
			goToS1.setTextFill(Color.WHITE);
			goToS1.setFont(Font.font("Verdana", 20));

			ins3.setPrefSize(300, 50);
			ins3.setStyle("-fx-background-color:green;");
			ins3.setFont(Font.font("Verdana", 20));
			ins3.setTextFill(Color.WHITE);

			del3.setPrefSize(300, 50);
			del3.setStyle("-fx-background-color:green;");
			del3.setTextFill(Color.WHITE);
			del3.setFont(Font.font("Verdana", 20));

			sea3.setPrefSize(300, 50);
			sea3.setStyle("-fx-background-color:green;");
			sea3.setFont(Font.font("Verdana", 20));
			sea3.setTextFill(Color.WHITE);

			dis3.setPrefSize(300, 50);
			dis3.setStyle("-fx-background-color:green;");
			dis3.setTextFill(Color.WHITE);
			dis3.setFont(Font.font("Verdana", 20));

			mean3.setPrefSize(300, 50);
			mean3.setStyle("-fx-background-color:green;");
			mean3.setFont(Font.font("Verdana", 20));
			mean3.setTextFill(Color.WHITE);

			mod3.setPrefSize(300, 50);
			mod3.setStyle("-fx-background-color:green;");
			mod3.setTextFill(Color.WHITE);
			mod3.setFont(Font.font("Verdana", 20));

			per3.setPrefSize(300, 50);
			per3.setStyle("-fx-background-color:green;");
			per3.setTextFill(Color.WHITE);
			per3.setFont(Font.font("Verdana", 20));

			back3.setPrefSize(300, 50);
			back3.setStyle("-fx-background-color:green;");
			back3.setTextFill(Color.WHITE);
			back3.setFont(Font.font("Verdana", 20));

			// West Scientific
			GridPane west = new GridPane();
			west.addColumn(5, goToL);
			west.addColumn(0, ins);
			west.addColumn(0, del);
			west.addColumn(0, sea);
			west.addColumn(0, dis);
			west.addColumn(0, mean);
			west.addColumn(0, mod);
			west.addColumn(0, per);
			west.add(back, 5, 6);
			west.setHgap(20);
			west.setVgap(20);

			// West Literary
			GridPane west1 = new GridPane();
			west1.addColumn(5, goToS);
			west1.addColumn(0, ins1);
			west1.addColumn(0, del1);
			west1.addColumn(0, sea1);
			west1.addColumn(0, dis1);
			west1.addColumn(0, mean1);
			west1.addColumn(0, mod1);
			west1.addColumn(0, per1);
			west1.add(back1, 5, 6);
			west1.setHgap(20);
			west1.setVgap(20);

			// Gaza Scientific
			GridPane gaza = new GridPane();
			gaza.addColumn(5, goToL1);
			gaza.addColumn(0, ins2);
			gaza.addColumn(0, del2);
			gaza.addColumn(0, sea2);
			gaza.addColumn(0, dis2);
			gaza.addColumn(0, mean2);
			gaza.addColumn(0, mod2);
			gaza.addColumn(0, per2);
			gaza.add(back2, 5, 6);
			gaza.setHgap(20);
			gaza.setVgap(20);

			// Gaza Literary
			GridPane gaza1 = new GridPane();
			gaza1.addColumn(5, goToS1);
			gaza1.addColumn(0, ins3);
			gaza1.addColumn(0, del3);
			gaza1.addColumn(0, sea3);
			gaza1.addColumn(0, dis3);
			gaza1.addColumn(0, mean3);
			gaza1.addColumn(0, mod3);
			gaza1.addColumn(0, per3);
			gaza1.add(back3, 5, 6);
			gaza1.setHgap(20);
			gaza1.setVgap(20);

// West Bank Scientific Insert
			GridPane insert = new GridPane();
			TextField tf = new TextField();
			tf.setPrefSize(300, 50);
			Button ba = new Button("Back");
			Button inser = new Button("Insert");
			TextArea ta = new TextArea();
			ba.setPrefSize(300, 50);
			ba.setStyle("-fx-background-color:green;");
			ba.setTextFill(Color.WHITE);
			ba.setFont(Font.font("Verdana", 20));
			inser.setPrefSize(300, 50);
			inser.setStyle("-fx-background-color:green;");
			inser.setTextFill(Color.WHITE);
			inser.setFont(Font.font("Verdana", 20));

			insert.addColumn(5, ba);
			insert.addColumn(2, tf);
			insert.addColumn(2, inser);
			insert.addColumn(2, ta);

			insert.setHgap(20);
			insert.setVgap(20);

			inser.setOnAction(e -> {
				if (tf.getText().trim().isEmpty()) {
					ta.setText("Enter Something");
				} else {
					String[] tokens = tf.getText().split(",");
					westS.insert(new Tawjihi(Integer.parseInt(tokens[0]), tokens[1], Double.parseDouble(tokens[2])));
					ta.setText("Insertion Completed");

				}

			});

			// West bank Scientific delete
			GridPane delete = new GridPane();
			TextField tf1 = new TextField();
			tf1.setPrefSize(300, 50);
			Button ba1 = new Button("Back");
			Button delet = new Button("Delete");
			TextArea ta1 = new TextArea();
			ba1.setPrefSize(300, 50);
			ba1.setStyle("-fx-background-color:green;");
			ba1.setTextFill(Color.WHITE);
			ba1.setFont(Font.font("Verdana", 20));
			delet.setPrefSize(300, 50);
			delet.setStyle("-fx-background-color:green;");
			delet.setTextFill(Color.WHITE);
			delet.setFont(Font.font("Verdana", 20));

			delete.addColumn(5, ba1);
			delete.addColumn(2, tf1);
			delete.addColumn(2, delet);
			delete.addColumn(2, ta1);

			delete.setHgap(20);
			delete.setVgap(20);

			delet.setOnAction(e -> {
				if (tf1.getText().trim().isEmpty()) {
					ta1.setText("Enter Something");
				} else {

					if (westS.delte(Integer.parseInt(tf1.getText())) == true) {
						ta1.setText("Deleted ");
					} else {
						ta1.setText("Error");
					}
				}
			});

			// West Bank Search Scientific
			GridPane search = new GridPane();
			TextField tf2 = new TextField();
			tf2.setPrefSize(300, 50);
			Button ba2 = new Button("Back");
			Button searc = new Button("Search");
			TextArea ta2 = new TextArea();
			ba2.setPrefSize(300, 50);
			ba2.setStyle("-fx-background-color:green;");
			ba2.setTextFill(Color.WHITE);
			ba2.setFont(Font.font("Verdana", 20));
			searc.setPrefSize(300, 50);
			searc.setStyle("-fx-background-color:green;");
			searc.setTextFill(Color.WHITE);
			searc.setFont(Font.font("Verdana", 20));

			search.addColumn(5, ba2);
			search.addColumn(2, tf2);
			search.addColumn(2, searc);
			search.addColumn(2, ta2);

			search.setHgap(20);
			search.setVgap(20);

			searc.setOnAction(e -> {
				if (tf2.getText().trim().isEmpty()) {
					ta2.setText("Enter Something");
				} else {
					ta2.setText(westS.search(Integer.parseInt(tf2.getText())));
				}
			});

			GridPane display = new GridPane();
			Button ba3 = new Button("Back");
			Button disp = new Button("Display");
			TextArea ta3 = new TextArea();
			ba3.setPrefSize(300, 50);
			ba3.setStyle("-fx-background-color:green;");
			ba3.setTextFill(Color.WHITE);
			ba3.setFont(Font.font("Verdana", 20));
			disp.setPrefSize(300, 50);
			disp.setStyle("-fx-background-color:green;");
			disp.setTextFill(Color.WHITE);
			disp.setFont(Font.font("Verdana", 20));

			display.addColumn(5, ba3);
			display.addColumn(2, disp);
			display.addColumn(2, ta3);

			display.setHgap(20);
			display.setVgap(20);

			disp.setOnAction(e -> {
				ta3.setText(westS.TopTen());
			});

			GridPane average = new GridPane();
			Button ba4 = new Button("Back");
			Button avg = new Button("Calculate");
			TextArea ta4 = new TextArea();
			ba4.setPrefSize(300, 50);
			ba4.setStyle("-fx-background-color:green;");
			ba4.setTextFill(Color.WHITE);
			ba4.setFont(Font.font("Verdana", 20));
			avg.setPrefSize(300, 50);
			avg.setStyle("-fx-background-color:green;");
			avg.setTextFill(Color.WHITE);
			avg.setFont(Font.font("Verdana", 20));

			average.addColumn(5, ba4);
			average.addColumn(2, avg);
			average.addColumn(2, ta4);

			average.setHgap(20);
			average.setVgap(20);

			avg.setOnAction(e -> {
				ta4.setText(String.valueOf(westS.avg()));
			});

			GridPane mode = new GridPane();
			Button ba5 = new Button("Back");
			Button moD = new Button("Calculate");
			TextArea ta5 = new TextArea();
			ba5.setPrefSize(300, 50);
			ba5.setStyle("-fx-background-color:green;");
			ba5.setTextFill(Color.WHITE);
			ba5.setFont(Font.font("Verdana", 20));
			moD.setPrefSize(300, 50);
			moD.setStyle("-fx-background-color:green;");
			moD.setTextFill(Color.WHITE);
			moD.setFont(Font.font("Verdana", 20));

			mode.addColumn(5, ba5);
			mode.addColumn(2, moD);
			mode.addColumn(2, ta5);

			mode.setHgap(20);
			mode.setVgap(20);

			moD.setOnAction(e -> {

			});

			GridPane percentage = new GridPane();
			TextField tf3 = new TextField();
			tf3.setPrefSize(300, 50);
			Button ba6 = new Button("Back");
			Button perc = new Button("Calculate");
			TextArea ta6 = new TextArea();
			ba6.setPrefSize(300, 50);
			ba6.setStyle("-fx-background-color:green;");
			ba6.setTextFill(Color.WHITE);
			ba6.setFont(Font.font("Verdana", 20));
			perc.setPrefSize(300, 50);
			perc.setStyle("-fx-background-color:green;");
			perc.setTextFill(Color.WHITE);
			perc.setFont(Font.font("Verdana", 20));

			percentage.addColumn(5, ba6);
			percentage.addColumn(2, tf3);
			percentage.addColumn(2, perc);
			percentage.addColumn(2, ta6);

			percentage.setHgap(20);
			percentage.setVgap(20);

			perc.setOnAction(e -> {
				if (tf3.getText().trim().isEmpty()) {
					ta6.setText("Enter a grade");
				} else {
					ta6.setText(westS.avgabovespec(Double.parseDouble(tf3.getText())));
				}
			});

			// West Bank Literary Insert
			GridPane insert1 = new GridPane();
			TextField tfl = new TextField();
			tfl.setPrefSize(300, 50);
			Button bal = new Button("Back");
			Button inserl = new Button("Insert");
			TextArea tal = new TextArea();
			bal.setPrefSize(300, 50);
			bal.setStyle("-fx-background-color:green;");
			bal.setTextFill(Color.WHITE);
			bal.setFont(Font.font("Verdana", 20));
			inserl.setPrefSize(300, 50);
			inserl.setStyle("-fx-background-color:green;");
			inserl.setTextFill(Color.WHITE);
			inserl.setFont(Font.font("Verdana", 20));

			insert1.addColumn(5, bal);
			insert1.addColumn(2, tfl);
			insert1.addColumn(2, inserl);
			insert1.addColumn(2, tal);

			insert1.setHgap(20);
			insert1.setVgap(20);

			inserl.setOnAction(e -> {
				if (tfl.getText().trim().isEmpty()) {
					tal.setText("Enter Something");
				} else {
					String[] tokens = tfl.getText().split(",");
					westL.insert(new Tawjihi(Integer.parseInt(tokens[0]), tokens[1], Double.parseDouble(tokens[2])));
					tal.setText("Insertion Completed");

				}

			});

			GridPane delete1 = new GridPane();
			TextField tfl1 = new TextField();
			tfl1.setPrefSize(300, 50);
			Button bal1 = new Button("Back");
			Button deletl = new Button("Delete");
			TextArea tal1 = new TextArea();
			bal1.setPrefSize(300, 50);
			bal1.setStyle("-fx-background-color:green;");
			bal1.setTextFill(Color.WHITE);
			bal1.setFont(Font.font("Verdana", 20));
			deletl.setPrefSize(300, 50);
			deletl.setStyle("-fx-background-color:green;");
			deletl.setTextFill(Color.WHITE);
			deletl.setFont(Font.font("Verdana", 20));

			delete1.addColumn(5, bal1);
			delete1.addColumn(2, tfl1);
			delete1.addColumn(2, deletl);
			delete1.addColumn(2, tal1);

			delete1.setHgap(20);
			delete1.setVgap(20);

			deletl.setOnAction(e -> {
				if (tfl1.getText().trim().isEmpty()) {
					tal1.setText("Enter Something");
				} else {

					if (westL.delte(Integer.parseInt(tfl1.getText())) == true) {
						tal1.setText("Deleted ");
					} else {
						tal1.setText("Error");
					}
				}
			});

			GridPane search1 = new GridPane();
			TextField tfl2 = new TextField();
			tfl2.setPrefSize(300, 50);
			Button bal2 = new Button("Back");
			Button searcl = new Button("Search");
			TextArea tal2 = new TextArea();
			bal2.setPrefSize(300, 50);
			bal2.setStyle("-fx-background-color:green;");
			bal2.setTextFill(Color.WHITE);
			bal2.setFont(Font.font("Verdana", 20));
			searcl.setPrefSize(300, 50);
			searcl.setStyle("-fx-background-color:green;");
			searcl.setTextFill(Color.WHITE);
			searcl.setFont(Font.font("Verdana", 20));

			search1.addColumn(5, bal2);
			search1.addColumn(2, tfl2);
			search1.addColumn(2, searcl);
			search1.addColumn(2, tal2);

			search1.setHgap(20);
			search1.setVgap(20);
			searcl.setOnAction(e -> {
				if (tfl2.getText().trim().isEmpty()) {
					tal2.setText("Enter Something");
				} else {
					tal2.setText(westL.search(Integer.parseInt(tfl2.getText())));
				}
			});

			GridPane display1 = new GridPane();
			Button bal3 = new Button("Back");
			Button displ = new Button("Display");
			TextArea tal3 = new TextArea();
			bal3.setPrefSize(300, 50);
			bal3.setStyle("-fx-background-color:green;");
			bal3.setTextFill(Color.WHITE);
			bal3.setFont(Font.font("Verdana", 20));
			displ.setPrefSize(300, 50);
			displ.setStyle("-fx-background-color:green;");
			displ.setTextFill(Color.WHITE);
			displ.setFont(Font.font("Verdana", 20));

			display1.addColumn(5, bal3);
			display1.addColumn(2, displ);
			display1.addColumn(2, tal3);

			display1.setHgap(20);
			display1.setVgap(20);
			displ.setOnAction(e -> {
				tal3.setText(westL.TopTen());
			});

			GridPane average1 = new GridPane();
			Button bal4 = new Button("Back");
			Button avgl = new Button("Calculate");
			TextArea tal4 = new TextArea();
			bal4.setPrefSize(300, 50);
			bal4.setStyle("-fx-background-color:green;");
			bal4.setTextFill(Color.WHITE);
			bal4.setFont(Font.font("Verdana", 20));
			avgl.setPrefSize(300, 50);
			avgl.setStyle("-fx-background-color:green;");
			avgl.setTextFill(Color.WHITE);
			avgl.setFont(Font.font("Verdana", 20));

			average1.addColumn(5, bal4);
			average1.addColumn(2, avgl);
			average1.addColumn(2, tal4);

			average1.setHgap(20);
			average1.setVgap(20);
			avgl.setOnAction(e -> {
				tal4.setText(String.valueOf(westL.avg()));
			});

			GridPane mode1 = new GridPane();
			Button bal5 = new Button("Back");
			Button moDl = new Button("Calculate");
			TextArea tal5 = new TextArea();
			bal5.setPrefSize(300, 50);
			bal5.setStyle("-fx-background-color:green;");
			bal5.setTextFill(Color.WHITE);
			bal5.setFont(Font.font("Verdana", 20));
			moDl.setPrefSize(300, 50);
			moDl.setStyle("-fx-background-color:green;");
			moDl.setTextFill(Color.WHITE);
			moDl.setFont(Font.font("Verdana", 20));

			mode1.addColumn(5, bal5);
			mode1.addColumn(2, moDl);
			mode1.addColumn(2, tal5);

			mode1.setHgap(20);
			mode1.setVgap(20);

			GridPane percentage1 = new GridPane();
			TextField tfl3 = new TextField();
			tfl3.setPrefSize(300, 50);
			Button bal6 = new Button("Back");
			Button percl = new Button("Calculate");
			TextArea tal6 = new TextArea();
			bal6.setPrefSize(300, 50);
			bal6.setStyle("-fx-background-color:green;");
			bal6.setTextFill(Color.WHITE);
			bal6.setFont(Font.font("Verdana", 20));
			percl.setPrefSize(300, 50);
			percl.setStyle("-fx-background-color:green;");
			percl.setTextFill(Color.WHITE);
			percl.setFont(Font.font("Verdana", 20));

			percentage1.addColumn(5, bal6);
			percentage1.addColumn(2, tfl3);
			percentage1.addColumn(2, percl);
			percentage1.addColumn(2, tal6);

			percentage1.setHgap(20);
			percentage1.setVgap(20);

			percl.setOnAction(e -> {
				if (tfl3.getText().trim().isEmpty()) {
					tal6.setText("Enter a grade");
				} else {
					tal6.setText(westL.avgabovespec(Double.parseDouble(tfl3.getText())));
				}
			});

			// Gaza Scientific
			GridPane insertg = new GridPane();
			TextField tfgg = new TextField();
			tfgg.setPrefSize(300, 50);
			Button bag = new Button("Back");
			Button inserg = new Button("Insert");
			TextArea tag = new TextArea();
			bag.setPrefSize(300, 50);
			bag.setStyle("-fx-background-color:green;");
			bag.setTextFill(Color.WHITE);
			bag.setFont(Font.font("Verdana", 20));
			inserg.setPrefSize(300, 50);
			inserg.setStyle("-fx-background-color:green;");
			inserg.setTextFill(Color.WHITE);
			inserg.setFont(Font.font("Verdana", 20));

			insertg.addColumn(5, bag);
			insertg.addColumn(2, tfgg);
			insertg.addColumn(2, inserg);
			insertg.addColumn(2, tag);

			insertg.setHgap(20);
			insertg.setVgap(20);

			inserg.setOnAction(e -> {
				if (tfgg.getText().trim().isEmpty()) {
					tag.setText("Enter Something");
				} else {
					String[] tokens = tfgg.getText().split(",");
					gazaS.insert(new Tawjihi(Integer.parseInt(tokens[0]), tokens[1], Double.parseDouble(tokens[2])));
					tag.setText("Insertion Completed");

				}

			});

			GridPane deleteg = new GridPane();
			TextField tf1g = new TextField();
			tf1g.setPrefSize(300, 50);
			Button ba1g = new Button("Back");
			Button deletg = new Button("Delete");
			TextArea ta1g = new TextArea();
			ba1g.setPrefSize(300, 50);
			ba1g.setStyle("-fx-background-color:green;");
			ba1g.setTextFill(Color.WHITE);
			ba1g.setFont(Font.font("Verdana", 20));
			deletg.setPrefSize(300, 50);
			deletg.setStyle("-fx-background-color:green;");
			deletg.setTextFill(Color.WHITE);
			deletg.setFont(Font.font("Verdana", 20));

			deleteg.addColumn(5, ba1g);
			deleteg.addColumn(2, tf1g);
			deleteg.addColumn(2, deletg);
			deleteg.addColumn(2, ta1g);

			deleteg.setHgap(20);
			deleteg.setVgap(20);

			deletg.setOnAction(e -> {
				if (tf1g.getText().trim().isEmpty()) {
					ta1g.setText("Enter Something");
				} else {

					if (gazaS.delte(Integer.parseInt(tf1g.getText())) == true) {
						ta1g.setText("Deleted ");
					} else {
						ta1g.setText("Error");
					}
				}
			});

			GridPane searchg = new GridPane();
			TextField tf2g = new TextField();
			tf2g.setPrefSize(300, 50);
			Button ba2g = new Button("Back");
			Button searcg = new Button("Search");
			TextArea ta2g = new TextArea();
			ba2g.setPrefSize(300, 50);
			ba2g.setStyle("-fx-background-color:green;");
			ba2g.setTextFill(Color.WHITE);
			ba2g.setFont(Font.font("Verdana", 20));
			searcg.setPrefSize(300, 50);
			searcg.setStyle("-fx-background-color:green;");
			searcg.setTextFill(Color.WHITE);
			searcg.setFont(Font.font("Verdana", 20));

			searchg.addColumn(5, ba2g);
			searchg.addColumn(2, tf2g);
			searchg.addColumn(2, searcg);
			searchg.addColumn(2, ta2g);

			searchg.setHgap(20);
			searchg.setVgap(20);

			searcg.setOnAction(e -> {
				if (tf2g.getText().trim().isEmpty()) {
					ta2g.setText("Enter Something");
				} else {
					ta2g.setText(gazaS.search(Integer.parseInt(tf2g.getText())));
				}
			});

			GridPane displayg = new GridPane();
			Button ba3g = new Button("Back");
			Button dispg = new Button("Display");
			TextArea ta3g = new TextArea();
			ba3g.setPrefSize(300, 50);
			ba3g.setStyle("-fx-background-color:green;");
			ba3g.setTextFill(Color.WHITE);
			ba3g.setFont(Font.font("Verdana", 20));
			dispg.setPrefSize(300, 50);
			dispg.setStyle("-fx-background-color:green;");
			dispg.setTextFill(Color.WHITE);
			dispg.setFont(Font.font("Verdana", 20));

			displayg.addColumn(5, ba3g);
			displayg.addColumn(2, dispg);
			displayg.addColumn(2, ta3g);

			displayg.setHgap(20);
			displayg.setVgap(20);

			dispg.setOnAction(e -> {
				ta3g.setText(gazaS.TopTen());
			});

			GridPane averageg = new GridPane();
			Button ba4g = new Button("Back");
			Button avgg = new Button("Calculate");
			TextArea ta4g = new TextArea();
			ba4g.setPrefSize(300, 50);
			ba4g.setStyle("-fx-background-color:green;");
			ba4g.setTextFill(Color.WHITE);
			ba4g.setFont(Font.font("Verdana", 20));
			avgg.setPrefSize(300, 50);
			avgg.setStyle("-fx-background-color:green;");
			avgg.setTextFill(Color.WHITE);
			avgg.setFont(Font.font("Verdana", 20));

			averageg.addColumn(5, ba4g);
			averageg.addColumn(2, avgg);
			averageg.addColumn(2, ta4g);

			averageg.setHgap(20);
			averageg.setVgap(20);

			avgg.setOnAction(e -> {
				ta4g.setText(String.valueOf(gazaS.avg()));
			});

			GridPane modeg = new GridPane();
			Button ba5g = new Button("Back");
			Button moDg = new Button("Calculate");
			TextArea ta5g = new TextArea();
			ba5g.setPrefSize(300, 50);
			ba5g.setStyle("-fx-background-color:green;");
			ba5g.setTextFill(Color.WHITE);
			ba5g.setFont(Font.font("Verdana", 20));
			moDg.setPrefSize(300, 50);
			moDg.setStyle("-fx-background-color:green;");
			moDg.setTextFill(Color.WHITE);
			moDg.setFont(Font.font("Verdana", 20));

			modeg.addColumn(5, ba5g);
			modeg.addColumn(2, moDg);
			modeg.addColumn(2, ta5g);

			modeg.setHgap(20);
			modeg.setVgap(20);

			moDg.setOnAction(e -> {

			});

			GridPane percentageg = new GridPane();
			TextField tf3g = new TextField();
			tf3g.setPrefSize(300, 50);
			Button ba6g = new Button("Back");
			Button percg = new Button("Calculate");
			TextArea ta6g = new TextArea();
			ba6g.setPrefSize(300, 50);
			ba6g.setStyle("-fx-background-color:green;");
			ba6g.setTextFill(Color.WHITE);
			ba6g.setFont(Font.font("Verdana", 20));
			percg.setPrefSize(300, 50);
			percg.setStyle("-fx-background-color:green;");
			percg.setTextFill(Color.WHITE);
			percg.setFont(Font.font("Verdana", 20));

			percentageg.addColumn(5, ba6g);
			percentageg.addColumn(2, tf3g);
			percentageg.addColumn(2, percg);
			percentageg.addColumn(2, ta6g);

			percentageg.setHgap(20);
			percentageg.setVgap(20);

			percg.setOnAction(e -> {
				if (tf3g.getText().trim().isEmpty()) {
					ta6g.setText("Enter a grade");
				} else {
					ta6g.setText(gazaS.avgabovespec(Double.parseDouble(tf3g.getText())));
				}
			});

			// gaza Literary Insert
			GridPane insert1g = new GridPane();
			TextField tflg = new TextField();
			tflg.setPrefSize(300, 50);
			Button balg = new Button("Back");
			Button inserlg = new Button("Insert");
			TextArea talg = new TextArea();
			balg.setPrefSize(300, 50);
			balg.setStyle("-fx-background-color:green;");
			balg.setTextFill(Color.WHITE);
			balg.setFont(Font.font("Verdana", 20));
			inserlg.setPrefSize(300, 50);
			inserlg.setStyle("-fx-background-color:green;");
			inserlg.setTextFill(Color.WHITE);
			inserlg.setFont(Font.font("Verdana", 20));

			insert1g.addColumn(5, balg);
			insert1g.addColumn(2, tflg);
			insert1g.addColumn(2, inserlg);
			insert1g.addColumn(2, talg);

			insert1g.setHgap(20);
			insert1g.setVgap(20);

			inserlg.setOnAction(e -> {
				if (tflg.getText().trim().isEmpty()) {
					talg.setText("Enter Something");
				} else {
					String[] tokens = tflg.getText().split(",");
					gazaL.insert(new Tawjihi(Integer.parseInt(tokens[0]), tokens[1], Double.parseDouble(tokens[2])));
					talg.setText("Insertion Completed");

				}

			});

			GridPane delete1g = new GridPane();
			TextField tfl1g = new TextField();
			tfl1g.setPrefSize(300, 50);
			Button bal1g = new Button("Back");
			Button deletlg = new Button("Delete");
			TextArea tal1g = new TextArea();
			bal1g.setPrefSize(300, 50);
			bal1g.setStyle("-fx-background-color:green;");
			bal1g.setTextFill(Color.WHITE);
			bal1g.setFont(Font.font("Verdana", 20));
			deletlg.setPrefSize(300, 50);
			deletlg.setStyle("-fx-background-color:green;");
			deletlg.setTextFill(Color.WHITE);
			deletlg.setFont(Font.font("Verdana", 20));

			delete1g.addColumn(5, bal1g);
			delete1g.addColumn(2, tfl1g);
			delete1g.addColumn(2, deletlg);
			delete1g.addColumn(2, tal1g);

			delete1g.setHgap(20);
			delete1g.setVgap(20);

			deletlg.setOnAction(e -> {
				if (tfl1g.getText().trim().isEmpty()) {
					tal1g.setText("Enter Something");
				} else {

					if (gazaL.delte(Integer.parseInt(tfl1g.getText())) == true) {
						tal1g.setText("Deleted ");
					} else {
						tal1g.setText("Error");
					}
				}
			});

			GridPane search1g = new GridPane();
			TextField tfl2g = new TextField();
			tfl2g.setPrefSize(300, 50);
			Button bal2g = new Button("Back");
			Button searclg = new Button("Search");
			TextArea tal2g = new TextArea();
			bal2g.setPrefSize(300, 50);
			bal2g.setStyle("-fx-background-color:green;");
			bal2g.setTextFill(Color.WHITE);
			bal2g.setFont(Font.font("Verdana", 20));
			searclg.setPrefSize(300, 50);
			searclg.setStyle("-fx-background-color:green;");
			searclg.setTextFill(Color.WHITE);
			searclg.setFont(Font.font("Verdana", 20));

			search1g.addColumn(5, bal2g);
			search1g.addColumn(2, tfl2g);
			search1g.addColumn(2, searclg);
			search1g.addColumn(2, tal2g);

			search1g.setHgap(20);
			search1g.setVgap(20);
			searclg.setOnAction(e -> {
				if (tfl2g.getText().trim().isEmpty()) {
					tal2g.setText("Enter Something");
				} else {
					tal2g.setText(gazaL.search(Integer.parseInt(tfl2g.getText())));
				}
			});

			GridPane display1g = new GridPane();
			Button bal3g = new Button("Back");
			Button displg = new Button("Display");
			TextArea tal3g = new TextArea();
			bal3g.setPrefSize(300, 50);
			bal3g.setStyle("-fx-background-color:green;");
			bal3g.setTextFill(Color.WHITE);
			bal3g.setFont(Font.font("Verdana", 20));
			displg.setPrefSize(300, 50);
			displg.setStyle("-fx-background-color:green;");
			displg.setTextFill(Color.WHITE);
			displg.setFont(Font.font("Verdana", 20));

			display1g.addColumn(5, bal3g);
			display1g.addColumn(2, displg);
			display1g.addColumn(2, tal3g);

			display1g.setHgap(20);
			display1g.setVgap(20);
			displg.setOnAction(e -> {
				tal3g.setText(gazaL.TopTen());
			});

			GridPane average1g = new GridPane();
			Button bal4g = new Button("Back");
			Button avglg = new Button("Calculate");
			TextArea tal4g = new TextArea();
			bal4g.setPrefSize(300, 50);
			bal4g.setStyle("-fx-background-color:green;");
			bal4g.setTextFill(Color.WHITE);
			bal4g.setFont(Font.font("Verdana", 20));
			avglg.setPrefSize(300, 50);
			avglg.setStyle("-fx-background-color:green;");
			avglg.setTextFill(Color.WHITE);
			avglg.setFont(Font.font("Verdana", 20));

			average1g.addColumn(5, bal4g);
			average1g.addColumn(2, avglg);
			average1g.addColumn(2, tal4g);

			average1g.setHgap(20);
			average1g.setVgap(20);
			avglg.setOnAction(e -> {
				tal4g.setText(String.valueOf(gazaL.avg()));
			});

			GridPane mode1g = new GridPane();
			Button bal5g = new Button("Back");
			Button moDlg = new Button("Calculate");
			TextArea tal5g = new TextArea();
			bal5g.setPrefSize(300, 50);
			bal5g.setStyle("-fx-background-color:green;");
			bal5g.setTextFill(Color.WHITE);
			bal5g.setFont(Font.font("Verdana", 20));
			moDlg.setPrefSize(300, 50);
			moDlg.setStyle("-fx-background-color:green;");
			moDlg.setTextFill(Color.WHITE);
			moDlg.setFont(Font.font("Verdana", 20));

			mode1g.addColumn(5, bal5g);
			mode1g.addColumn(2, moDlg);
			mode1g.addColumn(2, tal5g);

			mode1g.setHgap(20);
			mode1g.setVgap(20);

			GridPane percentage1g = new GridPane();
			TextField tfl3g = new TextField();
			tfl3g.setPrefSize(300, 50);
			Button bal6g = new Button("Back");
			Button perclg = new Button("Calculate");
			TextArea tal6g = new TextArea();
			bal6g.setPrefSize(300, 50);
			bal6g.setStyle("-fx-background-color:green;");
			bal6g.setTextFill(Color.WHITE);
			bal6g.setFont(Font.font("Verdana", 20));
			perclg.setPrefSize(300, 50);
			perclg.setStyle("-fx-background-color:green;");
			perclg.setTextFill(Color.WHITE);
			perclg.setFont(Font.font("Verdana", 20));

			percentage1g.addColumn(5, bal6g);
			percentage1g.addColumn(2, tfl3g);
			percentage1g.addColumn(2, perclg);
			percentage1g.addColumn(2, tal6g);

			percentage1g.setHgap(20);
			percentage1g.setVgap(20);

			perclg.setOnAction(e -> {
				if (tfl3g.getText().trim().isEmpty()) {
					tal6g.setText("Enter a grade");
				} else {
					tal6g.setText(gazaL.avgabovespec(Double.parseDouble(tfl3g.getText())));
				}
				///////////////////////////////////////////////////////////////////////////////////
			});
			Scene main = new Scene(root, 800, 600); // main scene
			Scene westsS = new Scene(west, 800, 600); // west scientific scene
			Scene westsL = new Scene(west1, 800, 600); // west literary scene
			Scene gazasS = new Scene(gaza, 800, 600); // gaza scientific scene
			Scene gazasL = new Scene(gaza1, 800, 600); // gaza literary scene

			// west scientific scenes
			Scene insertw = new Scene(insert, 800, 600);
			Scene deletew = new Scene(delete, 800, 600);
			Scene searchw = new Scene(search, 800, 600);
			Scene dispalyw = new Scene(display, 800, 600);
			Scene averagew = new Scene(average, 800, 600);
			Scene modw = new Scene(mode, 800, 600);
			Scene percentagew = new Scene(percentage, 800, 600);

			// west literary scenes
			Scene insertl = new Scene(insert1, 800, 600);
			Scene deletel = new Scene(delete1, 800, 600);
			Scene searchl = new Scene(search1, 800, 600);
			Scene dispalyl = new Scene(display1, 800, 600);
			Scene averagel = new Scene(average1, 800, 600);
			Scene modl = new Scene(mode1, 800, 600);
			Scene percentagel = new Scene(percentage1, 800, 600);

			// gaza scientific
			Scene insertgs = new Scene(insertg, 800, 600);
			Scene deletegs = new Scene(deleteg, 800, 600);
			Scene searchgs = new Scene(searchg, 800, 600);
			Scene dispalygs = new Scene(displayg, 800, 600);
			Scene averagegs = new Scene(averageg, 800, 600);
			Scene modgs = new Scene(modeg, 800, 600);
			Scene percentagegs = new Scene(percentageg, 800, 600);

			// gaza literary
			Scene insertgl = new Scene(insert1g, 800, 600);
			Scene deletegl = new Scene(delete1g, 800, 600);
			Scene searchgl = new Scene(search1g, 800, 600);
			Scene dispalygl = new Scene(display1g, 800, 600);
			Scene averagegl = new Scene(average1g, 800, 600);
			Scene modgl = new Scene(mode1g, 800, 600);
			Scene percentagegl = new Scene(percentage1g, 800, 600);

			wBTN.setOnAction(e -> {
				primaryStage.setScene(westsS);
			});

			gBTN.setOnAction(e -> {
				primaryStage.setScene(gazasS);
			});

			goToL.setOnAction(e -> {
				primaryStage.setScene(westsL);
			});

			goToS.setOnAction(e -> {
				primaryStage.setScene(westsS);
			});

			goToL1.setOnAction(e -> {
				primaryStage.setScene(gazasL);
			});

			goToS1.setOnAction(e -> {
				primaryStage.setScene(gazasS);
			});

			back.setOnAction(e -> {
				primaryStage.setScene(main);

			});
			back1.setOnAction(e -> {
				primaryStage.setScene(main);

			});
			back2.setOnAction(e -> {
				primaryStage.setScene(main);

			});
			back3.setOnAction(e -> {
				primaryStage.setScene(main);

			});

			// West Bank Scientific Buttons that goes to Sub Scenes
			ins.setOnAction(e -> {
				primaryStage.setScene(insertw);
			});

			del.setOnAction(e -> {
				primaryStage.setScene(deletew);
			});

			sea.setOnAction(e -> {
				primaryStage.setScene(searchw);
			});

			dis.setOnAction(e -> {
				primaryStage.setScene(dispalyw);
			});
			mean.setOnAction(e -> {
				primaryStage.setScene(averagew);
			});
			mod.setOnAction(e -> {
				primaryStage.setScene(modw);
			});
			per.setOnAction(e -> {
				primaryStage.setScene(percentagew);
			});

			// West Bank Scientific back buttons inside scenes
			ba.setOnAction(e -> {
				primaryStage.setScene(westsS);
			});
			ba1.setOnAction(e -> {
				primaryStage.setScene(westsS);
			});
			ba2.setOnAction(e -> {
				primaryStage.setScene(westsS);
			});
			ba3.setOnAction(e -> {
				primaryStage.setScene(westsS);
			});
			ba4.setOnAction(e -> {
				primaryStage.setScene(westsS);
			});
			ba5.setOnAction(e -> {
				primaryStage.setScene(westsS);
			});
			ba6.setOnAction(e -> {
				primaryStage.setScene(westsS);
			});

			// West bank literary buttons
			ins1.setOnAction(e -> {
				primaryStage.setScene(insertl);
			});
			del1.setOnAction(e -> {
				primaryStage.setScene(deletel);
			});

			sea1.setOnAction(e -> {
				primaryStage.setScene(searchl);
			});

			dis1.setOnAction(e -> {
				primaryStage.setScene(dispalyl);
			});
			mean1.setOnAction(e -> {
				primaryStage.setScene(averagel);
			});
			mod1.setOnAction(e -> {
				primaryStage.setScene(modl);
			});
			per1.setOnAction(e -> {
				primaryStage.setScene(percentagel);
			});

			// back buttons inside west bank literary scenes
			bal.setOnAction(e -> {
				primaryStage.setScene(westsL);
			});
			bal1.setOnAction(e -> {
				primaryStage.setScene(westsL);
			});
			bal2.setOnAction(e -> {
				primaryStage.setScene(westsL);
			});
			bal3.setOnAction(e -> {
				primaryStage.setScene(westsL);
			});
			bal4.setOnAction(e -> {
				primaryStage.setScene(westsL);
			});
			bal5.setOnAction(e -> {
				primaryStage.setScene(westsL);
			});
			bal6.setOnAction(e -> {
				primaryStage.setScene(westsL);
			});

			// gaza scientific
			ins2.setOnAction(e -> {
				primaryStage.setScene(insertgs);
			});
			del2.setOnAction(e -> {
				primaryStage.setScene(deletegs);
			});
			sea2.setOnAction(e -> {
				primaryStage.setScene(searchgs);
			});
			dis2.setOnAction(e -> {
				primaryStage.setScene(dispalygs);
			});
			mean2.setOnAction(e -> {
				primaryStage.setScene(averagegs);
			});
			mod2.setOnAction(e -> {
				primaryStage.setScene(modgs);
			});
			per2.setOnAction(e -> {
				primaryStage.setScene(percentagegs);
			});

			// gaza literary

			ins3.setOnAction(e -> {
				primaryStage.setScene(insertgl);
			});
			del3.setOnAction(e -> {
				primaryStage.setScene(deletegl);
			});
			sea3.setOnAction(e -> {
				primaryStage.setScene(searchgl);
			});
			dis3.setOnAction(e -> {
				primaryStage.setScene(dispalygl);
			});
			mean3.setOnAction(e -> {
				primaryStage.setScene(averagegl);
			});
			mod3.setOnAction(e -> {
				primaryStage.setScene(modgl);
			});
			per3.setOnAction(e -> {
				primaryStage.setScene(percentagegl);
			});

			// gaza back buttons
			bag.setOnAction(e -> {
				primaryStage.setScene(gazasS);
			});
			ba1g.setOnAction(e -> {
				primaryStage.setScene(gazasS);
			});
			ba2g.setOnAction(e -> {
				primaryStage.setScene(gazasS);
			});
			ba3g.setOnAction(e -> {
				primaryStage.setScene(gazasS);
			});
			ba4g.setOnAction(e -> {
				primaryStage.setScene(gazasS);
			});
			ba5g.setOnAction(e -> {
				primaryStage.setScene(gazasS);
			});
			ba6g.setOnAction(e -> {
				primaryStage.setScene(gazasS);
			});
			balg.setOnAction(e -> {
				primaryStage.setScene(gazasL);
			});
			bal1g.setOnAction(e -> {
				primaryStage.setScene(gazasL);
			});
			bal2g.setOnAction(e -> {
				primaryStage.setScene(gazasL);
			});
			bal3g.setOnAction(e -> {
				primaryStage.setScene(gazasL);
			});
			bal4g.setOnAction(e -> {
				primaryStage.setScene(gazasL);
			});
			bal5g.setOnAction(e -> {
				primaryStage.setScene(gazasL);
			});
			bal6g.setOnAction(e -> {
				primaryStage.setScene(gazasL);
			});

			primaryStage.setScene(main);
			primaryStage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static String fileReadW(String s) throws FileNotFoundException {
		File file = new File(s);
		Scanner sc = new Scanner(file);
		if (file.exists()) {
			while (sc.hasNext()) {
				// 123 , scientific , 99
				String st = sc.nextLine();
				String[] tokens = st.split(",");
				int num = Integer.parseInt(tokens[0]);
				String branch = tokens[1];
				double average = Double.parseDouble(tokens[2]);

				if (branch.equals("Scientific")) {
					westS.insert(new Tawjihi(num, branch, average));
				} else if (branch.equals("Literary")) {
					westL.insert(new Tawjihi(num, branch, average));
				} else {
					return "Error";
				}
			}
		}
		return "Complete";
	}

	public static String fileReadG(String s) throws FileNotFoundException {
		File file = new File(s);
		Scanner sc = new Scanner(file);
		if (file.exists()) {
			while (sc.hasNext()) {
				String st = sc.nextLine();
				String[] tokens = st.split(",");
				int num = Integer.parseInt(tokens[0]);
				String branch = tokens[1];
				double average = Double.parseDouble(tokens[2]);

				if (branch.equals("Scientific")) {
					gazaS.insert(new Tawjihi(num, branch, average));
				} else if (branch.equals("Literary")) {
					gazaL.insert(new Tawjihi(num, branch, average));
				} else {
					return "Error";
				}
			}
		}
		return "Complete";
	}

	public static void main(String[] args) {
		launch(args);
	}
}
