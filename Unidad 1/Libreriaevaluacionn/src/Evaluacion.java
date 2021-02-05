import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;

public class Evaluacion {
    double[] trucha;
    double[] carpa;


    public Evaluacion(double[] trucha, double[] carpa) {
        this.trucha = trucha;
        this.carpa = carpa;
    }
    public double[] procesartrucha() {
        double[] retorno = trucha;
        for (int x = 0; x < retorno.length; x++) {
        }
        return retorno;
    }
    @FXML
    public ComboBox comb;
    ObservableList<String> list = FXCollections.observableArrayList("Trucha, Carpa");

    public Evaluacion(double[] trucha, double[] carpa, ComboBox comb, ObservableList<String> list) {
        this.trucha = trucha;
        this.carpa = carpa;
        this.comb = comb;
        this.list = list;
    }

    public ComboBox getComb() {
        return comb;
    }

    public void setComb(ComboBox comb) {
        this.comb = comb;
    }

    public ObservableList<String> getList() {
        return list;
    }

    public void setList(ObservableList<String> list) {
        this.list = list;
    }

    public double[] getTrucha() {
        return trucha;
    }

    public void setTrucha(double[] trucha) {
        this.trucha = trucha;
    }

    public double[] getCarpa() {
        return carpa;
    }

    public void setCarpa(double[] carpa) {
        this.carpa = carpa;
    }
}
