
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.ScatterChart;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class graficaciont1 extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("Proyecto Graficación");
        final NumberAxis xAxis = new NumberAxis(0, 3, 1);
        final NumberAxis yAxis = new NumberAxis(0, 3, 1);
        final ScatterChart<Number, Number> sc = new ScatterChart<Number, Number>(xAxis, yAxis);
        xAxis.setLabel("EJE X");
        yAxis.setLabel("EJE Y");
        sc.setTitle("Formar la letra K");
        XYChart.Series series1 = new XYChart.Series();
        series1.setName("Círculos");
        series1.getData().add(new XYChart.Data(0.1, 0.1));
        series1.getData().add(new XYChart.Data(0.1, 1.5));
        series1.getData().add(new XYChart.Data(0.1, 2.9));
        XYChart.Series series2 = new XYChart.Series();
        series2.setName("Cuadrados");
        series2.getData().add(new XYChart.Data(2.9, 2.9));
        series2.getData().add(new XYChart.Data(0.9, 1.5));
        series2.getData().add(new XYChart.Data(2.9, 0.1));
        series2.getData().add(new XYChart.Data(2.0, 2.2));
        series2.getData().add(new XYChart.Data(2.0, 1.0));
        sc.getData().addAll(series1, series2);
        Scene scene = new Scene(sc, 600, 600);
        stage.setScene(scene);
        stage.show();
    }
}
