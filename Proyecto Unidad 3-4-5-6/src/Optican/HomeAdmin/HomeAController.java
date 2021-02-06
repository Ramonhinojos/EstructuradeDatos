package Optican.HomeAdmin;

import Optican.Main;
import Optican.Sick;
import Optican.User;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;

import javafx.fxml.FXML;;
import javafx.fxml.FXMLLoader;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class HomeAController {

    @FXML ListView<String> listPatient, listCita, listSicks;
    @FXML TextField txName, txLName, txAge, txKG, txCM, txSS, txSickTotal, txSickName, txSearch;
    @FXML Label lbPatient, lbPatient2;
   //sick mascotas
    Queue<User> colaPacientes=new LinkedList<>();
    List<Sick> listSick = new ArrayList<>();
    List<User> listUser = new ArrayList<>();
    int elementPos = -1;
    int counter=0;

    // Citas

    public void addCita(ActionEvent event){
        if(txName.getText().equals("") || txLName.getText().equals("") || txAge.getText().equals("") || txKG.getText().equals("") || txCM.getText().equals("") || txSS.getText().equals("")){
            String a = "Sin datos";
            String b = "Favor de ingresar todos los datos";
            alert(a,b);
        }else {
            User user = new User(txName.getText(), txLName.getText(), Integer.parseInt(txAge.getText()),Integer.parseInt(txSS.getText()),Double.parseDouble(txKG.getText()), Double.parseDouble(txCM.getText()), 0, 0, 0);
            colaPacientes.add(user);
            listUser.add(counter,user);

            listPatient.getItems().add("#" + counter + " " + user.getName() + " " + user.getlName());
            listCita.getItems().add("#" + counter + " " + user.getName() + " " + user.getlName());
            this.counter++;
        }
    }

    public void deleteCita(ActionEvent event){
        if (colaPacientes.size() > 0){
            listCita.getItems().remove(0);
            colaPacientes.poll();
        } else {
            String a = "Sin citas";
            String b = "No hay citas disponibles";
            alert(a,b);
        }
    }
    //Enfermedades

    public void addSick(ActionEvent event){
        if(txSickName.getText().equals("") || txSickTotal.getText().equals("")){
            String a = "Error";
            String b = "Usted no ha llenado los campos, necesita llenar todos los campos";
            alert(a,b);
        }else {
            Sick x = new Sick(txSickName.getText(), Integer.parseInt(txSickTotal.getText()));
            listSick.add(x);
        }
        txSickName.clear();
        txSickTotal.clear();
    }

    public void stadistic(){
        listSicks.getItems().clear();
        bubbleOrd(listSick);
        for (Sick value : listSick) { listSicks.getItems().add(value.getName() + ": " + value.getTotal() + " casos"); }
    }

    public static void bubbleOrd(List<Sick> array){
        {
            boolean flag = true; int numTemp; String stringTemp;

            while (flag) {
                flag = false;
                for (int t = 0; t < array.size() - 1; t++) {
                    if (array.get(t).getTotal() < array.get(t + 1).getTotal()) {

                        numTemp = array.get(t).getTotal(); stringTemp = array.get(t).getName();
                        array.get(t).setTotal(array.get(t + 1).getTotal()); array.get(t).setName(array.get(t + 1).getName());
                        array.get(t + 1).setTotal(numTemp); array.get(t + 1).setName(stringTemp);

                        flag = true;
                    }
                }
            }
        }
    }
    // Busqueda por numero de cartilla

    public void search(ActionEvent event){
        if (txSearch.getText().equals("")){
            String a = "Sin No de cartilla";
            String b = "Usted no ha escrito ningun numero de cartilla";
            alert(a,b);
        } else {
            int ss = Integer.parseInt(txSearch.getText());
            searchSeq(ss);
        }
    }

    public void searchSeq(int seguro){
        boolean z = false;
        for (User user : listUser) {
            if (user.getSs() == seguro) {
                lbPatient.setText(user.getName() + " " + user.getlName() + " - " + user.getSs());
                lbPatient2.setText("Altura: "+user.getCm()+"cm, Peso: "+user.getKg()+"kg, Edad: "+user.getAge());
                z=true;
                break;
            } else z=false;
        }
        if (!z) {
            String aa = "Error de busqueda";
            String bb = "El paciente con el numero de cartilla no se encuentra en esta lista";
            alert(aa,bb);
        }
    }


    public void returnLogin(MouseEvent mouseEvent){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/Optican/Login.fxml"));
            Scene scene = new Scene(root);
            Main.stage.setScene(scene);
        } catch (IOException e) { e.printStackTrace(); }
    }

    public void alert(String titulo, String contenido){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(titulo);
        alert.setContentText(contenido);
        alert.show();
    }


    public int searchBin(int dato, List<Sick> array){
        int minIndex = 0;
        int midIndex;
        int maxIndex = array.size();

        while (minIndex <= maxIndex) {
            midIndex = (minIndex + maxIndex) / 2;
            if (dato == array.get(midIndex).getTotal()) {
                this.elementPos = midIndex;
                break;
            } else if (dato < array.get(midIndex).getTotal()) {
                maxIndex = midIndex -1;
            } else{
                minIndex = midIndex+1;
            }
        }
        return -1;
    }
}