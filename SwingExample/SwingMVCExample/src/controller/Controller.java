package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import model.Constants;

public class Controller implements ActionListener {

    private JTextField searchTermTextField = new JTextField(30);
    private final DefaultTableModel model;

    public Controller(JTextField searchTermTextField, DefaultTableModel model) {
        this.searchTermTextField = searchTermTextField;
        this.model = model;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String searchTerm = searchTermTextField.getText();
        if (!searchTerm.equals("")) {
            int lengthData = Constants.DATA.length;
            Object[][] dataSearch = new Object[lengthData][];
            int i = 0;
            for (Object[] object : Constants.DATA) {
                if(object[0].toString().startsWith(searchTerm.toUpperCase().trim())){
                        dataSearch[i++] = object;
                }
            }
            model.setDataVector(dataSearch, Constants.TABLE_HEADER);
        } else {
            JOptionPane.showMessageDialog(null, "Chưa nhập mã nhân viên", "Thông báo", JOptionPane.WARNING_MESSAGE);
        }
    }

}
