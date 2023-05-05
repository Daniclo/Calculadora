module com.calculadora.pr11 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.calculadora.pr11 to javafx.fxml;
    exports com.calculadora.pr11;
}