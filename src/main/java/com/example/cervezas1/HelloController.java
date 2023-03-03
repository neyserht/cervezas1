package com.example.cervezas1;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.LinkedHashMap;
import java.util.Map;

public class HelloController {

    // Declaración de un mapa o diccionario
    private Map<String, Double> cartaCervezas1 = new LinkedHashMap<String, Double>();
    @FXML
    private Label label1;
    @FXML
    private ComboBox comboBox1, comboBox2;
    @FXML
    private RadioButton radioButton1;
    @FXML
    private RadioButton radioButton2;
    @FXML
    private ToggleGroup group1;
    @FXML
    private CheckBox checkBox1;
    @FXML
    private Button button1;
    @FXML
    protected void f1()
    {
        // Establecer la carta de cervezas (marca, pvp)
        // Sintaxis: map.put(key, value);
        cartaCervezas1.put("mahou", 1.0);
        cartaCervezas1.put("amstel", 1.5);
        cartaCervezas1.put("alhambra", 1.7);

        cartaCervezas1.put("mahou maestra", 2.0);
        cartaCervezas1.put("amstel oro", 2.5);
        cartaCervezas1.put("alhambra roja", 2.7);

        cartaCervezas1.put("guinness", 3.0);
        cartaCervezas1.put("leffe negra", 3.5);
        cartaCervezas1.put("1906 black", 3.7);

        // Si el elemento de la lisa seleccionada es iual al primer elemento de la lista
        if (comboBox1.getValue().toString().equals(comboBox1.getItems().get(0).toString()))
        {
            // Añadir un grupo de elemento, eliminando los anteriores
            String cervezas1[] = {"mahou", "amstel", "alhambra"};
            comboBox2.setItems(FXCollections.observableArrayList(cervezas1));

            // Establecer el primer elemeno como el valor por defecto
            comboBox2.getSelectionModel().selectFirst();
        } else if (comboBox1.getValue().toString().equals(comboBox1.getItems().get(1).toString()))
        {
            // Añadir un grupo de elemento, eliminando los anteriores
            String cervezas1[] = {"mahou maestra", "amstel oro", "alhambra roja"};
            comboBox2.setItems(FXCollections.observableArrayList(cervezas1));

            // Establecer el primer elemeno como el valor por defecto
            comboBox2.getSelectionModel().selectFirst();

        } else if (comboBox1.getValue().toString().equals(comboBox1.getItems().get(2).toString()))
        {
            // Añadir un grupo de elemento, eliminando los anteriores
            String cervezas1[] = {"guinness", "leffe negra", "1906 black"};
            comboBox2.setItems(FXCollections.observableArrayList(cervezas1));

            // Establecer el primer elemeno como el valor por defecto
            comboBox2.getSelectionModel().selectFirst();
        }

    }

    @FXML
    protected void f2()
    {
        //label1.setText(comboBox2.getValue().toString());

        // Obtener el precio de una marca de cerveza



        label1.setText(cartaCervezas1.get(comboBox2.getValue()).toString());


    }
}