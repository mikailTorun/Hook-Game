import javafx.geometry.Bounds;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.Initializable;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.StrokeLineCap;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.shape.Rectangle;

import javafx.animation.*;

//Göksel Tokur 150116049 - Mikail Torun 150116021
public class Game extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		// Start Menu
		Pane pane = new Pane();

		Text author = new Text(185, 200, "Göksel and Mikail's");
		author.setFont(new Font(20));
		author.setFill(Color.BLACK);
		pane.getChildren().add(author);

		Text hook = new Text(170, 350, "HOOK");
		hook.setFont(new Font(200));
		hook.setFill(Color.BLACK);
		pane.getChildren().add(hook);


		Circle startc = new Circle();
		startc.setCenterX(450);
		startc.setCenterY(500);
		startc.setRadius(80);
		startc.setStroke(Color.BLACK);
		startc.setFill(Color.BLACK);
		pane.getChildren().add(startc);

		Text start = new Text(380, 515, "START");
		start.setFont(new Font(50));
		start.setFill(Color.WHITE);
		pane.getChildren().add(start);


		startc.setOnMouseClicked(e -> {
			forOneLevel(primaryStage);
		});

		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 900, 800);
		scene.setFill(Color.WHITE);
		primaryStage.setTitle("Hook"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage


	}


	//Level 1
		public void forOneLevel(Stage primaryStage1){
			Pane pane = new Pane();

			Rectangle r1 = new Rectangle(498, 351, 5, 5);
			r1.setStroke(Color.BLACK);
			r1.setFill(Color.WHITE);
			r1.setVisible(false);
			pane.getChildren().add(r1);

			Rectangle r2 = new Rectangle(520, 351, 5, 5);
			r2.setStroke(Color.BLACK);
			r2.setFill(Color.WHITE);
			r2.setVisible(false);
			pane.getChildren().add(r2);

			Circle circle1 = new Circle();
			circle1.setCenterX(500);
			circle1.setCenterY(650);
			circle1.setRadius(20);
			circle1.setStroke(Color.BLACK);
			circle1.setFill(Color.BLACK);
			pane.getChildren().add(circle1); // Add circle to the pane

			Line line = new Line(500, 650, 500, 550);
			line.setFill(Color.BLACK);
			pane.getChildren().add(line);

			Line line2 = new Line(490, 550, 510, 550);
			line2.setFill(Color.BLACK);
			line2.setStrokeWidth(5);
			line2.setStrokeLineCap(StrokeLineCap.ROUND);
			pane.getChildren().add(line2);

			Line line3 = new Line(500, 550, 500, 345);
			line3.setFill(Color.BLACK);
			line3.setStroke(Color.BLACK);
			line3.setStrokeWidth(5);
			line3.setStrokeLineCap(StrokeLineCap.ROUND);
			pane.getChildren().add(line3);


			// animation part1
			circle1.setOnMouseClicked(e -> {

				Timeline animation = new Timeline(new KeyFrame(Duration.millis(30), event -> lineAnimationY(line3)));
				animation.setCycleCount((205 / 5));
				animation.play(); // Start animation

				Timeline animation2 = new Timeline(
						new KeyFrame(Duration.millis(30), event -> lineAnimationToBiggerX(line2)));
				animation2.setCycleCount(5);
				animation2.play(); // Start animation2

				Timeline animation3 = new Timeline(new KeyFrame(Duration.millis(30), event -> rectangleAnimationX(r1)));
				animation3.setCycleCount((205 / 5));
				animation3.play(); // Start animation

				animation3.setOnFinished(ee ->{
					circle1.setVisible(false);
					line.setVisible(false);
					line2.setVisible(false);
					line3.setVisible(false);
				});

			});

			// Created circle2
			Circle circle2 = new Circle();

			circle2.setCenterX(600);
			circle2.setCenterY(600);
			circle2.setRadius(20);
			circle2.setStroke(Color.BLACK);
			circle2.setFill(Color.BLACK);
			pane.getChildren().add(circle2); // Add circle to the pane

			Line line21 = new Line(600, 600, 250, 600);
			line21.setFill(Color.BLACK);
			line21.setStroke(Color.BLACK);
			pane.getChildren().add(line21);

			Line line22 = new Line(250, 600, 250, 353);
			line22.setFill(Color.BLACK);
			line22.setStroke(Color.BLACK);
			pane.getChildren().add(line22);

			Line line23 = new Line(250, 353, 280, 353);
			line23.setFill(Color.BLACK);
			line23.setStroke(Color.BLACK);
			pane.getChildren().add(line23);

			Line line24 = new Line(280, 343, 280, 363);
			line24.setFill(Color.BLACK);
			line24.setStroke(Color.BLACK);
			line24.setStrokeWidth(5);
			line24.setStrokeLineCap(StrokeLineCap.ROUND);
			pane.getChildren().add(line24);

			Line line25 = new Line(280, 353, 480, 353);
			line25.setFill(Color.BLACK);
			line25.setStroke(Color.BLACK);
			line25.setStrokeWidth(5);
			line25.setStrokeLineCap(StrokeLineCap.ROUND);
			pane.getChildren().add(line25);

			Arc arc1 = new Arc(500, 353, 20, 20, 0, 180);
			arc1.setFill(null); // Set fill color
			arc1.setStroke(Color.BLACK);
			arc1.setType(ArcType.OPEN); // Set arc type
			arc1.setStrokeWidth(5);
			arc1.setStrokeLineCap(StrokeLineCap.ROUND);
			pane.getChildren().add(arc1); // Add arc to pane

			Line line26 = new Line(520, 353, 600, 353);
			line26.setFill(Color.BLACK);
			line26.setStroke(Color.BLACK);
			line26.setStrokeWidth(5);
			line26.setStrokeLineCap(StrokeLineCap.ROUND);
			pane.getChildren().add(line26);

			// animation part2
			circle2.setOnMouseClicked(e -> {

				Timeline animation = new Timeline(new KeyFrame(Duration.millis(30), event -> lineAnimationXX(line26)));// to
																														// carry
																														// linelast
				animation.setCycleCount(240 / 5); // 240 is distance
				animation.play(); // Start animation


				animation.setOnFinished(ee -> {
					Timeline animationforlastline = new Timeline(
							new KeyFrame(Duration.millis(30), event -> lineAnimationX(line26))); // to
																									// remove
																									// lastline
					animationforlastline.setCycleCount((int) lineSizeX(line26) / 5);
					animationforlastline.play();
					animationforlastline.setOnFinished(ex ->{
						circle2.setVisible(false);
						line21.setVisible(false);
						line22.setVisible(false);
						line23.setVisible(false);
						line24.setVisible(false);
						line25.setVisible(false);
						line25.setVisible(false);
						arc1.setVisible(false);

						if(line25.isVisible()==false){
							forTwoLevel(primaryStage1);
						}
					});


				});

				Timeline animation3 = new Timeline(new KeyFrame(Duration.millis(30), event -> lineAnimationX(line25)));
				animation3.setCycleCount((int) lineSizeX(line25) / 5);
				animation3.play(); // start animation

				Timeline animation4 = new Timeline(
						new KeyFrame(Duration.millis(30), event -> lineAnimationToBiggerY(line24)));
				animation4.setCycleCount(5);
				animation4.play(); // Start animation

				Timeline animation5 = new Timeline(
						new KeyFrame(Duration.millis(30), event -> lineAnimationForArcX(arc1, line25)));
				animation5.setCycleCount(220 / 5);

				animation5.play(); // Start animation for arc

				Timeline animation6 = new Timeline(new KeyFrame(Duration.millis(30), event -> rectangleAnimationY(r2)));
				animation6.setCycleCount((240 / 5));
				animation6.play(); // Start animation

				Timeline animationForCollision = new Timeline(
						new KeyFrame(Duration.millis(30), event -> collisionDetectionInLevel1(r1, r2, animation5, animation,
								animation4, animation3,primaryStage1)));
				animationForCollision.setCycleCount(240 / 5);
				animationForCollision.play();


			});



			// Create a scene and place it in the stage
			Scene scene = new Scene(pane, 900, 800);
			scene.setFill(Color.WHITE);
			primaryStage1.setTitle("Hook"); // Set the stage title
			primaryStage1.setScene(scene); // Place the scene in the stage
			primaryStage1.show(); // Display the stage
		}


	public void forTwoLevel(Stage primaryStage2){

		//For level2

		Pane pane2 = new Pane();
		// We created rectangles to understand collision
		Rectangle r1 = new Rectangle(300, 300, 5, 5);
		r1.setStroke(Color.RED);
		r1.setFill(Color.WHITE);
		r1.setVisible(false);
		pane2.getChildren().add(r1);

		Rectangle r2 = new Rectangle(300, 280, 5, 5);
		r2.setStroke(Color.RED);
		r2.setFill(Color.WHITE);
		r2.setVisible(false);
		pane2.getChildren().add(r2);

		Rectangle r3 = new Rectangle(300, 440, 5, 5);
		r3.setStroke(Color.RED);
		r3.setFill(Color.WHITE);
		r3.setVisible(false);
		pane2.getChildren().add(r3);

		Rectangle r4 = new Rectangle(300, 460, 5, 5);
		r4.setStroke(Color.RED);
		r4.setFill(Color.WHITE);
		r4.setVisible(false);
		pane2.getChildren().add(r4);

		Rectangle r5 = new Rectangle(400, 460, 5, 5);// arc2 merkez
		r5.setStroke(Color.RED);
		r5.setFill(Color.WHITE);
		r5.setVisible(false);
		pane2.getChildren().add(r5);

		Rectangle r6 = new Rectangle(360, 460, 4, 4);
		r6.setStroke(Color.RED);
		r6.setFill(Color.WHITE);
		r6.setVisible(false);
		pane2.getChildren().add(r6);





				Circle circle1 = new Circle();
				circle1.setCenterX(200);
				circle1.setCenterY(600);
				circle1.setRadius(20);
				circle1.setStroke(Color.BLACK);
				circle1.setFill(Color.BLACK);
				pane2.getChildren().add(circle1); // Add circle to the pane

				// created line1
				Line line1 = new Line(200, 600, 200, 300);
				line1.setFill(Color.BLACK);
				pane2.getChildren().add(line1);
				// Created line2
				Line line2 = new Line(200, 300, 230, 300);
				line2.setFill(Color.BLACK);
				pane2.getChildren().add(line2);
				// Created Line3
				Line Line3 = new Line(230, 290, 230, 310);
				Line3.setFill(Color.BLACK);
				Line3.setStroke(Color.BLACK);
				Line3.setStrokeWidth(5);
				Line3.setStrokeLineCap(StrokeLineCap.ROUND);
				pane2.getChildren().add(Line3);
				// Created Line4
				Line Line4 = new Line(230, 300, 305, 300);
				Line4.setFill(Color.BLACK);
				Line4.setStroke(Color.BLACK);
				Line4.setStrokeWidth(5);
				Line4.setStrokeLineCap(StrokeLineCap.ROUND);
				pane2.getChildren().add(Line4);


				// created circle2
				Circle circle2 = new Circle();
				circle2.setCenterX(300);
				circle2.setCenterY(600);
				circle2.setRadius(20);
				circle2.setStroke(Color.BLACK);
				circle2.setFill(Color.BLACK);
				pane2.getChildren().add(circle2); // Add circle to the pane

				// Created Line21
				Line Line21 = new Line(300, 600, 300, 550);
				Line21.setFill(Color.BLACK);
				pane2.getChildren().add(Line21);
				// Created line22
				Line line22 = new Line(290, 550, 310, 550);
				line22.setFill(Color.BLACK);
				line22.setStrokeWidth(5);
				line22.setStrokeLineCap(StrokeLineCap.ROUND);
				pane2.getChildren().add(line22);
				// Created line23
				Line line23 = new Line(300, 550, 300, 480);
				line23.setFill(Color.BLACK);
				line23.setStroke(Color.BLACK);
				line23.setStrokeWidth(5);
				line23.setStrokeLineCap(StrokeLineCap.ROUND);
				pane2.getChildren().add(line23);
				// Created Arc1
				Arc Arc1 = new Arc(300, 460, 20, 20, 90, 180);
				Arc1.setFill(null); // Set fill color
				Arc1.setStroke(Color.BLACK);
				Arc1.setType(ArcType.OPEN); // Set arc type
				Arc1.setStrokeWidth(5);
				Arc1.setStrokeLineCap(StrokeLineCap.ROUND);
				pane2.getChildren().add(Arc1); // Add arc to pane
				// Created line24
				Line line24 = new Line(300, 440, 300, 320);
				line24.setFill(Color.BLACK);
				line24.setStroke(Color.BLACK);
				line24.setStrokeWidth(5);
				line24.setStrokeLineCap(StrokeLineCap.ROUND);
				pane2.getChildren().add(line24);
				// Created Arc2
				Arc arc2 = new Arc(300, 300, 20, 20, 90, -180);
				arc2.setFill(null); // Set fill color
				arc2.setStroke(Color.BLACK);
				arc2.setType(ArcType.OPEN); // Set arc type
				arc2.setStrokeWidth(5);
				arc2.setStrokeLineCap(StrokeLineCap.ROUND);
				pane2.getChildren().add(arc2); // Add arc to pane
				// Created line25
				Line line25 = new Line(300, 280, 300, 260);
				line25.setFill(Color.BLACK);
				line25.setStroke(Color.BLACK);
				line25.setStrokeWidth(5);
				line25.setStrokeLineCap(StrokeLineCap.ROUND);
				pane2.getChildren().add(line25);

				//Animation part1 for level2

				circle1.setOnMouseClicked(e -> {

					Timeline animation1 = new Timeline(new KeyFrame(Duration.millis(30), event -> lineAnimationX(Line4)));
					animation1.setCycleCount((75 / 5)); // 75  is length of line4
					animation1.play(); // Start animation

					Timeline animation2 = new Timeline(
							new KeyFrame(Duration.millis(30), event -> lineAnimationToBiggerY(Line3)));
					animation2.setCycleCount(5);
					animation2.play(); // Start animation2

					Timeline animation3 = new Timeline(new KeyFrame(Duration.millis(30), event -> rectangleAnimationY(r1)));
					animation3.setCycleCount((205 / 5));
					animation3.play(); // Start animation3

					animation3.setOnFinished(ee ->{
						circle1.setVisible(false);
						line1.setVisible(false);
						line2.setVisible(false);
						Line3.setVisible(false);
						Line4.setVisible(false);
					});


				});

				circle2.setOnMouseClicked(e -> {

					Timeline animation1 = new Timeline(new KeyFrame(Duration.millis(30), event -> lineAnimationToBiggerX(line22)));
					animation1.setCycleCount(( 5));
					animation1.play(); // Start animation

					Timeline animation2 = new Timeline(
							new KeyFrame(Duration.millis(30), event -> lineAnimationY(line23)));
					animation2.setCycleCount(70/5);
					animation2.play(); // Start animation2

					Timeline animation3 = new Timeline(new KeyFrame(Duration.millis(30), event -> lineAnimationForArcY(Arc1,line23)));
					animation3.setCycleCount((205 / 5));
					animation3.play(); // Start animation3

					Timeline animation4 = new Timeline( // TO CARRY
							new KeyFrame(Duration.millis(30), event -> lineAnimationYY(line24)));
					animation4.setCycleCount(110/5);
					animation4.play(); // Start animation4


				animation4.setOnFinished(ee -> {

					Timeline animation5 = new Timeline(// TO BE SMALL
							new KeyFrame(Duration.millis(30), event -> lineAnimationY(line24)));
					animation5.setCycleCount(125/5);
					animation5.play(); // Start animation2
				});

				Timeline animation6 = new Timeline(new KeyFrame(Duration.millis(30), event -> lineAnimationForArcYinlevel2(arc2,line24)));
				animation6.setCycleCount((250 / 5));
				animation6.play(); // Start animation3

				animation6.setOnFinished(eee -> {
					arc2.setVisible(false);
				});

				Timeline animation7 = new Timeline(new KeyFrame(Duration.millis(30), event -> lineAnimationYY(line25)));// to carry line25
				animation7.setCycleCount(270/5);
				animation7.play();

				animation7.setOnFinished(ee -> {

					Timeline animation8 = new Timeline(//  To decrease length of line
							new KeyFrame(Duration.millis(30), event -> lineAnimationY(line25)));
					animation8.setCycleCount(20/5);
					animation8.play(); // Start animation8

					animation8.setOnFinished(eee ->{
						circle2.setVisible(false);
						Line21.setVisible(false);
						line22.setVisible(false);
						line23.setVisible(false);
						line24.setVisible(false);
						line25.setVisible(false);
						Arc1.setVisible(false);
						arc2.setVisible(false);
						if(circle2.isVisible()==false ){ // CALL NEXT LEVEL IF CONDITIONALS ARE TRUE...
							forThreeLevel(primaryStage2);}
					});
				});

				Timeline animation9 = new Timeline(new KeyFrame(Duration.millis(30), event -> rectangleAnimationX(r2)));
				animation9.setCycleCount((240 / 5));
				animation9.play(); // Start animation

				Timeline animation10 = new Timeline(new KeyFrame(Duration.millis(30), event -> rectangleAnimationX(r3)));
				animation10.setCycleCount((240 / 5));
				animation10.play(); // Start animation

				Timeline animationForCollision = new Timeline(
						new KeyFrame(Duration.millis(30), event -> collisionDetectionInLevel2(r1, r2, r3, r4,animation1,animation2,animation3,
								animation4,animation6,animation7,animation9,animation10,
								primaryStage2)));
				animationForCollision.setCycleCount(240 / 5);
				animationForCollision.play();
				});
				// created circle3
				Circle circle3 = new Circle();
				circle3.setCenterX(400);
				circle3.setCenterY(600);
				circle3.setRadius(20);
				circle3.setStroke(Color.BLACK);
				circle3.setFill(Color.BLACK);
				pane2.getChildren().add(circle3); // Add circle to the pane
				// Created Line31
				Line Line31 = new Line(400, 600, 400, 550);
				Line31.setFill(Color.BLACK);
				pane2.getChildren().add(Line31);
				// Created line32
				Line line32 = new Line(390, 550, 410, 550);
				line32.setFill(Color.BLACK);
				line32.setStrokeWidth(5);
				line32.setStrokeLineCap(StrokeLineCap.ROUND);
				pane2.getChildren().add(line32);
				// Created line33
				Line line33 = new Line(400, 550, 400, 455);
				line33.setFill(Color.BLACK);
				line33.setStroke(Color.BLACK);
				line33.setStrokeWidth(5);
				line33.setStrokeLineCap(StrokeLineCap.ROUND);
				pane2.getChildren().add(line33);

				circle3.setOnMouseClicked(e -> {

					Timeline animation1 = new Timeline(new KeyFrame(Duration.millis(30), event -> lineAnimationToBiggerX(line32)));
					animation1.setCycleCount(( 5));
					animation1.play(); // Start animation

					Timeline animation2 = new Timeline(
							new KeyFrame(Duration.millis(30), event -> lineAnimationY(line33)));
					animation2.setCycleCount(95/5);
					animation2.play(); // Start animation2

					Timeline animation3 = new Timeline(new KeyFrame(Duration.millis(30), event -> rectangleAnimationX(r5)));
					animation3.setCycleCount((205 / 5));
					animation3.play(); // Start animation3

					animation3.setOnFinished(ee->{
						circle3.setVisible(false);
						Line31.setVisible(false);
						line32.setVisible(false);
						line33.setVisible(false);
					});
					});
				// created circle4
				Circle circle4 = new Circle();
				circle4.setCenterX(650);
				circle4.setCenterY(600);
				circle4.setRadius(20);
				circle4.setStroke(Color.BLACK);
				circle4.setFill(Color.BLACK);
				pane2.getChildren().add(circle4); // Add circle to the pane

				// created line41
				Line line41 = new Line(650, 600, 650, 460);
				line41.setFill(Color.BLACK);
				pane2.getChildren().add(line41);
				// created line42
				Line line42 = new Line(650, 460, 600, 460);
				line42.setFill(Color.BLACK);
				pane2.getChildren().add(line42);
				// Created line43
				Line line43 = new Line(600, 450, 600, 470);
				line43.setFill(Color.BLACK);
				line43.setStrokeWidth(5);
				line43.setStrokeLineCap(StrokeLineCap.ROUND);
				pane2.getChildren().add(line43);
				// Created Arc3
				Arc Arc3 = new Arc(400, 460, 20, 20, 180, -180);
				Arc3.setFill(null); // Set fill color
				Arc3.setStroke(Color.BLACK);
				Arc3.setType(ArcType.OPEN); // Set arc type
				Arc3.setStrokeWidth(5);
				Arc3.setStrokeLineCap(StrokeLineCap.ROUND);
				pane2.getChildren().add(Arc3); // Add arc to pane
				// Created line44
				Line line44 = new Line(600, 460, 420, 460);
				line44.setFill(Color.BLACK);
				line44.setStrokeWidth(5);
				line44.setStrokeLineCap(StrokeLineCap.ROUND);
				pane2.getChildren().add(line44);
				// Created line45
				Line line45 = new Line(380, 460, 295, 460);
				line45.setFill(Color.BLACK);
				line45.setStrokeWidth(5);
				line45.setStrokeLineCap(StrokeLineCap.ROUND);
				pane2.getChildren().add(line45);

				circle4.setOnMouseClicked(e -> {

					Timeline animation1 = new Timeline(new KeyFrame(Duration.millis(30), event -> lineAnimationToBiggerY(line43)));
					animation1.setCycleCount(( 5));
					animation1.play(); // Start animation

					Timeline animation2 = new Timeline(
							new KeyFrame(Duration.millis(30), event -> lineAnimationX(line44)));
					animation2.setCycleCount(180/5);
					animation2.play(); // Start animation2

					Timeline animation3 = new Timeline(
							new KeyFrame(Duration.millis(30), event -> lineAnimationForArcXinlevel2(Arc3, line44)));
					animation3.setCycleCount(200 / 5);
					animation3.play(); // Start animation for arc

					Timeline animation4 = new Timeline(new KeyFrame(Duration.millis(30), event -> rectangleAnimationY(r6)));
					animation4.setCycleCount((205 / 5));
					animation4.play(); // Start animation4

					Timeline animation11 = new Timeline(new KeyFrame(Duration.millis(30), event -> rectangleAnimationY(r4)));
					animation11.setCycleCount((240 / 5));
					animation11.play(); // Start animation

					Timeline animation5 = new Timeline(new KeyFrame(Duration.millis(30), event -> lineAnimationXX(line45)));// to carry line45
					animation5.setCycleCount(220/5);
					animation5.play();

					animation5.setOnFinished(ee -> {

						Timeline animation6 = new Timeline(//  To decrease length of line
								new KeyFrame(Duration.millis(30), event -> lineAnimationX(line45)));
						animation6.setCycleCount(85/5);
						animation6.play();

						animation6.setOnFinished(eee->{
							circle4.setVisible(false);
							line41.setVisible(false);
							line42.setVisible(false);
							line43.setVisible(false);
							line44.setVisible(false);
							line45.setVisible(false);
							Arc3.setVisible(false);
						});
					});

					Timeline animation7 = new Timeline(new KeyFrame(Duration.millis(30), event -> rectangleAnimationY(r6)));
					animation7.setCycleCount((205 / 5));
					animation7.play();

					Timeline animationForCollision = new Timeline(
							new KeyFrame(Duration.millis(30), event -> collisionDetectionInLevel22(r5, r6,animation1,animation2,animation3,animation5,
							primaryStage2)));
					animationForCollision.setCycleCount(240 / 5);
					animationForCollision.play();
					});

				// Create a scene and place it in the stage
				Scene scene2 = new Scene(pane2, 900, 800);
				scene2.setFill(Color.WHITE);
				primaryStage2.setTitle("Hook"); // Set the stage title
				primaryStage2.setScene(scene2); // Place the scene in the stage
				primaryStage2.show(); // Display the stage
	}

	//LEVEL3
	public void forThreeLevel(Stage primaryStage3){
		Pane pane = new Pane();

		Rectangle r1 = new Rectangle(568, 248, 5, 5);
		r1.setStroke(Color.BLACK);
		r1.setFill(Color.WHITE);
		r1.setVisible(false);
		pane.getChildren().add(r1);

		Rectangle r2 = new Rectangle(588, 248, 5, 5);
		r2.setStroke(Color.BLACK);
		r2.setFill(Color.WHITE);
		r2.setVisible(false);
		pane.getChildren().add(r2);

		Rectangle r3 = new Rectangle(568, 378, 5, 5);
		r3.setStroke(Color.BLACK);
		r3.setFill(Color.WHITE);
		r3.setVisible(false);
		pane.getChildren().add(r3);

		Rectangle r4 = new Rectangle(568, 358, 5, 5);
		r4.setStroke(Color.BLACK);
		r4.setFill(Color.WHITE);
		r4.setVisible(false);
		pane.getChildren().add(r4);

		Circle circle1 = new Circle();
		circle1.setCenterX(300);
		circle1.setCenterY(650);
		circle1.setRadius(20);
		circle1.setStroke(Color.BLACK);
		circle1.setFill(Color.BLACK);
		pane.getChildren().add(circle1); // Add circle to the pane

		Line line11 = new Line(300, 650, 300, 250);
		line11.setFill(Color.BLACK);
		pane.getChildren().add(line11);


		Line line12 = new Line(300, 250, 330, 250);
		line12.setFill(Color.BLACK);
		pane.getChildren().add(line12);

		Line line13 = new Line(330, 240, 330, 260);
		line13.setFill(Color.BLACK);
		line13.setStroke(Color.BLACK);
		line13.setStrokeWidth(5);
		line13.setStrokeLineCap(StrokeLineCap.ROUND);
		pane.getChildren().add(line13);

		Line line14 = new Line(330, 250, 550, 250);
		line14.setFill(Color.BLACK);
		line14.setStroke(Color.BLACK);
		line14.setStrokeWidth(5);
		line14.setStrokeLineCap(StrokeLineCap.ROUND);
		pane.getChildren().add(line14);

		Arc arc11 = new Arc(570,250,20,20,0,180);
		arc11.setFill(null); // Set fill color
		arc11.setStroke(Color.BLACK);
		arc11.setType(ArcType.OPEN); // Set arc type
		arc11.setStrokeWidth(5);
		arc11.setStrokeLineCap(StrokeLineCap.ROUND);
		pane.getChildren().add(arc11); // Add arc to pane

		Line line15 = new Line(590, 250, 700, 250);
		line15.setFill(Color.BLACK);
		line15.setStroke(Color.BLACK);
		line15.setStrokeWidth(5);
		line15.setStrokeLineCap(StrokeLineCap.ROUND);
		pane.getChildren().add(line15);


		circle1.setOnMouseClicked(e -> {

			Timeline animation = new Timeline(new KeyFrame(Duration.millis(30), event -> glineAnimationXX(line15)));// to
			// carry
			// linelast
			animation.setCycleCount(260 / 5); // 240 is distance
			animation.play(); // Start animation


			animation.setOnFinished(ee -> {
				Timeline animationforlastline = new Timeline(
						new KeyFrame(Duration.millis(30), event -> glineAnimationX(line15))); // to
					// remove
					// lastline
				animationforlastline.setCycleCount((int) glineSizeX(line15) / 5);
				animationforlastline.play();

				animationforlastline.setOnFinished(x -> {
					circle1.setVisible(false);
					line11.setVisible(false);
					line12.setVisible(false);
					line13.setVisible(false);
					if(circle1.isVisible()==false){
						forFourLevel(primaryStage3);
					}
				});

			});

			Timeline animation3 = new Timeline(new KeyFrame(Duration.millis(30), event -> glineAnimationX(line14)));
			animation3.setCycleCount((int) glineSizeX(line14) / 5);
			animation3.play(); // start animation

			Timeline animation4 = new Timeline(
					new KeyFrame(Duration.millis(30), event -> glineAnimationToBiggerY(line13)));
			animation4.setCycleCount(5);
			animation4.play(); // Start animation

			Timeline animation5 = new Timeline(
					new KeyFrame(Duration.millis(30), event -> glineAnimationForArcX(arc11, line14)));
			animation5.setCycleCount(glineSizeX(line14)+10 / 5);

			animation5.play(); // Start animation for arc

			Timeline animation6 = new Timeline(new KeyFrame(Duration.millis(30), event -> grectangleTwo(r2)));
			animation6.setCycleCount((glineSizeX(line14)/ 5));
			animation6.play(); // Start animation

			Timeline animationForCollision = new Timeline(new KeyFrame(Duration.millis(30), event -> gcollisionDetection(r1, r2, animation5,animation,animation4,animation3,primaryStage3)));
			animationForCollision.setCycleCount(glineSizeX(line14)/5);
			animationForCollision.play();



		});


		// CIRCLE 1 FINISHED.

		Circle circle2 = new Circle();
		circle2.setCenterX(200);
		circle2.setCenterY(580);
		circle2.setRadius(20);
		circle2.setStroke(Color.BLACK);
		circle2.setFill(Color.BLACK);
		pane.getChildren().add(circle2); // Add circle to the pane



		Line line21 = new Line(200, 580, 400, 580);
		line21.setFill(Color.BLACK);
		pane.getChildren().add(line21);

		Line line22 = new Line(400, 580, 400, 380);
		line22.setFill(Color.BLACK);
		pane.getChildren().add(line22);

		Line line23 = new Line(400, 380, 420, 380);
		line23.setFill(Color.BLACK);
		pane.getChildren().add(line23);

		Line line24 = new Line(420, 370, 420, 390);
		line24.setFill(Color.BLACK);
		line24.setStroke(Color.BLACK);
		line24.setStrokeWidth(5);
		line24.setStrokeLineCap(StrokeLineCap.ROUND);
		pane.getChildren().add(line24);

		Line line25 = new Line(420, 380, 580, 380);
		line25.setFill(Color.BLACK);
		line25.setStroke(Color.BLACK);
		line25.setStrokeWidth(5);
		line25.setStrokeLineCap(StrokeLineCap.ROUND);
		pane.getChildren().add(line25);

		circle2.setOnMouseClicked(e -> {

			Timeline animation7 = new Timeline(new KeyFrame(Duration.millis(30), event -> grectangleTwo(r3)));
			animation7.setCycleCount((glineSizeX(line25) / 5));
			animation7.play(); // Start animation

			Timeline animation = new Timeline(
					new KeyFrame(Duration.millis(30), event -> glineAnimationX(line25)));
			animation.setCycleCount(glineSizeX(line25)/5);
			animation.play();  //Start animation

			Timeline animation2 = new Timeline(
					new KeyFrame(Duration.millis(30), event -> glineAnimationToBiggerY(line24)));
			animation2.setCycleCount(5);
			animation2.play();

			animation.setOnFinished(x -> {
				circle2.setVisible(false);
				line21.setVisible(false);
				line22.setVisible(false);
				line23.setVisible(false);
				line24.setVisible(false);
			});


		});


		// CIRCLE 2 FINISHED.





		Circle circle3 = new Circle();
		circle3.setCenterX(100);
		circle3.setCenterY(510);
		circle3.setRadius(20);
		circle3.setStroke(Color.BLACK);
		circle3.setFill(Color.BLACK);
		pane.getChildren().add(circle3); // Add circle to the pane

		Line line31 = new Line(100, 510, 570, 510);
		line31.setFill(Color.BLACK);
		pane.getChildren().add(line31);

		Line line32 = new Line(570, 510, 570, 490);
		line32.setFill(Color.BLACK);
		pane.getChildren().add(line32);

		Line line33 = new Line(560, 490, 580, 490);
		line33.setFill(Color.BLACK);
		line33.setStroke(Color.BLACK);
		line33.setStrokeWidth(5);
		line33.setStrokeLineCap(StrokeLineCap.ROUND);
		pane.getChildren().add(line33);

		Line line34 = new Line(570, 490, 570, 400);
		line34.setFill(Color.BLACK);
		line34.setStroke(Color.BLACK);
		line34.setStrokeWidth(5);
		line34.setStrokeLineCap(StrokeLineCap.ROUND);
		pane.getChildren().add(line34);

		Arc arc21 = new Arc(570,380,20,20,90,-180);
		arc21.setFill(null); // Set fill color
		arc21.setStroke(Color.BLACK);
		arc21.setType(ArcType.OPEN); // Set arc type
		arc21.setStrokeWidth(5);
		arc21.setStrokeLineCap(StrokeLineCap.ROUND);
		pane.getChildren().add(arc21); // Add arc to pane

		Line line35 = new Line(570, 360, 570, 240);
		line35.setFill(Color.BLACK);
		line35.setStroke(Color.BLACK);
		line35.setStrokeWidth(5);
		line35.setStrokeLineCap(StrokeLineCap.ROUND);
		pane.getChildren().add(line35);



		circle3.setOnMouseClicked(e -> {

			Timeline animation = new Timeline(new KeyFrame(Duration.millis(30), event -> glineAnimationYY(line35)));// to
			animation.setCycleCount(130/ 5); // 210 is distance
			animation.play(); // Start animation
			animation.setOnFinished(ee -> {
				Timeline animationforlastline = new Timeline(
						new KeyFrame(Duration.millis(30), event -> glineAnimationY(line35)));
				animationforlastline.setCycleCount( -glineSizeY(line35) / 5);
				animationforlastline.play();

				animationforlastline.setOnFinished(x -> {
					circle3.setVisible(false);
					line31.setVisible(false);
					line32.setVisible(false);
					line33.setVisible(false);
				});
			});

			Timeline animation3 = new Timeline(new KeyFrame(Duration.millis(30), event -> glineAnimationY(line34)));
			animation3.setCycleCount(-glineSizeY(line34) / 5);
			animation3.play(); // start animation

			Timeline animation4 = new Timeline(
					new KeyFrame(Duration.millis(30), event -> glineAnimationToBiggerX(line33)));
			animation4.setCycleCount(5);
			animation4.play(); // Start animation

			Timeline animation5 = new Timeline(
					new KeyFrame(Duration.millis(30), event -> glineAnimationForArcY(arc21, line34)));
			animation5.setCycleCount(-glineSizeY(line34)-10 / 5);

			animation5.play(); // Start animation for arc

			Timeline animation6 = new Timeline(new KeyFrame(Duration.millis(30), event -> grectangleOne(r4)));
			animation6.setCycleCount((-glineSizeY(line34) / 5));
			animation6.play(); // Start animation

			Timeline animationForCollision = new Timeline(new KeyFrame(Duration.millis(30), event -> gcollisionDetection(r3, r4, animation5,animation,animation4,animation3,primaryStage3)));
			animationForCollision.setCycleCount(-glineSizeY(line34)/5);
			animationForCollision.play();

			Timeline animation7 = new Timeline(new KeyFrame(Duration.millis(30), event -> grectangleOne(r1)));
			animation7.setCycleCount((-glineSizeY(line34) / 5));
			animation7.play(); // Start animation


		});



		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 900, 800);
		scene.setFill(Color.WHITE);
		primaryStage3.setTitle("Hook"); // Set the stage title
		primaryStage3.setScene(scene); // Place the scene in the stage
		primaryStage3.show(); // Display the stage
	}
	public void forFourLevel(Stage primaryStage4){
		Pane pane = new Pane();
		// We created rectangles to understand collision
				Rectangle r1 = new Rectangle(550, 300, 5, 5);
				r1.setStroke(Color.RED);
				r1.setFill(Color.WHITE);
				r1.setVisible(false);
				pane.getChildren().add(r1);

				Rectangle r2 = new Rectangle(570, 300, 5, 5);
				r2.setStroke(Color.RED);
				r2.setFill(Color.WHITE);
				r2.setVisible(false);
				pane.getChildren().add(r2);


				// arc in icindeki buton
				Circle buttonInTheArc = new Circle();
				buttonInTheArc.setCenterX(300);
				buttonInTheArc.setCenterY(500);
				buttonInTheArc.setRadius(20);
				buttonInTheArc.setStroke(Color.WHITE);
				buttonInTheArc.setFill(Color.WHITE);
				pane.getChildren().add(buttonInTheArc); // Add circle to the pane

				// Created Arc42
				Arc Arc42 = new Arc(550, 300, 20, 20, 0, 180);
				Arc42.setFill(null); // Set fill color
				Arc42.setStroke(Color.BLACK);
				Arc42.setType(ArcType.OPEN); // Set arc type
				Arc42.setStrokeWidth(5);
				Arc42.setStrokeLineCap(StrokeLineCap.ROUND);
				pane.getChildren().add(Arc42); // Add arc to pane


		// Created Circle1
		Circle Circle1 = new Circle();
		Circle1.setCenterX(150);
		Circle1.setCenterY(500);
		Circle1.setRadius(20);
		Circle1.setStroke(Color.BLACK);
		Circle1.setFill(Color.BLACK);
		pane.getChildren().add(Circle1); // Add circle to the pane


		// created line41
		Line line41 = new Line(150, 500, 280, 500);
		line41.setFill(Color.BLACK);
		pane.getChildren().add(line41);

		// Created Arc41
		Arc arc1 = new Arc(300, 500, 20, 20, 0, 360);
		arc1.setFill(null); // Set fill color
		arc1.setStroke(Color.BLACK);
		arc1.setType(ArcType.OPEN); // Set arc type
		arc1.setStrokeWidth(5);
		arc1.setStrokeLineCap(StrokeLineCap.ROUND);
		pane.getChildren().add(arc1); // Add arc to pane


		// created line42
		Line line42 = new Line(320, 500, 550, 500);
		line42.setFill(Color.BLACK);
		pane.getChildren().add(line42);


		// created line43
		Line line43 = new Line(550, 500, 550, 480);
		line43.setFill(Color.BLACK);
		pane.getChildren().add(line43);


		// Created Line44
		Line Line44 = new Line(540, 480, 560, 480);
		Line44.setFill(Color.BLACK);
		Line44.setStroke(Color.BLACK);
		Line44.setStrokeWidth(5);
		Line44.setStrokeLineCap(StrokeLineCap.ROUND);
		pane.getChildren().add(Line44);


		// Created Line45
		Line Line45 = new Line(550, 480, 550, 290);
		Line45.setFill(Color.BLACK);
		Line45.setStroke(Color.BLACK);
		Line45.setStrokeWidth(5);
		Line45.setStrokeLineCap(StrokeLineCap.ROUND);
		pane.getChildren().add(Line45);


		// created lineInTheArc
		Line lineInTheArc = new Line(280, 500, 320, 500);
		lineInTheArc.setFill(Color.BLACK);
		lineInTheArc.setStroke(Color.BLACK);
		pane.getChildren().add(lineInTheArc);
		// Created Circle2
		Circle Circle2 = new Circle();
		Circle2.setCenterX(300);
		Circle2.setCenterY(650);
		Circle2.setRadius(20);
		Circle2.setStroke(Color.BLACK);
		Circle2.setFill(Color.BLACK);
		pane.getChildren().add(Circle2); // Add circle to the pane
		// created line47
		Line line47 = new Line(300, 650, 300, 520);
		line47.setFill(Color.BLACK);
		pane.getChildren().add(line47);
		// created line48
		Line line48 = new Line(300, 480, 300, 300);
		line48.setFill(Color.BLACK);
		pane.getChildren().add(line48);
		// created line49
		Line line49 = new Line(300, 300, 320, 300);
		line49.setFill(Color.BLACK);

		pane.getChildren().add(line49);
		// Created Line24
		Line Line24 = new Line(320, 290, 320, 310);
		Line24.setFill(Color.BLACK);
		Line24.setStroke(Color.BLACK);
		Line24.setStrokeWidth(5);
		Line24.setStrokeLineCap(StrokeLineCap.ROUND);
		pane.getChildren().add(Line24);
		// Created Line25
		Line Line25 = new Line(320, 300, 530, 300);
		Line25.setFill(Color.BLACK);
		Line25.setStroke(Color.BLACK);
		Line25.setStrokeWidth(5);
		Line25.setStrokeLineCap(StrokeLineCap.ROUND);
		pane.getChildren().add(Line25);

		// Created Line26
		Line Line26 = new Line(570, 300, 600, 300);
		Line26.setFill(Color.BLACK);
		Line26.setStroke(Color.BLACK);
		Line26.setStrokeWidth(5);
		Line26.setStrokeLineCap(StrokeLineCap.ROUND);
		pane.getChildren().add(Line26);

		buttonInTheArc.setOnMouseClicked(e -> {
			lineInTheArc.setRotate(lineInTheArc.getRotate()+90);
		});

		Circle1.setOnMouseClicked(e ->{
			if(getRotation(lineInTheArc)==0){
				Timeline animation1 = new Timeline(new KeyFrame(Duration.millis(30), event -> lineAnimationToBiggerX(Line44)));
				animation1.setCycleCount(( 5));
				animation1.play(); // Start animation

				Timeline animation2 = new Timeline(new KeyFrame(Duration.millis(30), event -> lineAnimationY(Line45)));
				animation2.setCycleCount((230 / 5));
				animation2.play(); // Start animation

				Timeline animationforRectangle1 = new Timeline(new KeyFrame(Duration.millis(30), event -> rectangleAnimationX(r1)));
				animationforRectangle1.setCycleCount((230 / 5));
				animationforRectangle1.play(); // Start animation
				animation2.setOnFinished(ee -> {
					Line44.setVisible(false);
					Line45.setVisible(false);
					line41.setVisible(false);
					line42.setVisible(false);
					line43.setVisible(false);
					Circle1.setVisible(false);
				});
			}
		});

		Circle2.setOnMouseClicked(e ->{
			if(getRotation(lineInTheArc)==90){
				Timeline animation3 = new Timeline(new KeyFrame(Duration.millis(30), event -> lineAnimationX(Line25)));
				animation3.setCycleCount((210/ 5));
				animation3.play(); // Start animation

				Timeline animation = new Timeline(new KeyFrame(Duration.millis(30), event -> lineAnimationToBiggerY(Line24)));
				animation.setCycleCount(( 5));
				animation.play(); // Start animation

				Timeline animation4 = new Timeline(new KeyFrame(Duration.millis(30), event -> lineAnimationForArcX(Arc42,Line25)));
				animation4.setCycleCount((230 / 5));
				animation4.play(); // Start animation

				Timeline animation5 = new Timeline(new KeyFrame(Duration.millis(30), event -> lineAnimationXX(Line26)));
				animation5.setCycleCount((250/ 5));
				animation5.play(); // Start animation

				animation5.setOnFinished(ee -> {

					Timeline animation6 = new Timeline(new KeyFrame(Duration.millis(30), event -> lineAnimationX(Line26)));
					animation6.setCycleCount((210/ 5));
					animation6.play(); // Start animation

					animation6.setOnFinished(x -> {
						Line25.setVisible(false);
						Line24.setVisible(false);
						Line26.setVisible(false);
						Arc42.setVisible(false);
						line47.setVisible(false);
						line48.setVisible(false);
						line49.setVisible(false);
						buttonInTheArc.setVisible(false);
						lineInTheArc.setVisible(false);
						Circle2.setVisible(false);
						Arc42.setVisible(false);
						arc1.setVisible(false);
						if(Circle2.isVisible()==false ){
							forFiveLevel(primaryStage4);}
					});
				});
				Timeline animationforRectangle2 = new Timeline(new KeyFrame(Duration.millis(30), event -> rectangleAnimationY(r2)));
				animationforRectangle2.setCycleCount((230 / 5));
				animationforRectangle2.play(); // Start animation

				Timeline animationForCollision = new Timeline(
						new KeyFrame(Duration.millis(30), event -> collisionDetectionInLevel4(r1, r2, animation, animation3,
								animation5, primaryStage4)));
				animationForCollision.setCycleCount(240 / 5);
				animationForCollision.play();
			}
		});
		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 900, 800);
		scene.setFill(Color.WHITE);
		primaryStage4.setTitle("Hook"); // Set the stage title
		primaryStage4.setScene(scene); // Place the scene in the stage
		primaryStage4.show(); // Display the stage
	}




	public void forFiveLevel(Stage primaryStage5){
		Pane pane = new Pane();

		Rectangle r1 = new Rectangle(395, 280, 8, 8);
		r1.setStroke(Color.BLACK);
		r1.setFill(Color.WHITE);
		r1.setVisible(false);
		pane.getChildren().add(r1);

		Rectangle r2 = new Rectangle(396, 260, 6, 6);
		r2.setStroke(Color.BLACK);
		r2.setFill(Color.WHITE);
		r2.setVisible(false);
		pane.getChildren().add(r2);

		Rectangle r3 = new Rectangle(400, 225, 6, 6);
		r3.setStroke(Color.BLACK);
		r3.setFill(Color.WHITE);
		r3.setVisible(false);
		pane.getChildren().add(r3);

		Rectangle r4 = new Rectangle(420, 230, 6, 6);
		r4.setStroke(Color.BLACK);
		r4.setFill(Color.WHITE);
		r4.setVisible(false);
		pane.getChildren().add(r4);

		Rectangle r5 = new Rectangle(548, 230, 6, 6);
		r5.setStroke(Color.BLACK);
		r5.setFill(Color.WHITE);
		r5.setVisible(false);
		pane.getChildren().add(r5);

		Rectangle r6 = new Rectangle(550, 210, 6, 6);
		r6.setStroke(Color.BLACK);
		r6.setFill(Color.WHITE);
		r6.setVisible(false);
		pane.getChildren().add(r6);

		Circle circle1 = new Circle();
		circle1.setCenterX(150);
		circle1.setCenterY(400);
		circle1.setRadius(20);
		circle1.setStroke(Color.BLACK);
		circle1.setFill(Color.BLACK);
		pane.getChildren().add(circle1); // Add circle to the pane

		Line line11 = new Line(150, 400, 280, 400);
		line11.setFill(Color.BLACK);
		pane.getChildren().add(line11);

		Circle circleButon1 = new Circle();
		circleButon1 .setCenterX(300);
		circleButon1 .setCenterY(400);
		circleButon1 .setRadius(20);
		circleButon1 .setStroke(Color.WHITE);
		circleButon1 .setFill(Color.WHITE);
		circleButon1.setVisible(true);
		pane.getChildren().add(circleButon1); // Add circle to the pane


		Arc arc11 = new Arc(300,400,20,20,0,360);
		arc11.setFill(null); // Set fill color
		arc11.setStroke(Color.BLACK);
		arc11.setType(ArcType.OPEN); // Set arc type
		arc11.setStrokeWidth(5);
		arc11.setStrokeLineCap(StrokeLineCap.ROUND);
		pane.getChildren().add(arc11); // Add arc to pane

		Line circleLine1 = new Line(280, 400, 320, 400);
		circleLine1.setFill(Color.BLACK);
		pane.getChildren().add(circleLine1);

		Line line12 = new Line(320, 400, 400, 400);
		line12.setFill(Color.BLACK);
		pane.getChildren().add(line12);

		Line line13 = new Line(400, 400, 400, 380);
		line13.setFill(Color.BLACK);
		pane.getChildren().add(line13);

		Line line14 = new Line(390, 380, 410, 380);
		line14.setFill(Color.BLACK);
		line14.setStroke(Color.BLACK);
		line14.setStrokeWidth(5);
		line14.setStrokeLineCap(StrokeLineCap.ROUND);
		pane.getChildren().add(line14);

		Line line15 = new Line(400, 380, 400, 300);
		line15.setFill(Color.BLACK);
		line15.setStroke(Color.BLACK);
		line15.setStrokeWidth(5);
		line15.setStrokeLineCap(StrokeLineCap.ROUND);
		pane.getChildren().add(line15);

		Arc arc12 = new Arc(400,280,20,20,90,180);
		arc12.setFill(null); // Set fill color
		arc12.setStroke(Color.BLACK);
		arc12.setType(ArcType.OPEN); // Set arc type
		arc12.setStrokeWidth(5);
		arc12.setStrokeLineCap(StrokeLineCap.ROUND);
		pane.getChildren().add(arc12); // Add arc to pane

		Line line16 = new Line(400, 260, 400, 220);
		line16.setFill(Color.BLACK);
		line16.setStroke(Color.BLACK);
		line16.setStrokeWidth(5);
		line16.setStrokeLineCap(StrokeLineCap.ROUND);
		pane.getChildren().add(line16);



		//CIRCLE 1 FINISHED

		Circle circle2 = new Circle();
		circle2.setCenterX(150);
		circle2.setCenterY(500);
		circle2.setRadius(20);
		circle2.setStroke(Color.BLACK);
		circle2.setFill(Color.BLACK);
		pane.getChildren().add(circle2); // Add circle to the pane

		Line line21 = new Line(150, 500, 280, 500);
		line21.setFill(Color.BLACK);
		pane.getChildren().add(line21);

		Circle circleButon2 = new Circle();
		circleButon2 .setCenterX(300);
		circleButon2 .setCenterY(500);
		circleButon2 .setRadius(20);
		circleButon2 .setStroke(Color.WHITE);
		circleButon2 .setFill(Color.WHITE);
		circleButon2.setVisible(true);
		pane.getChildren().add(circleButon2); // Add circle to the pane

		Arc arc21 = new Arc(300,500,20,20,0,360);
		arc21.setFill(null); // Set fill color
		arc21.setStroke(Color.BLACK);
		arc21.setType(ArcType.OPEN); // Set arc type
		arc21.setStrokeWidth(5);
		arc21.setStrokeLineCap(StrokeLineCap.ROUND);
		pane.getChildren().add(arc21); // Add arc to pane

		Line circleLine2 = new Line(280, 500, 320, 500);
		circleLine2.setFill(Color.BLACK);
		pane.getChildren().add(circleLine2);


		Line line22 = new Line(320, 500, 550, 500);
		line22.setFill(Color.BLACK);
		pane.getChildren().add(line22);

		Line line23 = new Line(550, 500, 550, 480);
		line23.setFill(Color.BLACK);
		pane.getChildren().add(line23);

		Line line24 = new Line(540, 480, 560, 480);
		line24.setFill(Color.BLACK);
		line24.setStroke(Color.BLACK);
		line24.setStrokeWidth(5);
		line24.setStrokeLineCap(StrokeLineCap.ROUND);
		pane.getChildren().add(line24);

		Line line25 = new Line(550, 480, 550, 250);
		line25.setFill(Color.BLACK);
		line25.setStroke(Color.BLACK);
		line25.setStrokeWidth(5);
		line25.setStrokeLineCap(StrokeLineCap.ROUND);
		pane.getChildren().add(line25);

		Arc arc22 = new Arc(550,230,20,20,90,-180);
		arc22.setFill(null); // Set fill color
		arc22.setStroke(Color.BLACK);
		arc22.setType(ArcType.OPEN); // Set arc type
		arc22.setStrokeWidth(5);
		arc22.setStrokeLineCap(StrokeLineCap.ROUND);
		pane.getChildren().add(arc22); // Add arc to pane

		Line line26 = new Line(550, 210, 550, 190);
		line26.setFill(Color.BLACK);
		line26.setStroke(Color.BLACK);
		line26.setStrokeWidth(5);
		line26.setStrokeLineCap(StrokeLineCap.ROUND);
		pane.getChildren().add(line26);


		//CIRCLE 2 FINISHED

		Circle circle3 = new Circle();
		circle3.setCenterX(300);
		circle3.setCenterY(600);
		circle3.setRadius(20);
		circle3.setStroke(Color.BLACK);
		circle3.setFill(Color.BLACK);
		pane.getChildren().add(circle3); // Add circle to the pane

		Line line31 = new Line(300, 600, 300, 520);
		line31.setFill(Color.BLACK);
		pane.getChildren().add(line31);

		Line line32 = new Line(300, 480, 300, 420);
		line32.setFill(Color.BLACK);
		pane.getChildren().add(line32);

		Line line33 = new Line(300, 380, 300, 230);
		line33.setFill(Color.BLACK);
		pane.getChildren().add(line33);

		Line line34 = new Line(300, 230, 320, 230);
		line34.setFill(Color.BLACK);
		pane.getChildren().add(line34);

		Line line35 = new Line(320, 220, 320, 240);
		line35.setFill(Color.BLACK);
		line35.setStroke(Color.BLACK);
		line35.setStrokeWidth(5);
		line35.setStrokeLineCap(StrokeLineCap.ROUND);
		pane.getChildren().add(line35);

		Line line36 = new Line(320, 230, 380, 230);
		line36.setFill(Color.BLACK);
		line36.setStroke(Color.BLACK);
		line36.setStrokeWidth(5);
		line36.setStrokeLineCap(StrokeLineCap.ROUND);
		pane.getChildren().add(line36);

		Arc arc31 = new Arc(400,230,20,20,0,180);
		arc31.setFill(null); // Set fill color
		arc31.setStroke(Color.BLACK);
		arc31.setType(ArcType.OPEN); // Set arc type
		arc31.setStrokeWidth(5);
		arc31.setStrokeLineCap(StrokeLineCap.ROUND);
		pane.getChildren().add(arc31); // Add arc to pane

		Line line37 = new Line(420, 230, 560, 230);
		line37.setFill(Color.BLACK);
		line37.setStroke(Color.BLACK);
		line37.setStrokeWidth(5);
		line37.setStrokeLineCap(StrokeLineCap.ROUND);
		pane.getChildren().add(line37);

		//CIRCLE 3 FINISHED

		Circle circle4 = new Circle();
		circle4.setCenterX(500);
		circle4.setCenterY(600);
		circle4.setRadius(20);
		circle4.setStroke(Color.BLACK);
		circle4.setFill(Color.BLACK);
		pane.getChildren().add(circle4); // Add circle to the pane

		Line line41 = new Line(500, 600, 500, 280);
		line41.setFill(Color.BLACK);
		pane.getChildren().add(line41);

		Line line42 = new Line(500, 280, 480, 280);
		line42.setFill(Color.BLACK);
		pane.getChildren().add(line42);

		Line line43 = new Line(480, 270, 480, 290);
		line43.setFill(Color.BLACK);
		line43.setStroke(Color.BLACK);
		line43.setStrokeWidth(5);
		line43.setStrokeLineCap(StrokeLineCap.ROUND);
		pane.getChildren().add(line43);

		Line line44 = new Line(480, 280, 390, 280);
		line44.setFill(Color.BLACK);
		line44.setStroke(Color.BLACK);
		line44.setStrokeWidth(5);
		line44.setStrokeLineCap(StrokeLineCap.ROUND);
		pane.getChildren().add(line44);


		circleButon1.setOnMouseClicked(e -> {
			circleLine1.setRotate(circleLine1.getRotate() + 90);
			System.out.println("Debug" + circleLine1.getRotate());

		});

		circleButon2.setOnMouseClicked(e -> {
			circleLine2.setRotate(circleLine2.getRotate() + 90);
			System.out.println("Debug" + circleLine2.getRotate());

		});


		circle1.setOnMouseClicked(e -> {
			if(ggetRotation(circleLine1) == 0){

				Timeline animation = new Timeline(new KeyFrame(Duration.millis(30), event -> glineAnimationYY(line16)));// to
				animation.setCycleCount(118/ 5); // 210 is distance
				animation.play(); // Start animation
				animation.setOnFinished(ee -> {
					Timeline animationforlastline = new Timeline(
							new KeyFrame(Duration.millis(30), event -> glineAnimationY(line16)));
					animationforlastline.setCycleCount( -glineSizeY(line16) / 5);
					animationforlastline.play();
					animationforlastline.setOnFinished(x -> {
						circle1.setVisible(false);
						line11.setVisible(false);
						line12.setVisible(false);
						line13.setVisible(false);
						line14.setVisible(false);
					});
				});

				Timeline animation3 = new Timeline(new KeyFrame(Duration.millis(30), event -> glineAnimationY(line15)));
				animation3.setCycleCount(-glineSizeY(line15) / 5);
				animation3.play(); // start animation

				Timeline animation4 = new Timeline(
						new KeyFrame(Duration.millis(30), event -> glineAnimationToBiggerX(line14)));
				animation4.setCycleCount(5);
				animation4.play(); // Start animation

				Timeline animation5 = new Timeline(
						new KeyFrame(Duration.millis(30), event -> glineAnimationForArcYR(arc12, line15)));
				animation5.setCycleCount(-glineSizeY(line15)-10 / 5);

				animation5.play(); // Start animation for arc

				Timeline animation6 = new Timeline(new KeyFrame(Duration.millis(30), event -> grectangleOne(r2)));
				animation6.setCycleCount((-glineSizeY(line15) / 5));
				animation6.play(); // Start animation

				Timeline animationForCollision = new Timeline(new KeyFrame(Duration.millis(30), event -> gcollisionDetectionLevel5(r1, r2, animation5,animation,animation4,animation3,primaryStage5)));
				animationForCollision.setCycleCount(200/5);
				animationForCollision.play();

				Timeline animation7 = new Timeline(new KeyFrame(Duration.millis(30), event -> grectangleOne(r3)));
				animation7.setCycleCount((-glineSizeY(line15) / 5));
				animation7.play(); // Start animation
			}

		});


		circle2.setOnMouseClicked(e -> {
			if(ggetRotation(circleLine2) == 0){

				Timeline animation = new Timeline(new KeyFrame(Duration.millis(30), event -> glineAnimationYY(line26)));// to
				animation.setCycleCount(270/ 5); // 210 is distance
				animation.play(); // Start animation
				animation.setOnFinished(ee -> {
					Timeline animationforlastline = new Timeline(
							new KeyFrame(Duration.millis(30), event -> glineAnimationY(line26)));
					animationforlastline.setCycleCount( -glineSizeY(line26) / 5);
					animationforlastline.play();

					animationforlastline.setOnFinished(x -> {
						circle2.setVisible(false);
						line21.setVisible(false);
						line22.setVisible(false);
						line23.setVisible(false);
						line24.setVisible(false);
						circleLine2.setVisible(false);
						arc21.setVisible(false);

						Text hook = new Text(170, 350, "VICTORY!");
						hook.setFont(new Font(130));
						hook.setFill(Color.BLACK);
						pane.getChildren().add(hook);
					});
				});

				Timeline animation3 = new Timeline(new KeyFrame(Duration.millis(30), event -> glineAnimationY(line25)));
				animation3.setCycleCount(-glineSizeY(line25) / 5);
				animation3.play(); // start animation

				Timeline animation4 = new Timeline(
						new KeyFrame(Duration.millis(30), event -> glineAnimationToBiggerX(line24)));
				animation4.setCycleCount(5);
				animation4.play(); // Start animation

				Timeline animation5 = new Timeline(
						new KeyFrame(Duration.millis(30), event -> glineAnimationForArcY(arc22, line25)));
				animation5.setCycleCount(-glineSizeY(line25)-10 / 5);

				animation5.play(); // Start animation for arc

				Timeline animation6 = new Timeline(new KeyFrame(Duration.millis(30), event -> grectangleOne(r6)));
				animation6.setCycleCount((-glineSizeY(line25) / 5));
				animation6.play(); // Start animation

				Timeline animationForCollision = new Timeline(new KeyFrame(Duration.millis(30), event -> gcollisionDetectionLevel5(r5, r6, animation5,animation,animation4,animation3,primaryStage5)));
				animationForCollision.setCycleCount(200/5);
				animationForCollision.play();


			}

		});


		circle3.setOnMouseClicked(e -> {
			if(ggetRotation(circleLine1) != 0 && ggetRotation(circleLine2) != 0 ){

				Timeline animation = new Timeline(new KeyFrame(Duration.millis(30), event -> glineAnimationXX(line37)));// to
				// carry
				// linelast
				animation.setCycleCount(100 / 5); // 240 is distance
				animation.play(); // Start animation


				animation.setOnFinished(ee -> {
					Timeline animationforlastline = new Timeline(
							new KeyFrame(Duration.millis(30), event -> glineAnimationX(line37))); // to
						// remove
						// lastline
					animationforlastline.setCycleCount((int) glineSizeX(line37) / 5);
					animationforlastline.play();

					animationforlastline.setOnFinished(x -> {
						circle3.setVisible(false);
						line31.setVisible(false);
						line32.setVisible(false);
						line33.setVisible(false);
						line34.setVisible(false);
						line35.setVisible(false);
						circleLine1.setVisible(false);
						arc11.setVisible(false);
					});

				});

				Timeline animation3 = new Timeline(new KeyFrame(Duration.millis(30), event -> glineAnimationX(line36)));
				animation3.setCycleCount((int) glineSizeX(line36) / 5);
				animation3.play(); // start animation

				Timeline animation4 = new Timeline(
						new KeyFrame(Duration.millis(30), event -> glineAnimationToBiggerY(line35)));
				animation4.setCycleCount(5);
				animation4.play(); // Start animation

				Timeline animation5 = new Timeline(
						new KeyFrame(Duration.millis(30), event -> glineAnimationForArcX(arc31, line36)));
				animation5.setCycleCount(glineSizeX(line36)+10 / 5);

				animation5.play(); // Start animation for arc

				Timeline animation6 = new Timeline(new KeyFrame(Duration.millis(30), event -> grectangleTwo(r4)));
				animation6.setCycleCount((glineSizeX(line36)/ 5));
				animation6.play(); // Start animation

				Timeline animationForCollision = new Timeline(new KeyFrame(Duration.millis(30), event -> gcollisionDetectionLevel5(r3, r4, animation5,animation,animation4,animation3,primaryStage5)));
				animationForCollision.setCycleCount(glineSizeX(line36)/5);
				animationForCollision.play();

				Timeline animation7 = new Timeline(new KeyFrame(Duration.millis(30), event -> grectangleTwo(r5)));
				animation7.setCycleCount((glineSizeX(line37) / 5));
				animation7.play(); // Start animation
			}

		});


		circle4.setOnMouseClicked(e -> {

			Timeline animation7 = new Timeline(new KeyFrame(Duration.millis(30), event -> grectangleTwoR(r1)));
			animation7.setCycleCount((-glineSizeX(line44) / 5));
			animation7.play(); // Start animation

			Timeline animation = new Timeline(
					new KeyFrame(Duration.millis(30), event -> glineAnimationXR(line44)));
			animation.setCycleCount(-glineSizeX(line44)/5);
			animation.play();  //Start animation

			Timeline animation2 = new Timeline(
					new KeyFrame(Duration.millis(30), event -> glineAnimationToBiggerY(line43)));
			animation2.setCycleCount(5);
			animation2.play();

			animation.setOnFinished(x -> {
				circle4.setVisible(false);
				line41.setVisible(false);
				line42.setVisible(false);
				line43.setVisible(false);
			});

		});











		//CIRCLE 4 FINISHED

		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 900, 800);
		scene.setFill(Color.WHITE);
		primaryStage5.setTitle("Hook"); // Set the stage title
		primaryStage5.setScene(scene); // Place the scene in the stage
		primaryStage5.show(); // Display the stage

	}


	/* GOKSEL'S METHODS
	 * GOKSEL'S METHODS
	 * GOKSEL'S METHODS
	 * GOKSEL'S METHODS
	 * GOKSEL'S METHODS
	 * GOKSEL'S METHODS
	 * GOKSEL'S METHODS
	 * */

	//Line Rotation scanner.
	public int ggetRotation(Line circleLine){
		return (int)circleLine.getRotate() % 180;
	}


	// in order to small
	public void glineAnimationX(Line line) {
		line.setEndX(line.getEndX() - 5);

		if (line.getStartX() == line.getEndX())
			line.setVisible(false);
	}

	public void glineAnimationXR(Line line) {
		line.setEndX(line.getEndX() + 5);

		if (line.getStartX() == line.getEndX())
			line.setVisible(false);
	}

	// For vertical line animation in level1
	public void glineAnimationY(Line line) {

		line.setEndY(line.getEndY() + 5);

		if (line.getStartY() == line.getEndY())
			line.setVisible(false);

	}

	// To calculate the length of line on X axis
	public int glineSizeX(Line line) {
		int size = (int) (line.getEndX() - line.getStartX());
		return size;
	}

	// To calculate the length of line on Y axis
	public int glineSizeY(Line line) {
		int size1 = (int) (line.getEndY() - line.getStartY());
		return size1;
	}

	//
	public void glineAnimationToBiggerX(Line line) {
		line.setEndX(line.getEndX() + 5);
		line.setStartX(line.getStartX() - 5);

		if (line.getStartX() == line.getEndX())
			line.setVisible(false);
	}

	public void glineAnimationToBiggerY(Line line) {
		line.setEndY(line.getEndY() + 5);
		line.setStartY(line.getStartY() - 5);

		if (line.getStartY() == line.getEndY())
			line.setVisible(false);
	}

	public void glineAnimationForArcX(Arc arc, Line line) {
		arc.setCenterX(arc.getCenterX() - 5);
		if (line.isVisible() == false) {
			arc.setLength(arc.getLength() - 36);
			if (arc.getLength() == 0) {
				arc.setVisible(false);
			}
		}
	}

	public void glineAnimationForArcY(Arc arc, Line line) {
		arc.setCenterY(arc.getCenterY() + 5);
		if (line.isVisible() == false) {
			arc.setLength(arc.getLength() + 36);
			if (arc.getLength() == 0) {
				arc.setVisible(false);
			}
		}
	}

	public void glineAnimationForArcYR(Arc arc, Line line) {
		arc.setCenterY(arc.getCenterY() + 5);
		if (line.isVisible() == false) {
			arc.setLength(arc.getLength() - 36);
			if (arc.getLength() == 0) {
				arc.setVisible(false);
			}
		}
	}
	public void glineAnimationXX(Line line) {
		line.setEndX(line.getEndX() - 5);
		line.setStartX(line.getStartX() - 5);
	}

	public void glineAnimationYY(Line line) {
		line.setEndY(line.getEndY() + 5);
		line.setStartY(line.getStartY() + 5);
	}

	public static void main(String[] args) {
		launch(args);
	}

	public void grectangleOne(Rectangle r) {
		r.setLayoutY(r.getLayoutY() +5);
	}

	public void grectangleOneN(Rectangle r) {
		r.setLayoutY(r.getLayoutY() -5);
	}

	public void grectangleTwo(Rectangle r) {
		r.setLayoutX(r.getLayoutX() - 5);
	}

	public void grectangleTwoR(Rectangle r) {
		r.setLayoutX(r.getLayoutX() + 5);
	}

	public void grectangleTwoN(Rectangle r) {
		r.setLayoutY(r.getLayoutY() +5);
	}

	public void gcollisionDetection(Rectangle r, Rectangle rr,Animation a1,Animation a2,Animation a3,Animation a4, Stage s) {
		boolean collision=false;
		if (r.getBoundsInParent().intersects(rr.getBoundsInParent())) {
			collision=true;
		}
		if(collision==true){
			a1.stop();
			a2.stop();
			a3.stop();
			a4.stop();

			try {
				Thread.sleep(1000); // wait 1000 millis when the collision takes place
				forThreeLevel(s);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	public void gcollisionDetectionLevel5(Rectangle r, Rectangle rr,Animation a1,Animation a2,Animation a3,Animation a4 , Stage s) {
		boolean collision=false;
		if (r.getBoundsInParent().intersects(rr.getBoundsInParent())) {
			collision=true;

		}
		if(collision==true){
			a1.stop();
			a2.stop();
			a3.stop();
			a4.stop();

			try {
				Thread.sleep(1000); // wait 1000 millis when the collision takes place
				forFiveLevel(s);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


		}



	}

	/* MIKAIL'S METHODS
	 * MIKAIL'S METHODS
	 * MIKAIL'S METHODS
	 * MIKAIL'S METHODS
	 * MIKAIL'S METHODS
	 * MIKAIL'S METHODS
	 * MIKAIL'S METHODS
	 * MIKAIL'S METHODS
	 * */

	public int getRotation(Line lineInArc){
		return (int)lineInArc.getRotate()%180;
	}

	// in order to small
		public void lineAnimationX(Line line) {

			if(line.getStartX()>line.getEndX()){
				line.setEndX(line.getEndX() + 5);
			}
			else{
			line.setEndX(line.getEndX() - 5);}

			if (line.getStartX() == line.getEndX()){
				line.setVisible(false);}


		}

		// For vertical line animation in level1
		public void lineAnimationY(Line line) {

			line.setEndY(line.getEndY() + 5);

			if (line.getStartY() == line.getEndY())
				line.setVisible(false);

		}

		// To calculate the length of line on X axis
		public int lineSizeX(Line line) {
			int size = (int) (line.getEndX() - line.getStartX());
			return size;
		}

		// To calculate the length of line on Y axis
		public int lineSizeY(Line line) {
			int size1 = (int) (line.getEndY() - line.getStartY());
			return size1;
		}

		//This for small line
		public void lineAnimationToBiggerX(Line line) {
			line.setEndX(line.getEndX() + 5);
			line.setStartX(line.getStartX() - 5);

			if (line.getStartX() == line.getEndX())
				line.setVisible(false);
		}
		//This for small line
		public void lineAnimationToBiggerY(Line line) {
			line.setEndY(line.getEndY() + 5);
			line.setStartY(line.getStartY() - 5);

			if (line.getStartY() == line.getEndY())
				line.setVisible(false);
		}

		public void lineAnimationForArcX(Arc arc, Line line) {

			if(line.getStartX()>line.getEndX())
				arc.setCenterX(arc.getCenterX()+5);
			else{
			arc.setCenterX(arc.getCenterX() - 5);}
			if (line.isVisible() == false) {
				arc.setLength(arc.getLength() - 36);
				if (arc.getLength() == 0) {
					arc.setVisible(false);
				}
			}
		}
		public void lineAnimationForArcXinlevel2(Arc arc, Line line) {

			if(line.getStartX()>line.getEndX())
				arc.setCenterX(arc.getCenterX()+5);

			if (line.isVisible() == false) {
				arc.setLength(arc.getLength() + 36);
				if (arc.getLength() == 0) {
					arc.setVisible(false);
				}
			}
		}

		public void lineAnimationForArcY(Arc arc, Line line) {
			arc.setCenterY(arc.getCenterY() + 5);
			if (line.isVisible() == false) {
				arc.setLength(arc.getLength() - 36);
				if (arc.getLength() == 0) {
					arc.setVisible(false);
				}
			}
		}
		public void lineAnimationForArcYinlevel2(Arc arc, Line line) {
			arc.setCenterY(arc.getCenterY() + 5);
			if (line.isVisible() == false) {
				arc.setLength(arc.getLength() + 36);
				if (arc.getLength() == 0) {
					arc.setVisible(false);
				}
			}
		}


		public void lineAnimationXX(Line line) {// to carry a line on x axis

			if(line.getStartX()>line.getEndX()){
			line.setEndX(line.getEndX() + 5);
			line.setStartX(line.getStartX() + 5);
			}
			else{
			line.setEndX(line.getEndX() - 5);
			line.setStartX(line.getStartX() - 5);
			}
		}

		public void lineAnimationYY(Line line) {// to carry a line on y axis
			line.setEndY(line.getEndY() + 5);
			line.setStartY(line.getStartY() + 5);

		}

		public void rectangleAnimationX(Rectangle r) {
			r.setLayoutY(r.getLayoutY() + 5);

		}

		public void rectangleAnimationY(Rectangle r) {

			if(r.getHeight()==4){
			r.setLayoutX(r.getLayoutX() + 5);
			}else{
			r.setLayoutX(r.getLayoutX() - 5);
			}
		}

		public void collisionDetectionInLevel1(Rectangle r, Rectangle rr, Animation a1, Animation a2, Animation a3,
				Animation a4,Stage s) {
			boolean collision = false;
			if (r.getBoundsInParent().intersects(rr.getBoundsInParent())) {
				collision = true;

			}
			if (collision == true) {
				a1.stop();
				a2.stop();
				a3.stop();
				a4.stop();

				try {
					Thread.sleep(1000);
					forOneLevel(s);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		public void collisionDetectionInLevel2(Rectangle r1, Rectangle r2,Rectangle r3,Rectangle r4,
				Animation a1, Animation a2,Animation a3, Animation a4,Animation a5,Animation a6,Animation a7,Animation a8,Stage s){

			boolean collision = false;
			if (r1.getBoundsInParent().intersects(r2.getBoundsInParent()) ||
					r3.getBoundsInParent().intersects(r4.getBoundsInParent()) ) {
				collision = true;

			}
			if(collision==true){
				a1.stop();
				a2.stop();
				a3.stop();
				a4.stop();
				a5.stop();
				a6.stop();
				a7.stop();
				a8.stop();

				try {
					forTwoLevel(s);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		public void collisionDetectionInLevel22(Rectangle r1, Rectangle r2,
				Animation a1, Animation a2,Animation a3, Animation a4,Stage s){

			boolean collision = false;
			if (r1.getBoundsInParent().intersects(r2.getBoundsInParent())) {
				collision = true;
			}
			if (collision == true) {
				a1.stop();
				a2.stop();
				a3.stop();
				a4.stop();

				try {
					Thread.sleep(1000);
					forTwoLevel(s);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		public void collisionDetectionInLevel4(Rectangle r1, Rectangle r2,
				Animation a1, Animation a2,Animation a3,Stage s){

			boolean collision = false;
			if (r1.getBoundsInParent().intersects(r2.getBoundsInParent())) {
				collision = true;

			}
			if(collision==true){
				a1.stop();
				a2.stop();
				a3.stop();

				try {
					Thread.sleep(1000);
					forFourLevel(s);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}




}
