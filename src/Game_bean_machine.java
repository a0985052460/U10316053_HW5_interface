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
		
		//for(int i=0;i<5;i++){
			Ellipse e1=new Ellipse(50,50,5,5);//x位置,y位置,x大小,y大小
			//e1.setRotate(i*180/16);
			e1.setRotate(1*180/16);
			pane.getChildren().add(e1);
		//}
		
		Scene scene=new Scene(pane,300,200);
		primaryStage.setTitle("Show");
		primaryStage.setScene(scene);
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