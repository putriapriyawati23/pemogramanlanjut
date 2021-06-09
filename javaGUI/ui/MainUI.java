package com.putri.javaGUI.ui;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class MainUI {
    private JPanel rootPanel;
    private JTable showTable;
    private JComboBox genreCombo;
    private JComboBox typeCombo;
    private JTextField minVotesField;
    private JButton episodeButton;
    private JButton imdbButton;

    public MainUI() {
        createTable();
        createGenreCombo();
        createTypeCombo();
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }

    private void createTable() {
        Object[][] data = {
                {"Putri Apriyawati", 2002, 9.5, 995064},
                {"Dewi Ramanda Putri", 2002, 8.8, 962165},
                {"Haechan", 2003, 8.8, 1675116}
        };
        showTable.setModel(new DefaultTableModel(
                data,
                new String[]{"Nama", "Tahun Kelahiran", "Nilai", "No Peserta"}
        ));
        TableColumnModel columns = showTable.getColumnModel();
        columns.getColumn(0).setMinWidth(250);

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        columns.getColumn(1).setCellRenderer(centerRenderer);
        columns.getColumn(2).setCellRenderer(centerRenderer);
        columns.getColumn(3).setCellRenderer(centerRenderer);
    }

    private void createGenreCombo() {
        genreCombo.setModel(new DefaultComboBoxModel(new String [] {"Teknik Informatika", "Teknik Industri", "Sistem Informasi", "Matematika", "Teknik Elektro"}));
    }

    private void createTypeCombo() {
        typeCombo.setModel(new DefaultComboBoxModel(new String [] {"Matematika", "Fisika", "Kimia"}));
    }
}
