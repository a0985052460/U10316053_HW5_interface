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
		Scene scene=new Scene(new LinePane(),300,200);
		Scene scene1=new Scene(pane,300,200);
		primaryStage.setTitle("Show");
		primaryStage.setScene(scene);
		primaryStage.show();
		primaryStage.setScene(scene1);
		primaryStage.show();
		
	}
}
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