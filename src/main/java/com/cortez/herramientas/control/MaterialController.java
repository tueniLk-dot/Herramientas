package com.cortez.herramientas.control;

import com.cortez.herramientas.dao.MaterialesDao;
import com.cortez.herramientas.dto.MaterialDto;
import com.cortez.herramientas.service.IMaterialesService;
import com.cortez.herramientas.service.MaterialesServicio;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.util.ArrayList;

public class MaterialController {
    @FXML
    public  TableColumn ID ;
    @FXML
    public TableColumn Nombre;
    @FXML
    public TextField txtId;
    @FXML
    public TextField txtNombre;

    MaterialDto dao;
    public void MaterialService() {
        this.dao = new MaterialDto();
    }








    @FXML
    public void handleLimpiar(MouseEvent mouseEvent) {
    }

    @FXML
    public void handleEliminar(MouseEvent mouseEvent) {
    }

    @FXML
    public void handleActualizar(MouseEvent mouseEvent) {
    }

    @FXML
    public void handleCrear(ActionEvent actionEvent) {
        ArrayList<MaterialDto> listado = this.dao.obtenerTodo();
        listado.add(materia);
        this.dao.guardarTodo(listado);    }

}
