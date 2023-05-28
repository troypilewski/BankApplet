module com.app.bankapplet {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.app.bankapplet to javafx.fxml;
    exports com.app.bankapplet;
}