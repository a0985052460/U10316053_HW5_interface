//U10316053 程柏綸
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
public class Game_bean_machine extends Application{
	@Override
	public void start(Stage primaryStage){
		Pane pane=new Pane();
		/*
		for(int i=1;i<=7;i++){
			for(int k=0;k<i;k+=2){
				Ellipse e1=new Ellipse(k*20,i*40,5,5);//x位置,y位置,x大小,y大小
				pane.getChildren().add(e1);
			}
			for(int g=1;g<i;g+=2){
				Ellipse e1=new Ellipse(g*20,(i*40)-20,5,5);
				pane.getChildren().add(e1);
			}
		}
		*/
		pane.getChildren().add(new Ellipse(280,40,5,5));
		
		pane.getChildren().add(new Ellipse(260,60,5,5));
		pane.getChildren().add(new Ellipse(300,60,5,5));
		
		pane.getChildren().add(new Ellipse(240,80,5,5));
		pane.getChildren().add(new Ellipse(280,80,5,5));
		pane.getChildren().add(new Ellipse(320,80,5,5));
		
		pane.getChildren().add(new Ellipse(220,100,5,5));
		pane.getChildren().add(new Ellipse(260,100,5,5));
		pane.getChildren().add(new Ellipse(300,100,5,5));
		pane.getChildren().add(new Ellipse(340,100,5,5));
		
		pane.getChildren().add(new Ellipse(200,120,5,5));
		pane.getChildren().add(new Ellipse(240,120,5,5));
		pane.getChildren().add(new Ellipse(280,120,5,5));
		pane.getChildren().add(new Ellipse(320,120,5,5));
		pane.getChildren().add(new Ellipse(360,120,5,5));
		
		pane.getChildren().add(new Ellipse(180,140,5,5));
		pane.getChildren().add(new Ellipse(220,140,5,5));
		pane.getChildren().add(new Ellipse(260,140,5,5));
		pane.getChildren().add(new Ellipse(300,140,5,5));
		pane.getChildren().add(new Ellipse(340,140,5,5));
		pane.getChildren().add(new Ellipse(380,140,5,5));
		
		pane.getChildren().add(new Ellipse(160,160,5,5));
		pane.getChildren().add(new Ellipse(200,160,5,5));
		pane.getChildren().add(new Ellipse(240,160,5,5));
		pane.getChildren().add(new Ellipse(280,160,5,5));
		pane.getChildren().add(new Ellipse(320,160,5,5));
		pane.getChildren().add(new Ellipse(360,160,5,5));
		pane.getChildren().add(new Ellipse(400,160,5,5));
		
		pane.getChildren().add(new Line(300,20,475,200));
		pane.getChildren().add(new Line(260,20,75,200));
		
		pane.getChildren().add(new Line(475,200,475,250));
		pane.getChildren().add(new Line(75,200,75,250));
		
		pane.getChildren().add(new Line(75,250,475,250));
		
		pane.getChildren().add(new Line(160,160,160,250));
		pane.getChildren().add(new Line(200,160,200,250));
		pane.getChildren().add(new Line(240,160,240,250));
		pane.getChildren().add(new Line(280,160,280,250));
		pane.getChildren().add(new Line(320,160,320,250));
		pane.getChildren().add(new Line(360,160,360,250));
		pane.getChildren().add(new Line(400,160,400,250));
		
		pane.getChildren().add(new Line(300,0,300,20));
		pane.getChildren().add(new Line(260,0,260,20));
		
		
		
		
		
		//for(int i=40;i<=160;i+=20){
			//pane.getChildren().add(new Ellipse(260,i,5,5));
		//}
		
		//Scene scene=new Scene(new LinePane(),600,600);
		Scene scene1=new Scene(pane,600,400);
		primaryStage.setTitle("U10316053 Bean game 程柏綸");
		//primaryStage.setScene(scene);
		primaryStage.show();
		primaryStage.setScene(scene1);
		primaryStage.show();
		
	}
}
/*
class LinePane extends Pane{
	public LinePane(){
		Line line1=new Line(10,10,10,10);
		line1.endXProperty().bind(widthProperty().subtract(10));
		line1.endYProperty().bind(heightProperty().subtract(10));
		line1.setStrokeWidth(5);
		line1.setStroke(Color.GREEN);
		getChildren().add(line1);
	}
}
*/